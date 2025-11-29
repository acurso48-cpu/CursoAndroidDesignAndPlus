<!--docs:
title: "Navegación inferior"
layout: detail
section: components
excerpt: "Las barras de navegación inferiores facilitan la exploración y el cambio entre vistas de nivel superior con un solo toque."
iconId: bottom_navigation
path: /catalog/bottom-navigation/
-->

# Navegación inferior (Barra de navegación)

La [barra de navegación](https://m3.material.io/components/navigation-bar/overview) permite a las personas cambiar entre vistas de la interfaz de usuario en dispositivos más pequeños.

**Nota:** El nombre de diseño de este componente ha cambiado de **Navegación inferior** a **Barra de navegación**. Sin embargo, la implementación de Android de Material permanece como `BottomNavigationView`.

<img src="assets/bottomnav/bottomnav-hero.png" alt="Barra de navegación con 4 iconos.">
Barra de navegación en tamaños de ventana compactos y medianos

Las barras de navegación pueden tener de tres a cinco destinos. La barra de navegación se coloca en la parte inferior de las pantallas para un acceso conveniente. Cada destino está representado por un icono y un texto de etiqueta.

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/navigation-bar/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/bottomnavigation/package-summary)

## Anatomía

![Diagrama de anatomía de la barra de navegación](assets/bottomnav/bottomnav-anatomy.png)

1.  Contenedor
2.  Icono
3.  Texto de la etiqueta
4.  Indicador activo
5.  Insignia pequeña (opcional)
6.  Insignia grande (opcional)
7.  Etiqueta de insignia grande

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/navigation-bar/guidelines#895b5b49-a166-4d30-90be-c71a4c970f04).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

Se ha introducido un nuevo estilo expresivo para la barra de navegación inferior que es más corto y admite elementos de navegación horizontales en ventanas de tamaño mediano.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

<img src="assets/bottomnav/bottomnav-expressive.png" alt="Barra de navegación horizontal flexible" width="700"/>

**Color:**

*   La etiqueta activa cambió de **on-surface-variant** a **secondary**

### Estilos de M3 Expressive

Cambios de M3:

*   Altura: De 80dp a 64dp
*   Color: ¡Nuevos colores expresivos!
*   Relleno del elemento superior: De 12dp a 6dp
*   Relleno del elemento inferior: De 16dp a 6dp
*   El texto de la etiqueta ya no está en negrita cuando se selecciona
*   Indicador activo: De 64dp a 56dp
*   Nueva configuración de elementos horizontales en tamaños de ventana medianos y grandes (mayores o iguales a 600 dp):
    *   El icono se mueve de la parte superior al inicio del elemento
    *   En lugar de tener un ancho establecido en función del número de elementos, el ancho del elemento se basa en el contenido con un ancho máximo
    *   Gravedad del elemento: De centro superior a centro

El estilo predeterminado para la barra de navegación inferior es:

```xml
<item name="bottomNavigationStyle">@style/Widget.Material3Expressive.BottomNavigationView</item>
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurfaceContainer`
**Elevación** | `app:elevation` | `setElevation` | `3dp`
**Sombra de compatibilidad** (obsoleto) | `compatShadowEnabled` | N/A | `false`

**Nota:** `compatShadowEnabled` no tiene ningún efecto, ya que la biblioteca ya no admite pre-Lollipop.

