# Pasos para usar Material 3 en tu proyecto Android

¡Hola! He creado este documento para guiarte en la implementación de Material You (Material 3) en tu aplicación. Tu proyecto ya está bien configurado, pero aquí tienes un resumen de los pasos clave.

## 1. Añadir la dependencia de Material Components

Asegúrate de que tu fichero `build.gradle.kts` (o `build.gradle`) del módulo `:app` contenga la última versión de la dependencia de Material Design.

```groovy
dependencies {
    // ... otras dependencias
    implementation("com.google.android.material:material:1.13.0")
}
```

*Tu proyecto ya tiene esta dependencia, así que este paso está completado.*

## 2. Actualizar el tema de la aplicación

El tema de tu aplicación debe heredar de un tema de Material 3. Abre tu fichero `app/src/main/res/values/themes.xml` y asegúrate de que el `parent` de tu estilo base sea uno de los temas de `Theme.Material3`.

**Ejemplo (`themes.xml`):**
```xml
<resources>
    <!-- Tu proyecto ya usa un tema M3 como base -->
    <style name="Base.Theme.MaterialComponents" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- En la siguiente sección se explica cómo personalizar los colores -->
    </style>

    <style name="Theme.MaterialComponents" parent="Base.Theme.MaterialComponents" />
</resources>
```
Este paso también está correctamente configurado en tu proyecto.

## 3. Personalización de Colores

Con Material 3, tienes dos opciones principales para el color:

### a) Color Dinámico (Recomendado en Android 12+)

El color dinámico extrae los colores del fondo de pantalla del usuario para crear una paleta única y personal.

**Para habilitarlo:**

1.  **En tu clase `Application` o en tu `MainActivity`**, llama a `DynamicColors.applyToActivitiesIfAvailable()` antes de `super.onCreate()`.

    ```kotlin
    import com.google.android.material.color.DynamicColors

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            // Habilita los colores dinámicos si están disponibles
            DynamicColors.applyToActivitiesIfAvailable(this)
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }
    ```

2.  **En `themes.xml`**, asegúrate de no tener valores fijos para los colores primarios y secundarios, para que el sistema pueda sobreescribirlos.

    ```xml
    <style name="Base.Theme.MaterialComponents" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- No definas colorPrimary, etc. para permitir el color dinámico -->
    </style>
    ```

### b) Paleta de Colores Personalizada

Si prefieres usar una paleta de colores propia o quieres dar soporte a versiones anteriores a Android 12, puedes definir tus colores.

1.  **Define tus colores en `app/src/main/res/values/colors.xml`:**

    ```xml
    <resources>
        <color name="my_light_primary">#6750A4</color>
        <color name="my_light_onPrimary">#FFFFFF</color>
        <color name="my_light_primaryContainer">#EADDFF</color>
        <color name="my_light_onPrimaryContainer">#21005D</color>
        <!-- ... otros colores para el tema claro -->
    </resources>
    ```
    Puedes usar la [herramienta web de Material Theme Builder](https://m3.material.io/theme-builder) para generar tu paleta completa fácilmente.

2.  **Aplica los colores en tu tema en `app/src/main/res/values/themes.xml`:**

    ```xml
    <style name="Base.Theme.MaterialComponents" parent="Theme.Material3.DayNight.NoActionBar">
        <item name="colorPrimary">@color/my_light_primary</item>
        <item name="colorOnPrimary">@color/my_light_onPrimary</item>
        <item name="colorPrimaryContainer">@color/my_light_primaryContainer</item>
        <item name="colorOnPrimaryContainer">@color/my_light_onPrimaryContainer</item>
        <!-- ... otros atributos de color -->
    </style>
    ```
    Recuerda hacer lo mismo para el tema oscuro en `app/src/main/res/values-night/themes.xml` con los colores correspondientes.

## 4. Usar componentes de Material 3

Cuando diseñes tus layouts en XML, utiliza los componentes del paquete `com.google.android.material`.

**Ejemplo (`activity_main.xml`):**
```xml
<com.google.android.material.button.MaterialButton
    android:id="@+id/my_button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón Material" />

<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Campo de texto">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

</com.google.android.material.textfield.TextInputLayout>
```

Con estos pasos, tu aplicación estará utilizando Material 3 y ofrecerá una experiencia de usuario moderna y consistente con el sistema Android.
