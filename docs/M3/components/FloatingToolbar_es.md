<!--docs:
title: "Barra de herramientas flotante"
layout: detail
section: components
excerpt: "Las barras de herramientas flotantes muestran acciones relacionadas con la página actual"
iconId: floating_toolbar
path: /catalog/floating-toolbar/
-->

# Barra de herramientas flotante

La barra de herramientas flotante proporciona una forma de mostrar acciones relacionadas con la página actual.
Las barras de herramientas flotantes pueden ser verticales u horizontales.

| Barra de herramientas flotante vertical | Barra de herramientas flotante horizontal |
| :---: | :---: |
| <img src="assets/floatingtoolbar/ftbvertical.png" alt="Barra de herramientas flotante vertical" height="500"/> | <img src="assets/floatingtoolbar/ftbhorizontal.png" alt="Barra de herramientas flotante horizontal" width="590"/> |

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/toolbars/overview)
*   Referencia de la API en curso

## Anatomía

<img src="assets/floatingtoolbar/ftbanatomy.png" alt="Diagrama de anatomía de la barra de herramientas flotante" width="600"/>

1.  Contenedor
2.  Elementos

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/toolbars/guidelines#d6b7bcb1-295d-41e6-a051-37f12e1c96ab).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/floatingtoolbar/floatingtoolbar-expressive.png" alt="La barra de herramientas flotante expresiva.png" width="700"/>
La barra de herramientas flotante muestra controles relevantes para la página actual

La **barra de herramientas flotante** se creó para una mayor versatilidad, una mayor cantidad de acciones y una mayor variedad en su ubicación.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Se agregó la **barra de herramientas flotante** con los siguientes atributos:

    *   Diseño: Horizontal o vertical
    *   Color: Estándar o vibrante
    *   Flexibilidad: Puede contener muchos elementos y componentes. Se puede combinar con FAB.

### Estilos de M3 Expressive

Hay dos estilos para la barra de herramientas flotante que especifican diferentes esquemas de color:

```xml
<item name="floatingToolbarStyle">@style/Widget.Material3Expressive.FloatingToolbar</item>
<item name="floatingToolbarVibrantStyle">@style/Widget.Material3Expressive.FloatingToolbar.Vibrant</item>
```

| Barra de herramientas flotante estándar | Barra de herramientas flotante vibrante |
| --- | --- |
| ![Barra de herramientas flotante estándar](assets/floatingtoolbar/standard-floating-toolbar.png) | ![Barra de herramientas flotante vibrante](assets/floatingtoolbar/vibrant-floating-toolbar.png) |

De forma predeterminada, si no se especifica un estilo, una `FloatingToolbar` usará `floatingToolbarStyle` del tema.

También hay estilos específicos para los componentes dentro de la barra de herramientas flotante que se recomienda usar. Actualmente, la recomendación existe para los botones de icono: `Widget.Material3Expressive.FloatingToolbar.IconButton` y `Widget.Material3Expressive.FloatingToolbar.IconButton.Vibrant`.

Ejemplo de uso:

```xml
<com.google.android.material.floatingtoolbar.FloatingToolbarLayout
    android:id="@+id/floating_toolbar_bottom"
    android:layout_margin="16dp"
    style="?attr/floatingToolbarVibrantStyle"
    android:layout_gravity="center|bottom"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.google.android.material.overflow.OverflowLinearLayout
      android:id="@+id/floating_toolbar_child_bottom"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_gravity="center"
      android:orientation="horizontal">

      <Button
          android:id="@+id/floating_toolbar_vibrant_button_bold"
          style="@style/Widget.Material3Expressive.FloatingToolbar.IconButton.Vibrant"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:checkable="true"
          android:contentDescription="@string/floating_toolbar_button_bold_content_description"
          app:icon="@drawable/ic_format_bold_24px" />
      ...
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | estándar es `?attr/colorSurfaceContainer`, vibrante es `?attr/colorPrimaryContainer`
**Forma** | `app:shapeAppearance` | N/A | `50% redondeado`
**Margen de inserción izquierdo** | `app:marginLeftSystemWindowInsets` | N/A | `true`
**Margen de inserción superior** | `app:marginTopSystemWindowInsets` | N/A | `true`
**Margen de inserción derecho** | `app:marginRightSystemWindowInsets` | N/A | `true`
**Margen de inserción inferior** | `app:marginBottomSystemWindowInsets` | N/A | `true`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo estándar** | `Widget.Material3.FloatingToolbar` | `?attr/floatingToolbarStyle`
**Estilo vibrante** | `Widget.Material3.FloatingToolbar.Vibrant` | `?attr/floatingToolbarVibrantStyle`

La barra de herramientas flotante también recomienda un estilo especial para componentes específicos para cuando están dentro de una barra de herramientas flotante. Actualmente, los estilos de la barra de herramientas flotante también incluyen una superposición de tema para `?attr/materialButtonStyle`, `?attr/materialIconButtonStyle` y `?attr/borderlessButtonStyle` para diseñar botones dentro de una barra de herramientas flotante.

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingtoolbar/res/values/styles.xml)
y
[atributos de la barra de herramientas flotante](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingtoolbar/res/values/attrs.xml)

## Implementación de código

Antes de poder usar la barra de herramientas flotante, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregar barra de herramientas flotante

Así es como se vería un diseño típico:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:app="http://schemas.android.com/apk/res-auto"
  android:layout_width="match_parent"
  android:layout_height="match_parent">

  <!-- contenido de pantalla de muestra -->
  <androidx.core.widget.NestedScrollView
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
      android:layout_width="match_parent"
      android:layout_height="wrap_content">

      <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/content" />
    </LinearLayout>
  </androidx.core.widget.NestedScrollView>

  <com.google.android.material.floatingtoolbar.FloatingToolbarLayout
    android:id="@+id/floating_toolbar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom|center"
    app:layout_behavior="com.google.android.material.behavior.HideViewOnScrollBehavior"
    android:layout_margin="16dp">

    <!-- contenido de muestra de la barra de herramientas flotante -->
   <com.google.android.material.overflow.OverflowLinearLayout
      android:id="@+id/floating_toolbar_child"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_gravity="center"
      android:orientation="horizontal">

      <Button
        android:id="@+id/floating_toolbar_button_bold"
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checkable="true"
        android:contentDescription="@string/bold_button_content_description"
        app:icon="@drawable/ic_format_bold_24px"
        app:layout_overflowText="@string/bold_button"
        app:layout_overflowIcon="@drawable/ic_format_bold_24px" />

      <Button
        android:id="@+id/floating_toolbar_button_italic"
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checkable="true"
        android:contentDescription="@string/italic_button_content_description"
        app:icon="@drawable/ic_format_italic_24px"
        app:layout_overflowText="@string/italic_button"
        app:layout_overflowIcon="@drawable/ic_format_italic_24px" />

      <Button
        android:id="@+id/floating_toolbar_button_underlined"
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checkable="true"
        android:contentDescription="@string/underlined_button_content_description"
        app:icon="@drawable/ic_format_underlined_24px"
        app:layout_overflowText="@string/underlined_button"
        app:layout_overflowIcon="@drawable/ic_format_underlined_24px" />
    </com.google.android.material.overflow.OverflowLinearLayout>

  </com.google.android.material.floatingtoolbar.FloatingToolbarLayout>
```

Una barra de herramientas flotante es un `FrameLayout` que proporciona estilo y funcionalidad adicionales. Puedes agregarle hijos como lo harías con un `FrameLayout`. Se recomienda que sus hijos estén envueltos por un `OverflowLinearLayout` que se encargará de agregar automáticamente elementos a un botón de desbordamiento cuando no haya suficiente espacio en la pantalla para mostrar todos los elementos.

