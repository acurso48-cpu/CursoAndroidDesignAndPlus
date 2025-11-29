<!--docs:
title: "Barras de aplicaciones superiores"
layout: detail
section: components
excerpt: "Barra de aplicaciones superior de Android."
iconId: top_app_bar
path: /catalog/top-app-bars/
-->

# Barras de aplicaciones superiores (Barras de aplicaciones)

Las [barras de aplicaciones](https://m3.material.io/components/app-bars/overview) se colocan en la parte superior de la pantalla para ayudar a las personas a navegar por un producto. Hay cuatro variantes de barras de aplicaciones.

**Nota**: El componente de la barra de aplicaciones superior se renombra a barra de aplicaciones en el lenguaje de diseño.

<img src="assets/topappbar/topappbar-variants.png" alt="Cuatro tipos de barras de aplicaciones." width="600"/>

1.  Barra de aplicaciones de búsqueda
2.  Pequeña
3.  Mediana flexible
4.  Grande flexible

Para fines de implementación, las **barras de aplicaciones de búsqueda y pequeñas** se pueden agrupar en **barras de aplicaciones superiores normales**, mientras que las **barras de aplicaciones medianas flexibles y grandes flexibles** se pueden agrupar en **barras de aplicaciones superiores colapsables**.

Una barra de aplicaciones puede transformarse en una **barra de acciones contextual**, permaneciendo activa hasta que se realiza una acción o se descarta. Para obtener más información, consulta [barra de acciones contextual](#contextual-action-bar).

**Nota:** Las imágenes usan varios esquemas de colores dinámicos.

[**Barras de aplicaciones obsoletas**](#deprecated-app-bars)

Hay dos variantes que están siendo obsoletas y ya no se recomiendan:

1.  **Mediana**: reemplazar con mediana flexible.
2.  **Grande**: reemplazar con grande flexible.

<img src="assets/topappbar/appbars-deprecated.png" alt="Dos barras de aplicaciones obsoletas" width="650"/>

1.  Mediana
2.  Grande

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/top-app-bar/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/appbar/package-summary)

## Anatomía

<img src="assets/topappbar/topappbar-anatomy.png" alt="Diagrama de anatomía de la barra de aplicaciones normal." width="600"/>

1.  Contenedor
2.  Botón principal
3.  Elementos finales
4.  Encabezado
5.  Subtítulo

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/top-app-bar/guidelines#6423b736-55a9-42ba-85f1-b842329f1d54).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

La nueva **barra de aplicaciones de búsqueda** admite íconos dentro y fuera de la barra de búsqueda, y texto centrado. Abre el componente de vista de búsqueda cuando se selecciona.

Las nuevas barras de aplicaciones **mediana flexible** y **grande flexible** vienen con mejoras significativas, y deberían reemplazar a las barras de aplicaciones **mediana** y **grande**, que están siendo obsoletas. La barra de aplicaciones **pequeña** se actualiza con las mismas mejoras flexibles.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   Componente renombrado de **barra de aplicaciones superior** a **barra de aplicaciones**
*   Se agregó la **barra de aplicaciones de búsqueda**
*   Se están obsoletando las barras de aplicaciones **mediana** y **grande**
*   Se agregaron las barras de aplicaciones **mediana flexible** y **grande flexible** con:
    *   Altura total reducida
    *   Texto de título más grande
    *   Subtítulo
    *   Opciones de texto alineado a la izquierda y al centro
    *   Ajuste de texto
    *   Elementos más flexibles para imágenes y botones rellenos
*   Se agregaron funciones a la barra de aplicaciones pequeña:
    *   Subtítulo
    *   Opción de texto alineado al centro
    *   Elementos más flexibles para imágenes y botones rellenos

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `android:background` | `setBackground`<br>`getBackground` | `?attr/colorSurface`
**Elevación de `MaterialToolbar`** | `android:elevation` | `setElevation`<br>`getElevation` | `4dp`
**Elevación de `AppBarLayout`** | `android:stateListAnimator` | `setStateListAnimator`<br>`getStateListAnimator` | `0dp` a `4dp` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/res/animator/design_appbar_state_list_animator.xml))

### Atributos del ícono de navegación

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono de `MaterialToolbar`** | `app:navigationIcon` | `setNavigationIcon`<br>`getNavigationIcon` | `null`
**Color del ícono de `MaterialToolbar`** | `app:navigationIconTint` | `setNavigationIconTint` | `?attr/colorOnSurface`

