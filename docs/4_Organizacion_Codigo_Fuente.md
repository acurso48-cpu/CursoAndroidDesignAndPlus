# Guía Definitiva: Arquitectura y Organización del Código Fuente para una App Escalable

La organización de la carpeta `java` o `kotlin` es una de las decisiones más críticas para la salud a largo plazo de un proyecto. Una estructura lógica, basada en una arquitectura limpia, es la base para un código mantenible, testeable y fácil de navegar.

Esta guía explica los componentes clave de una arquitectura moderna y cómo organizarlos.

## 1. Los Pilares de una Arquitectura Moderna

Antes de ver la estructura de carpetas, debemos entender las herramientas y patrones que la definen.

### a) Inyección de Dependencias: Hilt y Koin

*   **¿Qué es?** Es un patrón de diseño donde un objeto no crea sus propias dependencias, sino que se las "inyectan" desde fuera. *(Ver Anexo al final para una explicación detallada)*.
*   **Problema que resuelve:** Evita el acoplamiento fuerte, haciendo que las clases sean más modulares, flexibles y fáciles de testear.

### b) Networking: Retrofit

*   **¿Qué es?** Es la librería estándar para realizar peticiones de red y consumir APIs REST. Permite definir una API como una simple interfaz de Kotlin, y Retrofit se encarga del resto.

### c) Base de Datos Local: Room

*   **¿Qué es?** Es la librería recomendada por Google para la persistencia de datos locales. Ofrece una capa de abstracción segura y fácil de usar sobre la base de datos SQLite de Android.

## 2. El Patrón de Diseño: MVVM (Model-View-ViewModel) y la Arquitectura Limpia

Para organizar las capas, el patrón más utilizado y recomendado es el **MVVM (Model-View-ViewModel)**. Su objetivo es separar la lógica de la interfaz de usuario.

Piénsalo como la organización de un restaurante:

*   **View (La Vista):** Es el **camarero**.
    *   **Qué es:** Tu `Activity` o `Fragment`.
    *   **Su trabajo:** Muestra el menú al cliente (la UI), toma nota de su pedido (captura los clics del usuario) y le entrega el plato cocinado (actualiza la UI).
    *   **Regla importante:** El camarero **no cocina**. No sabe cómo se prepara la comida. Solo se comunica con la cocina.

*   **ViewModel (El Modelo-Vista):** Es el **jefe de cocina**.
    *   **Qué es:** Una clase especial (`...ViewModel`) que sobrevive a los cambios de configuración (como rotar el teléfono).
    *   **Su trabajo:** Recibe el pedido del camarero (`loginPulsado()`). No cocina directamente, pero conoce las recetas (la lógica de la UI) y le dice a los chefs qué hacer (llama a los `UseCases` o `Repositories`). Prepara el "plato final" (el `UiState`) y lo deja en el pase para que el camarero lo recoja.
    *   **Regla importante:** El jefe de cocina **no conoce personalmente al camarero**. No tiene una referencia directa a la `Activity` o `Fragment`. Simplemente expone la comida en el pase (`LiveData` o `StateFlow`) y el camarero la observa.

*   **Model (El Modelo):** Es la **cocina y el almacén**.
    *   **Qué es:** En una arquitectura limpia, esto representa **toda la capa de `domain` y `data`** (Casos de Uso, Repositorios, APIs, Base de Datos).
    *   **Su trabajo:** Son los chefs (`UseCases`) que siguen las recetas y el personal de almacén (`Repositories`) que obtiene los ingredientes frescos (de la API) o los que ya están guardados (de la base de datos).

### Flujo de comunicación en MVVM:

1.  La **View** (camarero) notifica al **ViewModel** (jefe de cocina) de una acción: "¡El cliente quiere la ensalada!".
2.  El **ViewModel** (jefe de cocina) no prepara la ensalada. Llama a su **Model** (chefs): "¡Preparen una ensalada!".
3.  El **Model** (los chefs en la cocina) obtiene los ingredientes del almacén (`data`) y prepara la ensalada (lógica de negocio).
4.  El **ViewModel** recibe la ensalada lista y la convierte en un estado de la UI (`UiState.EnsaladaLista`). La deja en el pase (`LiveData/StateFlow`).
5.  La **View**, que está observando el pase, ve la ensalada lista y se la presenta al cliente (actualiza la UI).

