<!--docs:
title: "Selectores de tiempo"
layout: detail
section: components
excerpt: "Los selectores de tiempo son modales que permiten al usuario elegir una hora."
iconId: picker
path: /catalog/time-pickers/
-->

# Selectores de tiempo

Los [selectores de tiempo](https://m3.material.io/components/time-pickers/overview/) ayudan a los usuarios a seleccionar y establecer una hora específica. Hay dos variantes de selectores de tiempo.

<img src="assets/timepicker/timepicker-types.png" alt="Selector de tiempo en una interfaz de usuario móvil que tiene una pantalla numérica y una esfera de reloj de la hora." height="500">

1.  Dial del selector de tiempo
2.  Entrada del selector de tiempo

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/time-pickers/overview/)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/timepicker/package-summary)

## Anatomía

<details>
  <summary><h4>Dial del selector de tiempo</h4></summary>

![Anatomía del dial del selector de tiempo](assets/timepicker/timepickerdial-anatomy.png)

1.  Titular
2.  Separador del selector de tiempo
3.  Contenedor
4.  Contenedor del selector de período
5.  Texto de la etiqueta del selector de período
6.  Centro del selector de la esfera del reloj
7.  Pista del selector de la esfera del reloj
8.  Botón de texto
9.  Botón de icono
10. Contenedor del selector de tiempo
11. Texto de la etiqueta de la esfera del reloj
12. Contenedor de la esfera del reloj
13. Texto de la etiqueta del selector de tiempo
14. Contenedor del selector de tiempo

</details>

<details>
  <summary><h4>Entrada del selector de tiempo</h4></summary>

![Anatomía de la entrada del selector de tiempo](assets/timepicker/timepickerinput-anatomy.png)

1.  Titular
2.  Separador del selector de tiempo
3.  Contenedor
4.  Contenedor del selector de período
5.  Texto de la etiqueta del selector de período
6.  Centro del selector de la esfera del reloj
7.  Pista del selector de la esfera del reloj
8.  Botón de texto
9.  Botón de icono
10. Contenedor del selector de tiempo
11. Texto de la etiqueta de la esfera del reloj
12. Contenedor de la esfera del reloj
13. Texto de la etiqueta del selector de tiempo
14. Contenedor del selector de tiempo

</details>

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/time-pickers/guidelines#d08ce88e-aa29-4b9e-a655-3f693ccf72ee).

## Propiedades clave

### Atributos

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Hora** | `N/A` | `Builder.setHour`<br>`MaterialTimePicker.getHour` | `0`
**Minuto** | `N/A` | `Builder.setMinute`<br>`MaterialTimePicker.getMinute` | `0`
**Título** | `N/A` | `Builder.setTitleText` | `Select Time`
**Icono de teclado** | `app:keyboardIcon` | `N/A` | `@drawable/ic_keyboard_black_24dp`
**Icono de reloj** | `app:clockIcon` | `N/A` | `@drawable/ic_clock_black_24dp`
**Color de fondo de la esfera del reloj** | `app:clockFaceBackgroundColor` | `N/A` | `?attr/colorSurfaceContainerHighest`
**Color de la manecilla del reloj** | `app:clockNumberTextColor` | `N/A` | `?attr/colorPrimary`
**Color del texto del número del reloj** | `app:clockNumberTextColor` | `N/A` | `?attr/colorOnBackground`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.MaterialTimePicker` | `?attr/materialTimePickerStyle`

Los atributos de estilo se asignan a los siguientes componentes:

Elemento | Componente afectado | Predeterminado
--- | --- | ---
**chipStyle** | Entradas de número en el modo de reloj | `@style/Widget.Material3.MaterialTimePicker.Display`
**materialButtonOutlinedStyle** | Conmutador AM/PM | `@style/Widget.Material3.MaterialTimePicker.Button`
**imageButtonStyle** | Botón de teclado/entrada de texto | `@style/Widget.Material3.MaterialTimePicker.ImageButton`
**materialClockStyle** | Esfera del reloj del selector de tiempo | `@style/Widget.Material3.MaterialTimePicker.Clock`

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/timepicker/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/timepicker/res/values/attrs.xml).

## Variantes de selectores de tiempo

### Dial del selector de tiempo

<img src="assets/timepicker/timepicker-type-dial.png" alt="Ejemplo de dial del selector de tiempo" width="700">

Los selectores de tiempo de dial permiten a las personas establecer una hora moviendo una manecilla alrededor del dial. Se utilizan a menudo para configurar una alarma o un evento de calendario.

### Entrada del selector de tiempo

<img src="assets/timepicker/timepicker-type-input.png" alt="Ejemplo de entrada del selector de tiempo" height="500">

Los selectores de tiempo de entrada permiten a las personas establecer una hora usando un teclado. Se puede acceder a esta opción desde cualquier interfaz de selector de tiempo móvil a través del icono del teclado.

## Implementación de código

Antes de que puedas usar los selectores de tiempo de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregar selector de tiempo

<img src="assets/timepicker/timepicker-formats.png" alt="Imagen de un selector de tiempo en formato de 12H y otro en formato de 24H." height="500">

API y código fuente:

*   `MaterialTimePicker`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/timepicker/MaterialTimePicker)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/timepicker/MaterialTimePicker.java)

Se puede crear una instancia de un selector de tiempo con `MaterialTimePicker.Builder`

```kt
val picker =
    MaterialTimePicker.Builder()
        .setTimeFormat(TimeFormat.CLOCK_12H)
        .setHour(12)
        .setMinute(10)
        .setTitleText("Select Appointment time")
        .build()
