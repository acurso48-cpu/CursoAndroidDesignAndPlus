<!--docs:
title: "Selectores de fecha"
layout: detail
section: components
excerpt: "Los selectores de fecha permiten a los usuarios seleccionar una fecha o un rango de fechas."
iconId: picker
path: /catalog/date-pickers/
-->

# Selectores de fecha

Los [selectores de fecha](https://material.io/components/date-pickers) permiten a los usuarios seleccionar una fecha o un rango de fechas. Hay tres variantes de selectores de fecha.

<img src="assets/datepicker/datepickers-types.png" alt="Ejemplos de selector de fecha y selector de rango de fechas."/>

1.  Selector de fecha acoplado
2.  Selector de fecha modal
3.  Entrada de fecha modal

**Nota:** Las imágenes usan varios esquemas de colores dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/date-pickers/overview/)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/datepicker/package-summary)

## Anatomía

<details>

<summary><h4>Selector de fecha acoplado</h4></summary>

<img src="assets/datepicker/dockeddatepicker-anatomy1.png" alt="10 elementos de un selector de fecha acoplado." height="600"/>

1.  Campo de texto delineado
2.  Botón de menú: selección de mes
3.  Botón de menú: selección de año
4.  Botón de icono
5.  Texto de etiqueta de los días de la semana
6.  Fecha no seleccionada
7.  Fecha de hoy
8.  Fecha de fuera del mes
9.  Botones de texto
10. Contenedor

<img src="assets/datepicker/dockeddatepicker-anatomy2.png" alt="8 elementos de un selector de fecha acoplado." height="600"/>

1.  Campo de texto delineado
2.  Botón de menú: selección de mes (presionado)
3.  Botón de menú: selección de año (deshabilitado)
4.  Encabezado
5.  Menú
6.  Elemento de lista seleccionado
7.  Elemento de lista de menú no seleccionado
8.  Contenedor

</details>

<details>

<summary><h4>Selector de fecha modal</h4></summary>

<img src="assets/datepicker/modaldatepicker-anatomy1.png" alt="13 elementos de un selector de fecha modal." height="600"/>

1.  Titular
2.  Texto de apoyo
3.  Encabezado
4.  Contenedor
5.  Botón de icono
6.  Botones de icono
7.  Días de la semana
8.  Fecha de hoy
9.  Fecha no seleccionada
10. Botones de texto
11. Fecha seleccionada
12. Botón de menú
13. Divisor

<img src="assets/datepicker/modaldatepicker-anatomy2.png" alt="10 elementos de un selector de fecha modal." height="600"/>

1.  Titular
2.  Texto de apoyo
3.  Encabezado
4.  Contenedor
5.  Botón de icono
6.  Año no seleccionado
7.  Año seleccionado
8.  Botones de texto
9.  Divisor
10. Botón de menú

<img src="assets/datepicker/modaldatepicker-anatomy3.png" alt="15 elementos de un selector de fecha modal." height="650"/>

1.  Titular
2.  Texto de apoyo
3.  Botón de icono
4.  Encabezado
5.  Botón de texto
6.  Botón de icono
7.  Texto de etiqueta de los días de la semana
8.  Contenedor
9.  Fecha no seleccionada
10. Fecha de hoy
11. Indicador activo en el rango
12. Fecha en el rango
13. Subtítulo del mes
14. Fecha seleccionada
15. Divisor

</details>

<details>

<summary><h4>Entrada de fecha modal</h4></summary>

<img src="assets/datepicker/modaldateinput-anatomy.png" alt="8 elementos de una entrada de fecha modal."/>

1.  Titular
2.  Texto de apoyo
3.  Encabezado
4.  Contenedor
5.  Botón de icono
6.  Campo de texto delineado
7.  Botones de texto
8.  Divisor

</details>

