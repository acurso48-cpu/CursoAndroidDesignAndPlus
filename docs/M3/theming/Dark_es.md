# Tema Oscuro

El [sistema de tema oscuro de Material][dark-theme-mdc-spec] se puede usar para crear un tema oscuro hermoso y funcional para tu aplicación. Un tema oscuro generalmente consiste en colores de fondo oscuros y colores de primer plano claros para elementos como texto e iconografía.

Los beneficios de un tema oscuro incluyen: mejor conservación de la batería en dispositivos con pantallas OLED; reducción de la fatiga visual; y mejor visibilidad en entornos con poca luz.

A partir de [Android Q][dark-theme-dac-docs], los usuarios ahora pueden cambiar su dispositivo a un tema oscuro a través de una nueva configuración del sistema, que se aplica tanto a la interfaz de usuario del sistema Android como a las aplicaciones que se ejecutan en el dispositivo.

## Documentación de Diseño y API

-   [Guías de Material Design: Tema Oscuro][dark-theme-mdc-spec]
-   [Documentación del Tema Oscuro de Android Q][dark-theme-dac-docs]
-   [Documentación de AppCompat DayNight][daynight-appcompat-docs]

## Configuración

Antes de poder usar la funcionalidad del tema oscuro de Material, necesitas añadir una dependencia a la librería de Material Components para Android. Para más información, ve a la página de [primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

Para soportar un tema oscuro para Android Q y superior, asegúrate de que dependes de la última versión de la [librería Material de Android][maven-repo-mdc], y actualiza el tema de tu aplicación para que herede de `Theme.Material3.DayNight` (o uno de sus descendientes). Por ejemplo:

**res/values/themes.xml**

```xml
<style name="Theme.MyApp" parent="Theme.Material3.DayNight">
    <!-- ... -->
</style>
```

Alternativamente, si quieres definir temas `Light` y `Dark` separados para tu aplicación, puedes heredar de `Theme.Material3.Light` en el directorio `res/values`, y de `Theme.Material3.Dark` en el directorio `res/values-night`:

**res/values/themes.xml**

```xml
<style name="Theme.MyApp" parent="Theme.Material3.Light">
    <!-- ... -->
</style>
```

**res/values-night/themes.xml**

```xml
<style name="Theme.MyApp" parent="Theme.Material3.Dark">
    <!-- ... -->
</style>
```

El tema `Theme.Material3.Dark` es un tema oscuro estático, mientras que `Theme.Material3.DayNight` es un tema más dinámico que facilitará el cambio entre los temas `Light` y `Dark` de tu aplicación. Si usas un tema `DayNight`, puedes definir un tema de aplicación que haga referencia a los recursos de color, los cuales pueden ser sobrescritos en el directorio `values-night` si es necesario.

## Catálogo

Para ver cómo se adaptan los componentes de Material en un tema oscuro, construye y ejecuta la [aplicación de Catálogo](../catalog-app.md) y habilita un tema oscuro de una de las siguientes maneras:

*   Cualquier nivel de API: Icono del menú de engranaje de configuración en las pantallas de inicio y demostración del Catálogo
*   Android Q: `Ajustes > Pantalla > Tema Oscuro` (o el tile de Tema Oscuro en la Bandeja de Notificaciones)
*   Android P: `Ajustes > Sistema > Opciones de desarrollador > Modo nocturno`

## Paleta de colores

En el núcleo de cualquier tema oscuro hay una paleta de colores que usa colores de fondo oscuros y colores de primer plano claros. Los temas `Dark` de Material hacen uso del [Sistema de Color de Material](Color.md), para proporcionar valores de tema oscuro por defecto para los colores de la paleta neutra como `android:colorBackground` y `colorSurface`.

Los colores de fondo y superficie del tema `Dark` base de Material son de color gris oscuro en lugar de negro, lo que aumenta la visibilidad de las sombras y también reduce la fatiga visual para el texto claro.

Los temas `Dark` de Material también proporcionan valores por defecto ajustados para la paleta de marca base, incluyendo `colorPrimary`, `colorSecondary`, `colorTertiary`, y más. Consulta la [especificación del Tema Oscuro de Material][dark-theme-mdc-spec-ui-application] para obtener orientación sobre cómo puedes ajustar los colores de tu marca para un tema oscuro.

## Superposiciones de elevación

**Nota:** La superficie con superposiciones de elevación ha sido reemplazada en los componentes de Material por el [sistema de color de superficie tonal](./Color.md#using-surface-colors).

Además de los ajustes de la paleta de colores mencionados anteriormente, comunicar la jerarquía de una interfaz de usuario a través de la elevación requiere algunas consideraciones específicas del tema oscuro.

Las sombras son menos efectivas en una aplicación que usa un tema oscuro, porque tendrán menos contraste con los colores de fondo oscuros y parecerán menos visibles. Para compensar esto, las superficies de Material se vuelven más claras y coloridas a elevaciones más altas, cuando están más cerca de la fuente de luz implícita.

Esto se logra a través de superposiciones de elevación, que son superposiciones semitransparentes (`colorPrimary`) que se colocan conceptualmente encima del color de la superficie. El porcentaje alfa semitransparente se calcula usando una ecuación basada en la elevación, lo que resulta en porcentajes alfa más altos a elevaciones más altas, y por lo tanto, superficies más claras.

**Nota:** evitamos el sobredibujado con las superposiciones de elevación calculando una mezcla compuesta del color de la superficie con el color de la superposición y usando eso como fondo de la superficie, en lugar de dibujar otra capa en el lienzo.

### Componentes afectados

La siguiente es una lista de componentes de Material que soportan superposiciones de elevación, porque usan `colorSurface` para su fondo y pueden ser elevados:

*   [Barra de aplicaciones superior](../components/TopAppBar.md)
*   [Barra de aplicaciones inferior](../components/BottomAppBar.md)
*   [Navegación inferior](../components/BottomNavigation.md)
*   [Riel de navegación](../components/NavigationRail.md)
*   [Panel de navegación lateral](../components/NavigationDrawer.md)
*   [Hoja inferior](../components/BottomSheet.md)
*   [Diálogo](../components/Dialog.md)
*   [Selector de fecha](../components/DatePicker.md)
*   [Selector de hora](../components/TimePicker.md)
*   [Menú](../components/Menu.md)
*   [Pestañas](../components/Tabs.md)
*   [Tarjeta](../components/Card.md)
*   [FAB](../components/FloatingActionButton.md)
*   [Botón](../components/Button.md)
*   [Chip](../components/Chip.md)
*   [Interruptor](../components/Switch.md)

### Atributos de tema

Para facilitar cierta orquestación en torno a las superposiciones de elevación, tenemos los siguientes atributos de tema:

Nombre del atributo              |Descripción                                                                          |Default Value
----------------------------|-------------------------------------------------------------------------------------|-------------
`elevationOverlayEnabled`   |Si la funcionalidad de superposición de elevación está habilitada.                              |`true` en temas `Light` y `Dark`
`elevationOverlayColor`     |El color usado para las superposiciones de elevación, aplicado con un alfa basado en la elevación.   |`colorPrimary`

**Nota:** Si heredas de un tema `Theme.Material3.*`, lo más probable es que no tengas que establecer estos atributos tú mismo porque los temas de Material ya configuran los valores por defecto anteriores.

### Vistas personalizadas y componentes que no son de Material

Si deseas aplicar superposiciones de elevación a tus vistas personalizadas o a cualquier vista que no sea de Material que sea una superficie elevada, puedes usar las APIs `MaterialShapeDrawable` o `ElevationOverlayProvider`.

#### MaterialShapeDrawable

La clave para soportar superposiciones de elevación en una vista personalizada es crear un `MaterialShapeDrawable` con el soporte de superposición habilitado a través de `MaterialShapeDrawable#createWithElevationOverlay`, y establecerlo como fondo de tu vista.

A continuación, sobrescribe el método `View#setElevation` y reenvía la elevación pasada al método `setElevation` de tu fondo `MaterialShapeDrawable`.

`MaterialShapeDrawable` es el enfoque preferido para las vistas personalizadas porque mantendrá un registro del valor de elevación por ti, y lo tendrá en cuenta en la superposición cada vez que cambie la elevación. No tienes que preocuparte por componer incorrectamente las superposiciones varias veces.

#### ElevationOverlayProvider

Si tienes un caso en el que el valor de la elevación es más estático y te gustaría obtener el color de superposición de elevación correspondiente (quizás para colorear una vista existente), entonces puedes usar `ElevationOverlayProvider`.

Si las superposiciones de elevación están habilitadas a nivel de tema, el método `ElevationOverlayProvider#compositeOverlayWithThemeSurfaceColorIfNeeded` devolverá `colorSurface` con el color de la superposición mezclado con un nivel de alfa basado en la elevación pasada. De lo contrario, simplemente devolverá `colorSurface`, para que puedas usar el resultado de este método sin necesidad de ninguna lógica de orquestación adicional.

Si necesitas mezclar las superposiciones con un color arbitrario o un color de superficie ajustado, o necesitas acceder a valores de nivel inferior como los porcentajes de alfa de la superposición, echa un vistazo a los otros métodos de `ElevationOverlayProvider` incluyendo `compositeOverlayIfNeeded`, `compositeOverlay` y `calculateOverlayAlpha`.

#### Elevación Absoluta

Al calcular el porcentaje de alfa de la superposición de elevación, los componentes de Material tienen en cuenta la elevación absoluta de su vista padre. Esto se debe a que la distancia desde la fuente de luz es el factor determinante detrás de las superposiciones de elevación.

Si necesitas tener en cuenta la elevación absoluta en una vista personalizada que soporta superposiciones, puedes usar los métodos `MaterialShapeUtils#setParentAbsoluteElevation` cuando uses un fondo `MaterialShapeDrawable`. Por ejemplo:

```java
@Override
protected void onAttachedToWindow() {
  super.onAttachedToWindow();

  MaterialShapeUtils.setParentAbsoluteElevation(this);
}
```

Alternativamente, podrías usar los métodos compuestos de `ElevationOverlayProvider` que toman un parámetro `View` o el método `getParentAbsoluteElevation`.

**Nota:** Esto significa que debes considerar las relaciones de contraste de accesibilidad para el texto y la iconografía, al anidar profundamente componentes de Material elevados y vistas que soportan superposiciones de elevación.

[dark-theme-mdc-spec]: https://material.io/design/color/dark-theme.html
[dark-theme-mdc-spec-ui-application]: https://material.io/design/color/dark-theme.html#ui-application
[dark-theme-mdc-spec-custom-application]: https://material.io/design/color/dark-theme.html#custom-application
[dark-theme-dac-docs]: https://developer.android.com/preview/features/darktheme
[daynight-appcompat-docs]: https://medium.com/androiddevelopers/appcompat-v23-2-daynight-d10f90c83e94
[maven-repo-mdc]: https://maven.google.com/web/index.html#com.google.android.material:material