### Conectando MVVM con la Arquitectura Limpia en 3 Capas

Así es como se mapea MVVM a la estructura de 3 capas (`presentation`, `domain`, `data`):

*   **View:** Corresponde a la capa de **`presentation`** (Activities, Fragments).
*   **ViewModel:** También es parte de la capa de **`presentation`**. Es el puente entre la UI y la lógica de negocio.
*   **Model:** Corresponde a las capas **`domain`** y **`data`** juntas.

Esta combinación te da una separación de responsabilidades clara, haciendo tu código testeable, flexible y fácil de entender.

## 3. Estructura Final de Paquetes Recomendada

Organizamos el código por **funcionalidad** (`feature`), combinando las capas de la arquitectura limpia.

```
com.ejemplo.ecommerce
│
├── core/                  # CÓDIGO COMÚN A TODA LA APP
│   ├── di/                # Módulos de Hilt/Koin globales
│   ├── network/           # Configuración de Retrofit
│   ├── data/              # Configuración de Room
│   └── presentation/      # BaseActivity, BaseFragment, extensiones
│
├── feature_login/         # Funcionalidad: Inicio de sesión
│   ├── presentation/
│   ├── data/
│   └── domain/
│
├── feature_products/      # Funcionalidad: Productos
│   ├── presentation/
│   ├── data/
│   └── domain/
│
└── App.kt                 # Clase Application
```

---

## Anexo: ¿Qué es la Inyección de Dependencias? (Explicado para Principiantes)

Imagina que quieres construir algo. Un `Coche` necesita un `Motor`. Un `Guerrero` necesita un `Arma`. Una `Pizza` necesita `Ingredientes`. La Inyección de Dependencias (DI) es simplemente la idea de que **un objeto no debe crear las cosas que necesita, sino que se las deben dar desde fuera.**

### Forma 1: El Objeto Crea sus Dependencias (El Camino Rígido)

```kotlin
// El Coche está creando su propia dependencia. ¡Están fuertemente acoplados!
class Coche {
    private val motor = MotorDeGasolina() // Creación interna

    fun arrancar() {
        motor.encender()
        println("Coche arrancado.")
    }
}
```

**Problemas:**
1.  **Poca flexibilidad:** ¿Y si quieres un `MotorElectrico`? Tienes que cambiar el código de la clase `Coche`.
2.  **Difícil de probar:** Para probar el `Coche`, estás obligado a probar también un `MotorDeGasolina` real y complejo.

### Forma 2: Al Objeto le "Inyectan" sus Dependencias (El Camino Flexible)

En lugar de crear, el objeto **pide** lo que necesita. Hay tres formas principales de "inyectar":

#### a) Inyección por Constructor (La más común y recomendada)

El objeto pide sus dependencias obligatorias al nacer.

```kotlin
// El Coche ahora recibe su dependencia en el constructor.
class Coche(private val motor: Motor) { // <-- ¡INYECCIÓN!
    fun arrancar() {
        motor.encender()
        println("Coche arrancado.")
    }
}

// Ahora podemos crear coches con diferentes motores sin cambiar la clase Coche.
val miCocheDeGasolina = Coche(MotorDeGasolina())
val miCocheElectrico = Coche(MotorElectrico())
```

**Ventaja:** El objeto `Coche` es válido y funcional desde el momento en que se crea.

#### b) Inyección por Setter (o por Propiedad)

El objeto tiene un método para recibir dependencias opcionales después de haber sido creado.

```kotlin
class Guerrero {
    private var arma: Arma? = null // La dependencia puede ser nula al principio

    // Método "setter" para la inyección
    fun equiparArma(armaAEquipar: Arma) { // <-- ¡INYECCIÓN!
        this.arma = armaAEquipar
        println("Guerrero equipado con ${arma.nombre}")
    }

    fun atacar() {
        arma?.usar() ?: println("Guerrero ataca con los puños!")
    }
}

val conan = Guerrero()
conan.atacar() // Ataca con los puños
conan.equiparArma(EspadaDeAcero()) // Inyectamos la dependencia más tarde
conan.atacar() // Ataca con la espada
```

