<!--docs:
title: "Diseño lineal de desbordamiento"
layout: detail
section: components
excerpt:  "El diseño lineal de desbordamiento se usa generalmente con FloatingToolbar y DockedToolbar."
iconId: overflow
path: /catalog/overflow-linear-layout/
-->

# Diseño lineal de desbordamiento

El `OverflowLinearLayout` se usa generalmente con la [barra de herramientas flotante](FloatingToolbar.md) y la [barra de herramientas acoplada](DockedToolbar.md). Permite que sus hijos se oculten/muestren automáticamente según el tamaño máximo de su padre. Los hijos ocultos se colocan en un menú de desbordamiento y se agrega un botón de desbordamiento como último hijo de su diseño principal.

Nota: si deseas ocultar/mostrar hijos independientemente de las decisiones de este diseño, deberás agregar/eliminar la(s) vista(s) deseada(s), en lugar de cambiar su visibilidad, ya que `OverflowLinearLayout` determinará el valor de visibilidad final de sus hijos.

## Propiedades clave

### Atributos de `OverflowLinearLayout`

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Icono del botón de desbordamiento** | `app:overflowButtonIcon` | `setOverflowButtonIcon`<br/>`setOverflowButtonIconResource`<br/>`getOverflowButtonIcon` | `@drawable/abc_ic_menu_overflow_material`

### Atributos de `OverflowLinearLayout_Layout`

Atributos para los hijos de `OverflowLinearLayout`:

| Elemento | Atributo | Métodos relacionados | Valor predeterminado |
| --- | --- | --- | --- |
| **Texto del elemento del menú de desbordamiento** | `app:layout_overflowText` | N/A | `null` |
| **Icono del elemento del menú de desbordamiento** | `app:layout_overflowIcon` | N/A | `null` |

### Estilos de `OverflowLinearLayout`

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo** | `Widget.Material3.OverflowLinearLayout` | `?attr/overflowLinearLayoutStyle`
**Desbordamiento de botón** | `overflowLinearLayoutOverflowButtonStyle` | `?attr/overflowLinearLayoutOverflowButtonStyle`
**Desbordamiento de menú emergente** | `overflowLinearLayoutPopupMenuStyle` | `?attr/overflowLinearLayoutPopupMenuStyle`

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/overflow/res/values/styles.xml)
y
[atributos de diseño lineal de desbordamiento](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/overflow/res/values/attrs.xml)

## Implementación de código

### Agregar diseño lineal de desbordamiento

Un uso común se ve así:

```xml
<ParentLayout
 ...>
  <com.google.android.material.overflow.OverflowLinearLayout>
    <ParentLayoutItem
      ...
      app:layout_overflowText="@string/item_1_text"
      app:layout_overflowIcon="@drawable/item_1_icon" />
    <ParentLayoutItem
      ...
      app:layout_overflowText="@string/item_2_text"
      app:layout_overflowIcon="@drawable/item_2_icon" />
    ...
  </com.google.android.material.overflow.OverflowLinearLayout>
</ParentLayout>
```

Cuando uses `OverflowLinearLayout`, debes establecer `app:layout_overflowText` en cada hijo, ya que eso se mostrará como el texto del elemento de menú que corresponde al hijo oculto. Opcionalmente, también puedes establecer `app:layout_overflowIcon`.

Consulta [barra de herramientas flotante](FloatingToolbar.md) y [barra de herramientas acoplada](DockedToolbar.md) para ver ejemplos de uso con esos componentes.

API y código fuente:

*   `OverflowLinearLayout`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/overflow/OverflowLinearLayout.java)

### Hacer accesible el diseño lineal de desbordamiento

Como se mencionó anteriormente, debes establecer `app:layout_overflowText` en cada hijo directo de `OverflowLinearLayout` que pueda desbordarse, para que los elementos del menú de desbordamiento tengan texto que puedan leer los lectores de pantalla.

## Personalización del diseño lineal de desbordamiento

### Tematización del diseño lineal de desbordamiento

El diseño lineal de desbordamiento admite la [tematización de Material](https://m3.material.io/foundations/customization), que puede personalizar el color, la forma y la tipografía.

#### Implementación de la tematización del diseño lineal de desbordamiento

Usa atributos de tema y un estilo en `res/values/styles.xml` que se aplican a todos los diseños lineales de desbordamiento y afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    ...
</style>
```

Usa un atributo de tema de estilo predeterminado, estilos y una superposición de tema, que se aplican a todos los diseños lineales de desbordamiento pero no afectan a otros componentes:

```xml

<style name="Theme.App" parent="Theme.Material3.*">
  ...
  <item name="overflowLinearLayoutStyle">@style/Widget.App.OverflowLinearLayout</item>
  <item name="floatingToolbarStyle">@style/Widget.App.FloatingToolbar</item>
</style>

<style name="Widget.App.OverflowLinearLayout" parent="Widget.Material3.OverflowLinearLayout">
  <item name="materialThemeOverlay">@style/ThemeOverlay.App.OverflowLinearLayout</item>
</style>

<style name="ThemeOverlay.App.OverflowLinearLayout" parent="ThemeOverlay.Material3.OverflowLinearLayout">
  <item name="colorPrimary">@color/shrine_theme_light_primary</item>
  <item name="overflowLinearLayoutOverflowButtonStyle">@style/Widget.App.OverflowButton</item>
  <item name="overflowLinearLayoutPopupMenuStyle">@style/Widget.App.PopupMenuStyle</item>
  ...
</style>

<style name="Widget.App.OverflowButton" parent="Widget.Material3.Button.IconButton">
  ...
</style>

<style name="Widget.App.PopupMenuStyle" parent="Widget.Material3.PopupMenuStyle">
...
</style>
```

O usa el estilo en el diseño, lo que afecta solo a este diseño lineal de desbordamiento específico:

```xml

<com.google.android.material.floatingtoolbar.FloatingToolbarLayout
  ...
  style="@style.Widget.App.FloatingToolbarLayout">
  <com.google.android.material.overflow.OverflowLinearLayout
    ...
    style="@style/Widget.App.OverflowLinearLayout"/>
</com.google.android.material.floatingtoolbar.FloatingToolbarLayout>
```
