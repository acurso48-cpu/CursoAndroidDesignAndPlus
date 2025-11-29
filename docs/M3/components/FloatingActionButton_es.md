<!--docs:
title: "Botones de acción flotantes"
layout: detail
section: components
excerpt:  "Un botón de acción flotante (FAB) representa la acción principal de una pantalla."
iconId: button
path: /catalog/floating-action-button/
-->

# Botones de acción flotantes (FAB)

Un [botón de acción flotante (FAB)](https://m3.material.io/components/floating-action-button) representa la acción principal de una pantalla. Hay tres variantes de un FAB.

![Tipos de FAB](assets/fabs/fab-types.png)

1.  FAB
2.  FAB mediano
3.  FAB grande

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

Un FAB realiza la acción principal o más común en una pantalla. Aparece delante de todo el contenido de la pantalla, normalmente como una forma cuadrada con un icono en su centro.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/floating-action-button/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/package-summary)

## Anatomía

![Diagrama de anatomía del FAB](assets/fabs/fab-anatomy.png)

1.  Contenedor
2.  Icono

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/floating-action-button/guidelines#9a56f806-8840-4910-8f53-3cb2a6c81c86).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

![Cuatro FAB que muestran los colores disponibles después de la actualización expresiva.](assets/fabs/fab-expressive.png)
Los FAB tienen colores y tamaños actualizados

El FAB tiene nuevos tamaños para que coincidan con el FAB extendido y más opciones de color. El FAB pequeño está obsoleto.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Se agregó el tamaño de FAB **mediano**
*   Se ha quedado obsoleto el tamaño de FAB **pequeño**
*   Los tamaños de FAB y FAB grande no han cambiado
*   Los tipos de FAB se basan en el tamaño, no en el color

**Color:**

*   Se agregaron estilos de color de tono:
    *   Primario
    *   Secundario
    *   Terciario
*   Se cambiaron los nombres de los estilos de color tonales existentes para que coincidan con los nombres de sus tokens:
    *   **Primario** a **Contenedor primario**
    *   **Secundario** a **Contenedor secundario**
    *   **Terciario** a **Contenedor terciario**
    *   Los valores no han cambiado
*   FAB de color de superficie obsoletos

### Estilos de M3 Expressive

#### Superposiciones de temas

Para evitar un escenario de combinaciones de estilos explosivas, los colores se manejarán a través de superposiciones de temas en lugar de crear estilos distintos para cada combinación de tamaño/paleta para FAB y FAB extendidos.

La biblioteca M3 Expressive proporciona seis superposiciones de temas para usar:

-   `ThemeOverlay.Material3Expressive.FloatingActionButton.Primary`
-   `ThemeOverlay.Material3Expressive.FloatingActionButton.Secondary`
-   `ThemeOverlay.Material3Expressive.FloatingActionButton.Tertiary`
-   `ThemeOverlay.Material3Expressive.FloatingActionButton.PrimaryContainer`
-   `ThemeOverlay.Material3Expressive.FloatingActionButton.SecondaryContainer`
-   `ThemeOverlay.Material3Expressive.FloatingActionButton.TertiaryContainer`

La superposición de tema para un FAB o FAB extendido determinado se puede especificar dentro del XML del componente agregando, por ejemplo, `app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary`.

**Nota:** Las imágenes a continuación muestran ejemplos de FAB en modo claro (izquierda) y en modo oscuro (derecha) usando la superposición de tema principal.

#### M3 Expressive FAB

| <img src="assets/fabs/fab-expressive-light.png" alt="FAB expresivo en modo claro." width="75"> | <img src="assets/fabs/fab-expressive-dark.png" alt="FAB expresivo en modo oscuro." width="75"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
      style="?attr/floatingActionButtonStyle"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_margin="8dp"
      android:contentDescription="@string/m3_expressive_primary_fab_content_description"
      app:srcCompat="@drawable/gs_edit_fill1_vd_theme_24"
      app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

#### M3 Expressive medium FAB

| <img src="assets/fabs/fab-expressive-medium-light.png" alt="FAB mediano expresivo en modo claro." width="150"> | <img src="assets/fabs/fab-expressive-medium-dark.png" alt="FAB mediano expresivo en modo oscuro" width="150"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
            style="?attr/floatingActionButtonMediumStyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="8dp"
            android:contentDescription="@string/m3_expressive_primary_medium_fab_content_description"
            app:srcCompat="@drawable/gs_edit_fill1_vd_theme_24"
            app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

#### M3 Expressive large FAB

