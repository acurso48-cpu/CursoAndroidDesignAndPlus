<!--docs:
title: "Riel de navegación"
layout: detail
section: components
excerpt: "Los rieles de navegación brindan acceso a los destinos principales de su aplicación en pantallas de tabletas y computadoras de escritorio."
iconId: navigation_rail
path: /catalog/navigation-rail/
-->

# Riel de navegación

El [riel de navegación](https://m3.material.io/components/navigation-rail/overview) permite a las personas cambiar entre vistas de la interfaz de usuario en dispositivos de tamaño mediano. Hay dos tipos de riel de navegación.

<img src="assets/navigationrail/navigation-rail-hero.png" alt="El contenedor del riel de navegación tiene 80 dp de ancho de forma predeterminada." height="400"/>

1.  Riel de navegación contraído
2.  Riel de navegación expandido

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/navigation-rail/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/navigationrail/package-summary)

## Anatomía

<img src="assets/navigationrail/navigation-rail-anatomy.png" alt="Diagrama de anatomía del riel de navegación">
Elementos del riel de navegación contraído y expandido:

1.  Contenedor
2.  Menú (opcional)
3.  FAB o FAB extendido (opcional)
4.  Icono
5.  Indicador activo
6.  Texto de la etiqueta
7.  Insignia grande (opcional)
8.  Etiqueta de insignia grande (opcional)
9.  Insignia pequeña (opcional)

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/navigation-rail/guidelines#b51e4558-351f-4368-af8d-bbf1f63f68b4).

## M3 Expressive

### Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/navigationrail/navigation-rail-expressive.png" alt="rieles de navegación contraídos y expandidos" width="500">
Los rieles de navegación contraído y expandido coinciden visualmente y pueden realizar una transición entre sí.

El riel de navegación ahora se puede **expandir** para mostrar más contenido, funcionando de manera similar a un cajón de navegación. Cuando no está expandido, se lo conoce como un **riel de navegación contraído**, que es su estado predeterminado.

El riel de navegación expandido está destinado a reemplazar el cajón de navegación.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres:**

*   El **riel de navegación** original ahora se conoce como **riel de navegación contraído**
*   Se agregaron dos rieles de navegación más anchos:
    *   **Contraído:** riel de navegación original renombrado
    *   **Expandido:** reemplaza el cajón de navegación

**Configuraciones:**

*   Modalidad del riel expandido:
    *   No modal
*   Comportamiento expandido:
    *   Transición al riel de navegación contraído

**Color:**

*   La etiqueta activa en los elementos verticales cambió de **on surface variant** a **secondary**

### Estilos de M3 Expressive

Cambios de medida de M3:

*   Ancho: de 80dp a 96dp
*   Color: ¡nuevos colores expresivos!
*   Altura mínima del elemento: de 60dp a 64dp
*   Espaciado de elementos: de 0dp a 4dp
*   Elevación: de 0dp a 3dp
*   Relleno del elemento superior: de 4dp a 6dp
*   Relleno del elemento inferior: de 12dp a 4dp
*   Margen superior del contenido del riel de navegación: de 8dp a 44dp
*   Relleno entre la vista de encabezado opcional y los elementos del riel de navegación: de 8dp a 40dp
*   El texto de la etiqueta ya no está en negrita cuando se selecciona

El estilo predeterminado para el riel de navegación es:

```xml
<item name="navigationRailStyle">@style/Widget.Material3Expressive.NavigationRailView</item>
```

## Propiedades clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurface`
**Elevación** | `app:elevation` | `setElevation` | `0dp`
**Se adapta a las ventanas del sistema** | `android:fitsSystemWindows` | `getFitsSystemWindows`<br/>`setFitsSystemWindows` | `true`
**Relleno de las inserciones de la ventana del sistema superior** | `app:paddingTopSystemWindowInsets` | N/A | `null`
**Relleno de las inserciones de la ventana del sistema inferior** | `app:paddingBottomSystemWindowInsets` | N/A | `null`
**Margen superior** | `app:contentMarginTop` | N/A | N/A
**Desplazamiento** | `app:scrollingEnabled` | N/A | `false`

### Atributos del encabezado

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Vista de encabezado** | `app:headerLayout` | `addHeaderView`<br/>`removeHeaderView`<br/>`getHeaderView` | N/A
**Margen inferior del encabezado** | `app:headerMarginBottom` | N/A | `8dp`