Cuando uses `OverflowLinearLayout`, también debes establecer `app:layout_overflowText`, ya que ese será el texto del elemento de menú que corresponde al hijo oculto. Opcionalmente, también puedes establecer `app:layout_overflowIcon`. Consulta [OverflowLinearLayout](https://github.com/material-components/material-components-android/tree/master//docs/components/Overflow.md) para obtener más información.

**Nota:** si la vista hija en la que se puede hacer clic no es un hijo directo de `OverflowLinearLayout`, como en el caso del ejemplo anterior, asegúrate de propagar el clic del padre al hijo. Esto es para que los elementos desbordados en el menú desbordado respondan correctamente al hacer clic. Alternativamente, también puedes establecer `onClickListener` en los elementos desbordados directamente accediendo a ellos a través de `OverflowLinearLayout.getOverflowedViews()`.

Las barras de herramientas flotantes pueden ocultarse al desplazarse si están dentro de un `CoordinatorLayout` estableciendo el siguiente `CoordinatorLayout.Behavior` a través del atributo `app:layout_behavior`:

```xml
  <com.google.android.material.floatingtoolbar.FloatingToolbarLayout
    android:id="@+id/floating_toolbar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom|center"
    app:layout_behavior="com.google.android.material.behavior.HideViewOnScrollBehavior">
  ...
</com.google.android.material.floatingtoolbar.FloatingToolbarLayout>
```

Este comportamiento se deshabilitará cuando TalkBack esté habilitado por razones de accesibilidad. Consulta [cómo hacer que las barras de herramientas flotantes sean accesibles](#making-floating-toolbar-accessible).

Ten en cuenta que el estilo predeterminado de M3 es el estilo de color estándar horizontal. Los estilos de color vibrante o verticales deben establecerse explícitamente en `FloatingToolbarLayout`. También se pueden definir estilos de M3 para componentes específicos, como los botones de icono. Se recomienda establecerlos explícitamente en los componentes correspondientes dentro de `FloatingToolbarLayout`. Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingtoolbar/res/values/styles.xml).

API y código fuente:

*   `FloatingToolBar`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingtoolbar/FloatingToolbarLayout.java)

### Hacer accesible la barra de herramientas flotante

Debes establecer una `contentDescription` en todas las acciones de la barra de herramientas flotante para que los lectores de pantalla como TalkBack puedan anunciar correctamente lo que representa cada acción.

También puedes controlar el orden del enfoque de TalkBack a través de las banderas `accessibilityTraversalBefore` y `accessibilityTraversalAfter`.

Por ejemplo, si deseas que la barra de herramientas flotante obtenga el enfoque de TalkBack primero, puedes establecer estas banderas de accesibilidad como se muestra a continuación:

```xml
  <!-- contenido de pantalla de muestra -->
  <androidx.core.widget.NestedScrollView
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
      android:layout_width="match_parent"
      android:layout_height="wrap_content">

      <TextView
        android:id="@+id/content"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/content"
        android:accessibilityTraversalAfter="@id/floating_toolbar" />
    </LinearLayout>
  </androidx.core.widget.NestedScrollView>

  <com.google.android.material.floatingtoolbar.FloatingToolbarLayout
android:id="@+id/floating_toolbar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:accessibilityTraversalBefore="@id/content">
    ...
  </com.google.android.material.floatingtoolbar.FloatingToolbarLayout>
```

#### TalkBack

Las barras de herramientas flotantes pueden usar opcionalmente el `CoordinatorLayout.Behavior` `HideViewOnScrollBehavior` para ocultar la barra de herramientas flotante al desplazarse. Este comportamiento se deshabilita cuando TalkBack está habilitado debido a que los lectores de pantalla no pueden verlo si la barra de herramientas flotante está oculta al desplazarse.

Si usas una barra de herramientas flotante en un diseño que oscurece cualquier contenido cuando la ocultación al desplazarse está deshabilitada, asegúrate de agregar el relleno apropiado al contenido. Por ejemplo, si la barra de herramientas flotante está en la parte inferior y está oscureciendo el contenido, se debe agregar un relleno inferior al contenido.

Consulta a continuación un ejemplo:

```
val am = context.getSystemService(AccessibilityManager::class.java)
if (am != null && am.isTouchExplorationEnabled) {
    (bar.layoutParams as? CoordinatorLayout.LayoutParams)?.behavior = null
    bar.post {
        content.setPadding(
            content.paddingLeft,
            content.paddingTop,
            content.paddingRight,
            content.paddingBottom + bar.measuredHeight
        )
    }
}
```

## Personalización de la barra de herramientas flotante

### Tematización de la barra de herramientas flotante

Las barras de herramientas flotantes admiten la personalización de color y tipografía.

API y código fuente:

*   `FloatingToolBarLayout`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingtoolbar/FloatingToolbarLayout.java)

#### Ejemplo de tematización de la barra de herramientas flotante

El siguiente ejemplo muestra una barra de herramientas flotante con tematización de Material.

<img src="assets/floatingtoolbar/ftbtheming.png" alt="Ejemplo de tematización de la barra de herramientas flotante" width="600"/>

##### Implementación de la tematización de la barra de herramientas flotante

Usa atributos de tema y un estilo en `res/values/styles.xml` que se aplican a todas las barras de herramientas flotantes y afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_theme_light_primary</item>
    <item name="colorOnPrimary">@color/shrine_theme_light_onPrimary</item>
    <item name="colorPrimaryContainer">@color/shrine_theme_light_primaryContainer</item>
    <item name="colorOnPrimaryContainer">@color/shrine_theme_light_onPrimaryContainer</item>
    <item name="colorSecondaryContainer">@color/shrine_theme_light_secondaryContainer</item>
    <item name="colorOnSecondaryContainer">@color/shrine_theme_light_onSecondaryContainer</item>
    <item name="colorTertiaryContainer">@color/shrine_theme_light_tertiaryContainer</item>
    <item name="colorOnTertiaryContainer">@color/shrine_theme_light_onTertiaryContainer</item>
    <item name="colorError">@color/shrine_theme_light_error</item>
    <item name="colorErrorContainer">@color/shrine_theme_light_errorContainer</item>
    <item name="colorOnError">@color/shrine_theme_light_onError</item>
    <item name="colorOnErrorContainer">@color/shrine_theme_light_onErrorContainer</item>
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurface">@color/shrine_theme_light_onSurface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
</style>
```

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema, que se aplican a todas las barras de herramientas flotantes pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="floatingToolbarStyle">@style/Widget.App.FloatingToolbar</item>
</style>

<style name="Widget.App.FloatingToolbar" parent="Widget.Material3.FloatingToolbar">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.FloatingToolbar</item>
</style>

<style name="ThemeOverlay.App.FloatingToolbar" parent="">
    <item name="colorPrimary">@color/shrine_theme_light_primary</item>
    <item name="colorOnPrimary">@color/shrine_theme_light_onPrimary</item>
    <item name="colorPrimaryContainer">@color/shrine_theme_light_primaryContainer</item>
    <item name="colorOnPrimaryContainer">@color/shrine_theme_light_onPrimaryContainer</item>
    <item name="colorSecondaryContainer">@color/shrine_theme_light_secondaryContainer</item>
    <item name="colorOnSecondaryContainer">@color/shrine_theme_light_onSecondaryContainer</item>
    <item name="colorTertiaryContainer">@color/shrine_theme_light_tertiaryContainer</item>
    <item name="colorOnTertiaryContainer">@color/shrine_theme_light_onTertiaryContainer</item>
    <item name="colorError">@color/shrine_theme_light_error</item>
    <item name="colorErrorContainer">@color/shrine_theme_light_errorContainer</item>
    <item name="colorOnError">@color/shrine_theme_light_onError</item>
    <item name="colorOnErrorContainer">@color/shrine_theme_light_onErrorContainer</item>
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurface">@color/shrine_theme_light_onSurface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
</style>
```

O usa el estilo en el diseño, lo que afecta solo a esta barra de herramientas flotante específica:

```xml
<com.google.android.material.floatingtoolbar.FloatingToolbarLayout
    ...
    style="@style/Widget.App.FloatingToolbar"
/>
```
