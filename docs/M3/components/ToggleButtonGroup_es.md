<!--docs:
title: "Grupo de botones de dos estados"
layout: detail
section: components
excerpt: "Un componente de botón personalizable con estilos visuales actualizados."
iconId: materialbutton
path: /catalog/buttons/
-->

# Grupos de botones de dos estados

**Nota:** Los botones segmentados están siendo obsoletos en la actualización expresiva de Material 3. Para aquellos que han actualizado, usen el [grupo de botones conectados](https://github.com/material-components/material-components-android/tree/master/docs/components/ButtonGroup.md) en su lugar, que tiene principalmente la misma funcionalidad pero con un diseño visual actualizado.

El [grupo de botones de dos estados (botones segmentados)](https://m3.material.io/components/segmented-buttons) se puede usar para seleccionar de un grupo de opciones. Hay dos tipos de botones de dos estados que se pueden colocar en un grupo de botones de dos estados:

*   [Botón de dos estados](#toggle-button)
*   [Botón de icono de dos estados](#icon-toggle-button)

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/segmented-buttons)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/button/package-summary)

## Anatomía

Un botón de dos estados tiene un contenedor con trazo compartido, iconos y/o etiquetas de texto.

![Anatomía del grupo de botones de dos estados](assets/buttons/togglebuttongroup-anatomy.png)

1.  Contenedor
2.  Icono (opcional para el estado no seleccionado)
3.  Texto de la etiqueta

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/segmented-buttons/guidelines#75ec9219-0196-4c59-bd6a-ed9a1b481013).

## M3 Expressive

### Actualización de M3 Expressive

El botón segmentado está siendo obsoleto. Usa el [grupo de botones conectados](https://github.com/material-components/material-components-android/tree/master/docs/components/ButtonGroup.md) en su lugar.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

### Estilo de M3 Expressive

Estilo predeterminado en los temas expresivos:
`Widget.Material3Expressive.MaterialButtonToggleGroup`

## Propiedades clave

### Atributos de selección

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Selección única** | `app:singleSelection` | `setSingleSelection`<br/>`isSingleSelection` | `false`
**Selección requerida** | `app:selectionRequired` | `setSelectionRequired`<br/>`isSelectionRequired` | `false`
**Habilitar el grupo y todos los hijos** | `android:enabled` | `setEnabled`<br/>`isEnabled` | `true`

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Tamaño de las esquinas interiores** | `app:innerCornerSize` | `setInnerCornerSize`<br/>`getInnerCornerSize` | `0dp`
**Espaciado entre botones** | `android:spacing` | `setSpacing`<br/>`getSpacing` | `0dp`
**Forma del grupo (esquinas exteriores)** | `app:shapeAppearance` | `setShapeAppearance`</br>`getShapeAppearance` | `none`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.MaterialButtonToggleGroup` | `?attr/materialButtonToggleGroupStyle`

Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml) y [atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

## Implementación de código

Antes de poder usar los botones de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** `<Button>` se infla automáticamente como `<com.google.android.material.button.MaterialButton>` a través de `MaterialComponentsViewInflater` cuando se usa un tema `Theme.Material3.*`.

<h3 id="toggle-button">Agregar botón de dos estados</h3>

Para enfatizar grupos de botones de dos estados relacionados, un grupo debe compartir un contenedor común.

#### Ejemplos de botones de dos estados

API y código fuente:

*   `MaterialButtonToggleGroup`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButtonToggleGroup.java)
*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón de dos estados con tres botones que tienen etiquetas de texto.

!["Ejemplo de botón de dos estados para Android con etiquetas de texto - 'Botón 1', 'Botón 2' y 'Botón 3' - y bordes gris/púrpura sobre un fondo blanco."](assets/buttons/toggle-button-text.png)

En el diseño:

```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    android:id="@+id/toggleButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 1"
    />
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 2"
    />
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 3"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
```

En el código:

```kt
toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
    // Responder a la selección del botón
}
```

### Agregar un botón de dos estados de solo icono

El siguiente ejemplo muestra un botón de dos estados con tres botones que tienen iconos.

!["Botones de dos estados con iconos - corazón, agregar y buscar - y bordes gris/púrpura sobre un fondo blanco."](assets/buttons/toggle-button.png)

En `res/values/styles.xml`:

```xml
<style name="Widget.App.Button.OutlinedButton.IconOnly" parent="Widget.Material3.Button.OutlinedButton">
    <item name="iconPadding">0dp</item>
    <item name="android:insetTop">0dp</item>
    <item name="android:insetBottom">0dp</item>
    <item name="android:paddingLeft">12dp</item>
    <item name="android:paddingRight">12dp</item>
    <item name="android:minWidth">48dp</item>
    <item name="android:minHeight">48dp</item>
</style>
```

En el diseño:

```xml
<com.google.android.material.button.MaterialButtonToggleGroup
    ...>
    <Button
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
        ...
        app:icon="@drawable/ic_favorite_24dp"
    />
    <Button
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
        ...
        app:icon="@drawable/ic_add_24dp"
    />
    <Button
        style="@style/Widget.App.Button.OutlinedButton.IconOnly"
        ...
        app:icon="@drawable/ic_search_24dp"
    />
</com.google.android.material.button.MaterialButtonToggleGroup>
```

<h3 id="icon-toggle-button">Agregar botón de icono de dos estados</h3>

Los iconos se pueden usar como botones de dos estados cuando permiten la selección o anulación de la selección de una sola opción, como marcar un elemento como favorito.

#### Ejemplo de icono de dos estados

API y código fuente:

*   `CheckBox`
    *   [Descripción de la clase](https://developer.android.com/reference/android/widget/CheckBox)

**Nota:** La API `CheckBox` es solo una de las varias entradas que pueden implementar el botón de icono. Consulta otros [controles de selección](https://material.io/components/selection-controls/) para obtener más detalles.

El siguiente ejemplo muestra un icono que se puede usar de forma independiente o en elementos de un `RecyclerView`.

![Ejemplo de icono de dos estados que muestra 4 imágenes, icono de corazón en la esquina superior derecha de cada imagen](assets/buttons/android-toggle-button.png)

En el diseño:

```xml
<CheckBox
    android:id="@+id/icon"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:button="@drawable/sl_favourite_24dp"
    app:buttonTint="@android:color/white"
/>
```

En `res/drawable/sl_favourite_24dp.xml`:

```xml
<selector>
    <item
        android:drawable="@drawable/ic_favourite_outlined_24dp"
        android:state_checked="false" />
    <item
        android:drawable="@drawable/ic_favourite_filled_24dp"
        android:state_checked="true" />
    <item android:drawable="@drawable/ic_favourite_outlined_24dp" />
</selector>
```

En el código:

```kt
icon.setOnCheckedChangeListener { checkBox, isChecked ->
    // Responder al cambio de estado del icono
}
```

### Hacer que los botones sean accesibles

Los botones admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los botones se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, ve a la [guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

## Personalización de grupos de botones de dos estados

### Tematización de botones

Los botones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de botones

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra los tipos de botones de texto, delineado y relleno con tematización de Material.

!["Tematización de botones con tres botones - texto, delineado y relleno - con tematización de color rosa y esquinas cortadas."](assets/buttons/button-theming.png)

##### Implementación de la tematización de botones

Usa atributos y estilos de tema en `res/values/styles.xml` para agregar el tema a todos los botones. Esto afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="textAppearanceLabelLarge">@style/TextAppearance.App.Button</item>
    <item name="shapeCornerFamily">cut</item>
</style>

<style name="TextAppearance.App.Button" parent="TextAppearance.Material3.LabelLarge">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>
```

Usa atributos de tema de estilo predeterminado, estilos y superposiciones de tema. Esto agrega el tema a todos los botones pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="borderlessButtonStyle">@style/Widget.App.Button.TextButton</item>
    <item name="materialButtonOutlinedStyle">@style/Widget.App.Button.OutlinedButton</item>
    <item name="materialButtonStyle">@style/Widget.App.Button</item>
</style>

<style name="Widget.App.Button.TextButton" parent="Widget.Material3.Button.TextButton">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button.TextButton</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="Widget.App.Button.OutlinedButton" parent="Widget.Material3.Button.OutlinedButton">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button.TextButton</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="Widget.App.Button" parent="Widget.Material3.Button">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="ThemeOverlay.App.Button.TextButton" parent="ThemeOverlay.Material3.Button.TextButton">
    <item name="colorOnContainer">@color/shrine_pink_900</item>
</style>

<style name="ThemeOverlay.App.Button" parent="ThemeOverlay.Material3.Button">
    <item name="colorContainer">@color/shrine_pink_100</item>
    <item name="colorOnContainer">@color/shrine_pink_900</item>
</style>

<style name="ShapeAppearance.App.Button" parent="">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">4dp</item>
</style>
```

Usa uno de los estilos en el diseño. Eso afectará solo a este botón:

```xml

<Button style="@style/Widget.App.Button".../>
```

### Centrado óptico

El centrado óptico significa desplazar el contenido de `MaterialButton` (icono y/o etiqueta) cuando la forma es asimétrica. Antes del centrado óptico, solo proporcionábamos centrado con formas horizontalmente asimétricas.

Para activar el centrado óptico para un botón determinado, usa `setOpticalCenterEnabled(true)`. El centrado óptico está deshabilitado de forma predeterminada. Cuando está habilitado, la cantidad de desplazamiento del icono y/o texto se calcula como un valor con la proporción fija a la diferencia entre el tamaño de la esquina izquierda en dp y el tamaño de la esquina derecha en dp. La cantidad de desplazamiento se aplica al relleno inicial y al relleno final.