Consulta la [documentación del FAB](https://github.com/material-components/material-components-android/tree/master/docs/components/FloatingActionButton.md) para obtener más atributos.

### Atributos del menú de navegación

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Gravedad del menú** | `app:menuGravity` | `setMenuGravity`<br/>`getMenuGravity` | `TOP\|CENTER_HORIZONTAL`
**Divisores** | `app:submenuDividersEnabled` | `setSubmenuDividersEnabled`<br/>`getSubmenuDividersEnabled` | `false`

**Nota:** Si los divisores están habilitados, estarán entre todos los submenús, que solo son visibles cuando están expandidos.

### Atributos del elemento de navegación

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Recurso de menú** | `app:menu` | `inflateMenu`<br/>`getMenu` | N/A
**Ondulación (inactiva)** | `app:itemRippleColor` | `setItemRippleColor`<br/>`getItemRippleColor` | `?attr/colorPrimary` al 12% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/res/color/mtrl_navigation_bar_ripple_color.xml))
**Ondulación (activa)** | `app:itemRippleColor` | `setItemRippleColor`<br/>`getItemRippleColor` | `?attr/colorPrimary` al 12% (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/res/color/mtrl_navigation_bar_ripple_color.xml))
**Modo de visibilidad de la etiqueta** | `app:labelVisibilityMode` | `setLabelVisibilityMode`<br/>`getLabelVisibilityMode` | `LABEL_VISIBILITY_AUTO`
**Altura mínima del elemento** | `app:itemMinHeight` | `setItemMinimumHeight`<br/>`getItemMinimumHeight` | `NO_ITEM_MINIMUM_HEIGHT`
**Altura mínima del elemento contraído** | `app:collapsedItemMinHeight` | `setCollapsedItemMinimumHeight`<br/>`getCollapsedItemMinimumHeight` | `NO_ITEM_MINIMUM_HEIGHT`
**Altura mínima del elemento expandido** | `app:expandedItemMinHeight` | `setExpandedItemMinimumHeight`<br/>`getExpandedItemMinimumHeight` | `NO_ITEM_MINIMUM_HEIGHT`
**Espaciado de elementos** | `app:itemSpacing` | `setItemSpacing`<br/>`getItemSpacing` | `0dp`
**Gravedad del elemento** | `app:itemGravity` | `setItemGravity`<br/>`getItemGravity` | `TOP_CENTER`

**Nota:** Si no hay suficiente espacio, es posible que no se respeten `itemMinHeight` e `itemSpacing` para que quepan los elementos.

### Atributos del indicador activo

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
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
**Relleno superior expandido** | `app:expandedActiveIndicatorPaddingTop` | `setItemExpandedActiveIndicatorPadding` | `16dp`
**Relleno inferior expandido** | `app:expandedActiveIndicatorPaddingBottom` | `setItemExpandedActiveIndicatorPadding` | `16dp`

**Nota:** El indicador activo expandido se refiere al indicador activo que se expande para envolver el contenido del elemento del riel de navegación cuando el valor de `itemIconGravity` es igual a `START`.

### Atributos del icono

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono** | `android:icon` en el recurso de `menu` | N/A | N/A
**Tamaño** | `app:itemIconSize` | `setItemIconSize`<br/>`setItemIconSizeRes`<br/>`getItemIconSize` | `24dp`
**Color (inactivo)** | `app:itemIconTint` | `setItemIconTintList`<br/>`getItemIconTintList` | `?attr/colorOnSurfaceVariant`
**Color (activo)** | `app:itemIconTint` | `setItemIconTintList`<br/>`getItemIconTintList` | `?attr/colorOnSecondaryContainer`
**Gravedad** | `app:itemIconGravity` | `setItemIconGravity`<br/>`getItemIconGravity` | `TOP`
**Relleno horizontal del icono y la etiqueta** | `app:iconLabelHorizontalSpacing` | `setIconLabelHorizontalSpacing`<br/>`getIconLabelHorizontalSpacing` | `8dp`

