<!--docs:
title: "Botones"
layout: detail
section: components
excerpt: "Un componente de botón personalizable con estilos visuales actualizados."
iconId: materialbutton
path: /catalog/buttons/
-->

# Botones

Los [botones](https://m3.material.io/components/buttons/overview) permiten a los usuarios tomar acciones y tomar decisiones con un solo toque. Hay dos variantes de botones comunes.

![2 tipos de botones comunes](assets/buttons/commonbutton-types.png)

1.  Botón predeterminado
2.  Botón de dos estados

![Diagrama de estilos de botones y comportamientos de dos estados](assets/buttons/commonbutton-styles.png)

Hay cinco estilos de botones, en orden de énfasis:

1.  Botón elevado
2.  Botón relleno
3.  Botón tonal relleno
4.  Botón delineado
5.  Botón de texto

Los botones tienen comportamientos predeterminados y de dos estados:

A. Botón predeterminado <br>
B. De dos estados (no seleccionado) <br>
C. De dos estados (seleccionado) <br>

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/buttons/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/button/package-summary)

## Anatomía

![Diagrama de anatomía del botón elevado](assets/buttons/commonbutton-anatomy.png)

1.  Contenedor
2.  Texto de la etiqueta
3.  Icono (opcional)

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/buttons/guidelines#653b660b-e9d8-48ad-9f53-67fb3d76e09e).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/buttons/commonbutton-expressive.png" alt="4 cambios en los botones en la actualización expresiva" height="600"/>

1.  Cinco tamaños
2.  De dos estados (selección)
3.  Dos formas
4.  Dos anchos de relleno pequeños

Los botones ahora tienen una variedad más amplia de formas y tamaños, funcionalidad de dos estados y pueden cambiar de forma cuando se seleccionan.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Predeterminado y de dos estados (selección)
*   Los estilos de color ahora son configuraciones. (elevado, relleno, tonal, delineado, texto)

**Formas:**

*   Opciones redondas y cuadradas
*   La forma se transforma cuando se presiona
*   La forma se transforma cuando se selecciona

**Tamaños:**

*   Extra pequeño
*   Pequeño (existente, predeterminado)
*   Mediano
*   Grande
*   Extra grande

**Nuevo relleno para botones pequeños:**

*   16dp (recomendado para que coincida con el relleno de los nuevos tamaños)
*   24dp (obsoleto)

### Estilos de M3 Expressive

#### Botones

<details><summary><h5>Relleno</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Ejemplo de botón relleno expresivo predeterminado en tema oscuro](assets/buttons/default-filled-button-dark.png) | ![Botón relleno expresivo marcado en tema oscuro](assets/buttons/checked-filled-button-dark.png) | ![Botón relleno expresivo sin marcar en tema claro](assets/buttons/default-filled-button-dark.png)
![Ejemplo de botón relleno expresivo predeterminado en tema claro](assets/buttons/default-filled-button-light.png) | ![Botón relleno expresivo marcado en tema claro](assets/buttons/checked-filled-button-light.png) | ![Botón relleno expresivo sin marcar en tema oscuro](assets/buttons/default-filled-button-light.png)

De forma predeterminada, el botón relleno no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    android:checkable="true"/>
```

</details>

<details><summary><h5>Tonal relleno</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón tonal relleno expresivo predeterminado en tema claro](assets/buttons/default-filled-tonal-light.png) | ![Botón tonal relleno expresivo marcado en tema oscuro](assets/buttons/checked-filled-tonal-dark.png) | ![Botón tonal relleno expresivo sin marcar en tema claro](assets/buttons/default-filled-tonal-light.png)
![Botón tonal relleno expresivo predeterminado en tema oscuro](assets/buttons/default-filled-tonal-dark.png) | ![Botón tonal relleno expresivo marcado en tema claro](assets/buttons/checked-filled-tonal-light.png) | ![Botón tonal relleno expresivo sin marcar en tema oscuro](assets/buttons/default-filled-tonal-dark.png)

De forma predeterminada, el botón tonal no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialButtonTonalStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    android:checkable="true"/>
```

</details>

