<!--docs:
title: "Botones de acción flotantes extendidos"
layout: detail
section: components
excerpt:  "Un botón de acción flotante (FAB) representa la acción principal de una pantalla."
iconId: button
path: /catalog/floating-action-button/
-->

# Botones de acción flotantes extendidos (FAB extendidos)

Los [botones de acción flotantes extendidos (FAB extendidos)](https://m3.material.io/components/extended-fab) ayudan a las personas a realizar acciones principales. Hay tres variantes del FAB extendido.

<img src="assets/fabs/efab-types.png" alt="Tipos de FAB extendidos"/>

1.  FAB extendido pequeño
2.  FAB extendido mediano
3.  FAB extendido grande

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/extended-fab/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/package-summary)

## Anatomía

<img src="assets/fabs/efab-anatomy.png" alt="Anatomía de los FAB extendidos"/>

1.  Contenedor
2.  Etiqueta de texto
3.  Icono (opcional)

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/extended-fab/guidelines#1dc1f503-edff-4e3f-b2a6-c76cee1b8369).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

![El FAB extendido original obsoleto y los FAB extendidos pequeños, medianos y grandes de la actualización expresiva.](assets/fabs/efab-expressive.png) El FAB extendido original se reemplaza por un conjunto de FAB extendidos pequeños, medianos y grandes con nueva tipografía

El FAB extendido ahora tiene tres tamaños: pequeño, mediano y grande, cada uno con estilos de tipo actualizados. Estos se alinean con los tamaños de FAB para una transición más fácil entre los FAB. El FAB extendido original está siendo obsoleto y debe reemplazarse por el FAB extendido pequeño. Los FAB de superficie también están siendo obsoletos.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Se agregaron nuevos tamaños
    *   Pequeño: 56dp
    *   Mediano: 80dp
    *   Grande: 96dp
*   Obsoleto

    *   FAB extendido original (56dp)
    *   FAB extendido de superficie

*   Actualizaciones:

    *   Se ajustó la tipografía para que sea más grande

### Estilos de M3 Expressive

#### M3 Expressive small extended FAB

| <img src="assets/fabs/small-efabs-light.png" alt="FAB extendido pequeño expresivo en modo claro" width="150"> | <img src="assets/fabs/small-efabs-dark.png" alt="FAB extendido pequeño expresivo en modo oscuro" width="150"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
      style="?attr/extendedFloatingActionButtonSmallStyle"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_margin="8dp"
      android:contentDescription="@string/m3_expressive_primary_small_extended_fab_content_description"
      android:text="@string/m3_expressive_extended_fab_label"
      app:icon="@drawable/gs_edit_fill1_vd_theme_24"
      app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

#### M3 Expressive medium extended FAB

| <img src="assets/fabs/medium-efabs-light.png" alt="FAB extendido mediano expresivo en modo claro" width="225"> | <img src="assets/fabs/medium-efabs-dark.png" alt="FAB extendido mediano expresivo en modo oscuro" width="225"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
      style="?attr/extendedFloatingActionButtonMediumStyle"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_margin="8dp"
      android:contentDescription="@string/m3_expressive_primary_medium_extended_fab_content_description"
      android:text="@string/m3_expressive_extended_fab_label"
      app:icon="@drawable/gs_edit_fill1_vd_theme_24"
      app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

#### M3 Expressive large extended FAB

| <img src="assets/fabs/large-efabs-light.png" alt="FAB extendido grande expresivo en modo claro" width="275"> | <img src="assets/fabs/large-efabs-dark.png" alt="FAB extendido grande expresivo en modo oscuro" width="275"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
      style="?attr/extendedFloatingActionButtonLargeStyle"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_margin="8dp"
      android:contentDescription="@string/m3_expressive_primary_large_extended_fab_content_description"
      android:text="@string/m3_expressive_extended_fab_label"
      app:icon="@drawable/gs_edit_fill1_vd_theme_24"
      app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorPrimaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_background_color_selector.xml))
