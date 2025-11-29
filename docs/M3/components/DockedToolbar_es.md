<!--docs:
title: "Barra de herramientas acoplada"
layout: detail
section: components
excerpt: "Las barras de herramientas acopladas muestran acciones relacionadas con la página actual"
iconId: docked_toolbar
path: /catalog/docked-toolbar/
-->

# Barra de herramientas acoplada

La barra de herramientas acoplada proporciona una forma de mostrar acciones relacionadas con la página actual.

![Barra de herramientas acoplada](assets/dockedtoolbar/docked-toolbar.png)

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/toolbars/overview)
*   Referencia de la API en curso

## Anatomía

<img src="assets/dockedtoolbar/docked-toolbar-anatomy.png" alt="Diagrama de anatomía de la barra de herramientas acoplada" height="350">

1.  Contenedor
2.  Elementos

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/toolbars/guidelines#d6b7bcb1-295d-41e6-a051-37f12e1c96ab).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/dockedtoolbar/dockedtoolbar-expressive.png" alt="Barra de herramientas acoplada" height="350">
Acoplado con acción principal incrustada en lugar de FAB

La **barra de aplicaciones inferior** está siendo obsoleta y debe reemplazarse por la **barra de herramientas acoplada**, que funciona de manera similar, pero es más corta y tiene más flexibilidad.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres**

*   Se agregó la **barra de herramientas acoplada** para reemplazar la **barra de aplicaciones inferior**

    *   Tamaño: Altura más corta
    *   Color: Estándar o vibrante
    *   Flexibilidad: Más opciones de diseño y elementos

*   La **barra de aplicaciones inferior** todavía está disponible, pero no se recomienda

### Estilos de M3 Expressive

El estilo estándar para la barra de herramientas acoplada se define a continuación:

```xml
<item name="dockedToolbarStyle">@style/Widget.Material3Expressive.DockedToolbar</item>
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurfaceContainer`
**Forma** | `app:shapeAppearance` | N/A | `0% redondeado`
**Relleno de inserción superior** | `app:paddingTopSystemWindowInsets` | N/A | `no establecido`
**Relleno de inserción inferior** | `app:paddingBottomSystemWindowInsets` | N/A | `no establecido`

**Nota:** `DockedToolbarLayout` agrega automáticamente una inserción superior o inferior según su gravedad dentro de un `CoordinatorLayout`, si `app:paddingTopSystemWindowInsets` o `app:paddingBottomSystemWindowInsets` no están establecidos. Si no se usa una barra de herramientas acoplada dentro de un `CoordinatorLayout`, establece estos atributos explícitamente para agregar un relleno de inserción.

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.DockedToolbar` | `?attr/dockedToolbarStyle`
**Estilo vibrante** | `Widget.Material3.DockedToolbar.Vibrant` | `?attr/dockedToolbarVibrantStyle`

El estilo predeterminado es el estilo estándar.

La barra de herramientas acoplada también recomienda un estilo especial para componentes específicos para cuando están dentro de una barra de herramientas acoplada. Actualmente, los estilos de la barra de herramientas acoplada también incluyen una superposición de tema para `?attr/materialButtonStyle`, `?attr/materialIconButtonStyle` y `?attr/borderlessButtonStyle` para diseñar botones dentro de una barra de herramientas acoplada.

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/dockedtoolbar/res/values/styles.xml)
y
[atributos de la barra de herramientas acoplada](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/dockedtoolbar/res/values/attrs.xml)

## Implementación de código

Antes de poder usar la barra de herramientas acoplada, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregar barra de herramientas acoplada

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

  <com.google.android.material.dockedtoolbar.DockedToolbarLayout
    android:id="@+id/docked_toolbar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:layout_behavior="com.google.android.material.behavior.HideViewOnScrollBehavior">

    <!-- contenido de muestra de la barra de herramientas acoplada -->
    <com.google.android.material.overflow.OverflowLinearLayout
      android:id="@+id/docked_toolbar_child"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_gravity="center"
      android:orientation="horizontal">
      <FrameLayout
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:minWidth="48dp"
        android:layout_weight="1"
        app:layout_overflowText="@string/docked_toolbar_back_button_description"
        app:layout_overflowIcon="@drawable/ic_arrow_back_24px">
        <Button
          android:id="@+id/docked_toolbar_back_button"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_gravity="center"
          style="?attr/materialIconButtonStyle"
          android:contentDescription="@string/docked_toolbar_back_button_description"
          app:icon="@drawable/ic_arrow_back_24px" />
      </FrameLayout>

      <FrameLayout
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:minWidth="48dp"
        android:layout_weight="1"
        app:layout_overflowText="@string/docked_toolbar_add_button_description"
        app:layout_overflowIcon="@drawable/ic_add_24px">
        <Button
          android:id="@+id/docked_toolbar_add_button"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_gravity="center"
          style="?attr/materialIconButtonStyle"
          android:contentDescription="@string/docked_toolbar_add_button_description"
          app:icon="@drawable/ic_add_24px" />
      </FrameLayout>

      <FrameLayout
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:minWidth="48dp"
        android:layout_weight="1"
        app:layout_overflowText="@string/docked_toolbar_forward_button_description"
        app:layout_overflowIcon="@drawable/ic_arrow_forward_24px">
        <Button
          android:id="@+id/docked_toolbar_forward_button"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_gravity="center"
          style="?attr/materialIconButtonStyle"
          android:contentDescription="@string/docked_toolbar_forward_button_description"
          app:icon="@drawable/ic_arrow_forward_24px" />
      </FrameLayout>
    </com.google.android.material.overflow.OverflowLinearLayout>

  </com.google.android.material.dockedtoolbar.DockedToolbarLayout>
</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

Una barra de herramientas acoplada es un `FrameLayout` que proporciona un estilo adicional. Puedes agregarle hijos como lo harías con un `FrameLayout`. Se recomienda que sus hijos estén envueltos por un `OverflowLinearLayout` que se encargará de agregar automáticamente elementos a un menú de desbordamiento cuando no haya suficiente espacio en la pantalla para mostrar todos los elementos.

Cuando uses `OverflowLinearLayout`, también debes establecer `app:layout_overflowText` en cada hijo, ya que ese será el texto del elemento de menú que corresponde al hijo oculto. Opcionalmente, también puedes establecer `app:layout_overflowIcon`. Consulta [OverflowLinearLayout](https://github.com/material-components/material-components-android/tree/master/docs/components/OverflowLinearLayout.md) para obtener más información.

Nota: si la vista hija en la que se puede hacer clic no es un hijo directo de `OverflowLinearLayout`, como en el caso del ejemplo anterior, asegúrate de propagar el clic del padre al hijo. Esto es para que los elementos desbordados en el menú desbordado respondan correctamente al hacer clic. Alternativamente, también puedes establecer `onClickListener` en los elementos desbordados directamente accediendo a ellos a través de `OverflowLinearLayout.getOverflowedViews()`.

Las barras de herramientas acopladas pueden ocultarse opcionalmente al desplazarse hacia abajo si están dentro de un `CoordinatorLayout` estableciendo el siguiente `CoordinatorLayout.Behavior` a través del atributo `app:layout_behavior`:

```xml
<com.google.android.material.dockedtoolbar.DockedToolbarLayout
    android:id="@+id/docked_toolbar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:layout_behavior="com.google.android.material.behavior.HideViewOnScrollBehavior">
  ...