### Atributos de la etiqueta de texto

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Etiqueta de texto** | `android:title` en el recurso de `menu` | N/A | N/A
**Color (inactivo)** | `app:itemTextColor` | `setItemTextColor`<br/>`getItemTextColor` | `?attr/colorOnSurfaceVariant`
**Color (activo)** | `app:itemTextColor` | `setItemTextColor`<br/>`getItemTextColor` | `?attr/colorOnSurface`
**Tipografía (inactiva)** | `app:itemTextAppearanceInactive`<br/>`app:horizontalItemTextAppearanceInactive` | `setItemTextAppearanceInactive`<br/>`getItemTextAppearanceInactive`<br/>`setHorizontalItemTextAppearanceInactive`<br/>`getHorizontalItemTextAppearanceInactive` | `?attr/textAppearanceTitleSmall` para la configuración de elementos normal, `?attr/textAppearanceLabelLarge` para horizontal
**Tipografía (activa)** | `app:itemTextAppearanceActive`<br/>`app:horizontalItemTextAppearanceActive` | `setItemTextAppearanceActive`<br/>`getItemTextAppearanceActive`<br/>`setHorizontalItemTextAppearanceActive`<br/>`getHorizontalItemTextAppearanceActive` | `?attr/textAppearanceTitleSmall` para la configuración de elementos normal, `?attr/textAppearanceLabelLarge` para horizontal
**Tipografía (activa)** | `app:itemTextAppearanceActiveBoldEnabled` | `setItemTextAppearanceActiveBoldEnabled` | `true`
**Líneas máximas** | `app:labelMaxLines` | `setLabelMaxLines`<br/>`getLabelMaxLines` | `1`
**Escalar con el tamaño de fuente** | `app:scaleLabelWithFontSize` | `setScaleLabelTextWithFont`<br/>`getScaleLabelTextWithFont` | `false`

### Estilos

Elemento | Estilo | Color del contenedor | Color del icono/etiqueta de texto (inactivo) | Color del icono/etiqueta de texto (activo) | Atributo de tema
--- | --- | --- | --- | --- | ---
**Estilo predeterminado** | `Widget.Material3.NavigationRailView` | `?attr/colorSurface` | `?attr/colorOnSurfaceVariant` | `?attr/colorOnSurface`<br/>`?attr/colorOnSecondaryContainer` | `?attr/navigationRailStyle`

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigationrail/res/values/styles.xml),
[atributos de la barra de navegación](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigation/res/values/attrs.xml),
y
[atributos del riel de navegación](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigationrail/res/values/attrs.xml).

## Implementación del código

Antes de poder usar el riel de navegación de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

<details>
<summary><h3>Agregar riel de navegación</h3></summary>

Un diseño típico se verá similar a este:

```xml
<com.google.android.material.navigationrail.NavigationRailView
    android:id="@+id/navigation_rail"
    android:layout_width="wrap_content"
    android:layout_height="match_parent"
    app:menu="@menu/navigation_rail_menu" />
```

**Nota:** El ancho de una `NavigationRailView` será de 80 dp de forma predeterminada. El ancho del riel se puede cambiar estableciendo el atributo `android:layout_width` en un valor de DP específico.

En `navigation_rail_menu.xml` dentro de un directorio de recursos de `menu`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      android:id="@+id/alarms"
      android:enabled="true"
      android:icon="@drawable/icon_alarms"
      android:title="@string/alarms_destination_label"/>
  <item
      android:id="@+id/schedule"
      android:enabled="true"
      android:icon="@drawable/icon_clock"
      android:title="@string/schedule_destination_label"/>
  <item
      android:id="@+id/timer"
      android:enabled="true"
      android:icon="@drawable/icon_sand_clock"
      android:title="@string/timer_destination_label"/>
  <item
      android:id="@+id/stopwatch"
      android:enabled="true"
      android:icon="@drawable/icon_stop_watch"
      android:title="@string/stopwatch_destination_label"/>
</menu>
```

`NavigationRailView` muestra de tres a no más de siete destinos de la aplicación cuando está contraído, y puede incluir una vista de encabezado. Cada destino está representado por un icono y una etiqueta de texto.

También puedes definir submenús para el riel de navegación como se muestra a continuación:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/submenu_1"
        android:title="@string/subheader_1_name">
        <menu>
            <item
                android:id="@+id/timer"
                android:enabled="true"
                android:icon="@drawable/icon_sand_clock"
                android:title="@string/timer_destination_label"/>
            <item
                android:id="@+id/stopwatch"
                android:enabled="true"
                android:icon="@drawable/icon_stop_watch"
                android:title="@string/stopwatch_destination_label"/>
        </menu>
    </item>
    <item
        android:id="@+id/alarms"
        android:enabled="true"
        android:icon="@drawable/icon_alarms"
        android:title="@string/alarms_destination_label"/>
    <item
        android:id="@+id/schedule"
        android:enabled="true"
        android:icon="@drawable/icon_clock"
        android:title="@string/schedule_destination_label"/>
</menu>
```

Los rieles de navegación están contraídos de forma predeterminada. Cuando están contraídos, solo se mostrarán los elementos del menú que no estén en un submenú, hasta un límite de 7. No hay límite de elementos que se muestran cuando están expandidos.

Deberás establecer detectores para los elementos del menú en el código:

```kt
// Los detectores se definen en la superclase NavigationBarView
// para admitir tanto NavigationRail como BottomNavigation con los
// mismos detectores
NavigationBarView.OnNavigationItemSelectedListener { item ->
    when(item.itemId) {
        R.id.alarms -> {
            // Responder al clic del elemento de navegación de alarmas
            true
        }
        R.id.schedule -> {
            // Responder al clic del elemento de navegación de programación
            true
        }
        else -> false
    }
}
```

También hay un método para detectar si los elementos de navegación se han vuelto a seleccionar:

```kt
navigationRail.setOnNavigationItemReselectedListener { item ->
    when(item.itemId) {
        R.id.item1 -> {
            // Responder a la reselección del elemento de navegación 1
        }
        R.id.item2 -> {
            // Responder a la reselección del elemento de navegación 2
        }
    }
}
```

Lo que da como resultado:

![El contenedor del riel de navegación tiene 72 dp de ancho de forma predeterminada.](assets/navigationrail/navigation-rail-demo.png)

De forma predeterminada, el riel de navegación agrega relleno superior e inferior de acuerdo con las inserciones de la ventana superior e inferior, lo que ayuda a que el diseño del encabezado y los elementos del menú esquiven los espacios del sistema. Esto se controla mediante el atributo `android:fitsSystemWindowInsets`, que se establece en verdadero de forma predeterminada. Para eliminar este comportamiento, establece `android:fitsSystemWindowInsets` en `false` u opta por participar o no en las inserciones superior e inferior de forma independiente mediante el uso de `app:paddingTopSystemWindowInsets` y `app:paddingBottomSystemWindowInsets`.

</details>

<details>
<summary><h3>Ejemplo de riel de navegación</h3></summary>

El siguiente ejemplo muestra un riel de navegación con cuatro iconos.

<img src="assets/navigationrail/navigation-rail-example.png" alt="Ejemplo de riel de navegación con cuatro iconos" height="500"/>

*   Alarmas
*   Programación
*   Temporizadores
*   Cronómetro

En `navigation_rail_menu.xml` dentro de un directorio de recursos de `menu`:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      android:id="@+id/alarms"
      android:enabled="true"
      android:icon="@drawable/icon_alarm"
      android:title="@string/alarms_destination_label"/>
  <item
      android:id="@+id/schedule"
      android:enabled="true"
      android:icon="@drawable/icon_clock"
      android:title="@string/schedule_destination_label"/>
  <item
      android:id="@+id/timers"
      android:enabled="true"
      android:icon="@drawable/icon_sand_clock"
      android:title="@string/timers_destination_label"/>
  <item
      android:id="@+id/stopwatch"
      android:enabled="true"
      android:icon="@drawable/icon_stop_watch"
      android:title="@string/stopwatch_destination_label"/>
</menu>
```

En el código:

```kt
navigationRail.selectedItemId = R.id.schedule
```

</details>

<details>
<summary><h3>Hacer accesible el riel de navegación</h3></summary>

Debes establecer un `android:title` para cada uno de los elementos de tu `menu` para que los lectores de pantalla como TalkBack puedan anunciar correctamente lo que representa cada elemento de navegación:

```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
  <item
      ...
      android:title="@string/text_label"/>
  ...