### Atributos del elemento de la barra de navegación

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Recurso de menú** | `app:menu` | `inflateMenu`<br/>`getMenu` | N/A
**Ondulación (inactiva)** | `app:itemRippleColor` | `setItemRippleColor`<br/>`getItemRippleColor` | Variaciones de `?attr/colorPrimary` y `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_ripple_color_selector.xml))
**Ondulación (activa)** | " | " | Variaciones de `?attr/colorPrimary` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_ripple_color_selector.xml))
**Modo de visibilidad de la etiqueta** | `app:labelVisibilityMode` | `setLabelVisibilityMode`<br/>`getLabelVisibilityMode` | `LABEL_VISIBILITY_AUTO`
**Gravedad del elemento** | `app:itemGravity` | `setItemGravity`<br/>`getItemGravity` | `TOP_CENTER`

### Atributos del indicador activo

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Color** | `android:color` | `setItemActiveIndicatorColor`<br/>`getItemActiveIndicatorColor` | `?attr/colorSecondaryContainer`
**Ancho** | `android:width` | `setItemActiveIndicatorWidth`<br/>`getItemActiveIndicatorWidth` | `56dp`
**Altura** | `android:height` | `setItemActiveIndicatorHeight`<br/>`getItemActiveIndicatorHeight` | `32dp`
**Forma** | `app:shapeAppearance` | `setItemActiveIndicatorShapeAppearance`<br/>`getItemActiveIndicatorShapeAppearance` | `50% redondeado`
**Margen horizontal** | `app:marginHorizontal` | `setItemActiveIndicatorMarginHorizontal`<br/>`getItemActiveIndicatorMarginHorizontal` | `4dp`
**Relleno entre el indicador y la etiqueta** | `app:activeIndicatorLabelPadding` | `setActiveIndicatorLabelPadding` <br/> `getActiveIndicatorLabelPadding` | `4dp`
**Ancho expandido** | `app:expandedWidth` | `setItemActiveIndicatorExpandedWidth`<br/>`getItemActiveIndicatorExpandedWidth` | `HUG`
**Altura expandida** | `app:expandedHeight` | `setItemActiveIndicatorExpandedHeight`<br/>`getItemActiveIndicatorExpandedHeight` | `56dp`
**Margen horizontal expandido** | `app:expandedMarginHorizontal` | `setItemActiveIndicatorExpandedMarginHorizontal`<br/>`getItemActiveIndicatorExpandedMarginHorizontal` | `20dp`
**Relleno inicial expandido** | `app:expandedActiveIndicatorPaddingStart` | `setItemExpandedActiveIndicatorPadding` | `16dp`
**Relleno final expandido** | `app:expandedActiveIndicatorPaddingEnd` | `setItemExpandedActiveIndicatorPadding` | `16dp`
**Relleno superior expandido** | `app:expandedActiveIndicatorPaddingTop` | `setItemExpandedActiveIndicatorPadding` | `0dp`
**Relleno inferior expandido** | `app:expandedActiveIndicatorPaddingBottom` | `setItemExpandedActiveIndicatorPadding` | `0dp`

**Nota:** El indicador activo expandido se refiere al indicador activo que se expande para envolver el contenido del elemento de la barra de navegación cuando el valor de `itemIconGravity` es igual a `START`.

### Atributos del icono

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Icono** | `android:icon` en el recurso de `menu` | N/A | N/A
**Tamaño** | `app:itemIconSize` | `setItemIconSize`<br/>`setItemIconSizeRes`<br/>`getItemIconSize` | `24dp`
**Color (inactivo)** | `app:itemIconTint` | `setItemIconTintList`<br/>`getItemIconTintList` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_item_with_indicator_icon_tint.xml))
**Color (activo)** | " | " | `?attr/colorOnSecondaryContainer` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_item_with_indicator_icon_tint.xml))
**Gravedad** | `app:itemIconGravity` | `setItemIconGravity`<br/>`getItemIconGravity` | `TOP`
**Relleno horizontal del icono y la etiqueta** | `app:iconLabelHorizontalSpacing` | `setIconLabelHorizontalSpacing`<br/>`getIconLabelHorizontalSpacing` | `4dp`

### Atributos de la etiqueta de texto

Elemento | Atributo | Métodos relacionados | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:title` en el recurso de `menu` | N/A | N/A
**Color (inactivo)** | `app:itemTextColor` | `setItemTextColor`<br/>`getItemTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_item_with_indicator_label_tint.xml))
**Color (activo)** | " | " | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/color/m3_navigation_bar_item_with_indicator_label_tint.xml))
**Tipografía (inactiva)** | `app:itemTextAppearanceInactive`<br/>`app:horizontalItemTextAppearanceInactive` | `setItemTextAppearanceInactive`<br/>`getItemTextAppearanceInactive`<br/>`setHorizontalItemTextAppearanceInactive`<br/>`getHorizontalItemTextAppearanceInactive` | `?attr/textAppearanceTitleSmall`
**Tipografía (activa)** | `app:itemTextAppearanceActive`<br/>`app:horizontalItemTextAppearanceActive` | `setItemTextAppearanceActive`<br/>`getItemTextAppearanceActive`<br/>`setHorizontalItemTextAppearanceActive`<br/>`getHorizontalItemTextAppearanceActive` | `?attr/textAppearanceTitleSmall`
**Tipografía (activa)** | `app:itemTextAppearanceActiveBoldEnabled` | `setItemTextAppearanceActiveBoldEnabled` | `true`
**Líneas máximas** | `app:labelMaxLines` | `setLabelMaxLines`<br/>`getLabelMaxLines` | `1`
**Escalar con el tamaño de fuente** | `app:scaleLabelWithFontSize` | `setScaleLabelTextWithFont`<br/>`getScaleLabelTextWithFont` | `false`

### Estilos

Elemento | Estilo | Color del contenedor | Color del icono/etiqueta de texto (inactivo) | Color del icono/etiqueta de texto (activo) | Atributo de tema
--- | --- | --- | --- | --- | ---
**Estilo predeterminado** | `Widget.Material3.BottomNavigationView` | `?attr/colorSurface` | `?attr/colorOnSurfaceVariant` | Icono: `?attr/colorOnSecondaryContainer` <br/> Texto: `?attr/colorOnSurface` | `?attr/bottomNavigationStyle`

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/values/styles.xml),
[atributos de navegación](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/res/values/attrs.xml),
y
[atributos de la barra de navegación](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/res/values/attrs.xml).

## Implementación del código

Antes de poder usar la barra de navegación de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregar barra de navegación

Un diseño típico se ve así:

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
  ...
  <com.google.android.material.bottomnavigation.BottomNavigationView
      android:id="@+id/bottom_navigation"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      app:menu="@menu/bottom_navigation_menu" />

</LinearLayout>
```