<details><summary><h5>Delineado</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón delineado expresivo predeterminado en tema claro](assets/buttons/default-outlined-button-light.png) | ![Botón delineado expresivo marcado en tema oscuro](assets/buttons/checked-outlined-button-dark.png) | ![Botón delineado expresivo sin marcar en tema claro](assets/buttons/default-outlined-button-light.png)
![Botón delineado expresivo predeterminado en tema oscuro](assets/buttons/default-outlined-button-dark.png) | ![Botón delineado expresivo marcado en tema claro](assets/buttons/checked-outlined-button-light.png) | ![Botón delineado expresivo sin marcar en tema oscuro](assets/buttons/default-outlined-button-dark.png)

De forma predeterminada, el botón delineado no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialButtonOutlinedStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    android:checkable="true"/>
```

</details>

<details><summary><h5>Texto</h5></summary>

<img src="assets/buttons/text-button-dark.png" alt="Botón de texto expresivo en tema oscuro con texto oscuro y sin contorno" width="175"> <div style="width:400px"></div> | <img src="assets/buttons/text-button-light.png" alt="Botón de texto expresivo en tema claro con texto claro y sin contorno" width="175"> <div style="width:400px"></div>
--- | ---

El botón de texto aparece como solo texto hasta que se presiona. No tiene un relleno sólido ni un contorno de forma predeterminada.

```xml
<Button
    style="?attr/borderlessButtonStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"/>
```

</details>

<details><summary><h5>Elevado</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón elevado expresivo predeterminado en tema claro](assets/buttons/default-elevated-light.png) | ![Botón elevado expresivo marcado en tema oscuro](assets/buttons/checked-elevated-dark.png) | ![Botón elevado expresivo sin marcar en tema claro](assets/buttons/default-elevated-light.png)
![Botón elevado expresivo predeterminado en tema oscuro](assets/buttons/default-elevated-dark.png) | ![Botón elevado expresivo marcado en tema claro](assets/buttons/checked-elevated-light.png) | ![Botón elevado expresivo sin marcar en tema oscuro](assets/buttons/default-elevated-dark.png)

De forma predeterminada, el botón elevado no se puede marcar. Para hacerlo marcable, habilita el atributo `android:checkable` en el estilo o diseño.

```xml
<Button
    style="?attr/materialButtonElevatedStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    android:checkable="true"/>
```

</details>

<details><summary><h5>Botón relleno con iconos</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón de icono relleno expresivo predeterminado en tema claro](assets/buttons/default-filled-icon-button-light.png) | ![Botón de icono relleno expresivo marcado en tema oscuro](assets/buttons/checked-filled-icon-button-dark.png) | ![Botón de icono relleno expresivo sin marcar en tema claro](assets/buttons/default-filled-icon-button-light.png)
![Botón de icono relleno expresivo predeterminado en tema oscuro](assets/buttons/default-filled-icon-button-dark.png) | ![Botón de icono relleno expresivo marcado en tema claro](assets/buttons/checked-filled-icon-button-light.png) | ![Botón de icono relleno expresivo sin marcar en tema oscuro](assets/buttons/default-filled-icon-button-dark.png)

Los iconos comunican visualmente la acción del botón y ayudan a llamar la atención. Deben colocarse en el lado principal del botón, antes del texto de la etiqueta.

```xml
<Button
    style="@style/Widget.Material3Expressive.Button.Icon"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:icon="@drawable/ic_dialogs_24px"
    android:checkable="true"/>
```

</details>

#### Formas

<details><summary><h5>Redondo</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón relleno redondo expresivo predeterminado con icono en tema claro](assets/buttons/default-filled-button-light.png) | ![Botón relleno redondo expresivo marcado con icono en tema claro](assets/buttons/checked-filled-button-light.png) | ![Botón cuadrado redondo expresivo sin marcar con icono en tema claro](assets/buttons/default-filled-button-light.png)

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"/>
```

</details>

<details><summary><h5>Cuadrado</h5></summary>

