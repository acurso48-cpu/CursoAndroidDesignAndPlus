# Guía Detallada: Jetpack Compose e Interoperabilidad

Jetpack Compose es el kit de herramientas moderno y declarativo de Google para construir interfaces de usuario nativas en Android. Esta guía explora sus conceptos fundamentales, su arquitectura y cómo puede coexistir con el sistema de Vistas basado en XML.

## 1. El Cambio de Paradigma: De Imperativo a Declarativo

*   **Sistema de Vistas (Imperativo):** Le dices a la UI "cómo" cambiar. Creas un `TextView` y, cuando los datos cambian, llamas a `textView.setText("nuevo texto")`. Manipulas los widgets directamente.

*   **Jetpack Compose (Declarativo):** Describes "qué" debería mostrar la UI para un estado determinado. Creas un Composable `Text(text = miEstado.texto)`. Cuando `miEstado.texto` cambia, el framework de Compose se encarga de redibujar el componente con el nuevo texto. **Nunca manipulas la UI directamente.**

## 2. Conceptos Fundamentales de Compose

*   **`@Composable`:** Todo en Compose es una función anotada con `@Composable`. Estas funciones son los bloques de construcción de tu UI.

*   **Recomposición:** Cuando el estado de entrada de un Composable cambia, Compose vuelve a llamar a esa función (la "recompone") para actualizar la UI de forma inteligente.

*   **`Modifier`:** La herramienta principal para decorar o añadir comportamiento a un Composable (`padding`, `size`, `background`, `onClick`, etc.).

## 3. Gestión de Estado: El Corazón de Compose

El estado (`State`) es cualquier valor que puede cambiar con el tiempo y afectar a la UI.

*   **`remember`:** Se usa para que un estado "recuerde" su valor durante las recomposiciones. **Sin embargo, `remember` no sobrevive a la rotación de pantalla** (recreación de la Activity).

    ```kotlin
    var text by remember { mutableStateOf("") } // 'text' es un estado local
    ```

*   **`rememberSaveable`:** Es una versión más potente de `remember`. **Sí sobrevive a la rotación de pantalla** y a la finalización del proceso por parte del sistema. Úsalo para estados de UI simples que deben persistir.

    ```kotlin
    var text by rememberSaveable { mutableStateOf("") }
    ```

*   **Elevación de Estado (State Hoisting):** Es el patrón principal de arquitectura en Compose. Consiste en mover el estado desde donde se usa (un Composable "hijo") hacia un ancestro común (normalmente la "Screen" o el `ViewModel`). Esto hace que tus componentes sean "tontos" (stateless), más reutilizables y fáciles de testear.

    ```kotlin
    // Mal: El estado está dentro del botón, no se puede controlar desde fuera.
    @Composable
    fun UncontrollableButton() {
        var count by remember { mutableStateOf(0) }
        Button(onClick = { count++ }) { Text("Pulsado $count veces") }
    }

    // Bien: El estado se eleva. El botón es "tonto".
    @Composable
    fun ControllableButton(count: Int, onClick: () -> Unit) {
        Button(onClick = onClick) { Text("Pulsado $count veces") }
    }
    ```

*   **El `ViewModel` como Fuente de la Verdad:** Para el estado de la pantalla (datos del usuario, listas, etc.), el `ViewModel` es el lugar correcto para almacenarlo. Este estado sobrevive a la rotación de forma natural y se conecta a las capas `domain` y `data`.

## 4. Construyendo Layouts en Compose

Compose proporciona componentes básicos para organizar tu UI.

*   **`Column`:** Apila sus hijos verticalmente, uno debajo del otro.
    ```kotlin
    Column {
        Text("Arriba")
        Text("Abajo")
    }
    ```

*   **`Row`:** Coloca a sus hijos horizontalmente, uno al lado del otro.
    ```kotlin
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Default.AccountCircle, contentDescription = null)
        Text("Usuario")
    }
    ```

*   **`Box`:** Apila a sus hijos uno encima del otro, como un `FrameLayout`. Es perfecto para superponer elementos.
    ```kotlin
    Box {
        Image(...)
        Icon(Icons.Default.PlayCircle, modifier = Modifier.align(Alignment.Center))
    }
    ```

*   **`Spacer`:** Se usa para crear un espacio vacío entre componentes.
    ```kotlin
    Column {
        Text("Arriba")
        Spacer(modifier = Modifier.height(16.dp)) // Espacio vertical de 16dp
        Text("Abajo")
    }
    ```