**Color del trazo** | `app:strokeColor` | `setStrokeColor`<br/>`getStrokeColor` | `null`
**Ancho del trazo** | `app:strokeWidth` | `setStrokeWidth`<br/>`getStrokeWidth` | `0dp`
**Tamaño** | `app:collapsedSize` | `setCollapsedSize`<br/>`getCollapsedSize` |
**Estrategia de extensión** | `app:extendStrategy` | N/A | `wrap_content`
**Forma** | `app:shapeAppearance`<br/>`app:shapeAppearanceOverlay` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearanceOverlay.Material3.FloatingActionButton`<br/>
**Elevación** | `app:elevation` | `setElevation`<br/>`getElevation` | `6dp`
**Elevación al pasar el cursor/enfocar** | `app:hoveredFocusedTranslationZ` | N/A | `2dp`
**Elevación al presionar** | `app:pressedTranslationZ` | N/A | `6dp`
**Ondulación** | `app:rippleColor` | | variaciones de `?attr/colorOnPrimaryContainer`, ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_ripple_color_selector.xml)
**Movimiento** | `app:showMotionSpec`<br>`app:hideMotionSpec`<br/>`extendMotionSpec`<br/>`shrinkMotionSpec` | `set*MotionSpec`<br/>`set*MotionSpecResource`<br/>`get*MotionSpec` | ver [animadores](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/res/animator)

### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:icon` | `setIcon`<br/>`setIconResource`<br/>`getIcon` | `null`
**Color** | `app:iconTint` | `setIconTint`<br/>`setIconTintResource`<br/>`getIconTint` | `?attr/colorOnPrimaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tamaño** | `app:iconSize` | `setIconSize`<br/>`getIconSize` | `24dp`
**Relleno entre el icono y el texto** | `app:iconPadding` | `setIconPadding`<br/>`getIconPadding` | `12dp`

### Etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:text` | `setText`<br/>`getText` | `null`
**Color** | `android:textColor` | `setTextColor`<br/>`getTextColor` | `?attr/colorPrimaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceLabelLarge`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.ExtendedFloatingActionButton.Icon.Primary` | `?attr/extendedFloatingActionButtonStyle`
**Solo texto cuando está extendido** | `Widget.Material3.ExtendedFloatingActionButton.Primary` | `?attr/extendedFloatingActionButtonPrimaryStyle`

Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/res/values/styles.xml) y [atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/res/values/attrs.xml).

## Variantes de FAB extendido

Hay tres tipos de FAB extendidos: pequeño, mediano y grande.

![Tamaños de EFAB](assets/fabs/efab-sizes.png)

Elige un FAB extendido de tamaño apropiado para agregar la cantidad correcta de énfasis para una acción.

En ventanas compactas con una acción prominente, el **FAB extendido grande** puede ser apropiado.

En tamaños de ventana más grandes, usa un **FAB extendido mediano** o **grande**.

## Implementación de código

Antes de poder usar los FAB extendidos de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** Si el `FloatingActionButton` es un hijo de un `CoordinatorLayout`, obtienes ciertos comportamientos de forma gratuita. Se desplazará automáticamente para que cualquier `Snackbar` que se muestre no lo cubra, y se ocultará automáticamente cuando lo cubra un `AppBarLayout` o `BottomSheetBehavior`.

### Agregar FAB extendido

El FAB extendido es más ancho e incluye una etiqueta de texto.

**Nota:** `ExtendedFloatingActionButton` es una clase hija de [`MaterialButton`](Button.md), en lugar de `FloatingActionButton`. Esto significa que varios atributos que son aplicables a `FloatingActionButton` tienen un nombre diferente en `ExtendedFloatingActionButton`. Por ejemplo, `FloatingActionButton` usa `app:srcCompat` para establecer el dibujable del icono, mientras que `ExtendedFloatingActionButton` usa `app:icon`. Consulta las [tablas de atributos](#key-properties) para obtener más detalles.

API y código fuente:

*   `ExtendedFloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.java)

El siguiente ejemplo muestra un FAB extendido con un icono de más.

<img src="assets/fabs/fab-extended.png" alt="FAB púrpura con icono de más y etiqueta extendida" height="400"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  <!-- Contenido principal -->

  <com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
    android:id="@+id/extended_fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="16dp"
    android:layout_gravity="bottom|end"
    android:contentDescription="@string/extended_fab_content_desc"
    android:text="@string/extended_fab_label"
    app:icon="@drawable/ic_plus_24px"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En el código:

