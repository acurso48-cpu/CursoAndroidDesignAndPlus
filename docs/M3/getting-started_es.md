# Primeros pasos con los componentes de Material para Android

## 1. Guía de migración

Echa un vistazo a nuestra [guía](https://material.io/blog/migrating-material-3) y [codelab](https://goo.gle/apply-dynamic-color) para ayudarte a migrar tu base de código usando Material Components para Android al nuevo sistema de Material 3.

Además, si todavía estás usando la antigua Design Support Library, echa un vistazo a nuestra [guía heredada](https://material.io/blog/migrate-android-material-components) para ayudarte a migrar tu base de código a Material Components para Android.

## 2. Dependencia de la librería Maven

Material Components para Android está disponible a través del Repositorio Maven de Google. Para usarlo:

1.  Abre el archivo `build.gradle` de tu aplicación.
2.  Asegúrate de que la sección `repositories` incluye el Repositorio Maven de Google `google()`. Por ejemplo:

    ```groovy
      allprojects {
        repositories {
          google()
          mavenCentral()
        }
      }
    ```

3.  Añade la librería a la sección `dependencies`:

    ```groovy
      dependencies {
        // ...
        implementation 'com.google.android.material:material:<version>'
        // ...
      }
    ```

Visita el [Repositorio Maven de Google](https://maven.google.com/web/index.html#com.google.android.material:material) o el [Repositorio MVN](https://mvnrepository.com/artifact/com.google.android.material/material) para encontrar la última versión de la librería.

**Nota:** Para poder usar los nuevos temas y estilos de componentes `Material3`, deberías depender de la versión `1.5.0` o posterior.

**Nota:** Para poder usar los nuevos temas y estilos de componentes `Material3Expressive`, deberías depender de la versión `1.14.0` o posterior.

### Nuevo Namespace y AndroidX

Si tu app depende actualmente de la Design Support Library original, puedes hacer uso de la opción [`Refactor to AndroidX…`](https://developer.android.com/jetpack/androidx/migrate) proporcionada por Android Studio. Hacerlo actualizará las dependencias y el código de tu app para usar las nuevas librerías empaquetadas `androidx` y `com.google.android.material`.

Si aún no quieres cambiar a los nuevos paquetes `androidx` y `com.google.android.material`, puedes usar Material Components a través de la dependencia `com.android.support:design:28.0.0`.

**Nota:** No deberías usar las dependencias `com.android.support` y `com.google.android.material` en tu app al mismo tiempo.

### Clases R no transitivas (referenciando recursos de la librería programáticamente)

A partir de la versión `1.13.0-alpha12`, la librería Material se construye con AGP 8.7.3 (o posterior) y `android.nonTransitiveRClass=true`, lo que significa que [las clases R ya no son transitivas](https://developer.android.com/build/optimize-your-build#use-non-transitive-r-classes) y los recursos deben ser calificados completamente con la ruta de su librería cuando se usan programáticamente.

For example, since `colorPrimary` is defined in the AppCompat library, you must refer to it as `androidx.appcompat.R.attr.colorPrimary` as opposed to `com.google.android.material.R.attr.colorPrimary` or `R.attr.colorPrimary`.

For a Material defined resource like `colorOnPrimary`, you must refer to it as `com.google.android.material.R.attr.colorOnPrimary`.

Para optar por no participar en este nuevo comportamiento, establece `android.nonTransitiveRClass=false` en tu archivo `gradle.properties`. Entonces podrás acceder a cualquier recurso sin una ruta completamente calificada (es decir, simplemente `R.<tipo-recurso>.<nombre-recurso>`).

**Nota:** Esto es relevante para todos los tipos de recursos de la librería, no solo para las referencias de atributos.

## 3. Compilación del SDK de Android

Para poder usar las últimas versiones de Material Components para Android y las librerías de AndroidX Jetpack, tendrás que instalar la última versión de Android Studio y actualizar tu app para cumplir con los siguientes requisitos:

-   `compileSdkVersion` -> `35` o posterior (ver la [guía de migración de la app a Android 15](https://developer.android.com/about/versions/15/migration))
-   `minSdkVersion` -> `21` o posterior

## 4. Compilación con Java 8

Las últimas librerías de Material y AndroidX Jetpack ahora requieren que tu app se compile con Java 8. Consulta la [documentación de características y APIs del lenguaje Java 8](https://developer.android.com/studio/write/java8-support) para más información sobre el soporte de Java 8 y cómo habilitarlo para tu app.

## 5. Gradle, AGP y Android Studio

Al usar la versión `1.13.0` de MDC-Android y superiores, necesitarás asegurarte de que tu proyecto se construye con los siguientes requisitos mínimos, para soportar las últimas características de compilación como la `macro` de XML:

-   [Versión de Gradle 8.9](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
-   [Versión del Plugin de Android para Gradle (AGP) 8.7.3](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
-   [Android Studio Ladybug, version 2024.2.1](https://developer.android.com/studio/releases/gradle-plugin#android_gradle_plugin_and_android_studio_compatibility)

## 6. `AppCompatActivity`

Usa `AppCompatActivity` para asegurar que todos los componentes funcionen correctamente. Si no puedes extender de `AppCompatActivity`, actualiza tus actividades para usar [`AppCompatDelegate`](https://developer.android.com/reference/androidx/appcompat/app/AppCompatDelegate). Esto permitirá que las versiones de AppCompat o Material de los componentes se inflen (dependiendo de tu tema), entre otras cosas importantes.

## 7. Herencia de tema `Material3`

Te recomendamos que realices una migración en toda la app cambiando el tema de tu aplicación para que herede de un tema `Material3`. Asegúrate de probar a fondo después, ya que esto puede cambiar la apariencia y el comportamiento de los componentes de layout existentes.

Echa un vistazo a nuestro [Theming](theming.md) guide, as well as our
[Dark Theme](theming/Dark.md) guide for why it's important to inherit from the
`DayNight` theme.

`Material3` themes enable a custom view inflater, which replaces default
components with their Material counterparts. Currently, this replaces the
following XML components:

*   `<Button` → [`MaterialButton`](components/Button.md)
*   `<CheckBox` → [`MaterialCheckBox`](components/Checkbox.md)
*   `<RadioButton` → [`MaterialRadioButton`](components/RadioButton.md)
*   `<TextView` → [`MaterialTextView`](components/MaterialTextView.md)
*   `<AutoCompleteTextView` →
    [`MaterialAutoCompleteTextView`](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/MaterialAutoCompleteTextView.java)

### **Temas `AppCompat` o `MaterialComponents`**

Puedes probar incrementalmente los nuevos componentes de Material sin cambiar el tema de tu app. Esto te permite mantener tus layouts existentes con la misma apariencia y comportamiento, mientras introduces nuevos componentes a tu layout uno por uno.

Sin embargo, debes añadir los siguientes nuevos atributos de tema a tu tema de app existente, o te encontrarás con errores de `ThemeEnforcement`:

```xml
<style name="Theme.MyApp" parent="Theme.AppCompat OR Theme.MaterialComponents">

  <!-- Atributos originales de AppCompat. -->
  <item name="colorPrimary">@color/my_app_primary</item>
  <item name="colorPrimaryDark">@color/my_app_primary_dark</item>
  <item name="colorSecondary">@color/my_app_secondary</item>
  <item name="android:colorBackground">@color/my_app_background</item>
  <item name="colorError">@color/my_app_error</item>

  <!-- MaterialComponents attributes (needed if parent="Theme.AppCompat"). -->
  <item name="colorPrimaryVariant">@color/my_app_primary_variant</item>
  <item name="colorSecondaryVariant">@color/my_app_secondary_variant</item>
  <item name="colorSurface">@color/my_app_surface</item>
  <item name="colorOnPrimary">@color/my_app_on_primary</item>
  <item name="colorOnSecondary">@color/my_app_on_secondary</item>
  <item name="colorOnBackground">@color/my_app_on_background</item>
  <item name="colorOnError">@color/my_app_on_error</item>
  <item name="colorOnSurface">@color/my_app_on_surface</item>
  <item name="scrimBackground">@color/mtrl_scrim</item>
  <item name="textAppearanceHeadline1">@style/TextAppearance.MaterialComponents.Headline1</item>
  <item name="textAppearanceHeadline2">@style/TextAppearance.MaterialComponents.Headline2</item>
  <item name="textAppearanceHeadline3">@style/TextAppearance.MaterialComponents.Headline3</item>
  <item name="textAppearanceHeadline4">@style/TextAppearance.MaterialComponents.Headline4</item>
  <item name="textAppearanceHeadline5">@style/TextAppearance.MaterialComponents.Headline5</item>
  <item name="textAppearanceHeadline6">@style/TextAppearance.MaterialComponents.Headline6</item>
  <item name="textAppearanceSubtitle1">@style/TextAppearance.MaterialComponents.Subtitle1</item>
  <item name="textAppearanceSubtitle2">@style/TextAppearance.MaterialComponents.Subtitle2</item>
  <item name="textAppearanceBody1">@style/TextAppearance.MaterialComponents.Body1</item>
  <item name="textAppearanceBody2">@style/TextAppearance.MaterialComponents.Body2</item>
  <item name="textAppearanceCaption">@style/TextAppearance.MaterialComponents.Caption</item>
  <item name="textAppearanceButton">@style/TextAppearance.MaterialComponents.Button</item>
  <item name="textAppearanceOverline">@style/TextAppearance.MaterialComponents.Overline</item>

  <!-- Material3 attributes (needed if parent="Theme.MaterialComponents"). -->
  <item name="colorPrimaryInverse">@color/my_app_primary_inverse</item>
  <item name="colorPrimaryContainer">@color/my_app_primary_container</item>
  <item name="colorOnPrimaryContainer">@color/my_app_on_primary_container</item>
  <item name="colorSecondaryContainer">@color/my_app_secondary_container</item>
  <item name="colorOnSecondaryContainer">@color/my_app_on_secondary_container</item>
  <item name="colorTertiary">@color/my_app_tertiary</item>
  <item name="colorOnTertiary">@color/my_app_on_tertiary</item>
  <item name="colorTertiaryContainer">@color/my_app_tertiary_container</item>
  <item name="colorOnTertiaryContainer">@color/my_app_on_tertiary_container</item>
  <item name="colorSurfaceVariant">@color/my_app_surface_variant</item>
  <item name="colorOnSurfaceVariant">@color/my_app_on_surface_variant</item>
  <item name="colorSurfaceInverse">@color/my_app_inverse_surface</item>
  <item name="colorOnSurfaceInverse">@color/my_app_inverse_on_surface</item>
  <item name="colorOutline">@color/my_app_outline</item>
  <item name="colorErrorContainer">@color/my_app_error_container</item>
  <item name="colorOnErrorContainer">@color/my_app_on_error_container</item>
  <item name="textAppearanceDisplayLarge">@style/TextAppearance.Material3.DisplayLarge</item>
  <item name="textAppearanceDisplayMedium">@style/TextAppearance.Material3.DisplayMedium</item>
  <item name="textAppearanceDisplaySmall">@style/TextAppearance.Material3.DisplaySmall</item>
  <item name="textAppearanceHeadlineLarge">@style/TextAppearance.Material3.HeadlineLarge</item>
  <item name="textAppearanceHeadlineMedium">@style/TextAppearance.Material3.HeadlineMedium</item>
  <item name="textAppearanceHeadlineSmall">@style/TextAppearance.Material3.HeadlineSmall</item>
  <item name="textAppearanceTitleLarge">@style/TextAppearance.Material3.TitleLarge</item>
  <item name="textAppearanceTitleMedium">@style/TextAppearance.Material3.TitleMedium</item>
  <item name="textAppearanceTitleSmall">@style/TextAppearance.Material3.TitleSmall</item>
  <item name="textAppearanceBodyLarge">@style/TextAppearance.Material3.BodyLarge</item>
  <item name="textAppearanceBodyMedium">@style/TextAppearance.Material3.BodyMedium</item>
  <item name="textAppearanceBodySmall">@style/TextAppearance.Material3.BodySmall</item>
  <item name="textAppearanceLabelLarge">@style/TextAppearance.Material3.LabelLarge</item>
  <item name="textAppearanceLabelMedium">@style/TextAppearance.Material3.LabelMedium</item>
  <item name="textAppearanceLabelSmall">@style/TextAppearance.Material3.LabelSmall</item>
  <item name="shapeAppearanceSmallComponent">@style/ShapeAppearance.Material3.SmallComponent</item>
  <item name="shapeAppearanceMediumComponent">@style/ShapeAppearance.Material3.MediumComponent</item>
  <item name="shapeAppearanceLargeComponent">@style/ShapeAppearance.Material3.LargeComponent</item>
</style>
```

## 8. Añade componentes de Material

Echa un vistazo a nuestra [documentación](https://material.io/components?platform=android) para la lista completa de componentes de Material disponibles. La página de cada componente tiene instrucciones específicas sobre cómo implementarlo en tu app.

Usemos los [campos de texto](components/TextField.md) como ejemplo.

### **Implementando un campo de texto vía XML**

El XML por defecto del [campo de texto contorneado](https://material.io/go/design-text-fields#outlined-text-field) se define como:

```xml
<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/textfield_label">

  <com.google.android.material.textfield.TextInputEditText
      android:layout_width="match_parent"
      android:layout_height="wrap_content"/>
</com.google.android.material.textfield.TextInputLayout>
```

**Nota:** Si **no** estás usando un tema que hereda de un tema `Material3`, tendrás que especificar también el estilo del campo de texto, vía `style="@style/Widget.Material3.TextInputLayout.OutlinedBox"`

También se proporcionan otros estilos de campos de texto. Por ejemplo, si quieres un [campo de texto relleno](https://material.io/go/design-text-fields#filled-text-field) en tu layout, puedes aplicar el estilo `filled` de `Material3` al campo de texto en XML:

```xml
<com.google.android.material.textfield.TextInputLayout
    style="@style/Widget.Material3.TextInputLayout.FilledBox"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/textfield_label">

  <com.google.android.material.textfield.TextInputEditText
      android:layout_width="match_parent"
      android:layout_height="wrap_content"/>
</com.google.android.material.textfield.TextInputLayout>
```

## Contribuidores

Material Components for Android da la bienvenida a las contribuciones de la comunidad. Echa un vistazo a nuestras [directrices de contribución](contributing.md) así como a una visión general de la [estructura de directorios](directorystructure.md) antes de empezar.

## Enlaces Útiles

-   [Guía de Temas](theming.md)
-   [Contribuir](contributing.md)
-   [Usando la Versión Snapshot](using-snapshot-version.md)
-   [Construyendo desde la Fuente](building-from-source.md)
-   [App de Catálogo](catalog-app.md)
-   [Documentación de Clases](https://developer.android.com/reference/com/google/android/material/classes)
-   [MDC-Android on Stack Overflow](https://www.stackoverflow.com/questions/tagged/material-components+android)
-   [Guía para Desarrolladores de Android](https://developer.android.com/training/material/index.html)
-   [Material.io](https://www.material.io)
-   [Guías de Material Design](https://material.google.com)