Más detalles sobre los elementos de la anatomía en las [pautas del componente](https://m3.material.io/components/date-pickers/guidelines#8899f108-6a06-44df-b228-0cee1ccf67ca).

## Propiedades clave

### Contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurfaceContainerHigh`
**Forma** | `app:shapeAppearance` | N/A | `?attr/shapeAppearanceCornerExtraLarge`

### Título

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarHeaderTitle` | N/A | `@style/Widget.Material3.MaterialCalendar.HeaderTitle`
**Etiqueta de texto** | N/A | `Builder.setTitleText`<br/>`getHeaderText` | `Select Date`
**Color** | `android:textColor` | N/A | `?attr/colorOnSurfaceVariant`
**Tipografía** | `android:textAppearance` | N/A | `?attr/textAppearanceLabelMedium`

### Fecha seleccionada

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarHeaderSelection` | N/A | `@style/Widget.Material3.MaterialCalendar.HeaderSelection`
**Color** | `android:textColor` | N/A | `?attr/colorOnSurface`
**Tipografía** | `android:textAppearance` | N/A | `?attr/textAppearanceHeadlineLarge`

### Icono de cambio a entrada de teclado

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarHeaderToggleButton` | N/A | `@style/Widget.Material3.MaterialCalendar.HeaderToggleButton`
**Fondo** | `android:background` | N/A | `?attr/actionBarItemBackground`
**Color** | `android:tint` | N/A | `?attr/colorOnSurfaceVariant`

### Menú de selección de año

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarYearNavigationButton` | N/A | `@style/Widget.Material3.MaterialCalendar.YearNavigationButton`
**Color de texto** | `android:textColor` | N/A | `?attr/colorOnSurfaceVariant`
**Color de icono** | `app:iconTint` | N/A | `?attr/colorOnSurfaceVariant`

### Paginación de mes

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarMonthNavigationButton` | N/A | `@style/Widget.Material3.MaterialCalendar.MonthNavigationButton`
**Color de texto** | `android:textColor` | N/A | `?attr/colorOnSurfaceVariant`
**Color de icono** | `app:iconTint` | N/A | `?attr/colorOnSurfaceVariant`

### Fecha actual

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:dayTodayStyle` | N/A | `@style/Widget.Material3.MaterialCalendar.Day.Today`
**Color de texto** | `app:itemTextColor` | N/A | `?attr/colorPrimary`
**Color de trazo** | `app:itemStrokeColor` | N/A | `?attr/colorPrimary`
**Ancho de trazo** | `app:itemStrokeWidth` | N/A | `1dp`

### Fecha seleccionada

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:daySelectedStyle` | N/A | `@style/Widget.Material3.MaterialCalendar.Day.Selected`
**Color de fondo** | `app:itemFillColor` | N/A | `?attr/colorPrimary`
**Color de texto** | `app:itemTextColor` | N/A | `?attr/colorOnPrimary`
**Color de trazo** | `app:itemStrokeColor` | N/A | N/A
**Ancho de trazo** | `app:itemStrokeWidth` | N/A | `0dp`

### Rango seleccionado

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:rangeFillColor` | N/A | `?attr/colorSurfaceVariant`

### Botón Cancelar

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Estilo** | `app:materialCalendarHeaderCancelButton` | N/A | `@style/Widget.Material3.MaterialCalendar.HeaderCancelButton`
**Color de texto** | `android:textColor` | N/A | `?attr/colorOnSurface` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/res/color/m3_text_button_foreground_color_selector.xml))
**Color de icono** | `app:iconTint` | N/A | `?attr/colorOnSurfaceVariant`

### Estilos y superposiciones de temas

Elemento | Estilo
--- | ---
**Predeterminado**<br/>**superposición de tema** | `ThemeOverlay.Material3.MaterialCalendar`
**Estilo predeterminado** | `Widget.Material3.MaterialCalendar`
**Pantalla completa**<br/>**superposición de tema** | `ThemeOverlay.Material3.MaterialCalendar.Fullscreen`
**Estilo de pantalla completa** | `Widget.Material3.MaterialCalendar.Fullscreen`

Atributo de tema de estilo predeterminado (establecido dentro de la superposición de tema):
`?attr/materialCalendarStyle`