### Atributos del título

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto del título de `MaterialToolbar`** | `app:title` | `setTitle`<br>`getTitle` | `null`
**Texto del subtítulo de `MaterialToolbar`** | `app:subtitle` | `setSubtitle`<br>`getSubtitle` | `null`
**Color del título de `MaterialToolbar`** | `app:titleTextColor` | `setTitleTextColor` | `?attr/colorOnSurface`
**Color del subtítulo de `MaterialToolbar`** | `app:subtitleTextColor` | `setSubtitleTextColor` | `?attr/colorOnSurfaceVariant`
**Tipografía del título de `MaterialToolbar`** | `app:titleTextAppearance` | `setTitleTextAppearance` | `?attr/textAppearanceTitleLarge`
**Tipografía del subtítulo de `MaterialToolbar`** | `app:subtitleTextAppearance` | `setSubtitleTextAppearance` | `?attr/textAppearanceTitleMedium`
**Centrado del título de `MaterialToolbar`** | `app:titleCentered` | `setTitleCentered` | `false`
**Centrado del subtítulo de `MaterialToolbar`** | `app:subtitleCentered` | `setSubtitleCentered` | `false`
**Tipografía del título contraído de `CollapsingToolbarLayout`** | `app:collapsedTitleTextAppearance` | `setCollapsedTitleTextAppearance` | `?attr/textAppearanceTitleLarge`
**Tipografía del título expandido de `CollapsingToolbarLayout`** | `app:expandedTitleTextAppearance` | `setExpandedTitleTextAppearance` | `?attr/textAppearanceHeadlineSmall` para mediana</br>`?attr/textAppearanceHeadlineMedium` para grande
**Color del título contraído de `CollapsingToolbarLayout`** | `android:textColor` (en `app:collapsedTitleTextAppearance`) o `app:collapsedTitleTextColor` | `setCollapsedTitleTextColor` | `?attr/colorOnSurface`
**Color del título expandido de `CollapsingToolbarLayout`** | `android:textColor` (en `app:expandedTitleTextAppearance`) o `app:expandedTitleTextColor` | `setExpandedTitleTextColor` | `?attr/colorOnSurface`
**Tipografía del subtítulo contraído de `CollapsingToolbarLayout`** | `app:collapsedSubtitleTextAppearance` | `setCollapsedSubtitleTextAppearance` | `?attr/textAppearanceTitleMedium`
**Tipografía del subtítulo expandido de `CollapsingToolbarLayout`** | `app:expandedSubtitleTextAppearance` | `setExpandedSubtitleTextAppearance` | `?attr/textAppearanceTitleLarge` para mediana</br>`?attr/textAppearanceHeadlineSmall` para grande
**Color del subtítulo contraído de `CollapsingToolbarLayout`** | `android:textColor` (en `app:collapsedSubtitleTextAppearance`) o `app:collapsedSubtitleTextColor` | `setCollapsedSubtitleTextColor` | `?attr/colorOnSurface`
**Color del subtítulo expandido de `CollapsingToolbarLayout`** | `android:textColor` (en `app:expandedSubtitleTextAppearance`) o `app:expandedSubtitleTextColor` | `setExpandedSubtitleTextColor` | `?attr/colorOnSurface`
**Márgenes del título expandido de `CollapsingToolbarLayout`** | `app:expandedTitleMargin*` | `setExpandedTitleMargin*` | `16dp`
**Relleno entre el título expandido y el subtítulo de `CollapsingToolbarLayout`** | `app:expandedTitlePadding` | `setExpandedTitlePadding` | `0dp`
**Líneas máximas del título de `CollapsingToolbarLayout`** | `app:maxLines` | `setMaxLines`<br>`getMaxLines` | `1`
**Elipsis del título de `CollapsingToolbarLayout`** | `app:titleTextEllipsize` | `setTitleEllipsize`<br>`getTitleEllipsize` | `end`
**Gravedad del título contraído de `CollapsingToolbarLayout`** | `app:collapsedTitleGravity` | `setCollapsedTitleGravity`<br>`getCollapsedTitleGravity` | `start\|center_vertical`
**Modo de gravedad del título contraído de `CollapsingToolbarLayout`** | `app:collapsedTitleGravityMode` | -- | `availableSpace`
**Gravedad del título expandido de `CollapsingToolbarLayout`** | `app:expandedTitleGravity` | `setExpandedTitleGravity`<br>`getExpandedTitleGravity` | `start\|bottom`

### Atributos de los elementos de acción

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Menú de `MaterialToolbar`** | `app:menu` | `inflateMenu`<br>`getMenu` | `null`
**Color del ícono de `MaterialToolbar`** | N/A | N/A | `?attr/colorOnSurfaceVariant`

### Atributos del menú de desbordamiento

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono de `MaterialToolbar`** | `android:src` y `app:srcCompat` en `actionOverflowButtonStyle` (en el tema de la aplicación) | `setOverflowIcon`<br>`getOverflowIcon` | `@drawable/abc_ic_menu_overflow_material` (antes de la API 23) o `@drawable/ic_menu_moreoverflow_material` (después de la API 23)
**Tema de desbordamiento de `MaterialToolbar`** | `app:popupTheme` | `setPopupTheme`<br>`getPopupTheme` | `@style/ThemeOverlay.Material3.*`
**Tipografía del elemento de desbordamiento de `MaterialToolbar`** | `textAppearanceSmallPopupMenu` y `textAppearanceLargePopupMenu` en `app:popupTheme` o el tema de la aplicación | N/A | `?attr/textAppearanceBodyLarge`