## 5. Mostrando Listas con `LazyColumn` y `LazyRow`

Son los equivalentes de `RecyclerView`. "Lazy" significa que solo componen y dibujan los elementos que son visibles en pantalla, haciéndolos increíblemente eficientes para listas largas.

```kotlin
val userList = // ... tu lista de usuarios desde el ViewModel

LazyColumn(
    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    verticalArrangement = Arrangement.spacedBy(8.dp) // Espacio entre ítems
) {
    // Añade un único ítem (ej. una cabecera)
    item {
        Text("Mi Lista de Usuarios", style = MaterialTheme.typography.h6)
    }

    // Añade todos los ítems de una lista
    items(items = userList, key = { user -> user.id }) { user ->
        // 'key' es un identificador único para mejorar el rendimiento
        UserCard(user = user)
    }
}
```

## 6. Interoperabilidad: La Clave para una Migración Exitosa

Puedes usar Views y Compose en el mismo proyecto, en la misma pantalla e incluso uno dentro del otro.

### Escenario 1: Usar Composables dentro de un Layout de Vistas (XML)

Este es el caso más común para empezar a migrar. Ideal para crear un nuevo componente en una pantalla existente.

*   **Paso 1: Añade el `ComposeView` a tu XML**

    Imagina que tienes un `fragment_profile.xml` y quieres añadir una nueva sección de "Insignias" (`Badges`) hecha en Compose.

    ```xml
    <!-- res/layout/fragment_profile.xml -->
    <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <!-- Componentes existentes del sistema de Vistas -->
        <TextView
            android:id="@+id/profile_name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Nombre de Usuario"
            style="@style/TextAppearance.MaterialComponents.Headline6" />

        <!-- Contenedor para el nuevo componente de Compose -->
        <androidx.compose.ui.platform.ComposeView
            android:id="@+id/profile_badges_compose_view"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp" />

    </LinearLayout>
    ```

*   **Paso 2: Llama a `setContent` en tu Fragment/Activity**

    En tu `ProfileFragment.kt`, infla el layout como siempre y luego asigna el contenido Composable al `ComposeView`.

    ```kotlin
    // ProfileFragment.kt
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val composeView = view.findViewById<ComposeView>(R.id.profile_badges_compose_view)
        composeView.setContent {
            // Tu tema de Compose es necesario para que los estilos (colores, fuentes) funcionen.
            MaterialTheme {
                // ¡Llama a cualquier @Composable que quieras!
                BadgesSection(badges = viewModel.userBadges)
            }
        }
    }

    // ... en otro archivo, por ejemplo, BadgesSection.kt
    @Composable
    fun BadgesSection(badges: List<Badge>) {
        Column {
            Text("Insignias Obtenidas", style = MaterialTheme.typography.h6)
            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                items(badges) { badge ->
                    Chip(badge.name) // Chip es otro Composable personalizado
                }
            }
        }
    }
    ```

### Escenario 2: Usar Vistas (XML) dentro de un Composable

Necesario cuando quieres usar una Vista que no tiene un equivalente nativo en Compose (`MapView`, `AdView`) o tienes una Vista personalizada muy compleja.

*   **La Herramienta:** El Composable `AndroidView`

*   **Ejemplo con un `MaterialButton` del sistema de vistas:**

    Imagina que quieres usar un `MaterialButton` específico dentro de una pantalla de Compose.

    ```kotlin
    // En tu Composable Screen
    @Composable
    fun OnboardingScreen(onLegacyButtonClicked: () -> Unit) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("¡Bienvenido a la App!", style = MaterialTheme.typography.h4)
            Spacer(modifier = Modifier.weight(1f)) // Empuja el botón hacia abajo

            // Contenedor para la Vista antigua
            AndroidView(
                modifier = Modifier.padding(16.dp),
                factory = { context ->
                    // Esta lambda se llama una sola vez para CREAR la Vista.
                    com.google.android.material.button.MaterialButton(context).apply {
                        text = "Botón del Sistema de Vistas"
                        setIconResource(R.drawable.ic_android) // Ejemplo
                    }
                },
                update = { button ->
                    // Esta lambda se llama cada vez que el Composable se recompone.
                    // Úsala para ACTUALIZAR la Vista con el nuevo estado.
                    button.setOnClickListener {
                        onLegacyButtonClicked()
                    }
                }
            )
        }
    }
    ```