Predeterminado <div style="width:250px"></div> | Marcado <div style="width:250px"></div> | Sin marcar <div style="width:250px"></div>
--- | --- | ---
![Botón relleno cuadrado expresivo predeterminado con icono en tema claro](assets/buttons/checked-filled-button-light.png) | ![Botón relleno cuadrado expresivo marcado con icono en tema claro](assets/buttons/default-filled-button-light.png) | ![Botón relleno cuadrado expresivo sin marcar con icono en tema claro](assets/buttons/checked-filled-button-light.png)

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.{Small}.Square"/>
```

</details>

#### Tamaños

**Nota:** Las imágenes a continuación muestran los botones de etiqueta en diferentes tamaños relativamente. Los tamaños reales en px en dispositivos móviles dependen de la densidad de píxeles de la pantalla.

<details><summary><h5>Extra pequeño</h5></summary>

<img src="assets/buttons/extrasmall.png" width=201 height=144/>

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.Xsmall"/>
```

</details>

<details><summary><h5>Pequeño</h5></summary>

<img src="assets/buttons/small-size.png" width=225 height=144/>

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"/>
```

</details>

<details><summary><h5>Mediano</h5></summary>

<img src="assets/buttons/medium-size.png" width=288 height=168/>

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.Medium"/>
```

</details>

<details><summary><h5>Grande</h5></summary>

<img src="assets/buttons/large-size.png" width=501 height=288/>

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.Large"/>
```

</details>

<details><summary><h5>Extra grande</h5></summary>

<img src="assets/buttons/extra-large-size.png" width=670 height=408/>

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_text"
    app:materialSizeOverlay="@style/SizeOverlay.Material3Expressive.Button.Xlarge"/>
```

</details>

## Propiedades clave

<details>

<summary><h3>Botón elevado</h3></summary>

#### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorSurfaceContainerLow` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null`
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp`
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearance.M3.Sys.Shape.Corner.Full`
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `1dp`
**Color de la ondulación** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnSurface` con una opacidad del 16% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_ripple_color_selector.xml))

#### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content`
**Gravedad** (posición relativa al texto de la etiqueta) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start`
**Relleno** (espacio entre el icono y el texto de la etiqueta) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `8dp`

#### Estilos

Elemento | Estilo
--- | ---
**Estilo predeterminado** | `Widget.Material3.Button.ElevatedButton`
**Estilo del icono** | `Widget.Material3.Button.ElevatedButton.Icon`

Atributo de tema de estilo predeterminado: `?attr/materialButtonElevatedStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

<details>

<summary><h3>Botón relleno</h3></summary>

#### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnPrimary` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorPrimary` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null`
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp`
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearance.M3.Sys.Shape.Corner.Full`
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `2dp`
**Color de la ondulación** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnPrimary` con una opacidad del 16% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_ripple_color_selector.xml))

#### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnPrimary` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content`
**Gravedad** (posición relativa al texto de la etiqueta) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start`
**Relleno** (espacio entre el icono y el texto de la etiqueta) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `8dp`

#### Estilos

Elemento | Estilo
--- | ---
**Estilo predeterminado** | `Widget.Material3.Button`
**Estilo del icono** | `Widget.Material3.Button.Icon`
**Estilo sin elevación** | `Widget.Material3.Button.UnelevatedButton`
**Estilo del icono sin elevación** | `Widget.Material3.Button.UnelevatedButton.Icon`

Atributo de tema de estilo predeterminado: `?attr/materialButtonStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

<details>

<summary><h3>Botón tonal relleno</h3></summary>

#### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnSecondaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorSecondaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null`
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp`
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearance.M3.Sys.Shape.Corner.Full`
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `2dp`
**Color de la ondulación** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnSecondaryContainer` con una opacidad del 16% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_tonal_button_ripple_color_selector.xml))

#### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnSecondaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content`
**Gravedad** (posición relativa al texto de la etiqueta) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start`
**Relleno** (espacio entre el icono y el texto de la etiqueta) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `8dp`

#### Estilos

Elemento | Estilo
--- | ---
**Estilo predeterminado** | `Widget.Material3.Button.TonalButton`
**Estilo del icono** | `Widget.Material3.Button.TonalButton.Icon`

Atributo de tema de estilo predeterminado: `?attr/materialButtonTonalStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