El recurso `@menu/bottom_navigation_menu` debe apuntar a un archivo llamado `bottom_navigation_menu.xml` dentro de un directorio de recursos de `menu`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      android:id="@+id/item_1"
      android:enabled="true"
      android:icon="@drawable/icon_1"
      android:title="@string/text_label_1"/>
  <item
      android:id="@+id/item_2"
      android:enabled="true"
      android:icon="@drawable/icon_2"
      android:title="@string/text_label_2"/>
</menu>
```

**Nota:** `BottomNavigationView` no admite más de 5 elementos de `menu`.

En el código:

```kt
NavigationBarView.OnItemSelectedListener { item ->
    when(item.itemId) {
        R.id.item_1 -> {
            // Responder al clic del elemento de navegación 1
            true
        }
        R.id.item_2 -> {
            // Responder al clic del elemento de navegación 2
            true
        }
        else -> false
    }
}
```

También hay un método para detectar cuándo se han vuelto a seleccionar los elementos de navegación:

```kt
bottomNavigation.setOnItemReselectedListener { item ->
    when(item.itemId) {
        R.id.item_1 -> {
            // Responder a la reselección del elemento de navegación 1
        }
        R.id.item_2 -> {
            // Responder a la reselección del elemento de navegación 2
        }
    }
}
```

Eso da como resultado:

<img src="assets/bottomnav/bottom-nav-default.png" alt="Barra de navegación con fondo blanco, un icono morado seleccionado y otro icono no seleccionado." height="500"/>

**Nota:** Hemos quedado obsoletos los métodos `BottomNavigationView#setOnNavigationItemSelectedListener` y `BottomNavigationView#setOnNavigationItemReselectedListener` en favor de los detectores en `NavigationBarView`. Esto te permite compartir el código de manejo de la selección entre los elementos de vista `BottomNavigation` y `NavigationRail`.

### Ejemplo de barra de navegación

El siguiente ejemplo muestra una barra de navegación con cuatro iconos:

<img src="assets/bottomnav/bottom-nav-generic.png" alt="Barra de navegación con cuatro iconos." height="500"/>

En `layout.xml`:

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

  <com.google.android.material.bottomnavigation.BottomNavigationView
      android:id="@+id/bottom_navigation"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      app:menu="@menu/bottom_navigation_menu" />

</LinearLayout>
```

En `bottom_navigation_menu.xml` dentro de un directorio de recursos de `menu`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      android:id="@+id/page_1"
      android:enabled="true"
      android:icon="@drawable/ic_star"
      android:title="@string/page_1"/>
  <item
      android:id="@+id/page_2"
      android:enabled="true"
      android:icon="@drawable/ic_star"
      android:title="@string/page_2"/>
  <item
      android:id="@+id/page_3"
      android:enabled="true"
      android:icon="@drawable/ic_star"
      android:title="@string/page_3"/>
  <item
      android:id="@+id/page_4"
      android:enabled="true"
      android:icon="@drawable/ic_star"
      android:title="@string/page_4"/>
</menu>
```

En el código:

```kt
bottomNavigation.selectedItemId = R.id.page_2
```

### Agregar barra de navegación en pantallas más grandes

