<!--docs:
title: "Cajón de navegación"
layout: detail
section: components
excerpt: "Los cajones de navegación brindan acceso a los destinos de su aplicación."
iconId: navigation-drawer
path: /catalog/navigation-drawer/
-->

# Cajones de navegación

**Nota:** El cajón de navegación está siendo obsoleto en la actualización expresiva de Material 3. Para aquellos que han actualizado, usen un [riel de navegación expandido](https://m3.material.io/components/navigation-rail/overview), que tiene principalmente la misma funcionalidad que el cajón de navegación y se adapta mejor a las clases de tamaño de ventana.

Los [cajones de navegación](https://m3.material.io/components/navigation-drawer/overview) brindan acceso a los destinos de su aplicación. Hay dos variantes de cajones de navegación.

<img src="assets/navigationdrawer/navigation-drawer-overview.png" alt="Un cajón de navegación estándar (izquierda) y modal (derecha)" height="450">

1.  Cajón de navegación estándar
2.  Cajón de navegación modal

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/navigation-drawer/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/navigation/package-summary)

## Anatomía

<img src="assets/navigationdrawer/navigation-drawer-anatomy.png" alt="Diagrama de anatomía del cajón de navegación" width="800">

1.  Contenedor
2.  Titular
3.  Texto de la etiqueta
4.  Icono
5.  Indicador activo
6.  Texto de la etiqueta de la insignia
7.  Scrim

Más detalles sobre los elementos de la anatomía están disponibles en las [directrices del componente](https://m3.material.io/components/navigation-drawer/guidelines#86ff751b-e510-4428-bfb2-cc5bf9206bb8).

## Actualización de M3 Expressive

El cajón de navegación está siendo obsoleto. Usa el [riel de navegación expandido](https://m3.material.io/components/navigation-rail/overview) en su lugar. [Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo(s) | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `android:background` | `setBackground`<br>`getBackground` | `?attr/colorSurfaceContainerLow`
**Forma** | `app:shapeAppearance`<br>`app:shapeAppearanceOverlay` | N/A | `null`
**Elevación** | `app:elevation` (se puede usar en `NavigationView` o `DrawerLayout`) | `setElevation`<br>`getElevation` | `0dp` (`NavigationView`) o `1dp` (`DrawerLayout`)
**Ancho máximo** | `android:maxWidth` | N/A | `280dp`
**Se adapta a las ventanas del sistema** | `android:fitsSystemWindows` | `setFitsSystemWindows`<br>`getFitsSystemWindows` | `true`
**Tamaño de la esquina del cajón** | `drawerLayoutCornerSize` | N/A | `16dp`

### Atributos del encabezado

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Diseño** | `app:headerLayout` | `addHeaderView`<br>`inflateHeaderView`<br>`getHeaderView`<br>`getHeaderCount`<br>`removeHeaderView` | `null`

### Atributos del divisor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Divisor** | `android:listDivider` en el tema de la aplicación | N/A | Varía según la versión de la plataforma
**Altura** | N/A (ver [diseño](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/internal/res/layout/design_navigation_item_separator.xml)) | N/A | `1dp`
**Inserción** | `app:dividerInsetStart`<br/>`app:dividerInsetEnd` | `setDividerInsetStart`<br/>`getDividerInsetStart`<br/>`setDividerInsetEnd`<br/>`getDividerInsetEnd` | `28dp`<br/>`28dp`

### Atributos del elemento

Elemento | Atributo(s) | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:itemShapeFillColor` | N/A | `?attr/colorSecondaryContainer`
**Forma** | `app:itemShapeAppearance`<br>`app:itemShapeAppearanceOverlay` | N/A | `@style/ShapeAppearance.Material3.Corner.Full` <br>(`?attr/shapeCornerFamily` y tamaño de esquina `50%`)
**Inserciones** | `app:itemShapeInsetStart`<br>`app:itemShapeInsetTop`<br>`app:itemShapeInsetEnd`<br>`app:itemShapeInsetBottom` | N/A | `12dp`<br>`0dp`<br>`12dp`<br>`0dp`
**Relleno horizontal** | `app:itemHorizontalPadding` | `setItemHorizontalPadding`<br>`setItemHorizontalPaddingResource`<br>`getItemHorizontalPadding` | `28dp`
**Relleno vertical** | `app:itemVerticalPadding` | `setItemVerticalPadding`<br>`setItemVerticalPaddingResource`<br>`getItemVerticalPadding` | `4dp`

### Atributos del texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:itemTextColor` | `setItemTextColor`<br>`getItemTextColor` | `?attr/colorOnSecondaryContainer` cuando está activo, de lo contrario `?attr/colorOnSurfaceVariant`
**Tipografía** | `app:itemTextAppearance` | `setItemTextAppearance` | `?attr/textAppearanceLabelLarge`
**Tipografía (activa)** | `app:itemTextAppearanceActiveBoldEnabled` | `setItemTextAppearanceActiveBoldEnabled` | `true`
**Líneas máximas** | `app:itemMaxLines` | `setItemMaxLines`<br>`getItemMaxLines` | `1`

### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:itemIconTint` | `setIconItemTintList`<br>`getIconItemTintList` | `?attr/colorOnSecondaryContainer` cuando está activo, de lo contrario `?attr/colorOnSurfaceVariant`
**Tamaño** | `app:itemIconSize` | `setItemIconSize` | `24dp`
**Relleno** | `app:itemIconPadding` | `setItemIconPadding`<br>`setItemIconPaddingResource`<br>`getItemIconPadding` | `12dp`

### Atributos del subtítulo

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:subheaderColor` | N/A | `?attr/colorOnSurfaceVariant`
**Tipografía** | `app:subheaderTextAppearance` | N/A | `?attr/textAppearanceTitleSmall`
**Líneas máximas** | N/A | N/A | `1`
**Altura** | N/A | N/A | `?attr/listPreferredItemHeightSmall`
**Relleno** | `app:subheaderInsetStart`<br/>`app:subheaderInsetEnd` | `setSubheaderInsetStart`<br/>`getSubheaderInsetStart`<br/>`setSubheaderInsetEnd`<br/>`getSubheaderInsetEnd` | `28dp` y `28dp`

### Atributos del scrim

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | N/A | `setScrimColor` en `DrawerLayout` | Negro con 60% de opacidad
**Inserciones de ventana** | `app:topInsetScrimEnabled`<br/>`app:bottomScrimEnabled`<br/>`app:startScrimEnabled`<br/>`app:endScrimEnabled` | `setTopInsetScrimEnabled`<br/>`isTopInsetScrimEnabled`<br/>`setBottomInsetScrimEnabled`<br/>`isBottomInsetScrimEnabled`<br/>`setStartInsetScrimEnabled`<br/>`isStartInsetScrimEnabled`<br/>`setEndInsetScrimEnabled`<br/>`isEndInsetScrimEnabled` | true

### Estilos de `NavigationView`

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.NavigationView` | `?attr/navigationViewStyle`

### Estilos de `DrawerLayout`

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.DrawerLayout` | `?attr/drawerLayoutStyle`

## Variantes de cajones de navegación

<details>
  <summary><h3>Cajón de navegación estándar</h3></summary>

Los [cajones de navegación estándar](https://material.io/components/navigation-drawer#standard-drawer) permiten la interacción tanto con el contenido de la pantalla como con el cajón al mismo tiempo. Se pueden usar en tabletas y computadoras de escritorio, pero no son adecuados para dispositivos móviles debido al tamaño limitado de la pantalla.

API y código fuente:

*   `NavigationView`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/navigation/NavigationView)
    *   [Código fuente de GitHub](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/NavigationView.java)

#### Ejemplo de cajón de navegación estándar

El siguiente ejemplo muestra un cajón de navegación estándar permanentemente visible.

<img src="assets/navigationdrawer/navigation-drawer-standard.png" alt="cajón de navegación con título de encabezado, texto de encabezado, subtítulo y 3 elementos con iconos en el lado izquierdo de la pantalla." height="300">

En el diseño:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.google.android.material.navigation.NavigationView
        ...
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Contenido de la pantalla (restringido al final de navigationView) -->

</androidx.constraintlayout.widget.ConstraintLayout>
```

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.DayNight.*">
    <item name="android:windowTranslucentStatus">true</item>
</style>
```

En `res/layout/header_navigation_drawer.xml`:

```xml
<LinearLayout
    ...
    android:fitsSystemWindows="true">

    ...

</LinearLayout>
```

</details>

<details>
  <summary><h3>Cajón de navegación modal</h3></summary>

Los [cajones de navegación modales](https://material.io/components/navigation-drawer#modal-drawer) bloquean la interacción con el resto del contenido de una aplicación con un scrim. Están elevados sobre la mayor parte de la interfaz de usuario de la aplicación y no afectan la cuadrícula de diseño de la pantalla.

Se utilizan principalmente para dispositivos móviles donde el espacio de la pantalla es limitado y se pueden reemplazar por cajones estándar en tabletas y computadoras de escritorio.

[DrawerLayout](https://developer.android.com/reference/androidx/drawerlayout/widget/DrawerLayout) se usa junto con NavigationDrawer para lograr el cajón de navegación modal.

API y código fuente:

*   `NavigationView`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/navigation/NavigationView)
    *   [Código fuente de GitHub](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/NavigationView.java)
*   `DrawerLayout`
    *   [Definición de la clase](https://developer.android.com/reference/androidx/drawerlayout/widget/DrawerLayout)

#### Ejemplo de cajón de navegación modal

El siguiente ejemplo muestra un cajón de navegación modal.

<img src="assets/navigationdrawer/navigation-drawer-modal.png" alt="Una pantalla con un cajón de navegación modal abierto. El contenedor del cajón, el título del encabezado, el texto del encabezado y seis elementos." height="600">

En el diseño:

```xml
<androidx.drawerlayout.widget.DrawerLayout
    ...
    android:id="@+id/drawerLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:openDrawer="start">

    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true">

        <!-- Contenido de la pantalla -->
        <!-- Usa app:layout_behavior="@string/appbar_scrolling_view_behavior" para que quepa debajo de la barra de aplicaciones superior -->

    </androidx.coordinatorlayout.widget.CoordinatorLayout>

    <com.google.android.material.navigation.NavigationView
        ...
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:layout_gravity="start" />

</androidx.drawerlayout.widget.DrawerLayout>
```

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.DayNight.*">
    <item name="android:windowTranslucentStatus">true</item>
</style>
```

En `res/layout/header_navigation_drawer.xml`:

```xml
<LinearLayout
    ...
    android:fitsSystemWindows="true">

    ...

</LinearLayout>
```

En el código:

```kt
topAppBar.setNavigationOnClickListener {
    drawerLayout.open()
}

navigationView.setNavigationItemSelectedListener { menuItem ->
    // Manejar el elemento de menú seleccionado
    menuItem.isChecked = true
    drawerLayout.close()
    true
}
```

Para obtener más información sobre las barras de aplicaciones superiores, consulta la [documentación](https://github.com/material-components/material-components-android/tree/master/docs/components/TopAppBar.md).

</details>

## Implementación de código

Antes de poder usar los cajones de navegación, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md). Para los cajones de navegación modales, también debes agregar una dependencia a la biblioteca `DrawerLayout` de AndroidX. Para obtener más información, ve a la página de [lanzamientos](https://developer.android.com/jetpack/androidx/releases/drawerlayout).

<details>
  <summary><h3>Agregar cajón de navegación</h3></summary>

El contenido de todos los tipos de cajones de navegación se puede implementar usando una `NavigationView`.

```xml
<com.google.android.material.navigation.NavigationView
  android:id="@+id/navigationView"
  ... />
```

**Nota:** Los atributos `layout_width` y `layout_height` deben establecerse en `wrap_content`, `match_parent` o una dimensión personalizada según el tipo de cajón de navegación y el `ViewGroup` principal.

</details>

<details>
  <summary><h3>Agregar menú</h3></summary>

<img src="assets/navigationdrawer/navigation-drawer-basic.png" alt="Cajón de navegación con 3 elementos de menú" height="300">

En el diseño:

```xml
<com.google.android.material.navigation.NavigationView
    ...
    app:menu="@menu/navigation_drawer" />
```

En `res/menu/navigation_drawer.xml`:

```xml
<menu ...>

  <item
    android:id="@+id/main_item"
    android:title="@string/mail_subheader_title">
      <menu>
        <item
          android:id="@+id/inbox_item"
          android:icon="@drawable/ic_inbox_24px"
          android:title="@string/inbox_title"
          android:checkable="true"/>
        <item
          android:id="@+id/outbox_item"
          android:icon="@drawable/ic_outbox_24px"
          android:title="@string/outbox_title"
          android:checkable="true"/>
        <item
          android:id="@+id/favourites_item"
          android:icon="@drawable/ic_favourites_24px"
          android:title="@string/favourites_title"
          android:checkable="true">
      </menu>
  </item>

</menu>
```

</details>

<details>
  <summary><h3>Agregar encabezado</h3></summary>

<img src="assets/navigationdrawer/navigation-drawer-header.png" alt="Cajón de navegación con título de encabezado, texto de encabezado, un subtítulo de correo y 3 elementos. El elemento 1 está seleccionado." height="500">

En el diseño:

```xml
<com.google.android.material.navigation.NavigationView
    ...
    app:headerLayout="@layout/header_navigation_drawer" />
```

En `res/layout/header_navigation_drawer.xml`:

```xml
<LinearLayout
    ...
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:textAppearance="?attr/textAppearanceHeadlineSmall"
        android:textColor="?attr/colorOnSurface"
        android:text="@string/header_title" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:textAppearance="?attr/textAppearanceTitleSmall"
        android:textColor="?attr/colorOnSurfaceVariant"
        android:text="@string/header_text" />

</LinearLayout>
```

</details>

<details>
  <summary><h3>Agregar divisores y subtítulos</h3></summary>

<img src="assets/navigationdrawer/navigation-drawer-dividers-subtitles.png" alt="Cajón de navegación con título de encabezado, texto de encabezado, subtítulo de correo y 6 elementos con un divisor entre los elementos 3 y 4" height="500">

Los divisores se agregan automáticamente entre los grupos de `<item>` con ID únicos o `<group>` con ID únicos. Cuando se agrega un sub-`<menu>` a un elemento, se trata como un subtítulo.

En `res/menu/navigation_drawer.xml`:

```xml
<menu ...>
  <item
    android:id="@+id/main_item"
    android:title="@string/mail_subheader_title">
      <menu>
        <item
          android:id="@+id/search_item"
          android:icon="@drawable/ic_search_24px"
          android:title="@string/search_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
        <item
          android:id="@+id/rotation_item"
          android:icon="@drawable/ic_3d_rotation_24px"
          android:title="@string/3d_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
        <item
          android:id="@+id/accelerator_item"
          android:icon="@drawable/ic_accelerator_24px"
          android:title="@string/accelerator_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
        <item
          android:id="@+id/dashboard_item"
          android:icon="@drawable/ic_dashboard_24px"
          android:title="@string/dashboard_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
      </menu>
  </item>
  <item
    android:id="@+id/labels_item"
    android:title="@string/labels_subheader_title">
      <menu>
        <item
          android:id="@+id/label_one"
          android:icon="@drawable/ic_label_24px"
          android:title="@string/label_one_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
        <item
          android:id="@+id/label_two"
          android:icon="@drawable/ic_label_24px"
          android:title="@string/label_two_title"
          android:checkable="true"
          app:showAsAction="ifRoom"/>
      </menu>
  </item>

</menu>
```

</details>

<details>
  <summary><h3>Hacer accesibles los cajones de navegación</h3></summary>

Los cajones de navegación admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los elementos del menú se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, ve a la [guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

Importante: Asegúrate de que haya una forma de cerrar el cajón de navegación mediante la navegación por teclado escuchando la tecla `esc` en tu actividad y cerrando los cajones abiertos.

```java
  @Override
  public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    if (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ESCAPE && drawerLayout.isDrawerOpen(navigationView)) {
      drawerLayout.closeDrawer(navigationView);
      return true;
    }
    return super.dispatchKeyEvent(keyEvent);
  }
```

</details>

<details>
  <summary><h3>Establecer descripciones de contenido</h3></summary>

Se puede establecer una descripción de contenido en los `<item>` del menú `NavigationView` para que los lectores de pantalla como TalkBack puedan anunciar correctamente su propósito o acción. Esto se puede hacer en XML usando el atributo `android:contentDescription` o mediante programación con `navigationView.menu.findItem(R.id.itemId)#setContentDescription` (en la API 26 y superior).

Cualquier `ImageView` dentro del diseño del encabezado también debe tener una descripción de contenido establecida.

</details>

<details>
  <summary><h3>Abrir y cerrar cajones de navegación</h3></summary>

Para abrir los cajones de navegación, usa widgets en los que se pueda hacer clic que cumplan con el tamaño mínimo del objetivo táctil de `48dp` y que estén correctamente etiquetados para la accesibilidad. Para cerrar los cajones de navegación, considera hacer lo mismo, pero ten en cuenta que hacer clic en los elementos del menú o en un scrim opcional también debería servir para este propósito.

</details>

<details>
  <summary><h3>Uso de cajones de navegación con el componente de navegación</h3></summary>

Los cajones de navegación se pueden usar con la biblioteca de navegación de AndroidX. Para obtener más información, ve a la [documentación](https://developer.android.com/guide/navigation/navigation-ui#add_a_navigation_drawer).

</details>

<details>
  <summary><h3>Retroceso predictivo</h3></summary>

El componente `NavigationView` admite automáticamente el [retroceso predictivo](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md) cuando se configura dentro de un `DrawerLayout`, como se mencionó en las secciones anteriores. No se requiere ninguna integración adicional por parte de la aplicación, aparte de los requisitos previos generales del retroceso predictivo y los pasos de migración mencionados [aquí](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md#usage).

Visita las [directrices de diseño de retroceso predictivo](https://m3.material.io/components/side-sheets/guidelines#d77245e3-1013-48f8-a9d7-76f484e1be13) para ver cómo se comporta el componente cuando un usuario desliza el dedo hacia atrás.

</details>

## Personalización de los cajones de navegación

### Tematización de los cajones de navegación

Los cajones de navegación admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización del cajón de navegación

API y código fuente:

*   `NavigationView`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/navigation/NavigationView)
    *   [Código fuente de GitHub](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/NavigationView.java)

El siguiente ejemplo muestra un cajón de navegación con tematización de Material.

<img src="assets/navigationdrawer/navigation-drawer-theming.png" alt="Cajón de navegación con “Encabezado”, “Texto del encabezado”, subtítulo “Correo” y 6 elementos: texto e iconos marrones, contenedores rosas" height="600">

##### Implementación de la tematización del cajón de navegación

Usa atributos de tema, atributos de tema de estilo predeterminado y estilos en `res/values/styles.xml`, que se aplica a todos los cajones de navegación y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorSecondaryContainer">@color/shrine_theme_light_secondaryContainer</item>
    <item name="colorOnSecondaryContainer">@color/shrine_theme_light_onSecondaryContainer</item>
    <item name="colorTertiaryContainer">@color/shrine_theme_light_tertiaryContainer</item>
    <item name="colorOnTertiaryContainer">@color/shrine_theme_light_onTertiaryContainer</item>
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurface">@color/shrine_theme_light_onSurface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
    <item name="colorOutline">@color/shrine_theme_light_outline</item>
    <item name="textAppearanceTitleSmall">@style/TextAppearance.App.TitleSmall</item>
    <item name="textAppearanceLabelLarge">@style/TextAppearance.App.LabelLarge</item>
</style>

<style name="TextAppearance.App.TitleSmall" parent="TextAppearance.Material3.TitleSmall">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="TextAppearance.App.LabelLarge" parent="TextAppearance.Material3.LabelLarge">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="Widget.App.NavigationView" parent="Widget.Material3.NavigationView">
    <item name="itemIconTint">@color/navigation_item_color</item>
    <item name="itemTextColor">@color/navigation_item_color</item>
    <item name="itemShapeFillColor">@color/navigation_item_background_color</item>
</style>
```

En `res/color/navigation_item_color.xml`:

```xml
<selector ...>
    <item android:color="?attr/colorOnTertiaryContainer" android:state_checked="true"/>
    <item android:alpha="@dimen/material_emphasis_disabled" android:color="?attr/colorOnSurface" android:state_enabled="false"/>
    <item android:color="?attr/colorOnSurfaceVariant"/>
</selector>

```

En `res/color/navigation_item_background_color.xml`:

```xml
<selector ...>
    <item android:alpha="@dimen/material_emphasis_disabled" android:color="?attr/colorTertiaryContainer" android:state_activated="true"/>
    <item android:alpha="@dimen/material_emphasis_disabled" android:color="?attr/colorTertiaryContainer" android:state_checked="true"/>
    <item android:color="@android:color/transparent"/>
</selector>
```

Usa atributos de tema de estilo predeterminado, estilos y superposiciones de tema que se aplican a todos los cajones de navegación pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="navigationViewStyle">@style/Widget.App.NavigationView</item>
</style>

<style name="Widget.App.NavigationView" parent="Widget.Material3.NavigationView">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.NavigationView</item>
    <item name="itemIconTint">@color/navigation_item_color</item>
    <item name="itemTextColor">@color/navigation_item_color</item>
    <item name="itemShapeFillColor">@color/navigation_item_background_color</item>
</style>

<style name="ThemeOverlay.App.NavigationView" parent="">
    <item name="colorSecondaryContainer">@color/shrine_theme_light_secondaryContainer</item>
    <item name="colorOnSecondaryContainer">@color/shrine_theme_light_onSecondaryContainer</item>
    <item name="colorTertiaryContainer">@color/shrine_theme_light_tertiaryContainer</item>
    <item name="colorOnTertiaryContainer">@color/shrine_theme_light_onTertiaryContainer</item>
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurface">@color/shrine_theme_light_onSurface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
    <item name="colorOutline">@color/shrine_theme_light_outline</item>
    <item name="textAppearanceTitleSmall">@style/TextAppearance.App.TitleSmall</item>
    <item name="textAppearanceLabelLarge">@style/TextAppearance.App.LabelLarge</item>
</style>
```

Usa el estilo en el diseño, lo que afecta solo a este cajón de navegación:

```xml
<com.google.android.material.navigation.NavigationView
    ...
    style="@style/Widget.App.NavigationView" />
```