Atributo de tema predeterminado (establecido en el tema de la aplicación): `?attr/materialCalendarTheme`,
`?attr/materialCalendarFullscreenTheme` (pantalla completa)

Consulte la lista completa de
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/res/values/styles.xml),
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/res/values/attrs.xml),
y
[superposiciones de temas](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/res/values/themes.xml).

## Variantes de selectores de fecha

<details>

<summary><h3>Selector de fecha acoplado</h3></summary>

Los selectores de fecha acoplados permiten la selección de una fecha y un año específicos. El selector de fecha acoplado muestra un campo de entrada de fecha de forma predeterminada, y un calendario desplegable aparece cuando el usuario toca el campo de entrada. Se puede interactuar con cualquiera de las formas de entrada de fecha.

Los selectores de fecha acoplados son ideales para navegar por fechas tanto en el futuro o pasado cercano como en el futuro o pasado lejano, ya que proporcionan múltiples formas de seleccionar fechas.

#### Ejemplo de selector de fecha acoplado

El siguiente ejemplo muestra un selector de fecha con una fecha seleccionada.

<img src="assets/datepicker/dockeddatepicker.png" alt="Selector de fecha con 17 de septiembre seleccionado" height="700"/>

En XML:

```
<com.google.android.material.textfield.textinputlayout
android:id="@+id/booking_date_input_layout"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Select Booking Date"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent"
app:endIconMode="custom"
app:endIconDrawable="@drawable/ic_android_black_24dp"
app:endIconContentDescription="Open Date Picker"
style="?attr/textInputOutlinedStyle">

<com.google.android.material.textfield.TextInputEditText
android:id="@+id/booking_date_edit_text"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:focusable="false"
android:clickable="true"
android:inputType="none"
/>

</com.google.android.material.textfield.TextInputLayout>
```

En código:

```kt
val datePickerBuilder.setTitleText("Select Date")
if (bookingDateEditText.text.toString().isNotEmpty()) {
  try {
      val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
      dateFormat.timeZone = TimeZone.getTimeZone("UTC")
      val parsedDate = dateFormat.parse(bookingDateEditText.text.toString())
      parsedDate?.let {
          datePickerBuilder.setSelection(it.time)
        }
      } catch (e: Exception) {
          e.printStackTrace()
        }
}
  val datePicker = datePickerBuilder.build()
  datePicker.addOnPositiveButtonClickListener { selection ->
  val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
  dateFormat.timeZone = TimeZone.getTimeZone("UTC")
  val formattedDate = dateFormat.format(Date(selection))
  bookingDateEditText.setText(formattedDate)
}
  datePicker.addOnNegativeButtonClickListener {
  bookingDateEditText.clearFocus()
}
  datePicker.addOnDismissListener {
  bookingDateEditText.clearFocus()
}
  datePicker.show()
```

</details>

<details>

<summary><h3>Selector de fecha modal</h3></summary>

Los selectores de fecha modales navegan por las fechas de varias maneras:

*   Para navegar por los meses, deslice horizontalmente
*   Para navegar por los años, desplácese verticalmente
*   Para acceder al selector de año, toque el año

La selección de rango de fechas proporciona una fecha de inicio and una fecha de finalización.

Los casos de uso comunes incluyen:

*   Reservar un vuelo
*   Reservar un hotel

Los selectores de fecha modales navegan por los rangos de fechas de varias maneras:

*   Para seleccionar un rango de fechas, toque las fechas de inicio and finalización en el calendario
*   Para navegar por los meses, desplácese verticalmente

#### Ejemplo de selector de fecha modal

El siguiente ejemplo muestra un **selector de fecha modal** con un rango de fechas seleccionado.

  <img src="assets/datepicker/modaldatepicker.png" alt="Selector de rango de fechas con el 20 de septiembre al 24 de septiembre seleccionado" height="700"/>

En código:

```kt
val datePicker =
    MaterialDatePicker.Builder.datePicker()
        .setTitleText("Select date")
        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
        .build()

datePicker.show()
```