```

`minute` es un valor *[0, 59]* y `hour` es un valor *[0, 23]* independientemente del formato de hora que elijas.

Puedes usar `TimeFormat.CLOCK_12H` (1 anillo) o `TimeFormat.CLOCK_24H` (2 anillos), según la ubicación del dispositivo:

```kt
val isSystem24Hour = is24HourFormat(this)
val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H
```

El modo de entrada del selector de tiempo tiene como valor predeterminado el modo de reloj (`INPUT_MODE_CLOCK`) con `TimeFormat.CLOCK_12H` y el modo de entrada de texto (`INPUT_MODE_KEYBOARD`) con `TimeFormat.CLOCK_24H`.

El selector de tiempo se puede iniciar en modo de reloj con:

```kt
MaterialTimePicker.Builder().setInputMode(INPUT_MODE_CLOCK)
```

El selector de tiempo se puede iniciar en modo de entrada de texto con:

```kt
MaterialTimePicker.Builder().setInputMode(INPUT_MODE_KEYBOARD)
```

Para mostrar el selector de tiempo al usuario:

```kt
 picker.show(fragmentManager, "tag");
```

Escucha los eventos de clic de botón positivo, clic de botón negativo, cancelación y descarte con las siguientes llamadas:

```kt
picker.addOnPositiveButtonClickListener {
    // código de devolución de llamada
}
picker.addOnNegativeButtonClickListener {
   // código de devolución de llamada
}
picker.addOnCancelListener {
    // código de devolución de llamada
}
picker.addOnDismissListener {
    // código de devolución de llamada
}
```

Puedes obtener la selección del usuario con `picker.minute` y `picker.hour`.

### Hacer que los selectores de tiempo sean accesibles

Los selectores de tiempo de Material son totalmente accesibles y compatibles con los lectores de pantalla. El título de tu selector de tiempo se leerá cuando el usuario inicie el diálogo. Usa un título descriptivo para la tarea:

```kt
val picker =
   MaterialTimePicker.Builder()
       .setTitleText("Select Appointment time")
   ...
```

## Personalización de los selectores de tiempo

### Tematización de los selectores de tiempo

Los selectores de tiempo admiten la personalización de color y tipografía.

#### Ejemplo de tematización del selector de tiempo

El siguiente ejemplo muestra un selector de tiempo con tematización de Material.

<img src="assets/timepicker/timepicker-theming.png" alt="Pantalla interactiva rosa del selector de tiempo, fondo gris e iconos y texto marrones." height="500">

Usa atributos y estilos de tema en `res/values/styles.xml`, que da estilo a todos los selectores de tiempo y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="colorOnSurface">@color/shrine_pink_100</item>
    <item name="chipStyle">@style/Widget.App.Chip</item>
</style>
```

```xml
<style name="Widget.App.Chip" parent="Widget.Material3.MaterialTimePicker.Display">
  <item name="android:textColor">@color/shrine_diplay_text_color</item>
</style>
```

En res/color/shrine_diplay_text_color.xml:

```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">

  <item android:color="?attr/colorOnSecondary" android:state_enabled="true" android:state_selected="true"/>
  <item android:color="?attr/colorOnSecondary" android:state_enabled="true" android:state_checked="true"/>
  <item android:alpha="0.87" android:color="?attr/colorOnSurface" android:state_enabled="true"/>
  <item android:alpha="0.33" android:color="?attr/colorOnSurface"/>

</selector>
```

```xml
<style name="Widget.App.TimePicker.Clock" parent="Widget.Material3.MaterialTimePicker.Clock">
    <item name="clockFaceBackgroundColor">@color/...</item>
    <item name="clockHandColor">@color/...</item>
    <item name="clockNumberTextColor">@color/...</item>
</style>
```

También puedes establecer un tema específico para el selector de tiempo

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="materialTimePickerTheme">@style/ThemeOverlay.App.TimePicker</item>
</style>

```
