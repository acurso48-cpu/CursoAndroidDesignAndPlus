<!--docs:
title: "Barras de aplicaciones inferiores"
layout: detail
section: components
excerpt: "Barras de aplicaciones inferiores de Android."
iconId: bottom_app_bar
path: /catalog/bottom-app-bars/
-->

# Barras de aplicaciones inferiores

**Nota:** La **barra de aplicaciones inferior** está siendo obsoleta y debe reemplazarse por la [barra de herramientas acoplada](DockedToolbar.md), que funciona de manera similar, pero es más corta y tiene más flexibilidad.

Una [barra de aplicaciones inferior](https://m2.material.io/components/app-bars-bottom) muestra la navegación y las acciones clave en la parte inferior de las pantallas móviles.

![Barra de aplicaciones inferior morada con botón de acción flotante](assets/bottomappbar/bottom-app-bar-hero.png)

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

Las barras de aplicaciones inferiores brindan acceso a hasta cuatro acciones, incluido el [botón de acción flotante](FloatingActionButton.md) (FAB).

## Documentación de diseño y API

*   [Especificaciones de Material 2 (M2)](https://m2.material.io/components/app-bars-bottom)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/bottomappbar/package-summary)

## Anatomía

![Diagrama de anatomía de la barra de aplicaciones inferior](assets/bottomappbar/bottom-app-bar-anatomy.png)

1.  Contenedor
2.  Botón de acción flotante (FAB) (opcional)
3.  Elemento(s) de acción (opcional)
4.  Icono de navegación (opcional)
5.  Menú de desbordamiento (opcional)

**Nota:** Este documento refleja la barra de aplicaciones inferior después de los cambios en 1.7 para reflejar el estilo actual de M3. Usa `Widget.Material3.BottomAppBar.Legacy` para volver al estilo anterior.

## Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

La barra de aplicaciones inferior está siendo obsoleta y debe reemplazarse por la [barra de herramientas acoplada](DockedToolbar.md), que funciona de manera similar, pero es más corta y tiene más flexibilidad.

**Tipos y nombres:**

*   Se agregó la **barra de herramientas acoplada** para reemplazar la **barra de aplicaciones inferior**

    *   Tamaño: Altura más corta
    *   Color: Estándar o vibrante
    *   Flexibilidad: Más opciones de diseño y elementos

*   La **barra de aplicaciones inferior** todavía está disponible, pero no se recomienda

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | `setBackgroundTint`<br>`getBackgroundTint` | `?attr/colorSurfaceContainer`
**Elevación** | `app:elevation` | `setElevation` | `3dp`
**Altura** | `android:minHeight` | `setMinimumHeight`<br>`getMinimumHeight` | `80dp`
**Sombras** | `app:addElevationShadow` | N/A | `false`

### Atributos del icono de navegación

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `app:navigationIcon` | `setNavigationIcon`<br>`getNavigationIcon` | `null`
**Color** | `app:navigationIconTint` | `setNavigationIconTint` | `?attr/colorOnSurfaceVariant` (como tinte de `Drawable`)

### Atributos del FAB

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Modo de alineación** | `app:fabAlignmentMode` | `setFabAlignmentMode`<br>`getFabAlignmentMode` | `end`
**Modo de animación** | `app:fabAnimationMode` | `setFabAnimationMode`<br>`getFabAnimationMode` | `slide`
**Modo de anclaje** | `app:fabAnchorMode` | `setFabAnchorMode` <br> `getFabAnchorMode` | `embed`
**Margen de la base** | `app:fabCradleMargin` | `setFabCradleMargin`<br>`getFabCradleMargin` | `6dp`
**Radio de la esquina redondeada de la base** | `app:fabCradleRoundedCornerRadius` | `setFabCradleRoundedCornerRadius`<br>`getFabCradleRoundedCornerRadius` | `4dp`
**Desplazamiento vertical de la base** | `app:fabCradleVerticalOffset` | `setCradleVerticalOffset`<br>`getCradleVerticalOffset` | `12dp`
**Margen final** | `app:fabAlignmentModeEndMargin` | `setFabAlignmentModeEndMargin` <br> `getFabAlignmentModeEndMargin` | `16dp`
**Elevación incrustada** | `app:removeEmbeddedFabElevation` | N/A | `true`

Consulta la [documentación del FAB](https://github.com/material-components/material-components-android/tree/master/docs/components/FloatingActionButton.md) para obtener más atributos.

### Atributos del/de los elemento(s) de acción

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Menú** | `app:menu` | `replaceMenu`<br>`getMenu` | `null`
**Color del icono** | N/A | N/A | `?attr/colorControlNormal` (como tinte de `Drawable`)
**Modo de alineación** | `app:menuAlignmentMode` | `setMenuAlignmentMode` <br> `getMenuAlignmentMode` | `start`

### Atributos del menú de desbordamiento

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `android:src` y `app:srcCompat` en `actionOverflowButtonStyle` (en el tema de la aplicación) | `setOverflowIcon`<br>`getOverflowIcon` | `@drawable/abc_ic_menu_overflow_material` (antes de la API 23) o `@drawable/ic_menu_moreoverflow_material` (después de la API 23)
**Tema** | `app:popupTheme` | `setPopupTheme`<br>`getPopupTheme` | `@style/ThemeOverlay.Material3.*`
**Tipografía del elemento** | `textAppearanceSmallPopupMenu` y `textAppearanceLargePopupMenu` en `app:popupTheme` o el tema de la aplicación | N/A | `?attr/textAppearanceTitleMedium`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.BottomAppBar` | `bottomAppBarStyle`

Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomappbar/res/values/styles.xml) y [atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomappbar/res/values/attrs.xml).

## Implementación del código

Antes de poder usar las barras de aplicaciones inferiores de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Ejemplos de barras de aplicaciones inferiores

El siguiente ejemplo muestra una barra de aplicaciones inferior con un icono de navegación, 3 iconos de acción y un FAB incrustado.

<img src="assets/bottomappbar/bottomappbar-basic.png" alt="Barra de aplicaciones inferior morada con iconos grises y botón de acción flotante insertado morado." width="650"/>

**En el diseño:**

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- Nota: También se puede usar un RecyclerView -->
    <androidx.core.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingBottom="100dp"
        android:clipToPadding="false">

        <!-- Contenido desplazable -->

    </androidx.core.widget.NestedScrollView>

    <com.google.android.material.bottomappbar.BottomAppBar
        android:id="@+id/bottomAppBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        app:navigationIcon="@drawable/ic_drawer_menu_24px"
        app:menu="@menu/bottom_app_bar"
        />

    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:srcCompat="@drawable/ic_add_24dp"
        app:layout_anchor="@id/bottomAppBar"
        />

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

**En `menu/bottom_app_bar.xml`:**

```xml
<menu
      ...>
    <item
      android:id="@+id/accelerator"
      android:icon="@drawable/ic_accelerator_24px"
      android:title="@string/accelerator"
      android:contentDescription="@string/content_description_accelerator"
      app:showAsAction="ifRoom"/>

    <item
      android:id="@+id/rotation"
      android:icon="@drawable/ic_3d_rotation_24px"
      android:title="@string/rotation"
      android:contentDescription="@string/content_description_rotation"
      app:showAsAction="ifRoom"/>

    <item
      android:id="@+id/dashboard"
      android:icon="@drawable/ic_dashboard_24px"
      android:title="@string/dashboard"
      android:contentDescription="@string/content_description_dashboard"
      app:showAsAction="ifRoom"/>

</menu>
```

**En los dibujables del icono de menú/navegación:**

```xml
<vector
    ...
    android:tint="?attr/colorControlNormal">
    ...
</vector>
```

**En el código:**

```kt
bottomAppBar.setNavigationOnClickListener {
    // Manejar la pulsación del icono de navegación
}

bottomAppBar.setOnMenuItemClickListener { menuItem ->
    when (menuItem.itemId) {
        R.id.accelerator -> {
            // Manejar la pulsación del icono del acelerador
            true
        }
        R.id.rotation -> {
            // Manejar la pulsación del icono de rotación
            true
        }
        R.id.dashboard -> {
            // Manejar la pulsación del icono del panel de control
            true
        }
        else -> false
    }
}
```

### Hacer que las barras de aplicaciones inferiores sean accesibles

Las API del componente de la barra de aplicaciones inferior de Android brindan soporte para el icono de navegación, los elementos de acción, el menú de desbordamiento y más para decirle al usuario qué realiza cada acción. Aunque son opcionales, se recomienda encarecidamente su uso.

#### Descripciones de contenido

Cuando uses iconos de navegación, elementos de acción y otros elementos de las barras de aplicaciones inferiores, debes establecer una descripción de contenido para ellos para que los lectores de pantalla como TalkBack puedan anunciar su propósito o acción.

Para una descripción general del contenido de la barra de aplicaciones inferior, establece un `android:contentDescription` o usa el método `setContentDescription` en la `BottomAppBar`.

Para el icono de navegación, usa el atributo `app:navigationContentDescription` o el método `setNavigationContentDescription`.

Para los elementos de acción y los elementos dentro del menú de desbordamiento, establece la descripción del contenido en el menú:

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

#### Talkback

La barra de aplicaciones inferior puede ocultarse opcionalmente al desplazarse con el atributo `app:hideOnScroll`. Cuando este atributo se establece en verdadero, el desplazamiento ocultará la barra de aplicaciones inferior y evitará que la vean los lectores de pantalla, lo que puede ser confuso para los usuarios. Para evitar esto, el comportamiento de ocultación se deshabilita automáticamente cuando Talkback está habilitado. Aunque no se recomienda por motivos de accesibilidad, puedes forzar opcionalmente el comportamiento de ocultación llamando a `bottomAppBar.disableHideOnTouchExploration(false)`.

Dependiendo de tu diseño, deshabilitar el comportamiento de ocultación puede hacer que el contenido quede oculto detrás de la barra. Asegúrate de agregar el relleno inferior apropiado de la altura de la barra de aplicaciones inferior al contenido. Consulta a continuación un ejemplo:

```
val am = context.getSystemService(AccessibilityManager::class.java)
if (am != null && am.isTouchExplorationEnabled) {
    bar.setHideOnScroll(false)
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

### Aplicar el comportamiento de desplazamiento a las barras de aplicaciones inferiores

El siguiente ejemplo muestra que la barra de aplicaciones inferior se oculta al desplazar el contenido desplazable hacia abajo y aparece al desplazarlo hacia arriba.

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    ...>

    ...

    <com.google.android.material.bottomappbar.BottomAppBar
        ...
        app:hideOnScroll="true"
        />

    ...

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

## Personalización de las barras de aplicaciones inferiores

### Tematización de las barras de aplicaciones inferiores

Las barras de aplicaciones inferiores admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de la barra de aplicaciones inferior

API y código fuente:

*   `CoordinatorLayout`
    *   [Definición de clase](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout)
*   `BottomAppBar`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/bottomappbar/BottomAppBar)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomappbar/BottomAppBar.java)
*   `FloatingActionButton`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/floatingactionbutton/FloatingActionButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/floatingactionbutton/FloatingActionButton.java)
*   `BottomAppBarCutCornersTopEdge`:
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/bottomappbar/BottomAppBarCutCornersTopEdge.java)