| <img src="assets/fabs/fab-expressive-large-light.png" alt="FAB grande expresivo en modo claro." width="175"> | <img src="assets/fabs/fab-expressive-large-dark.png" alt="FAB grande expresivo en modo oscuro" width="175"> |
|---|---|

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
      style="?attr/floatingActionButtonLargeStyle"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_margin="8dp"
      android:contentDescription="@string/m3_expressive_primary_large_fab_content_description"
      app:srcCompat="@drawable/gs_edit_fill1_vd_theme_24"
      app:materialThemeOverlay="@style/ThemeOverlay.Material3Expressive.FloatingActionButton.Primary" />
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundTintList`<br/>`getBackgroundTintList` | `?attr/colorPrimaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_background_color_selector.xml))
**Trazo** | `app:borderWidth` | N/A | `0dp`
**Tamaño** | `app:fabSize`<br>`app:fabCustomSize` | `setSize`<br/>`setCustomSize`<br/>`clearCustomSize`<br/>`getSize`<br/>`getCustomSize` | `auto`
**Forma** | `shapeAppearance`<br/>`shapeAppearanceOverlay` | `setShapeAppearanceModel`<br/>`getShapeAppearanceModel` | `ShapeAppearanceOverlay.Material3.FloatingActionButton`<br/>
**Elevación** | `app:elevation` | `setElevation`<br/>`getCompatElevation` | `6dp`
**Elevación al pasar el cursor/enfocar** | `app:hoveredFocusedTranslationZ` | `setCompatHoveredFocusedTranslationZ`<br/>`getCompatHoveredFocusedTranslationZ` | `2dp`
**Elevación al presionar** | `app:pressedTranslationZ` | `setCompatPressedTranslationZ`<br/>`getCompatPressedTranslationZ` | `6dp`
**Ondulación** | `app:rippleColor` | `setRippleColor`<br/>`getRippleColor`<br/>`getRippleColorStateList` | variaciones de `?attr/colorOnPrimaryContainer`, ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_ripple_color_selector.xml)
**Movimiento** | `app:showMotionSpec`<br>`app:hideMotionSpec` | `set*MotionSpec`<br/>`set*MotionSpecResource`<br/>`get*MotionSpec` | `@null`

### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:srcCompat` | `setImageDrawable`<br/>`setImageResource`<br/>`getDrawable` | `null`
**Color** | `app:tint` | `setImageTintList`<br/>`getImageTintList` | `?attr/colorOnPrimaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_button_foreground_color_selector.xml))

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.FloatingActionButton.Primary` | `?attr/floatingActionButtonStyle`

Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/res/values/styles.xml) y [atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/res/values/attrs.xml).

## Variantes de FAB

Hay tres tamaños de FAB:

1.  FAB
2.  FAB mediano (el más recomendado)
3.  FAB grande

Elige el tamaño del FAB según la jerarquía visual de tu diseño.

![Tamaños de FAB](assets/fabs/fabs-sizes.png)Los FAB tienen varios tamaños que se escalan con el tamaño de la ventana

<details>

<summary><h3>FAB</h3></summary>

Los FAB son el tamaño y estilo predeterminados para un botón de acción principal. El FAB es el tamaño más pequeño y es mejor usarlo en ventanas compactas donde otras acciones pueden estar presentes en la pantalla.

API y código fuente:

*   `FloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

#### Ejemplo de FAB

El siguiente ejemplo muestra un FAB normal con un icono de más.

<img src="assets/fabs/fab-regular.png" alt="FAB púrpura cuadrado de 56dp con icono de más oscuro" height="500"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

  <!-- Contenido principal -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      android:id="@+id/floating_action_button"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_gravity="bottom|end"
      android:layout_margin="16dp"
      android:contentDescription="@string/fab_content_desc"
      app:srcCompat="@drawable/ic_plus_24"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En el código:

```kt
fab.setOnClickListener {
    // Responder al clic del FAB
}
```

</details>

<details>

<summary><h3>FAB mediano</h3></summary>

Se recomienda un FAB mediano para la mayoría de las situaciones y funciona mejor en ventanas compactas y medianas. Úsalo para acciones importantes sin ocupar demasiado espacio.

API y código fuente:

*   `FloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

#### Ejemplo de FAB mediano

El siguiente ejemplo muestra un FAB mediano con un icono de más.

<img src="assets/fabs/fab-medium.png" alt="FAB mediano púrpura en la pantalla de un dispositivo móvil." height="500"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  <!-- Contenido principal -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      ...
      style="?attr/floatingActionButtonMediumStyle"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En el código:

```kt
fab.setOnClickListener {
    // Responder al clic del FAB
}
```

</details>

<details>

<summary><h3>FAB grande</h3></summary>

Un FAB grande es útil en cualquier tamaño de ventana cuando el diseño requiere una acción principal clara y prominente, pero es más adecuado para tamaños de ventana expandidos y más grandes, donde su tamaño ayuda a llamar la atención.

API y código fuente:

*   `FloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

#### Ejemplo de FAB grande

El siguiente ejemplo muestra un FAB grande con un icono de más.

<img src="assets/fabs/fab-large.png" alt="FAB púrpura cuadrado de 96dp con icono de más oscuro" height="500"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  <!-- Contenido principal -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      ...
      style="?attr/floatingActionButtonLargeStyle"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En el código:

```kt
fab.setOnClickListener {
    // Responder al clic del FAB
}
```

</details>

<details>

<summary><h3>FAB pequeño (obsoleto)</h3></summary>

Se debe usar un FAB pequeño en pantallas más pequeñas.

Los FAB pequeños también se pueden usar para crear continuidad visual con otros elementos de la pantalla.

API y código fuente:

*   `FloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

#### Ejemplo de FAB pequeño

El siguiente ejemplo muestra un FAB pequeño con un icono de más.

<img src="assets/fabs/fab-mini.png" alt="FAB púrpura cuadrado de 40dp con icono de más oscuro" height="500"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    >

  <!-- Contenido principal -->

  <com.google.android.material.floatingactionbutton.FloatingActionButton
      ...
      style="?attr/floatingActionButtonSmallStyle"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En el código:

```kt
fab.setOnClickListener {
    // Responder al clic del FAB
}
```

</details>

## Implementación de código

Antes de poder usar los FAB de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** Si el `FloatingActionButton` es un hijo de un `CoordinatorLayout`, obtienes ciertos comportamientos de forma gratuita. Se desplazará automáticamente para que cualquier `Snackbar` que se muestre no lo cubra, y se ocultará automáticamente cuando lo cubra un `AppBarLayout` o `BottomSheetBehavior`.

### Hacer que los FAB sean accesibles

Debes establecer una descripción de contenido en un FAB a través del atributo `android:contentDescription` o el método `setContentDescription` para que los lectores de pantalla como TalkBack puedan anunciar su propósito o acción. El texto representado en los FAB extendidos se proporciona automáticamente a los servicios de accesibilidad, por lo que generalmente no se necesitan etiquetas de contenido adicionales.

### Animar la visibilidad del FAB

Usa los métodos `show` y `hide` para animar la visibilidad de un `FloatingActionButton`. La animación de mostrar hace crecer el widget y lo desvanece, mientras que la animación de ocultar encoge el widget y lo desvanece.

```kt
// Para mostrar:
fab.show()
// Para ocultar:
fab.hide()
```

## Personalización de FAB

### Tematización de FAB

#### Ejemplo de tematización de FAB

API y código fuente:

*   `FloatingActionButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)

El siguiente ejemplo muestra varios FAB con tematización de Material en diferentes tamaños que se escalan con el tamaño de la ventana.

![FAB en varios tamaños que se escalan con el tamaño de la ventana](assets/fabs/fab-3sizes.png)

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

### Dimensionamiento de FAB

El `FloatingActionButton` se puede dimensionar usando `app:fabCustomSize` o, para el FAB grande/pequeño (solo M3), aplicando el estilo deseado. El modo de tamaño discreto `app:fabSize` está obsoleto en el estilo Material3. Si se anula `app:fabSize` en tu estilo de FAB, que hereda de uno de estos estilos:

*   `Widget.Material3.FloatingActionButton(.Large).Primary`
*   `Widget.Material3.FloatingActionButton(.Large).Secondary`
*   `Widget.Material3.FloatingActionButton(.Large).Tertiary`
*   `Widget.Material3.FloatingActionButton(.Large).Surface`

Considera una de las siguientes opciones de migración:

*   Si se usa el tamaño `normal`, establece el estilo principal en `Widget.Material3.FloatingActionButton.{Color}` y elimina `app:fabSize`.
*   Si se usa el tamaño `mini`, establece el estilo principal en `Widget.Material3.FloatingActionButton.Small.{Color}` y elimina `app:fabSize`.
*   Si el tamaño del FAB cambia en tiempo de ejecución estableciendo `fabSize` o `fabCustomSize`, y se desean esquinas de tamaño relativo, establece `shapeAppearanceOverlay` como `@style/ShapeAppearanceOverlay.Material3.FloatingActionButton` en el estilo.

Si deseas usar el FAB pequeño, aplica uno de estos atributos de estilo:

*   `?attr/floatingActionButtonSmallStyle`
*   `?attr/floatingActionButtonSmallPrimaryStyle`
*   `?attr/floatingActionButtonSmallSecondaryStyle`
*   `?attr/floatingActionButtonSmallTertiaryStyle`
*   `?attr/floatingActionButtonSmallSurfaceStyle`

Si deseas usar el FAB mediano, aplica este estilo con la superposición de tema de color correspondiente a través de `materialThemeOverlay`:

*   `?attr/floatingActionButtonMediumStyle`

Si deseas usar el FAB grande, aplica uno de estos atributos de estilo:

*   `?attr/floatingActionButtonLargeStyle`
*   `?attr/floatingActionButtonLargePrimaryStyle`
*   `?attr/floatingActionButtonLargeSecondaryStyle`
*   `?attr/floatingActionButtonLargeTertiaryStyle`
*   `?attr/floatingActionButtonLargeSurfaceStyle`
