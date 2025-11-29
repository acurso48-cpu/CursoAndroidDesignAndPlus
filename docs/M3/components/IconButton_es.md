<!--docs:
title: "Botones de icono"
layout: detail
section: components
excerpt: "Un componente de botón personalizable con estilos visuales actualizados."
iconId: materialbutton
path: /catalog/buttons/
-->

# Botones de icono

Los [botones de icono](https://m3.material.io/components/icon-buttons/overview) ayudan a las personas a realizar acciones menores con un solo toque. Hay dos variantes de botones de icono.

![2 tipos de botones de icono](assets/buttons/iconbutton-types.png)

1.  Botón de icono predeterminado
2.  Botón de icono de dos estados

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/icon-buttons/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/button/package-summary)

## Anatomía

![Anatomía de un botón de icono](assets/buttons/iconbuttons-anatomy.png)

1.  Icono
2.  Contenedor

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/icon-buttons/guidelines#1f6f6121-e403-4d82-aa6a-5ab276f4bc4c).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/buttons/iconbuttons-expressive.png" alt="Los botones de icono pueden variar en tamaño, forma y ancho." height="400"/>

1.  Cinco tamaños
2.  Dos formas
3.  Tres anchos

Los botones de icono ahora tienen una variedad más amplia de formas y tamaños, cambiando de forma cuando se seleccionan. Cuando se colocan en grupos de botones, los botones de icono interactúan entre sí cuando se presionan.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Predeterminado y de dos estados (selección)
*   Los estilos de color ahora son configuraciones. (relleno, tonal, delineado, estándar)

**Formas:**

*   Opciones redondas y cuadradas
*   La forma se transforma cuando se presiona
*   La forma se transforma cuando se selecciona

**Tamaños:**

*   Extra pequeño
*   Pequeño (predeterminado)
*   Mediano
*   Grande
*   Extra grande

**Anchos:**

*   Estrecho
*   Predeterminado
*   Ancho

### Estilos de M3 Expressive

#### Formas de botones de icono

<details><summary><h5>Redondo</h5></summary>

|Predeterminado <div style="width:250px"></div>| Marcado <div style="width:250px"></div>|Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono relleno redondo expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-round-default-light-theme.png)|![Botón de icono relleno redondo expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-round-checked-light-theme.png)|![Botón de icono relleno redondo expresivo sin marcar solo con icono en tema claro](assets/buttons/iconbutton-round-unchecked-light-theme.png)|

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"/>
```

</details>

<details><summary><h5>Cuadrado</h5></summary>

|Predeterminado <div style="width:250px"></div>| Marcado <div style="width:250px"></div>|Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono relleno cuadrado expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-square-default-light-theme.png)|![Botón de icono relleno cuadrado expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-square-checked-light-theme.png)|![Botón de icono relleno cuadrado expresivo sin marcar solo con icono en tema claro](assets/buttons/iconbutton-square-unchecked-light-theme.png)|

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.{Small}.Square"/>
```

</details>

#### Botón de icono en diferentes tamaños

Hay cinco variantes de tamaño de botón de icono: Extra pequeño, pequeño, mediano, grande y extra grande.

<details><summary><h5>Extra pequeño</h5></summary>

**Nota:** Las imágenes a continuación muestran los botones de solo icono en diferentes tamaños relativamente. Los tamaños reales en px en dispositivos móviles dependen de la densidad de píxeles de la pantalla.

<img src="assets/buttons/iconbutton-extra-small-light-theme.png" alt="Ejemplo de botón de icono relleno extra pequeño solo con icono en tema claro" height="80">

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.Xsmall"/>
```

</details>

<details><summary><h5>Pequeño</h5></summary>

<img src="assets/buttons/iconbutton-small-light-theme.png" alt="Ejemplo de botón de icono relleno pequeño solo con icono en tema claro" height="120">

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.Small"/>
```

</details>

<details><summary><h5>Mediano</h5></summary>

<img src="assets/buttons/iconbutton-medium-light-theme.png" alt="Ejemplo de botón de icono relleno mediano solo con icono en tema claro" height="160">

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.Medium"/>
```

</details>

<details><summary><h5>Grande</h5></summary>

<img src="assets/buttons/iconbutton-large-light-theme.png" alt="Ejemplo de botón de icono relleno grande solo con icono en tema claro" height="200">

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.Large"/>
```

</details>

<details><summary><h5>Extra grande</h5></summary>

<img src="assets/buttons/iconbutton-extra-large-light-theme.png" alt="Ejemplo de botón de icono relleno extra grande solo con icono en tema claro" height="240">

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.Xlarge"/>
```

</details>

#### Botón de icono en diferentes relaciones de ancho y alto

Cada botón de icono tiene tres opciones de ancho: estrecho, uniforme (predeterminado) y ancho.

<details><summary><h5>Estrecho</h5></summary>

![Ejemplo de botón de icono relleno estrecho solo con icono en tema claro](assets/buttons/iconbutton-narrow-light-theme.png)

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.{Small}.Narrow"/>
```