```kt
extendedFab.setOnClickListener {
    // Responder al clic del FAB extendido
}
```

### Hacer accesibles los FAB extendidos

Debes establecer una descripción de contenido en un FAB a través del atributo `android:contentDescription` o el método `setContentDescription` para que los lectores de pantalla como TalkBack puedan anunciar su propósito o acción. El texto representado en los FAB extendidos se proporciona automáticamente a los servicios de accesibilidad, por lo que generalmente no se necesitan etiquetas de contenido adicionales.

### Animar la visibilidad del FAB extendido

Usa los métodos `show` y `hide` para animar la visibilidad de un `ExtendedFloatingActionButton`. La animación de mostrar hace crecer el widget y lo desvanece, mientras que la animación de ocultar encoge el widget y lo desvanece.

```kt
// Para mostrar:
fab.show()
// Para ocultar:
fab.hide()
```

### Extender y contraer el FAB extendido

Usa los métodos `extend` y `shrink` para animar la visualización y ocultación del texto de un `ExtendedFloatingActionButton`. La animación de extensión extiende el FAB para mostrar el texto y el icono. La animación de contracción encoge el FAB para mostrar solo el icono.

```kt
// Para extender:
extendedFab.extend()
// Para contraer:
extendedFab.shrink()
```

## Personalización de FAB extendidos

### Tematización de FAB extendidos

#### Ejemplo de tematización de FAB extendido

API y código fuente:

*   `ExtendedFloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.java)

El siguiente ejemplo muestra un FAB normal, pequeño y extendido con tematización de Material.

!["3 FAB cuadrados de color rosa con esquinas cortadas con iconos de más marrones: 56dp, 40dp, 56dp con etiqueta "Extendido""](assets/fabs/fab-theming.png)

##### Implementación de la tematización de FAB

Usa atributos y estilos de tema en `res/values/styles.xml` para agregar temas a todos los FAB. Esto afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimaryContainer">@color/purple_500</item>
    <item name="colorOnPrimaryContainer">@color/purple_700</item>
</style>
```

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema. Esto aplica un tema a todos los FAB de tu aplicación, pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="extendedFloatingActionButtonStyle">@style/Widget.App.ExtendedFloatingActionButton</item>
    <item name="floatingActionButtonStyle">@style/Widget.App.FloatingActionButton</item>
</style>

<style name="Widget.App.ExtendedFloatingActionButton" parent="Widget.Material3.ExtendedFloatingActionButton.Icon.Primary">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.FloatingActionButton</item>
</style>

<style name="Widget.App.FloatingActionButton" parent="Widget.Material3.FloatingActionButton.Primary">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.FloatingActionButton</item>
</style>

<style name="ThemeOverlay.App.FloatingActionButton" parent="">
    <item name="colorContainer">@color/purple_500</item>
    <item name="colorOnContainer">@color/purple_700</item>
</style>
```

Usa uno de los estilos en el diseño. Eso afecta solo a este FAB:

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    ...
    style="@style/Widget.App.FloatingActionButton"
/>
```

### Dimensionamiento de FAB extendidos

El `ExtendedFloatingActionButton` se dimensionará dinámicamente según su contenido (icono y etiqueta) y rellenos. Si se prefiere un tamaño fijo más grande, puedes usar los atributos `android:minWidth` y `android:minHeight`.

En los temas de Material 3, se proporcionan estilos en 3 tamaños diferentes:

*   Pequeño - `?attr/extendedFloatingActionButtonSmallStyle` (o `?attr/extendedFloatingActionButton`, `?attr/extendedFloatingActionButtonPrimaryStyle`, `?attr/extendedFloatingActionButtonSecondaryStyle`, `?attr/extendedFloatingActionButtonTertiaryStyle`, `?attr/extendedFloatingActionButtonSurfaceStyle`)
*   Mediano - `?attr/extendedFloatingActionButtonMediumStyle`
*   Grande - `?attr/extendedFloatingActionButtonLargeStyle`

**Nota:** Si estás usando la función de extensión/contracción con una altura personalizada, considera también establecer el atributo `collapsedSize` a la misma altura.