### Atributos de comportamiento de desplazamiento

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Banderas de desplazamiento de `MaterialToolbar` o `CollapsingToolbarLayout`** | `app:layout_scrollFlags` | `setScrollFlags`<br>`getScrollFlags`<br>(en `AppBarLayout.LayoutParams`) | `noScroll`
**Modo de colapso de `MaterialToolbar`** | `app:collapseMode` | `setCollapseMode`<br>`getCollapseMode`<br>(en `CollapsingToolbar`) | `none`
**Color del scrim de contenido de `CollapsingToolbarLayout`** | `app:contentScrim` | `setContentScrim`<br>`setContentScrimColor`<br>`setContentScrimResource`<br>`getContentScrim` | `null`
**Color del scrim de la barra de estado de `CollapsingToolbarLayout`** | `app:statusBarScrim` | `setStatusBarScrim`<br>`setStatusBarScrimColor`<br>`setStatusBarScrimResource`<br>`getStatusBarScrim` | `@empty`
**Duración de la animación del scrim de `CollapsingToolbarLayout`** | `app:scrimAnimationDuration` | `setScrimAnimationDuration`<br>`getScrimAnimationDuration` | `600`
**Interpolador de animación de colapso de `CollapsingToolbarLayout`** | `app:titlePositionInterpolator` | `setTitlePositionInterpolator` | `@null`
**Elevación en desplazamiento de `AppBarLayout`** | `app:liftOnScroll` | `setLiftOnScroll`<br>`isLiftOnScroll` | `true`
**Color de elevación en desplazamiento de `AppBarLayout`** | `app:liftOnScrollColor` | N/A | `?attr/colorSurfaceContainer`
**Vista de destino de elevación en desplazamiento de `AppBarLayout`** | `app:liftOnScrollTargetViewId` | `setLiftOnScrollTargetViewId`<br>`getLiftOnScrollTargetViewId` | `@null`
**Efecto de desplazamiento de `AppBarLayout`** | `app:layout_scrollEffect` | `setScrollEffect`<br>`getScrollEffect` | `none`

### Estilos de `AppBarLayout`

| Elemento | Estilo | Atributo de tema |
| --- | --- | --- |
| **Superficie | `Widget.Material3.AppBarLayout` | `?attr/appBarLayoutStyle` |
: color de fondo : | : | : |
: estilo de color** : | : | : |

### Estilos de `MaterialToolbar`

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.Toolbar` | `?attr/toolbarStyle`
**Estilo de color de fondo de superficie** | `Widget.Material3.Toolbar.Surface` | `?attr/toolbarSurfaceStyle`
**Estilo de color en superficie** | `Widget.Material3.Toolbar.OnSurface` | N/A

### Estilos de `CollapsingToolbarLayout`

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.CollapsingToolbar` | `?attr/collapsingToolbarLayoutStyle`
**Estilo mediano** | `Widget.Material3.CollapsingToolbar.Medium` | `?attr/collapsingToolbarLayoutMediumStyle`
**Estilo grande** | `Widget.Material3.CollapsingToolbar.Large` | `?attr/collapsingToolbarLayoutLargeStyle`

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/res/values/styles.xml)
y
[attrs](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/res/values/attrs.xml).

## Variantes de barras de aplicaciones

<details>

<summary><h3>Barra de aplicaciones de búsqueda</h3></summary>

Usa una barra de aplicaciones de búsqueda para proporcionar un punto de entrada enfatizado para abrir la vista de búsqueda. Úsala en las páginas de inicio cuando la búsqueda sea clave para el producto.

<img src="assets/topappbar/appbars-searchappbar.png" alt="Barra de aplicaciones de búsqueda con un ícono de búsqueda, un campo de texto de búsqueda y un título de página." width="600"/>
Las barras de aplicaciones de búsqueda tienen un campo de búsqueda en lugar de texto de encabezado

</details>

<details>

<summary><h3>Barra de aplicaciones pequeña</h3></summary>

Úsala en diseños densos o cuando se desplaza una página.

El siguiente ejemplo muestra una barra de aplicaciones superior pequeña con un título de página, un ícono de navegación, dos acciones y un menú de desbordamiento.

<img src="assets/topappbar/topappbar-small.png" alt="Barra de aplicaciones superior pequeña con fondo morado claro, íconos grises y título de página." width="600"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.google.android.material.appbar.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <com.google.android.material.appbar.MaterialToolbar
            android:id="@+id/topAppBar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:minHeight="?attr/actionBarSize"
            app:title="@string/page_title"
            app:menu="@menu/top_app_bar"
            app:navigationIcon="@drawable/ic_close_24dp" />

    </com.google.android.material.appbar.AppBarLayout>

    <!-- Nota: También se puede usar un RecyclerView -->
    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <!-- Contenido desplazable -->

    </androidx.core.widget.NestedScrollView>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

**Nota:** Para permitir que tu barra de aplicaciones superior crezca más alta cuando aumente la configuración de fuente del sistema, puedes usar `android:layout_height="wrap_content"` + `android:minHeight="?attr/actionBarSize"` en tu `MaterialToolbar`, como se muestra en el ejemplo anterior.

En `@menu/top_app_bar.xml`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/edit"
        android:title="@string/edit"
        android:contentDescription="@string/content_description_search"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/favorite"
        android:icon="@drawable/ic_favorite_24dp"
        android:title="@string/favorite"
        android:contentDescription="@string/content_description_favorite"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/more"
        android:title="@string/more"
        android:contentDescription="@string/content_description_more"
        app:showAsAction="never" />

</menu>
```

En los dibujables del ícono de menú/navegación:

```xml
<vector
    ...
    android:tint="?attr/colorControlNormal">
    ...