</details>

<details><summary><h5>Predeterminado</h5></summary>

![Ejemplo de botón de icono relleno predeterminado solo con icono en tema claro](assets/buttons/iconbutton-default-light-theme.png)

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"/>
```

</details>

<details><summary><h5>Ancho</h5></summary>

![Ejemplo de botón de icono relleno ancho solo con icono en tema claro](assets/buttons/iconbutton-wide-light-theme.png)

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/icon"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.IconButton.{Small}.Wide"/>
```

</details>

## Propiedades clave

### Estilos y atributos de tema

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.Button.IconButton` | `?attr/materialIconButtonStyle`
**Botón de icono relleno** | `Widget.Material3.Button.IconButton.Filled` | `?attr/materialIconButtonFilledStyle`
**Botón de icono tonal relleno** | `Widget.Material3.Button.IconButton.Filled.Tonal` | `?attr/materialIconButtonFilledTonalStyle`
**Botón de icono delineado** | `Widget.Material3.Button.IconButton.Outlined` | `?attr/materialIconButtonOutlinedStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

## Variantes de botones de icono

Hay cuatro estilos de color de botón de icono, en orden de énfasis:

![Diagrama de botones de icono predeterminados y de dos estados en 4 estilos de color.](assets/buttons/iconbuttons-color.png)

1.  Relleno
2.  Tonal
3.  Delineado
4.  Estándar

Para el mayor énfasis, utiliza el estilo relleno. Para el menor énfasis, utiliza el estándar.

### Botón de icono predeterminado

*   Los botones de icono predeterminados pueden abrir otros elementos, como un menú o una búsqueda.
*   Los botones de icono predeterminados deben usar iconos rellenos.

Se pueden usar iconos individuales para acciones adicionales y complementarias. Son mejores para áreas de un diseño compacto, como una barra de herramientas.

Las dimensiones predeterminadas permiten un objetivo táctil de `48dp`. Si se utiliza un icono más grande que el tamaño predeterminado, las dimensiones de relleno deben ajustarse para preservar la forma circular. Las dimensiones `android:inset*` también se pueden ajustar si se desea menos espacio vacío alrededor del icono.

Incluye siempre un `android:contentDescription` para que los botones de solo icono sean legibles para los lectores de pantalla.

![Botón de icono predeterminado.](assets/buttons/iconbuttons-default.png)
Botones de icono estándar, rellenos sin seleccionar, rellenos seleccionados, rellenos tonales y delineados

**Nota:** Los siguientes ejemplos muestran cómo crear un botón de icono usando `Button`, que se inflará a `MaterialButton` cuando se use un tema de Material. Existe un problema de rendimiento conocido en el que `MaterialButton` tarda más en inicializarse en comparación con `ImageButton` o `AppCompatImageButton`, en gran parte porque `MaterialButton` extiende de `AppCompatButton`, que admite más que solo botones de icono. Considera usar esas alternativas de botón de solo icono si la latencia adicional causa un problema notable para tu aplicación.

#### Agregar botón de icono

<details><summary><h5>Relleno</h5></summary>

|Predeterminado <div style="width:250px"></div>|Marcado <div style="width:250px"></div>|Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono relleno expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-default-light-theme.png)|![Botón de icono relleno expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-checked-light-theme.png) |![Botón de icono relleno sin marcar en tema claro](assets/buttons/iconbutton-unchecked-light-theme.png)|
|![Botón de icono relleno expresivo predeterminado solo con icono en tema oscuro](assets/buttons/iconbutton-default-dark-theme.png)|![Botón de icono relleno expresivo marcado solo con icono en tema oscuro](assets/buttons/iconbutton-checked-dark-theme.png)|![botón de solo icono relleno sin marcar_oscuro](assets/buttons/iconbutton-unchecked-dark-theme.png)|

De forma predeterminada, el botón de solo icono estándar no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialIconButtonFilledStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:contentDescription="@string/icon_description"
    android:checkable="true"
    app:icon="@drawable/icon"/>
```

</details>

<details><summary><h5>Estándar</h5></summary>

|Predeterminado <div style="width:250px"></div>|Marcado <div style="width:250px"></div>|Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono estándar expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-standard-default-light-theme.png)|![Botón de icono estándar expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-standard-checked-light-theme.png)|![botón de solo icono estándar sin marcar_claro](assets/buttons/iconbutton-standard-unchecked-light-theme.png)|
|![Botón de icono estándar expresivo predeterminado solo con icono en tema oscuro](assets/buttons/iconbutton-standard-default-dark-theme.png)|![Botón de icono estándar expresivo marcado solo con icono en tema oscuro](assets/buttons/iconbutton-standard-checked-dark-theme.png)|![botón de solo icono estándar sin marcar_oscuro](assets/buttons/iconbutton-standard-unchecked-dark-theme.png)|

De forma predeterminada, el botón de solo icono estándar no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialIconButtonStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:contentDescription="@string/icon_description"
    android:checkable="true"
    app:icon="@drawable/icon"/>
```