<details>

<summary><h3>Botón delineado</h3></summary>

#### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `@android:color/transparent` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `?attr/colorOnSurface` con una opacidad del 12% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_button_outline_color_selector.xml))
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `1dp`
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearance.M3.Sys.Shape.Corner.Full`
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `0dp`
**Color de la ondulación** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnSurface` con una opacidad del 16% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_ripple_color_selector.xml))

#### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content`
**Gravedad** (posición relativa al texto de la etiqueta) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start`
**Relleno** (espacio entre el icono y el texto de la etiqueta) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `8dp`

#### Estilos

Elemento | Estilo
--- | ---
**Estilo predeterminado** | `Widget.Material3.Button.OutlinedButton`
**Estilo del icono** | `Widget.Material3.Button.OutlinedButton.Icon`

Atributo de tema de estilo predeterminado: `?attr/materialButtonOutlinedStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

<details>

<summary><h3>Botón de texto</h3></summary>

#### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundColor`<br/>`setBackgroundTintList`<br/>`getBackgroundTintList` | `@android:color/transparent` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`setStrokeColorResource`<br/>`getStrokeColor` | `null`
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`setStrokeWidthResource`<br/>`getStrokeWidth` | `0dp`
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearance.M3.Sys.Shape.Corner.Full`
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `0dp`
**Color de la ondulación** | `app:rippleColor` | `setRippleColor`<br/>`setRippleColorResource`<br/>`getRippleColor` | `?attr/colorOnSurface` con una opacidad del 16% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_ripple_color_selector.xml))

#### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `wrap_content`
**Gravedad** (posición relativa al texto de la etiqueta) | `app:iconGravity` | `setIconGravity`<br/>`getIconGravity` | `start`
**Relleno** (espacio entre el icono y el texto de la etiqueta) | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `8dp`

#### Estilos

Elemento | Estilo
--- | ---
**Estilo predeterminado** | `Widget.Material3.Button.TextButton`
**Estilo del icono** | `Widget.Material3.Button.TextButton.Icon`
**Botones de ancho completo** | `Widget.Material3.Button.TextButton.Dialog.FullWidth`

Atributo de tema de estilo predeterminado: `?attr/borderlessButtonStyle`

Consulta la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/values/attrs.xml).

</details>

## Variantes de botones

### Botón predeterminado

*   Los botones comunican las acciones que las personas pueden realizar.
*   Normalmente se colocan en toda la interfaz de usuario, en lugares como:

    *   Diálogos
    *   Ventanas modales
    *   Formularios
    *   Tarjetas
    *   Barras de herramientas

*   También se pueden colocar dentro de grupos de botones estándar.

### Botón de dos estados

*   Los botones de dos estados deben usarse para selecciones binarias, como Guardar o Favorito. Cuando se presionan los botones de dos estados, pueden cambiar de color, forma y etiquetas.

*   Los botones de dos estados deben usar un icono delineado cuando no están seleccionados y una versión rellena del icono cuando están seleccionados. Si no existe una versión rellena, aumenta el grosor en su lugar.

*   De forma predeterminada, los botones de dos estados cambian de redondos a cuadrados cuando se seleccionan.

## Implementación del código

Antes de poder usar los botones de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** `<Button>` se infla automáticamente como `<com.google.android.material.button.MaterialButton>` a través de `MaterialComponentsViewInflater` cuando se usa un tema `Theme.Material3.*`.

### Agregar estilos de color de botón

*   Hay cinco estilos de color de botón integrados: elevado, relleno, tonal, delineado y de texto.
*   Los botones predeterminados y de dos estados usan diferentes colores.
*   Los botones de dos estados no usan el estilo de texto.

![5 tipos de botones comunes](assets/buttons/commonbuttons-types.png)

1.  Botón elevado
2.  Botón relleno
3.  Botón tonal relleno
4.  Botón delineado
5.  Botón de texto

<details>

<summary><h4>Botón elevado</h4></summary>

Los [botones elevados](https://m3.material.io/components/buttons/overview/#elevated-button) son esencialmente botones delineados con una sombra. Para evitar la propagación de la sombra, úsalos solo cuando sea absolutamente necesario, como cuando el botón requiere una separación visual de un fondo con patrón.

##### Ejemplos de botones elevados

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón elevado con una etiqueta de texto.

!["Botón elevado con texto morado 'Botón elevado' sobre un fondo blanco."](assets/buttons/elevated-button.png)

En el diseño:

```xml
<Button
    style="?attr/materialButtonElevatedStyle"
    android:id="@+id/elevatedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón elevado"