</vector>
```

En el código:

```kt
topAppBar.setNavigationOnClickListener {
    // Manejar la pulsación del ícono de navegación
}

topAppBar.setOnMenuItemClickListener { menuItem ->
    when (menuItem.itemId) {
        R.id.edit -> {
            // Manejar la pulsación del texto de edición
            true
        }
        R.id.favorite -> {
            // Manejar la pulsación del ícono de favorito
            true
        }
        R.id.more -> {
            // Manejar la pulsación del elemento más (dentro del menú de desbordamiento)
            true
        }
        else -> false
    }
}
```

**Nota:** El ejemplo anterior es el enfoque recomendado y, para que funcione, debes usar un tema `Theme.Material3.*` que contenga el segmento `NoActionBar`, como el `Theme.Material3.Light.NoActionBar`. De lo contrario, se agregará una barra de acciones a la ventana de `Activity` actual. El `MaterialToolbar` se puede establecer como la barra de acciones de soporte y, por lo tanto, recibir varias devoluciones de llamada de `Activity`, como se muestra en esta [guía](https://developer.android.com/training/appbar).

</details>

<details>

<summary><h3>Barra de aplicaciones mediana flexible</h3></summary>

Úsala para mostrar un encabezado más grande. Puede contraerse en una barra de aplicaciones pequeña al desplazarse.

<img src="assets/topappbar/medium-flexible-light.png" alt="Barra de aplicaciones mediana flexible en tema claro." width="550"/>

<img src="assets/topappbar/medium-flexible-dark.png" alt="Barra de aplicaciones mediana flexible en tema oscuro." width="550"/>

La [barra de aplicaciones superior mediana flexible](https://m3.material.io/components/app-bars/specs#51ac0fae-61c2-4abc-b8f9-1167bf54e875) introducida en las actualizaciones expresivas incluye alturas flexibles, soporte multilínea y puede contener una variedad más amplia de elementos. Estas características ya son compatibles/configurables dentro de la variante Mediana existente. Por lo tanto, el nombre de la variante `mediana` existente se reutilizará en el tema `Material3Expressive`.

**Si estás usando un tema `Material3Expressive`:**

El atributo `?attr/collapsingToolbarLayoutMediumStyle` existente se ha actualizado al nuevo comportamiento flexible. No necesitas cambiar tus diseños XML para obtener la nueva funcionalidad.

**Si no estás usando un tema `Material3Expressive`:**

Debes migrar a uno de los temas expresivos para usar los nuevos estilos de barra de aplicaciones flexibles.

Para dibujar correctamente el subtítulo en modo expandido. Utiliza lo siguiente:

```xml
  <com.google.android.material.appbar.AppBarLayout
      android:id="@+id/appbarlayout"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:fitsSystemWindows="true">

    <com.google.android.material.appbar.CollapsingToolbarLayout
        style="?attr/collapsingToolbarLayoutMediumStyle"
        android:id="@+id/collapsingtoolbarlayout"
        android:layout_width="match_parent"
        android:layout_height="?attr/collapsingToolbarLayoutMediumSize"
        app:layout_scrollFlags="scroll|exitUntilCollapsed|snap"
        app:expandedTitleGravity="bottom|center_horizontal">

      <com.google.android.material.appbar.MaterialToolbar
          android:id="@+id/toolbar"
          style="?attr/catalogToolbarWithCloseButtonStyle"
          android:layout_width="match_parent"
          android:layout_height="?attr/actionBarSize"
          android:elevation="0dp"
          app:layout_collapseMode="pin"
          app:title="Título mediano"
          app:subtitle="Subtítulo mediano"/>
    </com.google.android.material.appbar.CollapsingToolbarLayout>
  </com.google.android.material.appbar.AppBarLayout>
```

</details>

<details>

<summary><h3>Barra de aplicaciones grande flexible</h3></summary>

Úsala para enfatizar el encabezado de la página.

<img src="assets/topappbar/large-flexible-light.png" alt="Barra de aplicaciones grande flexible en tema claro." width="550"/>

<img src="assets/topappbar/large-flexible-dark.png" alt="Barra de aplicaciones grande flexible en tema oscuro." width="550"/>

La [barra de aplicaciones superior grande flexible](https://m3.material.io/components/app-bars/specs#51ac0fae-61c2-4abc-b8f9-1167bf54e875) introducida en las actualizaciones expresivas incluye alturas flexibles, soporte multilínea y puede contener una variedad más amplia de elementos. Estas características ya son compatibles/configurables dentro de la variante Grande existente. Por lo tanto, el nombre de la variante `grande` existente se reutilizará en el tema `Material3Expressive`.

**Si estás usando un tema `Material3Expressive`:**

El atributo `?attr/collapsingToolbarLayoutLargeStyle` existente se ha actualizado al nuevo comportamiento flexible. No necesitas cambiar tus diseños XML para obtener la nueva funcionalidad.

**Si no estás usando un tema `Material3Expressive`:**

Debes migrar a uno de los temas expresivos para usar los nuevos estilos de barra de aplicaciones flexibles.

Para dibujar correctamente el subtítulo en modo expandido. Utiliza lo siguiente:

```xml
  <com.google.android.material.appbar.AppBarLayout
      android:id="@+id/appbarlayout"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:fitsSystemWindows="true">

    <com.google.android.material.appbar.CollapsingToolbarLayout
        style="?attr/collapsingToolbarLayoutLargeStyle"
        android:id="@+id/collapsingtoolbarlayout"
        android:layout_width="match_parent"
        android:layout_height="?attr/collapsingToolbarLayoutLargeSize"
        app:layout_scrollFlags="scroll|exitUntilCollapsed|snap"
        app:expandedTitleGravity="bottom|center_horizontal">

      <com.google.android.material.appbar.MaterialToolbar
          android:id="@+id/toolbar"
          style="?attr/catalogToolbarWithCloseButtonStyle"
          android:layout_width="match_parent"
          android:layout_height="?attr/actionBarSize"
          android:elevation="0dp"
          app:layout_collapseMode="pin"
          app:title="Título grande"
          app:subtitle="Subtítulo grande"/>
    </com.google.android.material.appbar.CollapsingToolbarLayout>
  </com.google.android.material.appbar.AppBarLayout>