</com.google.android.material.dockedtoolbar.DockedToolbarLayout>
```

Las [barras de aplicaciones superiores](TopAppBar.md) y las [barras de aplicaciones inferiores](BottomAppBar.md) también son implementaciones de una barra de herramientas acoplada que ofrecen más en términos de funcionalidad, pero son menos flexibles que la implementación `DockedToolbarLayout`.

API y código fuente:

*   `DockedToolbar`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/dockedtoolbar/DockedToolbarLayout.java)

### Hacer accesible la barra de herramientas acoplada

Debes establecer una `contentDescription` en todas las acciones de la barra de herramientas acoplada para que los lectores de pantalla como TalkBack puedan anunciar correctamente lo que representa cada acción.

También puedes controlar el orden del enfoque de TalkBack a través de las banderas `accessibilityTraversalBefore` y `accessibilityTraversalAfter`.

Por ejemplo, si deseas que la barra de herramientas acoplada obtenga el enfoque de TalkBack primero, puedes establecer estas banderas de accesibilidad como se muestra a continuación:

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
        android:accessibilityTraversalAfter="@id/docked_toolbar" />
    </LinearLayout>
  </androidx.core.widget.NestedScrollView>

  <com.google.android.material.dockedbar.DockedToolbarLayout
    android:id="@+id/docked_toolbar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:accessibilityTraversalBefore="@id/content">
    ...
  </com.google.android.material.dockedtoolbar.DockedToolbarLayout>
```

#### TalkBack

Las barras de herramientas acopladas pueden usar opcionalmente el `CoordinatorLayout.Behavior` `HideViewOnScrollBehavior` para ocultar la barra de herramientas acoplada al desplazarse. Este comportamiento se deshabilita cuando TalkBack está habilitado debido a que los lectores de pantalla no pueden verlo si la barra de herramientas acoplada está oculta al desplazarse.

Si usas una barra de herramientas acoplada en un diseño que oscurece cualquier contenido cuando la ocultación al desplazarse está deshabilitada, asegúrate de agregar el relleno apropiado al contenido. Por ejemplo, si la barra de herramientas acoplada está en la parte inferior y está oscureciendo el contenido, se debe agregar un relleno inferior al contenido.

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

## Personalización de la barra de herramientas acoplada

### Tematización de la barra de herramientas acoplada

Las barras de herramientas acopladas admiten la personalización de color y tipografía.

#### Ejemplo de tematización de la barra de herramientas acoplada

El siguiente ejemplo muestra una barra de herramientas acoplada con tematización de Material.

<img src="assets/dockedtoolbar/docked-toolbar-theming.png" alt="Ejemplo de tematización de la barra de herramientas acoplada" width="600">

##### Implementación de la tematización de la barra de herramientas acoplada

Usa atributos de tema y un estilo en `res/values/styles.xml` que se aplican a todas las barras de herramientas acopladas y afectan a otros componentes:

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

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema, que se aplican a todas las barras de herramientas acopladas pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="dockedToolbarStyle">@style/Widget.App.DockedToolbar</item>
</style>

<style name="Widget.App.DockedToolbar" parent="Widget.Material3.DockedToolbar">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.DockedToolbar</item>
</style>

<style name="ThemeOverlay.App.DockedToolbar" parent="">
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

O usa el estilo en el diseño, lo que afecta solo a esta barra de herramientas acoplada específica:

```xml
<com.google.android.material.dockedtoolbar.DockedToolbarLayout
    ...
    style="@style/Widget.App.DockedToolbar"
/>
```