/>
```

En el código:

```kt
elevatedButton.setOnClickListener {
    // Responder a la pulsación del botón
}
```

##### Agregar un icono a un botón elevado

El siguiente ejemplo muestra un botón elevado con un icono.

![Botón elevado con texto morado, botón elevado, borde gris e icono de más sobre un fondo blanco](assets/buttons/elevated-button-icon.png)

En el diseño:

```xml
<Button
    style="@style/Widget.Material3.Button.ElevatedButton.Icon"
    ...
    app:icon="@drawable/ic_add_24dp"
/>
```

</details>

<details>

<summary><h4>Botón relleno</h4></summary>

El color de la superficie de contraste del [botón relleno](https://m3.material.io/components/buttons#filled-button) lo convierte en el botón más prominente después del FAB. Se usa para acciones finales o de desbloqueo en un flujo, como **Guardar**, **Unirse ahora** o **Confirmar**.

**Nota:** El botón relleno es el estilo predeterminado si no se establece el estilo.

##### Ejemplos de botones rellenos

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón relleno con una etiqueta de texto y un contenedor relleno.

!["Botón relleno con texto blanco, botón relleno y contenedor morado sobre un fondo blanco"](assets/buttons/filled-button.png)

En el diseño:

```xml
<Button
    android:id="@+id/filledButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón relleno"
/>
```

**Nota:** Dado que este es el tipo predeterminado, no necesitas especificar una etiqueta de estilo siempre que estés usando un tema de componentes de Material. Si no es así, establece el estilo en `@style/Widget.Material3.Button`.

En el código:

```kt
filledButton.setOnClickListener {
    // Responder a la pulsación del botón
}
```

##### Agregar un icono a un botón relleno

El siguiente ejemplo muestra un botón relleno con un icono.

![Botón relleno con texto blanco, botón relleno, contenedor morado e icono de más sobre un fondo blanco](assets/buttons/filled-button-icon.png)

En el diseño:

```xml
<Button
    style="@style/Widget.Material3.Button.Icon"
    ...
    app:icon="@drawable/ic_add_24dp"
/>
```

</details>

<details>

<summary><h4>Botón tonal relleno</h4></summary>

Los [botones tonales rellenos](https://m3.material.io/components/buttons/#filled-tonal-button) tienen un color de fondo más claro y un color de etiqueta más oscuro, lo que los hace menos prominentes visualmente que un botón relleno normal. Todavía se usan para acciones finales o de desbloqueo en un flujo, pero pueden ser mejores cuando estas acciones no requieren tanto énfasis.

Un botón relleno de estilo tonal se puede usar como una alternativa intermedia entre los botones rellenos y los delineados. Usan un mapeo de color secundario y son útiles en contextos donde un botón de menor prioridad requiere un poco más de énfasis de lo que daría un contorno, como **Siguiente** en un flujo de incorporación.

##### Ejemplos de botones tonales rellenos

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón tonal relleno con una etiqueta de texto y un contenedor relleno.

!["Botón tonal relleno con texto blanco, botón tonal relleno y contenedor morado sobre un fondo blanco"](assets/buttons/filled-button-tonal.png)

En el diseño:

```xml
<Button
    style="?attr/materialButtonTonalStyle"
    android:id="@+id/filledTonalButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón tonal relleno"
