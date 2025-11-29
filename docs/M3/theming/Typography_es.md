# Temas de Tipografía

Los temas de tipografía de Material Design se pueden usar para crear estilos tipográficos que reflejen tu marca o estilo, definiendo un conjunto de escalas de tipo que se usarán en toda tu aplicación. Puedes usar las escalas de tipo para personalizar la apariencia del texto en los componentes de Material.

## Documentación de Diseño y API

-   [Guías de Material Design: Tipografía](https://m3.material.io/styles/typography/overview/)

## Uso

### Escala base

Nombre del atributo | Estilo por defecto
--- | ---
`textAppearanceDisplayLarge` | Regular 57sp
`textAppearanceDisplayMedium` | Regular 45sp
`textAppearanceDisplaySmall` | Regular 36sp
`textAppearanceHeadlineLarge` | Regular 32sp
`textAppearanceHeadlineMedium` | Regular 28sp
`textAppearanceHeadlineSmall` | Regular 24sp
`textAppearanceTitleLarge` | Regular 22sp
`textAppearanceTitleMedium` | Medium 16sp
`textAppearanceTitleSmall` | Medium 14sp
`textAppearanceBodyLarge` | Regular 16sp
`textAppearanceBodyMedium` | Regular 14sp
`textAppearanceBodySmall` | Regular 12sp
`textAppearanceLabelLarge` | Medium 14sp
`textAppearanceLabelMedium` | Medium 12sp
`textAppearanceLabelSmall` | Medium 11sp

### Escala enfatizada

Los estilos enfatizados se usan para crear jerarquía y se recomiendan para mostrar selección, acciones, titulares u otros tratamientos editoriales.

Nombre del atributo | Estilo por defecto
--- | ---
`textAppearanceDisplayLargeEmphasized` | Medium 57sp
`textAppearanceDisplayMediumEmphasized` | Medium 45sp
...
`textAppearanceLabelSmallEmphasized` | Bold 11sp

## Valores de estilo

Los valores de estilo son una combinación de lo siguiente:

*   Nombre y peso de la fuente
*   Tamaño de la fuente
*   Espaciado entre letras
*   Transformación del texto (p. ej., todo en mayúsculas)

## Customization

Los componentes incluidos en la Librería de Material Design hacen referencia a estos atributos de texto tematizables, lo que te permite cambiar fácilmente la apariencia del texto en toda tu aplicación. Si muestras texto en `TextView`s o creas componentes personalizados, considera hacer referencia a uno de estos atributos de texto donde tenga sentido.

Puedes cambiar la apariencia de cualquier estilo de texto creando un nuevo estilo y estableciéndolo en tu tema:

```xml
<style name="TextAppearance.MyApp.DisplaySmall" parent="TextAppearance.Material3.DisplaySmall">
  ...
  <item name="fontFamily">@font/custom_font</item>
  <item name="android:textStyle">normal</item>
  <item name="android:textAllCaps">false</item>
  <item name="android:textSize">64sp</item>
  <item name="android:letterSpacing">0</item>
  ...
</style>
```

```xml
<style name="Theme.MyApp" parent="Theme.Material3.DayNight.NoActionBar">
  ...
  <item name="textAppearanceDisplaySmall">@style/TextAppearance.MyApp.DisplaySmall</item>
  ...
</style>
```

## Fuentes descargables

Android O y la Android Support Library 26 añaden soporte para [Fuentes Descargables](https://developer.android.com/guide/topics/ui/look-and-feel/downloadable-fonts.html). Esto te permite usar fácilmente toda la colección de Google Fonts Open Source sin empaquetar una fuente con tu apk. Encuentra más información en https://developers.google.com/fonts/docs/android.

**Nota:** Si quieres usar una Fuente Descargable antes de Android O, asegúrate de que estás usando `AppCompatTextView` o que estás cargando la fuente tú mismo con `ResourcesCompat.getFont()`.