```

</details>

## Implementación de código

Antes de poder usar las barras de aplicaciones superiores de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

<details>

<summary><h3>Centrar las barras de aplicaciones</h3></summary>

La guía y el código para todas las barras de aplicaciones también son aplicables para centrar el título en las barras de aplicaciones. Para centrarlas, solo necesitas establecer los atributos `app:titleCentered` y/o `app:subtitleCentered` en `true` en tu `MaterialToolbar`.

<img src="assets/topappbar/topappbar-centered.png" alt="Barra de aplicaciones superior centrada con fondo morado claro, íconos grises y título de página." width="600"/>

</details>

<details>

<summary><h3>Agregar una imagen a las barras de aplicaciones colapsables</h3></summary>

Una barra de aplicaciones superior colapsable con un fondo de imagen, un título de página, un ícono de navegación, dos íconos de acción y un menú de desbordamiento:

<img src="assets/topappbar/topappbar-collapsing-image.png" alt="Barra de aplicaciones con fondo de imagen e íconos blancos. El título de la página está en una nueva línea debajo de los íconos" width="600"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    android:fitsSystemWindows="true">

    <com.google.android.material.appbar.AppBarLayout
        ...
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <com.google.android.material.appbar.CollapsingToolbarLayout
            style="?attr/collapsingToolbarLayoutLargeStyle"
            android:layout_width="match_parent"
            android:layout_height="?attr/collapsingToolbarLayoutLargeSize">

            <ImageView
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:src="@drawable/media"
                android:scaleType="centerCrop"
                android:fitsSystemWindows="true"
                android:contentDescription="@string/content_description_media" />

            <com.google.android.material.appbar.MaterialToolbar
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                ...
                android:background="@android:color/transparent" />

        </com.google.android.material.appbar.CollapsingToolbarLayout>

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.*.NoActionBar">
    <item name="android:windowTranslucentStatus">true</item>
</style>
```

</details>

<details>

<summary><h3>Agregar un botón de ícono final relleno a las barras de aplicaciones</h3></summary>

![Barra de aplicaciones superior con una acción rellena](assets/topappbar/trailing-icon.png)