**Ventaja:** Útil para dependencias opcionales o para frameworks (como Android) que crean los objetos por nosotros (ej. `Activities`).

#### c) Inyección por Método

La dependencia no es parte del objeto, sino que se pasa a un método específico que la necesita para una acción puntual.

```kotlin
class Cocinero {
    // El cocinero no "posee" los ingredientes, los recibe para usarlos
    fun prepararPizza(queso: Queso, salsa: Salsa) { // <-- ¡INYECCIÓN!
        println("Cocinero preparando pizza con ${queso.tipo} y ${salsa.tipo}.")
    }
}

val chefItaliano = Cocinero()
// Las dependencias se crean y se inyectan solo cuando se necesitan.
chefItaliano.prepararPizza(QuesoMozzarella(), SalsaDeTomate())
```

**Ventaja:** El objeto es aún más simple y desacoplado.

### Conclusión: ¿Y qué son Hilt y Koin?

Piensa en **Hilt y Koin** como un **"Jefe de Fábrica"** súper inteligente para tu aplicación.

En lugar de que tú crees manualmente cada pieza (`val motor = MotorDeGasolina()`) y la pases a cada objeto (`Coche(motor)`), tú simplemente le enseñas al "Jefe de Fábrica" cómo construir cada pieza una vez.

Luego, cuando Hilt/Koin ven que tu clase `Coche` necesita un `Motor` en su constructor, automáticamente buscan en su "almacén", construyen un `Motor` por ti, y se lo inyectan sin que tengas que hacer nada más. Automatizan todo este proceso en una aplicación grande, ahorrándote muchísimo trabajo y errores.

---

## Anexo 2: Adaptando la Arquitectura para Jetpack Compose

La llegada de Jetpack Compose supone una revolución en cómo se construye la interfaz de usuario en Android. Si bien al principio puede parecer que cambia todo, la gran ventaja de una Arquitectura Limpia es que **las capas `domain` y `data` permanecen intactas**. La lógica de negocio y el acceso a los datos son independientes de la UI, por lo que todo ese trabajo se conserva.

El cambio se concentra casi exclusivamente en la capa de **`presentation`**.

### El Gran Cambio: La UI es Código

Con el sistema de Vistas, la UI se definía en `XML` y la lógica para manejarla en `Kotlin/Java`. Eran dos mundos separados.

Con Jetpack Compose, **la UI es código**. Se construye usando funciones de Kotlin anotadas con `@Composable`. Esto elimina la necesidad de `XML` para layouts y el cambio de contexto entre archivos. La UI se vuelve declarativa: en lugar de decir "cambia el color de este botón", dices "el color de este botón *es* rojo cuando el estado es 'error'".

### La Nueva Capa `presentation` en Detalle

La estructura de la capa de `presentation` de una `feature` se transforma para ser más cohesiva y centrada en Kotlin.

#### 1. El `ViewModel`: El Guardián del Estado

*   **Rol:** Su responsabilidad principal sigue siendo la misma: contener la lógica de la UI (no la de negocio), gestionar el estado y reaccionar a los eventos del usuario.
*   **Cambio clave:** En lugar de exponer datos a través de `LiveData`, el estándar moderno es usar `StateFlow`. `StateFlow` se integra de forma nativa con las corrutinas y el ciclo de vida de los Composables.

    ```kotlin
    // En el ViewModel
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onLoginClicked() {
        // Llama a los casos de uso del 'domain'
    }
    ```

#### 2. La `Screen`: El Composable "Inteligente" (Stateful)

El `Fragment` es reemplazado por una función Composable de alto nivel, que llamamos "Screen". Esta es la única parte de la UI que debería conocer al `ViewModel`.

