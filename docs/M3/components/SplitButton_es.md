<!--docs:
title: "Botón dividido"
layout: detail
section: components
excerpt: "Un componente de botón personalizable con estilos visuales actualizados."
iconId: materialbutton
path: /catalog/buttons/
-->

# Botón dividido

Los [botones divididos](https://m3.material.io/components/split-button/overview) abren un
menú para dar a las personas más opciones relacionadas con una acción. Es un tipo especializado
del grupo de botones conectados. El botón final es marcable con un icono animado.

![Héroe del botón dividido](assets/buttons/splitbutton-hero.png)

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/split-button/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/button/package-summary)

## Anatomía

![Anatomía de un botón dividido](assets/buttons/splitbutton-anatomy.png)

1.  Botón principal
2.  Icono
3.  Texto de la etiqueta
4.  Botón final

Más detalles sobre los elementos de la anatomía en las
[directrices del componente](https://m3.material.io/components/split-button/guidelines#551f6e11-0f95-41c2-9398-cd4066755806).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las
[instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/buttons/splitbutton-expressive.png" alt="5 tamaños de botones divididos." height="400"/>
Los botones divididos tienen los mismos cinco tamaños recomendados que los botones de etiqueta e icono

El botón dividido tiene un botón de menú separado que gira y cambia de forma cuando
se activa. Se puede usar junto con otros botones del mismo tamaño.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

El botón dividido es un nuevo componente agregado en expresivo, un tipo especial de grupo de botones conectados.

**Tamaños:**

*   Extra pequeño
*   Pequeño
*   Mediano
*   Grande
*   Extra grande

**Estilos de color:**

*   Elevado
*   Relleno
*   Tonal
*   Delineado

## Propiedades clave

### Atributos de tamaño y espacio

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Tamaño de las esquinas interiores** | `app:innerCornerSize` | `setInnerCornerSize`<br/>`getInnerCornerSize` | `none`
**Espaciado entre botones** | `android:spacing` | `setSpacing`<br/>`getSpacing` | `2dp`
**Cambio de tamaño del botón** | `app:buttonSizeChange` | N/A | `0%`

### Estilos y atributos de tema

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.MaterialSplitButton` | `?attr/materialSplitButtonStyle`
**Estilo principal del botón principal (relleno)** | `Widget.Material3.SplitButton.LeadingButton.Filled` | `?attr/materialSplitButtonLeadingFilledStyle`
**Estilo principal del botón principal (tonal)** | `Widget.Material3.SplitButton.LeadingButton.Filled.Tonal` | `?attr/materialSplitButtonLeadingFilledTonalStyle`
**Estilo principal del icono final (relleno)** | `Widget.Material3.SplitButton.IconButton.Filled` | `?attr/materialSplitButtonIconFilledStyle`
**Estilo secundario del icono final (tonal)** | `Widget.Material3.SplitButton.IconButton.Filled.Tonal` | `?attr/materialSplitButtonIconFilledTonalStyle`

Los dos nuevos estilos de icono final `materialSplitButtonIconFilledStyle` – con `materialIconButtonFilledStyle` como padre – y
`materialSplitButtonIconFilledTonalStyle` – con `materialIconButtonFilledTonalStyle` como padre – permiten el comportamiento personalizado de `MaterialSplitButton` para los estados `onChecked` y `onUnchecked`.
`materialSplitButtonIconFilledStyle` se combina con el estilo de botón principal predeterminado, sin ningún estilo especificado explícitamente en el XML.
`materialSplitButtonIconFilledTonalStyle` se combina con `materialButtonTonalStyle` para el botón principal.

## Implementación de código

Antes de poder usar los botones de Material, debes agregar una dependencia a la
biblioteca de componentes de Material para Android. Para obtener más información, ve a la
página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** `<Button>` se infla automáticamente como
`<com.google.android.material.button.MaterialButton>` a través de
`MaterialComponentsViewInflater` cuando se usa un tema `Theme.Material3.*`.

El botón principal en los botones divididos puede tener un icono, un texto de etiqueta o ambos. El
botón final siempre debe tener un icono de menú.
![Ejemplos de uso de botón dividido](assets/buttons/split-button.png)

1.  Etiqueta + icono
2.  Etiqueta
3.  Icono

### Agregar botón dividido

Código fuente:

*   `MaterialSplitButton`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialSplitButton.java)

El siguiente ejemplo muestra un botón dividido con un botón de etiqueta principal y un
botón de icono final que tiene un AnimatedVectorDrawable.

En el diseño:

```xml
<com.google.android.material.button.MaterialSplitButton
    android:id="@+id/splitbutton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        style="?attr/materialSplitButtonLeadingFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/cat_split_button_label"
        app:icon="@drawable/ic_edit_vd_theme_24dp"
    />
    <Button
        style="?attr/materialSplitButtonIconFilledStyle"
        android:id="@+id/expand_more_or_less_filled"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_split_button_label_chevron"
        app:icon="@drawable/m3_split_button_chevron_avd"
    />
</com.google.android.material.button.MaterialSplitButton>
```

### Hacer que los botones sean accesibles

Los botones admiten el etiquetado de contenido para la accesibilidad y la mayoría de los
lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los botones se proporciona automáticamente
a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, ve a la
[guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

### Animar el icono final

El icono del botón final está animado. En los ejemplos, esto se hace con
un AVD, `m3_split_button_chevron_avd`
[[fuente](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/drawable/m3_split_button_chevron_avd.xml)].

## Personalizar el botón dividido

### Tematizar botones

Los botones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de botones

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra los tipos de botones de texto, delineados y rellenos con la tematización de Material.

!["Tematización de botones con tres botones (texto, delineado y relleno) con tematización de color rosa y esquinas cortadas."](assets/buttons/button-theming.png)

##### Implementación de la tematización de botones

Usa atributos y estilos de tema en `res/values/styles.xml` para agregar el tema a
todos los botones. Esto afecta a otros componentes:

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

Usa atributos de tema de estilo predeterminados, estilos y superposiciones de tema. Esto agrega el
tema a todos los botones pero no afecta a otros componentes:

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

El centrado óptico significa desplazar el contenido de `MaterialButton` (icono y/o
etiqueta) cuando la forma es asimétrica. Antes del centrado óptico, solo proporcionábamos
centrado con formas horizontalmente asimétricas.

Para activar el centrado óptico para un botón determinado, usa
`setOpticalCenterEnabled(true)`. El centrado óptico está deshabilitado de forma predeterminada. Cuando
está habilitado, la cantidad de desplazamiento del icono y/o texto se calcula como un valor con
la proporción fija a la diferencia entre el tamaño de la esquina izquierda en dp y el tamaño de la esquina derecha
en dp. La cantidad de desplazamiento se aplica al relleno inicial y al relleno final.