En pantallas de tamaño mediano y más grandes, se recomienda que las barras de navegación sean una configuración de elementos horizontales, estableciendo `app:itemIconGravity` en `start` en lugar de `top`. Puedes hacer esto [estableciendo diseños alternativos identificados por calificadores de recursos](https://developer.android.com/develop/ui/views/layout/responsive-adaptive-design-with-views#alternative_layout_resources).

Aquí tienes un ejemplo:

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
  android:id="@+id/bottom_navigation_bar"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_gravity="bottom"
  app:itemIconGravity="start"
  app:itemGravity="center"
  app:menu="@menu/bottom_navigation_menu"/>
```

<img src="assets/bottomnav/bottomnav-horizontal.png" alt="Barra de navegación horizontal en pantallas más grandes" height="100"/>

### Hacer accesible la barra de navegación

Debes establecer un `android:title` para cada uno de los elementos de tu `menu` para que los lectores de pantalla como TalkBack puedan anunciar correctamente lo que representa cada elemento de navegación:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      ...
      android:title="@string/text_label"/>
  ...
</menu>
```

El atributo `labelVisibilityMode` se puede usar para ajustar el comportamiento de las etiquetas de texto para cada elemento de la barra de navegación. Hay cuatro modos de visibilidad:

*   `LABEL_VISIBILITY_AUTO` (predeterminado): la etiqueta se comporta como “etiquetada” cuando hay 3 elementos o menos, o “seleccionada” cuando hay 4 elementos o más
*   `LABEL_VISIBILITY_SELECTED`: la etiqueta solo se muestra en el elemento de navegación seleccionado
*   `LABEL_VISIBILITY_LABELED`: la etiqueta se muestra en todos los elementos de navegación
*   `LABEL_VISIBILITY_UNLABELED`: la etiqueta está oculta para todos los elementos de navegación

### Agregar insignias

<img src="assets/bottomnav/bottom-navigation-badges.png" alt="Barra de navegación con 3 iconos con insignias, una insignia de solo icono y dos insignias numeradas que muestran 99 y 999+." height="120"/>

Inicializa y muestra un `BadgeDrawable` asociado con `menuItemId`; las llamadas posteriores a este método reutilizarán el `BadgeDrawable` existente:

```kt
var badge = bottomNavigation.getOrCreateBadge(menuItemId)
badge.isVisible = true
// Se mostrará una insignia de solo icono a menos que se establezca un número o texto:
badge.number = 99  // o badge.text = "Nuevo"
```

Como práctica recomendada, si necesitas ocultar temporalmente la insignia, por ejemplo, hasta que se reciba la siguiente notificación, cambia la visibilidad de `BadgeDrawable`:

```kt
val badgeDrawable = bottomNavigation.getBadge(menuItemId)
    if (badgeDrawable != null) {
        badgeDrawable.isVisible = false
        badgeDrawable.clearNumber()  // o badgeDrawable.clearText()
    }
```

Para eliminar cualquier `BadgeDrawable` que ya no sea necesario:

```kt
bottomNavigation.removeBadge(menuItemId)
```

Consulta la documentación de [`Insignias`](BadgeDrawable.md) para obtener más información sobre las insignias.

## Personalización de la barra de navegación

### Tematización de una barra de navegación

Las barras de navegación admiten la personalización de color y tipografía.

#### Ejemplo de tematización de la barra de navegación

API y código fuente:

*   `BottomNavigationView`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/bottomnavigation/BottomNavigationView)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomnavigation/BottomNavigationView.java)

El siguiente ejemplo muestra una barra de navegación con tematización de Material.

<img src="assets/bottomnav/bottom-nav-theming.png" alt="Barra de navegación con iconos marrones (favoritos, música, lugares, noticias) y fondo rosa." height="500"/>

##### Implementación de la tematización de la barra de navegación

Usa atributos de tema y un estilo en `res/values/styles.xml`, que se aplica a todas las barras de navegación y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
</style>
```

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema, que se aplican a todas las barras de navegación pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="bottomNavigationStyle">@style/Widget.App.BottomNavigationView</item>
</style>

<style name="Widget.App.BottomNavigationView" parent="Widget.Material3.BottomNavigationView">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.BottomNavigationView</item>
</style>

<style name="ThemeOverlay.App.BottomNavigationView" parent="">
    <item name="colorSurface">@color/shrine_theme_light_surface</item>
    <item name="colorOnSurfaceVariant">@color/shrine_theme_light_onSurfaceVariant</item>
</style>
```

Usa el estilo en el diseño, lo que afecta solo a esta barra de navegación específica:

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    ...
    style="@style/Widget.App.BottomNavigationView"
/>
```