El siguiente ejemplo muestra un **selector de rango de fechas modal** con un rango de fechas seleccionado.

  <img src="assets/datepicker/datepickers-range-example.png" alt="Selector de rango de fechas con el 20 de septiembre al 24 de septiembre seleccionado" height="700"/>

En código:

```kt
val dateRangePicker =
    MaterialDatePicker.Builder.dateRangePicker()
        .setTitleText("Select dates")
        .setSelection(
          Pair(
            MaterialDatePicker.thisMonthInUtcMilliseconds(),
            MaterialDatePicker.todayInUtcMilliseconds()
          )
        )
        .build()

dateRange-picker.show()
```

</details>

<details>

<summary><h3>Entrada de fecha modal</h3></summary>

Las entradas de fecha modales permiten la entrada manual de fechas utilizando los números de un teclado. Los usuarios pueden introducir una fecha o un rango de fechas en un diálogo.

  <img src="assets/datepicker/modaldateinput.png" alt="Selector de rango de fechas con el 20 de septiembre al 24 de septiembre seleccionado" height="700"/>

En código:

```kt
val datePickerBuilder =
     MaterialDatePicker.Builder.datePicker()
      .setInputMode(MaterialDatePicker.INPUT_MODE_TEXT)
      datePickerBuilder.setTitleText("Select Date")
      datePickerBuilder.setSelection(MaterialDatePicker.todayInUtcMilliseconds())
val datePicker = datePickerBuilder.build() datePicker.show()
```

</details>

## Implementación de código

Antes de poder usar los selectores de fecha de Material, debe agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, vaya a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

Los selectores de fecha deben ser adecuados para el contexto en el que aparecen y pueden incrustarse en diálogos en dispositivos móviles.

### Ejemplos de selectores de fecha

**API y código fuente:**

*   `MaterialDatePicker`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/datepicker/MaterialDatePicker)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/MaterialDatePicker.java)
*   `CalendarConstraints`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/datepicker/CalendarConstraints)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/CalendarConstraints.java)

**Se puede crear una instancia de un selector de rango de fechas con `MaterialDatePicker.Builder.dateRangePicker()`:**

```kt
val dateRangePicker =
    MaterialDatePicker.Builder.dateRangePicker()
        .setTitleText("Select dates")
        .build()
```

**Para establecer una selección predeterminada:**

```kt
// Abre el selector de fecha con la fecha de hoy seleccionada.
MaterialDatePicker.Builder.datePicker()
      ...
    .setSelection(MaterialDatePicker.todayInUtcMilliseconds())

// Abre el selector de rango de fechas con el rango del primer día del
// mes hasta hoy seleccionado.
MaterialDatePicker.Builder.dateRangePicker()
      ...
    .setSelection(
          Pair(
            MaterialDatePicker.thisMonthInUtcMilliseconds(),
            MaterialDatePicker.todayInUtcMilliseconds()
          )
        )
```

**El selector se puede iniciar en modo de entrada de texto con:**

```kt
MaterialDatePicker.Builder.datePicker()
      ...
    .setInputMode(MaterialDatePicker.INPUT_MODE_TEXT)
```

**Se puede establecer un `DayViewDecorator` que permita personalizar las vistas del día del mes dentro del selector ([ejemplo de un `DayViewDecorator`](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/datepicker/CircleIndicatorDecorator.java)):**

```kt
MaterialDatePicker.Builder.datePicker()
      ...
    .setDayViewDecorator(CircleIndicatorDecorator())
```

**Para mostrar el selector al usuario:**

```kt
picker.show(supportFragmentManager, "tag")
```

**Escuche los clics de los botones, los eventos de cancelación y descarte con las siguientes llamadas:**

```kt
picker.addOnPositiveButtonClickListener {
    // Responder al clic del botón positivo.
}
picker.addOnNegativeButtonClickListener {
    // Responder al clic del botón negativo.
}
picker.addOnCancelListener {
    // Responder a los eventos de cancelación.
}
picker.addOnDismissListener {
    // Responder a los eventos de descarte.
}
```