</menu>
```

El atributo `labelVisibilityMode` se puede usar para ajustar el comportamiento de las etiquetas de texto para cada elemento de navegación. Hay cuatro modos de visibilidad:

*   `LABEL_VISIBILITY_AUTO` (predeterminado): la etiqueta se comporta como “etiquetada” cuando hay 3 elementos o menos, o “seleccionada” cuando hay 4 elementos o más
*   `LABEL_VISIBILITY_SELECTED`: la etiqueta solo se muestra en el elemento de navegación seleccionado
*   `LABEL_VISIBILITY_LABELED`: la etiqueta se muestra en todos los elementos de navegación
*   `LABEL_VISIBILITY_UNLABELED`: la etiqueta está oculta para todos los elementos de navegación

</details>

<details>
<summary><h3>Expandir el riel de navegación</h3></summary>

Puedes llamar a `navigationRailView.expand()` y `navigationRailView.collapse()` para expandir y contraer el riel de navegación. Cuando está contraído, solo se mostrarán los elementos del menú que no estén en un submenú, hasta un límite de 7. Cuando está expandido, se mostrarán todos los elementos del menú, incluidos los elementos del submenú.

Los rieles de navegación están contraídos de forma predeterminada, lo que se anima al riel de navegación expandido cuando se expande. Si el contenido junto al riel de navegación tiene en cuenta el tamaño del riel de navegación (es decir, mediante la configuración de restricciones en `ConstraintLayout` o pesos de diseño), el contenido también se animará para encogerse. Esta animación se encarga de una [transición ChangeBounds](https://developer.android.com/reference/android/transition/ChangeBounds); cualquier animación durante la expansión del riel de navegación debe desactivarse, ya que podría dar como resultado una animación extraña debido a la `transición`.

| Riel de navegación contraído | Riel de navegación expandido |
| :---: | :---: |
| <img src="assets/navigationrail/collapsed-nav-rail.png" alt="Riel de navegación contraído" height="560"/> | <img src="assets/navigationrail/expanded-nav-rail.png" alt="Riel de navegación expandido" height="560"/> |

</details>

<details>
<summary><h3>Agregar insignias</h3></summary>

Los iconos de riel pueden incluir insignias en la esquina superior derecha del icono. Las insignias transmiten información dinámica sobre el destino asociado, como recuentos o estado.

![Riel de navegación con insignias](assets/navigationrail/navigation-rail-badges.png)

Inicializa y muestra un `BadgeDrawable` asociado con `menuItemId`. Las llamadas posteriores a este método reutilizarán el `BadgeDrawable` existente:

```kt
var badge = navigationRail.getOrCreateBadge(menuItemId)
badge.isVisible = true
// Se mostrará una insignia de solo icono a menos que se establezca un número o texto:
badge.number = 99  // o badge.text = "Nuevo"
```

Como práctica recomendada, si necesitas ocultar temporalmente la insignia, por ejemplo, hasta que se reciba la siguiente notificación, cambia la visibilidad de `BadgeDrawable`:

```kt
val badgeDrawable = navigationRail.getBadge(menuItemId)
    if (badgeDrawable != null) {
        badgeDrawable.isVisible = false
        badgeDrawable.clearNumber()  // o badgeDrawable.clearText()
    }
```

Para eliminar cualquier `BadgeDrawable` que ya no sea necesario:

```kt
navigationRail.removeBadge(menuItemId)
```

Consulta la documentación de [`Insignia`](BadgeDrawable.md) para obtener más información.

</details>

<details>
<summary><h3>Agregar vista de encabezado</h3></summary>

El riel proporciona un contenedor conveniente para anclar una vista de encabezado, como un `FloatingActionButton` o un logotipo, a la parte superior del riel, usando el atributo `app:headerLayout`.

<img src="assets/navigationrail/navigation-rail-fab.png" alt="Riel de navegación con un FAB en el encabezado" height="550"/>

```xml
<com.google.android.material.navigationrail.NavigationRailView
    android:id="@+id/navigation_rail"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:headerLayout="@layout/navigation_rail_fab"
    app:menu="@menu/navigation_rail_menu" />
```

La vista de encabezado también se puede agregar o eliminar en tiempo de ejecución usando los siguientes métodos:

| Método | Descripción |
|---|---|
| `addHeaderView(@NonNull View view)` | Adjunta la vista de encabezado especificada a la parte superior de NavigationRailView. Si ya hay una vista de encabezado adjunta, se eliminará primero. |
| `removeHeaderView()` | Desvincula la vista de encabezado actual, si la hay, del riel de navegación. |

Los siguientes métodos se pueden usar para manipular la vista de encabezado en tiempo de ejecución.

| Método | Descripción |
|---|---|
| `@Nullable View getHeaderView()` | Devuelve una instancia de la vista de encabezado asociada con el riel de navegación, nulo si no hay ninguna adjunta actualmente. |

</details>

## Personalización del riel de navegación

### Tematización del riel de navegación

El riel de navegación admite la personalización de color y tipografía.

#### Ejemplo de tematización del riel de navegación

API y código fuente:

*   `NavigationRailView`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/navigationrail/NavigationRailView)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/navigationrail/NavigationRailView.java)

El siguiente ejemplo muestra un riel de navegación con tematización de Material.

![Ejemplo de tematización del riel de navegación](assets/navigationrail/navigation-rail-theming.png)

##### Implementación de la tematización del riel de navegación

Usa atributos de tema y un estilo en `res/values/styles.xml` que se aplican a todos los rieles de navegación y afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_theme_light_primary</item>
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

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema, que se aplican a todos los rieles de navegación pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="navigationRailStyle">@style/Widget.App.NavigationRailView</item>
</style>

<style name="Widget.App.NavigationRailView" parent="Widget.Material3.NavigationRailView">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.NavigationRailView</item>
</style>

<style name="ThemeOverlay.App.NavigationRailView" parent="">
    <item name="colorPrimary">@color/shrine_theme_light_primary</item>
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

O usa el estilo en el diseño, lo que afecta solo a esta barra de riel de navegación específica:

```xml
<com.google.android.material.navigationrail.NavigationRailView
    ...
    style="@style/Widget.App.NavigationRailView"
/>
```