El siguiente ejemplo muestra una barra de aplicaciones inferior con tematización de Material.

<img src="assets/bottomappbar/bottomappbar-theming.png" alt="Barra de aplicaciones inferior rosa con FAB insertado en forma de diamante rosa e iconos marrones." width="600"/>

##### Implementación de la tematización de la barra de aplicaciones inferior

Usa atributos de tema en `res/values/styles.xml`, que aplica el tema a todas las barras de aplicaciones inferiores y FAB y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorSurfaceContainer">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="colorPrimaryContainer">@color/shrine_pink_50</item>
    <item name="colorOnPrimaryContainer">@color/shrine_pink_900</item>
    <item name="textAppearanceTitleMedium">@style/TextAppearance.App.Medium</item>
    <item name="shapeAppearanceCornerLarge">@style/ShapeAppearance.App.Corner.Large</item>
</style>

<style name="TextAppearance.App.Medium" parent="TextAppearance.Material3.TitleMedium">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="ShapeAppearance.App.Corner.Large" parent="ShapeAppearance.Material3.Corner.Large">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">50%</item>
</style>
```

Usa atributos de tema de estilo predeterminado, estilos y superposiciones de temas, que aplica el tema a todas las barras de aplicaciones inferiores y FAB pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="bottomAppBarStyle">@style/Widget.App.BottomAppBar</item>
    <item name="floatingActionButtonStyle">@style/Widget.App.FloatingActionButton</item>
</style>

<style name="Widget.App.BottomAppBar" parent="Widget.Material3.BottomAppBar">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.BottomAppBar</item>
</style>

<style name="Widget.App.FloatingActionButton" parent="Widget.Material3.FloatingActionButton.Primary">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.FloatingActionButton</item>
</style>

<style name="ThemeOverlay.App.BottomAppBar" parent="ThemeOverlay.Material3.BottomAppBar">
    <item name="colorSurfaceContainer">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="textAppearanceTitleMedium">@style/TextAppearance.App.TitleMedium</item>
</style>

<style name="ThemeOverlay.App.FloatingActionButton" parent="ThemeOverlay.Material3.FloatingActionButton.Primary">
    <item name="colorPrimaryContainer">@color/shrine_pink_50</item>
    <item name="colorOnPrimaryContainer">@color/shrine_pink_900</item>
    <item name="shapeAppearanceCornerLarge">@style/ShapeAppearance.App.Corner.Large</item>
</style>
```

Usa los estilos en el diseño, lo que afecta solo a esta barra de aplicaciones inferior y FAB:

```xml
<com.google.android.material.bottomappbar.BottomAppBar
    ...
    style="@style/Widget.App.BottomAppBar"
    />

<com.google.android.material.floatingactionbutton.FloatingActionButton
    ...
    style="@style/Widget.App.FloatingActionButton"
    />
```