Con las actualizaciones de Expressive, un [botón de ícono final relleno](https://m3.material.io/components/app-bars/specs#90d1e764-47e7-4e5d-9668-c00bc9599236) puede reemplazar los elementos de acción predeterminados. Para lograr esto, utiliza la siguiente configuración de diseño.

```xml

  <com.google.android.material.appbar.AppBarLayout
      android:id="@+id/appbarlayout"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:fitsSystemWindows="true">

    <com.google.android.material.appbar.CollapsingToolbarLayout
        style="?attr/collapsingToolbarLayoutMediumStyle"
        android:id="@+id/collapsingtoolbarlayout"
        android:layout_width="match_parent"
        android:layout_height="?attr/collapsingToolbarLayoutMediumSize"
        app:layout_scrollFlags="scroll|exitUntilCollapsed|snap"
        app:toolbarId="@id/toolbar">
      <LinearLayout
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:orientation="horizontal"
          app:layout_collapseMode="pin">
        <com.google.android.material.appbar.MaterialToolbar
            android:id="@+id/toolbar"
            style="?attr/catalogToolbarWithCloseButtonStyle"
            android:layout_width="0dp"
            android:layout_height="?attr/actionBarSize"
            android:layout_weight="1"
            android:elevation="0dp"
            app:title="Título mediano"/>
        <Button
            android:id="@+id/action_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginEnd="8dp"
            android:layout_gravity="center_vertical"
            app:icon="@drawable/ic_star_checkable_24"/>
      </LinearLayout>
    </com.google.android.material.appbar.CollapsingToolbarLayout>
  </com.google.android.material.appbar.AppBarLayout>
```

</details>

<details>

<summary><h3>Agregar un círculo al botón de navegación</h3></summary>

Si deseas agregar un fondo de círculo al ícono de navegación, establece la superposición de tema `android:theme="@style/ThemeOverlay.Material3.Toolbar.CircleNavigationButton"` en tu `Toolbar` o `MaterialToolbar`.

De forma predeterminada, la superposición de tema anterior usa `?attr/colorSurfaceContainer` para el color del círculo. Esto se puede personalizar extendiendo la superposición de tema y estableciendo el atributo `toolbarNavigationButtonCircleColor`.

<img src="assets/topappbar/topappbar-circle-nav-button.png" alt="Barra de aplicaciones superior con fondo de botón de navegación circular." width="600"/>

</details>

<details>

<summary><h3>Aplicar comportamiento de desplazamiento a las barras de aplicaciones</h3></summary>

Al desplazarse hacia arriba, la barra de aplicaciones superior colapsable se transforma en una barra de aplicaciones superior normal.

El siguiente ejemplo muestra la barra de aplicaciones superior posicionada en la misma elevación que el contenido. Al desplazarse, aumenta la elevación y permite que el contenido se desplace detrás de ella.

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    <com.google.android.material.appbar.AppBarLayout
        ...
        app:liftOnScroll="true">

        <com.google.android.material.appbar.MaterialToolbar
            ...
            />

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

**Nota:** Si tu vista de desplazamiento (`RecyclerView`, `ListView`, etc.) está anidada dentro de otra vista (por ejemplo, un `SwipeRefreshLayout`), debes asegurarte de establecer `app:liftOnScrollTargetViewId` en tu `AppBarLayout` en el id de la vista de desplazamiento. Esto asegurará que `AppBarLayout` esté usando la vista correcta para determinar si debe elevarse o no, y ayudará a evitar problemas de parpadeo.

El siguiente ejemplo muestra que la barra de aplicaciones superior desaparece al desplazarse hacia arriba y aparece al desplazarse hacia abajo.

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    <com.google.android.material.appbar.AppBarLayout
        ...>

        <com.google.android.material.appbar.MaterialToolbar
            ...
            app:layout_scrollFlags="scroll|enterAlways|snap"
            />

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

Opcionalmente, puedes cambiar el estilo en el que la barra de aplicaciones desaparece y aparece al desplazarse estableciendo un efecto de desplazamiento. De forma predeterminada, se establece un efecto de desplazamiento `none`, que traslada la barra de aplicaciones en sincronía con el contenido de desplazamiento. La siguiente opción muestra la configuración del efecto de desplazamiento `compress`, que recorta la barra de aplicaciones superior hasta que llega a la parte superior de la pantalla:

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    <com.google.android.material.appbar.AppBarLayout
        ...>

        <com.google.android.material.appbar.MaterialToolbar
            ...
            app:layout_scrollFlags="scroll|enterAlways|snap"
            app:layout_scrollEffect="compress"
            />

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

</details>

<details>

<summary><h3>Hacer que las barras de aplicaciones sean accesibles</h3></summary>

Las API del componente de la barra de aplicaciones superior de Android brindan soporte para el ícono de navegación, los elementos de acción, el menú de desbordamiento y más, para informar al usuario qué realiza cada acción. Aunque son opcionales, se recomienda encarecidamente su uso.

#### Descripciones de contenido

Cuando uses íconos para la navegación, los elementos de acción y otros elementos de las barras de aplicaciones superiores, debes establecer una descripción de contenido para ellos para que los lectores de pantalla como TalkBack puedan anunciar su propósito o acción.

Para una descripción general del contenido de la barra de aplicaciones superior, establece un `android:contentDescription` o usa el método `setContentDescription` en el `MaterialToolbar`.

Para el ícono de navegación, esto se puede lograr a través del atributo `app:navigationContentDescription` o el método `setNavigationContentDescription`.

Para los elementos de acción y los elementos dentro del menú de desbordamiento, la descripción del contenido debe establecerse en el menú:

```xml
<menu ...>
    ...
    <item
          ...
          android:contentDescription="@string/content_description_one" />
    <item
          ...
          android:contentDescription="@string/content_description_two" />
</menu>
```

Para las imágenes dentro de las barras de aplicaciones superiores colapsables, establece un `android:contentDescription` o usa el método `setContentDescription` para el `ImageView`.

</details>

<details>

<summary><h3>Barra de estado y de borde a borde</h3></summary>

<img src="assets/topappbar/topappbar-small.png" alt="Barra de aplicaciones superior pequeña con barra de estado de borde a borde." width="600"/>

Una configuración común para las barras de aplicaciones superiores modernas, como se ve arriba, es tener un color uniforme compartido con la barra de estado. La mejor manera de lograr esto es seguir la [guía de borde a borde](https://developer.android.com/training/gestures/edge-to-edge), que dará como resultado una barra de estado transparente que permite que se vea el color de fondo de la barra de aplicaciones superior.

Asegúrate de establecer `android:fitsSystemWindows="true"` en tu `AppBarLayout` (o `MaterialToolbar` si no usas `AppBarLayout`), para que se agregue un recuadro adicional para evitar la superposición con la barra de estado.

Si tu `AppBarLayout` se desplaza y el contenido es visible debajo de la barra de estado, puedes establecer el `statusBarForeground` de `AppBarLayout` en un `MaterialShapeDrawable` para permitir que `AppBarLayout` haga coincidir automáticamente el color de la barra de estado con su propio fondo.

En el código:

```kt
appBarLayout.statusBarForeground =
    MaterialShapeDrawable.createWithElevationOverlay(context)
```

O si usas colores de superficie tonales en lugar de superposiciones de elevación, puedes simplemente establecer el `statusBarForeground` en `colorSurface` para permitir que `AppBarLayout` haga coincidir automáticamente el color de la barra de estado con su propio fondo:

```kt
appBarLayout.setStatusBarForegroundColor(
    MaterialColors.getColor(appBarLayout, R.attr.colorSurface))
```

</details>

## Personalización de las barras de aplicaciones

### Tematización de las barras de aplicaciones

Las barras de aplicaciones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de la barra de aplicaciones

API y código fuente:

*   `CoordinatorLayout`
    *   [Definición de clase](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout)
*   `AppBarLayout`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/AppBarLayout.java)
*   `MaterialToolbar`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/appbar/MaterialToolbar)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/MaterialToolbar.java)
*   `CollapsingToolbarLayout`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/appbar/CollapsingToolbarLayout)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/CollapsingToolbarLayout.java)