</details>

<details><summary><h5>Tonal relleno</h5></summary>

|Predeterminado <div style="width:250px"></div>|Marcado <div style="width:250px"></div> |Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono tonal relleno expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-filledtonal-default-light-theme.png)|![Botón de icono tonal relleno expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-filledtonal-checked-light-theme.png) |![botón de solo icono tonal relleno sin marcar_claro](assets/buttons/iconbutton-filledtonal-unchecked-light-theme.png)|
|![Botón de icono tonal relleno expresivo predeterminado solo con icono en tema oscuro](assets/buttons/iconbutton-filledtonal-default-dark-theme.png)|![Botón de icono tonal relleno expresivo marcado solo con icono en tema oscuro](assets/buttons/iconbutton-filledtonal-checked-dark-theme.png)|![botón de solo icono tonal relleno sin marcar_oscuro](assets/buttons/iconbutton-filledtonal-unchecked-dark-theme.png)|

De forma predeterminada, el botón de solo icono estándar no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialIconButtonFilledTonalStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:contentDescription="@string/icon_description"
    android:checkable="true"
    app:icon="@drawable/icon"/>
```

</details>

<details><summary><h5>Delineado</h5></summary>

|Predeterminado <div style="width:250px"></div>| Marcado <div style="width:250px"></div>|Sin marcar <div style="width:250px"></div>|
| ------ | ---- | ---- |
|![Botón de icono delineado expresivo predeterminado solo con icono en tema claro](assets/buttons/iconbutton-outlined-default-light-theme.png)|![Botón de icono delineado expresivo marcado solo con icono en tema claro](assets/buttons/iconbutton-outlined-checked-light-theme.png)|![botón de solo icono delineado sin marcar_claro](assets/buttons/iconbutton-outlined-unchecked-light-theme.png)|
|![Botón de icono delineado expresivo predeterminado solo con icono en tema oscuro](assets/buttons/iconbutton-outlined-default-dark-theme.png)|![Botón de icono delineado expresivo marcado solo con icono en tema oscuro](assets/buttons/iconbutton-outlined-checked-dark-theme.png)|![botón de solo icono delineado sin marcar_oscuro](assets/buttons/iconbutton-outlined-unchecked-dark-theme.png)|

De forma predeterminada, el botón de solo icono estándar no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialIconButtonOutlinedStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:contentDescription="@string/icon_description"
    android:checkable="true"
    app:icon="@drawable/icon"/>
```

</details>

### Botón de icono de dos estados

*   Los botones de icono de dos estados pueden representar acciones binarias que se pueden activar y desactivar, como favorito o marcador.

*   Cada botón de icono tiene un comportamiento de dos estados opcional, que permite a las personas seleccionar y anular la selección del botón. Los botones de dos estados permanecen resaltados cuando se seleccionan y tienen un estilo diferente al de los botones predeterminados sin dos estados.

*   Los botones de dos estados deben usar un icono delineado cuando no están seleccionados y una versión rellena del icono cuando están seleccionados.

#### Agregar botón de icono de dos estados

En los botones de dos estados, utiliza el estilo delineado de un icono para el estado no seleccionado y el estilo relleno para el estado seleccionado.

El siguiente ejemplo muestra un botón de icono de dos estados.

Crea el archivo `res/drawable/toggle_icon_button_selector.xml` para incluir los iconos delineado y relleno para el botón de icono de dos estados:

```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">
<item android:state_checked="true" android:drawable="@drawable/star_filled" />
<item android:drawable="@drawable/star_outline" /> </selector>

<com.google.android.material.button.MaterialButton
        android:id="@+id/toggleIconButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.Material3.Button.IconButton.Standard"
        app:icon="@drawable/toggle_icon_button_selector"
        app:iconTint="?attr/colorAccent"
        android:contentDescription="Botón de icono de dos estados"
        android:checkable="true"/>
```

## Implementación de código

### Hacer que los botones sean accesibles

Los botones admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los botones se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, consulta la [guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

## Personalización de botones de icono

### Tematización de botones

Los botones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de botones

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra los tipos de botones de texto, delineado y relleno con tematización de Material.

!["Tematización de botones con tres botones (texto, delineado y relleno) con tematización de color rosa y esquinas cortadas."](assets/buttons/button-theming.png)

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