*   **Responsabilidad:** Conectarse al `ViewModel`, recolectar el estado y pasarlo a los componentes de UI "tontos". Es el "stateful" (consciente del estado).

    ```kotlin
    // LoginScreen.kt

    @Composable
    fun LoginScreen(
        viewModel: LoginViewModel = hiltViewModel() // Inyecta el ViewModel
    ) {
        // Recolecta el estado del ViewModel de forma segura para el ciclo de vida
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        // Llama al Composable "tonto" pasándole el estado y los eventos
        LoginContent(
            state = uiState,
            onEmailChange = { viewModel.onEmailChange(it) },
            onLoginClick = { viewModel.onLoginClicked() }
        )
    }
    ```

#### 3. El `Content`: El Composable "Tonto" (Stateless)

Este es el corazón del patrón de diseño en Compose. La mayor parte de tu UI debería estar en Composables "stateless" (sin estado).

*   **Responsabilidad:** Recibir datos (el estado) y emitir eventos (lambdas). No sabe de dónde vienen los datos ni qué hacen los eventos.
*   **Ventajas:**
    *   **Reutilizable:** Puedes usar `LoginContent` en cualquier otro lugar de la app.
    *   **Fácil de previsualizar:** La vista previa de Android Studio (`@Preview`) funciona perfectamente.
    *   **Fácil de testear:** Puedes probar su apariencia pasándole estados de prueba.

    ```kotlin
    // También en LoginScreen.kt
    @Composable
    private fun LoginContent(
        state: LoginUiState,
        onEmailChange: (String) -> Unit,
        onLoginClick: () -> Unit
    ) {
        Column {
            EmailField(value = state.email, onValueChange = onEmailChange)
            LoginButton(isEnabled = state.isLoginEnabled, onClick = onLoginClick)
        }
    }
    ```
    Este patrón se conoce como **State Hoisting** (elevación de estado).

#### 4. Los `Components`: Bloques de Construcción Reutilizables

*   **¿Qué son?** Pequeños Composables que representan una pieza de UI (un botón, un campo de texto, una tarjeta). Siempre son "stateless".
*   **Ubicación:** Si un componente es específico de una `feature`, vive en `feature_login/presentation/components/`. Si es reutilizable en toda la app (ej. `MyPrimaryButton`), vive en `core/presentation/components/`.

### Nueva Estructura de la Capa `presentation` con Compose

```
presentation/
├── LoginScreen.kt       // Contiene el 'LoginScreen' (stateful) y 'LoginContent' (stateless)
├── LoginViewModel.kt    // Sigue siendo el cerebro de la UI
├── LoginUiState.kt      // Data class que modela todo lo que se puede pintar en la pantalla
└── components/
    ├── EmailField.kt
    └── PasswordField.kt
```

### Tabla Comparativa Extensa: Views vs. Compose
| Concepto | Sistema de Vistas (XML) | Jetpack Compose |
| :--- | :--- | :--- |
| **Paradigma** | Imperativo ("Cómo" cambiar la UI) | Declarativo ("Qué" mostrar en la UI) |
| **Definición de UI** | Archivos `XML` en `res/layout` | Funciones `@Composable` en `Kotlin` |
| **Controlador de UI** | `Activity` / `Fragment` | Una función `@Composable` ("Screen") |
| **Manejo de Estado** | `LiveData` observado en `Fragment`, `findViewById` | `StateFlow` recolectado con `collectAsState`, State Hoisting |
| **Lógica de UI** | Mezclada en el `Fragment` (clics, visibilidad) | En el `ViewModel` y en lambdas de eventos |
| **Listas** | `RecyclerView` con `Adapter` y `ViewHolder` | `LazyColumn` / `LazyRow` con `items` |
| **Navegación** | Fragment Transactions, Navigation Component con IDs | `Navigation-Compose` con rutas (Strings) |
| **Testeo de UI** | Espresso (lento, complejo) | `ComposeTestRule` (integrado, más rápido) |
| **Reutilización** | `include`, `merge`, Custom Views (complejo) | Simples funciones `@Composable` |

En resumen, Jetpack Compose no invalida tu arquitectura, sino que la potencia. Obliga a una separación aún más limpia dentro de la capa `presentation`, lo que resulta en un código más predecible, testeable y agradable de escribir.
