<!--docs:
title: "Controles de selección de materiales: Botón de radio"
layout: detail
section: components
excerpt: "Los controles de selección permiten al usuario seleccionar opciones."
iconId: radiobutton
path: /catalog/radiobuttons/
-->

# Botón de radio

Los [botones de radio](https://m3.material.io/components/radio-button/overview) permiten a las personas seleccionar una opción de un conjunto de opciones.

<img src="assets/radiobutton/radiobutton-hero.png" alt="Menú de configuración con botones de radio" width="800"/>

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/radio-button/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/radiobutton/package-summary)

## Anatomía

![Anatomía del botón de radio](assets/radiobutton/radiobutton-anatomy.png)

1.  Icono (seleccionado)
2.  Texto de la etiqueta adyacente
3.  Icono (no seleccionado)

Más detalles sobre los elementos de la anatomía están disponibles en las [guías del componente](https://m3.material.io/components/radio-button/guidelines#4c0190e7-49da-43bf-b08b-828f71300425).

## Propiedades clave

### Atributos del botón de radio

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Para usar colores de material** | `app:useMaterialThemeColors` | `setUseMaterialThemeColors`<br/>`isUseMaterialThemeColors` | `true` (ignorado si se establece `app:buttonTint`)
**Color** | `app:buttonTint` | `setButtonTintList`<br/>`getButtonTintList` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/radiobutton/res/color/m3_radiobutton_button_tint.xml))
**Tamaño mínimo** | `android:minWidth`<br/>`android:minHeight` | `(set/get)MinWidth`<br/>`(set/get)MinHeight` | `?attr/minTouchTargetSize`

El color del botón de radio tiene como valor predeterminado `?attr/colorOnSurface` (no marcado) y `?attr/colorPrimary` (marcado) definidos en el tema de tu aplicación. Si deseas anular este comportamiento, puedes usar un dibujable personalizado que no debe teñirse, establece `app:useMaterialThemeColors` en `false`:

```xml
<RadioButton
    ...
    app:useMaterialThemeColors="false"
/>
```

### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColors` | hereda de `AppCompatRadioButton`
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceBodyMedium`

### Estados del botón de radio

Los botones de radio se pueden seleccionar o anular la selección. Los botones de radio tienen los estados habilitado, deshabilitado, suspendido, enfocado y presionado.

![Estados del botón de radio en una matriz. Las columnas son habilitado, deshabilitado, suspendido, enfocado, presionado. Las filas están seleccionadas o no seleccionadas](assets/radiobutton/radiobutton-states.png)

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.CompoundButton.RadioButton` | `?attr/radioButtonStyle`

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/radiobutton/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/radiobutton/res/values/attrs.xml).

## Implementación del código

Antes de poder usar los botones de radio de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregar botón de radio

Un botón de radio es un círculo que se llena con una inserción cuando se selecciona. Los botones de radio permiten al usuario seleccionar una opción de un conjunto. Usa botones de radio cuando el usuario necesite ver todas las opciones disponibles. Si las opciones disponibles se pueden contraer, considera usar un menú desplegable porque usa menos espacio.

**Nota:** `<RadioButton>` se infla automáticamente como `<com.google.android.material.button.MaterialRadioButton>` a través de `MaterialComponentsViewInflater` cuando se usa un tema `Theme.Material3.*`.

<h3 id="radio-button-group-example">Ejemplo de botón de radio</h3>

El siguiente ejemplo muestra un grupo de botones de radio con tres botones de radio.

<img src="assets/radiobutton/radiobutton-example.png" alt="Ejemplo de grupo de botones de radio con 3 botones de radio, el primero está seleccionado" width="200"/>

En el diseño:

```xml
<RadioGroup
    android:checkedButton="@+id/enabled_selected"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <RadioButton
        android:id="@+id/enabled_selected"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:enabled="true"
        android:paddingStart="@dimen/padding_start"
        android:text="@string/radiobutton_text"/>
    <RadioButton
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:checked="false"
        android:enabled="true"
        android:paddingStart="@dimen/padding_start"
        android:text="@string/radiobutton_text"/>
    <RadioButton
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:checked="false"
        android:enabled="true"
        android:paddingStart="@dimen/padding_start"
        android:text="@string/radiobutton_text"/>
</RadioGroup>
```

En el código:

```kt
val checkedRadioButtonId = radioGroup.checkedRadioButtonId // Devuelve View.NO_ID si no hay nada marcado.
radioGroup.setOnCheckedChangeListener { group, checkedId ->
    // Responde a los cambios de marcado/desmarcado del RadioButton hijo
}

// Para marcar un botón de radio
radioButton.isChecked = true

// Para escuchar los cambios de estado de marcado/desmarcado de un botón de radio
radioButton.setOnCheckedChangeListener { buttonView, isChecked
    // Responde a que el botón de radio se marque/desmarque
}
```

### Hacer que los botones de radio sean accesibles

Los botones de radio admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como Talkback, pueden leerlos. El texto representado en los botones de radio se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

### Agrupar botones de radio

Los cambios en los estados de un botón de radio pueden afectar a otros botones del grupo. Específicamente, seleccionar un `RadioButton` en un `RadioGroup` anulará la selección de todos los demás botones de ese grupo. Consulta la [sección de ejemplo](#radio-button-group-example) para obtener detalles de implementación.

## Personalización de botones de radio

### Tematización de botones de radio

Los botones de radio admiten la personalización de color y tipografía.

#### Ejemplo de tematización de botones de radio

API y código fuente:

*   `MaterialRadioButton`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/radiobutton/MaterialRadioButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/radiobutton/MaterialRadioButton.java)
*   `RadioGroup`
    *   [Definición de la clase](https://developer.android.com/reference/android/widget/RadioGroup)

El siguiente ejemplo muestra un botón de radio con tematización de Material.

!["5 botones de radio con texto marrón; el primero seleccionado con contorno y relleno rosa, el último deshabilitado con texto y botón marrón claro"](assets/radiobutton/radiobutton-theming.png)

##### Implementación de la tematización de botones de radio

Usa atributos de tema en `res/values/styles.xml` que se aplican a todos los botones de radio y afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="colorPrimary">@color/shrine_pink_100</item>
</style>

```

Usa atributos de tema de estilo predeterminado, estilos y superposiciones de tema que se aplican a todos los botones de radio pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="radioButtonStyle">@style/Widget.App.RadioButton</item>
</style>

<style name="Widget.App.RadioButton" parent="Widget.Material3.CompoundButton.RadioButton">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.RadioButton</item>
</style>

<style name="ThemeOverlay.App.RadioButton" parent="">
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="colorPrimary">@color/shrine_pink_100</item>
</style>
```

También puedes cambiar los colores del botón de radio a través del atributo `?attr/buttonTint`:

```xml
<style name="Widget.App.RadioButton" parent="Widget.Material3.CompoundButton.RadioButton">
    <item name="buttonTint">@color/button_tint</item>
</style>
```

y en `color/button_tint.xml`:

```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:color="@color/shrine_pink_900" android:state_checked="true"/>
    <item android:alpha="0.38" android:color="@color/shrine_pink_100" android:state_enabled="false"/>
    <item android:color="@color/shrine_pink_100"/>
</selector>
```

Puedes usar los estilos en el diseño, lo que afecta solo a este botón de radio:

```xml
<RadioButton
    ...
    style="@style/Widget.App.RadioButton"
/>
```
