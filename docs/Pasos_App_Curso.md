# Pasos para crear la App del curso de Android

En este documento se registrarán todos los pasos que se han seguido para crear la aplicación del curso de Android, explicando cada una de las etapas y el código implementado.

## Etapa 1: Configuración inicial y pantalla de bienvenida

En esta primera etapa, hemos personalizado la pantalla principal de la aplicación para darle un toque más personal y divertido, ¡al estilo de Julián y su patito de goma!

### 1.1. Modificación del layout principal

Se ha modificado el archivo `activity_main.xml` para incluir una cabecera con el logo del patito de goma y un mensaje de bienvenida. Se ha utilizado un `LinearLayout` para centrar los elementos verticalmente.

```xml
<LinearLayout
    android:id="@+id/header"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="16dp"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent">

    <ImageView
        android:id="@+id/duck_logo"
        android:layout_width="120dp"
        android:layout_height="120dp"
        android:src="@drawable/duck_logo"
        android:contentDescription="@string/duck_logo_content_description" />

    <TextView
        android:id="@+id/welcome_message"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="¡Hola, soy Julián!"
        android:textAppearance="?attr/textAppearanceHeadline5" />

    <TextView
        android:id="@+id/course_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:text="Curso Android Nov/2025 Getafe"
        android:textAppearance="?attr/textAppearanceBody1" />

</LinearLayout>
```

### 1.2. Accesibilidad

Para que la imagen del patito sea accesible, se ha añadido una descripción de contenido en el archivo `strings.xml`:

```xml
<string name="duck_logo_content_description">Logo de un patito de goma</string>
```

## Etapa 2: Creación de actividades separadas

Para organizar mejor el contenido, hemos creado dos secciones principales en la `MainActivity`, cada una representada por una tarjeta que abrirá una nueva actividad.

### 2.1. Modificación del layout principal

Se ha modificado de nuevo el archivo `activity_main.xml` para reemplazar la lista de temas por dos `MaterialCardView`, una para "Componentes" y otra para "Documentación".

```xml
<LinearLayout
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    app:layout_constraintTop_toBottomOf="@id/header"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintBottom_toBottomOf="parent"
    android:gravity="center">

    <com.google.android.material.card.MaterialCardView
        android:id="@+id/components_card"
        ...
        >
        <LinearLayout ... >
            <ImageView ... />
            <TextView ... android:text="Componentes" />
        </LinearLayout>
    </com.google.android.material.card.MaterialCardView>

    <com.google.android.material.card.MaterialCardView
        android:id="@+id/docs_card"
        ...
        >
        <LinearLayout ... >
            <ImageView ... />
            <TextView ... android:text="Documentación" />
        </LinearLayout>
    </com.google.android.material.card.MaterialCardView>

</LinearLayout>
```

### 2.2. Creación de nuevas actividades

Se han creado dos nuevas actividades, `ComponentsActivity.kt` y `DocsActivity.kt`, junto con sus respectivos layouts (`activity_components.xml` y `activity_docs.xml`).

### 2.3. Declaración en el Manifest

Para que el sistema operativo reconozca las nuevas actividades, se han añadido al `AndroidManifest.xml`:

```xml
<activity android:name=".ComponentsActivity" />
<activity android:name=".DocsActivity" />
```

### 2.4. Navegación

Finalmente, se ha añadido el código necesario en `MainActivity.kt` para que, al pulsar sobre las tarjetas, se abran las nuevas actividades:

```kotlin
findViewById<MaterialCardView>(R.id.components_card).setOnClickListener {
    startActivity(Intent(this, ComponentsActivity::class.java))
}

findViewById<MaterialCardView>(R.id.docs_card).setOnClickListener {
    startActivity(Intent(this, DocsActivity::class.java))
}
```