Una barra de aplicaciones superior normal con tematización de Material:

!["Tematización de la barra de aplicaciones superior con colores rosa y marrón"](assets/topappbar/topappbar-theming.png)

##### Implementación de la tematización de la barra de aplicaciones

Usa atributos de tema en `res/values/styles.xml`, que se aplica a todas las barras de aplicaciones superiores y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*.NoActionBar">
    ...
    <item name="colorSurface">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="android:statusBarColor">?attr/colorPrimary</item>
    <item name="android:windowLightStatusBar" tools:targetApi="m">true</item>
    <item name="textAppearanceTitleLarge">@style/TextAppearance.App.TitleLarge</item>
    <item name="textAppearanceTitleMedium">@style/TextAppearance.App.TitleMedium</item>
</style>

<style name="TextAppearance.App.TitleLarge" parent="TextAppearance.Material3.TitleLarge">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="TextAppearance.App.TitleMedium" parent="TextAppearance.Material3.TitleMedium">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>
```

Usa atributos de estilo de tema predeterminados, estilos y superposiciones de temas, que se aplica a todas las barras de aplicaciones superiores pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*.NoActionBar">
    ...
    <item name="toolbarStyle">@style/Widget.App.Toolbar</item>
</style>

<style name="Widget.App.Toolbar" parent="Widget.Material3.Toolbar">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Toolbar</item>
    <item name="titleTextAppearance">@style/TextAppearance.App.TitleLarge</item>
    <item name="subtitleTextAppearance">@style/TextAppearance.App.TitleMedium</item>
</style>

<style name="ThemeOverlay.App.Toolbar" parent="">
    <item name="colorSurface">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
</style>
```

Usa el estilo en el diseño, que afecta solo a esta barra de aplicaciones superior:

```xml
<com.google.android.material.appbar.MaterialToolbar
    ...
    app:title="@string/flow_shirt_blouse"
    app:menu="@menu/top_app_bar_shrine"
    app:navigationIcon="@drawable/ic_close_24dp"
    style="@style/Widget.App.Toolbar"
    />
```

## Barra de acciones contextual

Las barras de acciones contextuales proporcionan acciones para los elementos seleccionados.

<details>

<summary><h3>Anatomía</h3></summary>

![Diagrama de anatomía de la barra de acciones contextual](assets/topappbar/contextual-action-bar-anatomy.png)

1.  Botón de cierre (en lugar de un ícono de navegación)
2.  Título contextual
3.  Acciones contextuales
4.  Menú de desbordamiento (opcional)
5.  Contenedor (no se muestra)

</details>

<details>

<summary><h3>Propiedades clave</h3></summary>

#### Atributos del botón de cierre

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono** | `app:actionModeCloseDrawable` (en el tema de la aplicación) | N/A | `@drawable/abc_ic_ab_back_material`
**Color** | N/A | N/A | `?attr/colorControlNormal` (como tinte de `Drawable`)

#### Atributos del título contextual

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto del título** | N/A | `setTitle`<br>`getTitle` | `null`
**Texto del subtítulo** | N/A | `setSubtitle`<br>`getSubtitle` | `null`
**Tipografía del título** | `app:titleTextStyle` | N/A | `@style/TextAppearance.Material3.ActionBar.Title`
**Tipografía del subtítulo** | `app:subtitleTextStyle` | N/A | `@style/TextAppearance.Material3.ActionBar.Subtitle`

#### Atributos de las acciones contextuales

| Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado |
|---|---|---|---|
| **Menú** | N/A | `menuInflater.inflate` en `ActionMode.Callback` | `null` |
| **Color del ícono** | N/A | N/A | `?attr/colorControlNormal` (como tinte de `Drawable`) |

#### Atributos del menú de desbordamiento

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono** | `android:src` y `app:srcCompat` en `actionOverflowButtonStyle` (en el tema de la aplicación) | `setOverflowIcon`<br>`getOverflowIcon` | `@drawable/abc_ic_menu_overflow_material` (antes de la API 23) o `@drawable/ic_menu_moreoverflow_material` (después de la API 23)
**Tipografía del elemento de desbordamiento** | `textAppearanceSmallPopupMenu` y `textAppearanceLargePopupMenu` en el tema de la aplicación | N/A | `?attr/textAppearanceTitleMedium`

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:background` | N/A | `?attr/actionModeBackground`
**Altura** | `app:height` | N/A | `?attr/actionBarSize`
**Ventana de superposición** | `app:windowActionModeOverlay` (en el tema de la aplicación) | N/A | `false`

#### Atributos del logotipo de la barra de herramientas

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**AdjustViewBounds** | `app:logoAdjustViewBounds` | `setLogoAdjustViewBounds`<br>`isLogoAdjustViewBounds` | `false`
**ScaleType** | `app:logoScaleType` | `setLogoScaleType`<br>`getLogoScaleType` | Predeterminado de ImageView

#### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.ActionMode` | `actionModeStyle`