/>
```

En el código:

```kt
filledTonalButton.setOnClickListener {
    // Responder a la pulsación del botón
}
```

##### Agregar un icono a un botón tonal relleno

El siguiente ejemplo muestra un botón tonal relleno con un icono.

![Botón tonal relleno con texto blanco, botón tonal relleno, contenedor morado e icono de más sobre un fondo blanco](assets/buttons/filled-button-tonal-icon.png)

En el diseño:

```xml
<Button
    style="@style/Widget.Material3.Button.TonalButton.Icon"
    ...
    app:icon="@drawable/ic_add_24dp"
/>
```

</details>

<details>

<summary><h4>Botón delineado</h4></summary>

Los [botones delineados](https://m3.material.io/components/buttons/#outlined-button) son para acciones que necesitan atención pero no son la acción principal, como “Ver todo” o “Agregar al carrito”. Este también es el botón que se usa para darle a alguien la oportunidad de cambiar de opinión o escapar de un flujo.

Los botones delineados combinan bien con los botones rellenos para indicar una acción secundaria y alternativa.

##### Ejemplos de botones delineados

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón delineado con una etiqueta de texto y un contenedor con trazo.

!["Botón delineado con texto morado, botón delineado y borde gris sobre un fondo blanco"](assets/buttons/outlined-button.png)

En el diseño:

```xml
<Button
    style="?attr/materialButtonOutlinedStyle"
    android:id="@+id/outlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón delineado"
/>
```

En el código:

```kt
outlinedButton.setOnClickListener {
    // Responder a la pulsación del botón
}
```

##### Agregar un icono a un botón delineado

El siguiente ejemplo muestra un botón delineado con un icono.

![Botón delineado con texto morado, botón delineado, borde gris e icono de más sobre un fondo blanco](assets/buttons/outlined-button-icon.png)

En el diseño:

```xml
<Button
    style="@style/Widget.Material3.Button.OutlinedButton.Icon"
    ...
    app:icon="@drawable/ic_add_24dp"
/>
```

</details>

<details>

<summary><h4>Botón de texto</h4></summary>

Los [botones de texto](https://m3.material.io/components/buttons/#text-button) tienen menos prominencia visual, por lo que deben usarse para acciones de bajo énfasis, como cuando se presentan varias opciones.

##### Ejemplos de botones de texto

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un botón de texto con una etiqueta de texto.

![Botón de texto con texto morado, botón de texto sobre un fondo blanco](assets/buttons/text-button.png)

En el diseño:

```xml
<Button
    style="?attr/borderlessButtonStyle"
    android:id="@+id/textButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Botón de texto"
/>
```

En el código:

```kt
textButton.setOnClickListener {
    // Responder a la pulsación del botón
}
```

##### Agregar un icono a un botón de texto

El siguiente ejemplo muestra un botón de texto con un icono.

![Botón de texto con texto morado, botón de texto e icono de más sobre un fondo blanco](assets/buttons/text-button-icon.png)

En el diseño:

```xml
<Button
    style="@style/Widget.Material3.Button.TextButton.Icon"
    ...
    app:icon="@drawable/ic_add_24dp"
/>
```

</details>

### Hacer que los botones sean accesibles

Los botones admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los botones se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, ve a la [guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

## Personalización de botones

### Tematización de botones

Los botones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de botones

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra los tipos de botones de texto, delineados y rellenos con la tematización de Material.

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

Usa atributos de tema de estilo predeterminados, estilos y superposiciones de tema. Esto agrega el tema a todos los botones pero no afecta a otros componentes:

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
<Button
    style="@style/Widget.App.Button"
    ...
/>
```

### Centrado óptico

El centrado óptico significa desplazar el contenido de `MaterialButton` (icono y/o etiqueta) cuando la forma es asimétrica. Antes del centrado óptico, solo proporcionábamos centrado con formas horizontalmente asimétricas.

Para activar el centrado óptico para un botón determinado, usa `setOpticalCenterEnabled(true)`. El centrado óptico está deshabilitado de forma predeterminada. Cuando está habilitado, la cantidad de desplazamiento del icono y/o texto se calcula como un valor con la proporción fija a la diferencia entre el tamaño de la esquina izquierda en dp y el tamaño de la esquina derecha en dp. La cantidad de desplazamiento se aplica al relleno inicial y al relleno final.