**Finalmente, puede obtener la selección del usuario con `picker.selection`.**

### Adición de restricciones de calendario

**Para restringir el calendario desde el principio hasta el final de este año:**

```kt
val today = MaterialDatePicker.todayInUtcMilliseconds()
val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))

calendar.timeInMillis = today
calendar[Calendar.MONTH] = Calendar.JANUARY
val janThisYear = calendar.timeInMillis

calendar.timeInMillis = today
calendar[Calendar.MONTH] = Calendar.DECEMBER
val decThisYear = calendar.timeInMillis

// Crear restricciones.
val constraintsBuilder =
   CalendarConstraints.Builder()
       .setStart(janThisYear)
       .setEnd(decThisYear)
```

**Para abrir el selector en un mes predeterminado:**

```kt
...
calendar[Calendar.MONTH] = Calendar.FEBRUARY
val february = calendar.timeInMillis

val constraintsBuilder =
   CalendarConstraints.Builder()
       .setOpenAt(february)
```

**Para establecer el primer día de la semana:**

```kt
val constraintsBuilder =
   CalendarConstraints.Builder()
       .setFirstDayOfWeek(Calendar.MONDAY)
```

**Para establecer un validador:**

```kt
// Hace que solo las fechas a partir de hoy sean seleccionables.
val constraintsBuilder =
   CalendarConstraints.Builder()
       .setValidator(DateValidatorPointForward.now())

// Hace que solo las fechas a partir de febrero sean seleccionables.
val constraintsBuilder =
   CalendarConstraints.Builder()
       .setValidator(DateValidatorPointForward.from(february))
```

También puede usar `DateValidatorPointBackward` o personalizar creando una clase que implemente `DateValidator` ([ejemplo de un `DateValidatorWeekdays`](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/datepicker/DateValidatorWeekdays.java) en el catálogo de MDC).

**Para establecer la restricción en el generador del selector:**

```kt
MaterialDatePicker.Builder.datePicker()
      ...
    .setCalendarConstraints(constraintsBuilder.build())
```

### Hacer que los selectores de fecha sean accesibles

Los selectores de fecha de Material son totalmente accesibles y compatibles con los lectores de pantalla. El título de su selector de fecha se leerá cuando el usuario inicie el diálogo. Use un título descriptivo para la tarea:

```kt
val picker =
   MaterialDatePicker.Builder.datePicker()
      ...
       .setTitleText("Select appointment date")
   ...
```

## Personalización de los selectores de fecha

### Tematización de los selectores de fecha

Los selectores de fecha admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización del selector de fecha

API y código fuente:

*   `MaterialDatePicker`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/datepicker/MaterialDatePicker)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/MaterialDatePicker.java)
*   `CalendarConstraints`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/datepicker/CalendarConstraints)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/CalendarConstraints.java)

El siguiente ejemplo muestra un selector de fecha con tematización de Material.

<img src="assets/datepicker/datepickers-hero.png" alt="Selector de fecha móvil para septiembre de 2021 con '21' seleccionado." height="637"/>

Use atributos y estilos de tema en `res/values/styles.xml`, que se aplica a todos los selectores de fecha y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="shapeCornerFamily">cut</item>
</style>
```

Use un atributo de tema de estilo predeterminado, estilos y una superposición de tema que se aplican a todos los selectores de fecha pero no afectan a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="materialCalendarTheme">@style/ThemeOverlay.App.DatePicker</item>
</style>

<style name="ThemeOverlay.App.DatePicker" parent="@style/ThemeOverlay.Material3.MaterialCalendar">
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="shapeCornerFamily">cut</item>
    <!-- Personalizar el campo de texto del modo de entrada de texto. -->
    <item name="textInputStyle">@style/Widget.App.TextInputLayout</item>
</style>
```

Establezca el tema en el código, lo que afecta solo a este selector de fecha:

```kt
val picker =
   MaterialDatePicker.Builder.datePicker()
      ...
       .setTheme(R.style.ThemeOverlay_App_DatePicker)
```