</details>

<details>

<summary><h3>Agregar barra de acciones contextual</h3></summary>

API y código fuente:

*   `ActionMode`
    *   [Definición de clase](https://developer.android.com/reference/androidx/appcompat/view/ActionMode)

El siguiente ejemplo muestra una barra de acciones contextual con un título contextual, un ícono de cierre, dos íconos de acción contextual y un menú de desbordamiento:

![Ejemplo de barra de acciones contextual con fondo gris oscuro, íconos blancos y "1 seleccionado".](assets/topappbar/contextualactionbar.png)

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.*.NoActionBar">
    ...
    <item name="windowActionModeOverlay">true</item>
    <item name="actionModeCloseDrawable">@drawable/ic_close_24dp</item>
    <item name="actionBarTheme">@style/ThemeOverlay.Material3.Dark.ActionBar</item>
</style>
```

En el código:

```kt
val callback = object : ActionMode.Callback {

    override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.contextual_action_bar, menu)
        return true
    }

    override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
        return false
    }

    override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.share -> {
                // Manejar la pulsación del ícono de compartir
                true
            }
            R.id.delete -> {
                // Manejar la pulsación del ícono de eliminar
                true
            }
            R.id.more -> {
                // Manejar la pulsación del elemento más (dentro del menú de desbordamiento)
                true
            }
            else -> false
        }
    }

    override fun onDestroyActionMode(mode: ActionMode?) {
    }
}

val actionMode = startSupportActionMode(callback)
actionMode?.title = "1 seleccionado"
```

En `@menu/contextual_action_bar.xml`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:id="@+id/share"
        android:icon="@drawable/ic_share_24dp"
        android:title="@string/share"
        android:contentDescription="@string/content_description_share"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/delete"
        android:icon="@drawable/ic_delete_24dp"
        android:title="@string/delete"
        android:contentDescription="@string/content_description_delete"
        app:showAsAction="ifRoom" />

    <item
        android:id="@+id/more"
        android:title="@string/more"
        android:contentDescription="@string/content_description_more"
        app:showAsAction="never" />

</menu>
```

En los íconos de menú/navegación:

```xml
<vector
    ...
    android:tint="?attr/colorControlNormal">
    ...
</vector>
```

</details>

## Barras de aplicaciones obsoletas

Hay dos barras de aplicaciones obsoletas que ya no se recomiendan:

<img src="assets/topappbar/topappbar-deprecated.png" alt="Barra de aplicaciones superior obsoleta" width="600"/>

1.  Mediana
2.  Grande

Las barras de aplicaciones superiores colapsables más grandes se pueden usar para títulos más largos, para albergar imágenes o para proporcionar una presencia más fuerte a la barra de aplicaciones superior.

<details>

<summary><h3>Barra de aplicaciones superior mediana</h3></summary>

El siguiente ejemplo muestra una barra de aplicaciones superior colapsable mediana con un título de página, un ícono de navegación, un ícono de acción y un menú de desbordamiento.

<img src="assets/topappbar/topappbar-medium.png" alt="Barra de aplicaciones superior mediana con fondo claro e íconos grises con el título de la página en una nueva línea debajo de los íconos." width="600"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    <com.google.android.material.appbar.AppBarLayout
        ...
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <com.google.android.material.appbar.CollapsingToolbarLayout
            style="?attr/collapsingToolbarLayoutMediumStyle"
            android:layout_width="match_parent"
            android:layout_height="?attr/collapsingToolbarLayoutMediumSize">

            <com.google.android.material.appbar.MaterialToolbar
                ...
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:elevation="0dp" />

        </com.google.android.material.appbar.CollapsingToolbarLayout>

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

</details>

<details>

<summary><h3>Barra de aplicaciones superior grande</h3></summary>

El siguiente ejemplo muestra una barra de aplicaciones superior colapsable grande con un título de página, un ícono de navegación, un ícono de acción y un menú de desbordamiento.

<img src="assets/topappbar/topappbar-large.png" alt="Barra de aplicaciones superior grande con fondo claro e íconos grises con el título de la página en
una nueva línea debajo de los íconos" width="600"/>

En el diseño:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    <com.google.android.material.appbar.AppBarLayout
        ...
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:fitsSystemWindows="true">

        <com.google.android.material.appbar.CollapsingToolbarLayout
            style="?attr/collapsingToolbarLayoutLargeStyle"
            android:layout_width="match_parent"
            android:layout_height="?attr/collapsingToolbarLayoutLargeSize">

            <com.google.android.material.appbar.MaterialToolbar
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                ...
                android:elevation="0dp" />

        </com.google.android.material.appbar.CollapsingToolbarLayout>

    </com.google.android.material.appbar.AppBarLayout>

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

</details>
