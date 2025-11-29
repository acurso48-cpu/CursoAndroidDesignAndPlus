<!--docs:
title: "Hojas laterales"
layout: detail
section: components
excerpt: "Las hojas laterales se deslizan desde el costado de la pantalla para revelar más contenido."
iconId: side_sheet
path: /catalog/side-sheet-behavior/
-->

# Hojas laterales

Las [Hojas laterales](https://m3.material.io/components/side-sheets/overview) son superficies que contienen contenido complementario y que están ancladas al costado de la pantalla. Hay dos variantes de hojas laterales.

<img src="assets/sidesheet/sidesheet-hero.png" alt="Side sheet hero image" width="650"/>

1.  Hoja lateral estándar
2.  Hoja lateral modal

**Nota:** Las imágenes usan varios esquemas de colores dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/side-sheets/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/sidesheet/package-summary)

## Anatomía

#### Hoja lateral estándar

<img src="assets/sidesheet/standard-sidesheet-anatomy.png" alt="anatomía de la hoja lateral estándar" height="500"/>

1.  Divisor (opcional)
2.  Encabezado
3.  Contenedor
4.  Control para cerrar

#### Hoja lateral modal

<img src="assets/sidesheet/modal-sidesheet-anatomy.png" alt="anatomía de la hoja lateral modal" height="500"/>

1.  Botón de ícono de retroceso (opcional)
2.  Encabezado
3.  Contenedor
4.  Botón de ícono de cerrar
5.  Divisor (opcional)
6.  Acción (opcional)
7.  Scrim

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/side-sheets/guidelines#4d992de0-362a-41b3-9537-9da4dec148af).

## Propiedades clave

### Atributos de la hoja

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurface`<br/>`?attr/colorSurfaceContainerLow` (modal)
**ID de vista hermana coplanar** | `app:coplanarSiblingViewId` | `setCoplanarSiblingViewId`<br/>`setCoplanarSiblingView` | N/A
**Forma** | `app:shapeAppearance` | N/A | `?attr/shapeAppearanceCornerLarge`
**Borde de la hoja** | `android:layout_gravity` | `setSheetEdge` (solo modal) | end
**Elevación** | `android:elevation` | N/A | 0dp
**Ancho máximo** | `android:maxWidth` | `setMaxWidth`<br/>`getMaxWidth` | N/A
**Alto máximo** | `android:maxHeight` | `setMaxHeight`<br/>`getMaxHeight` | N/A

### Atributos de comportamiento

Más información sobre estos atributos y cómo usarlos en la sección [configuración de comportamiento](#setting-behavior).

Comportamiento | Método(s) relacionado(s) | Valor predeterminado
--- | --- | ---
`app:behavior_draggable` | `setDraggable`<br/>`isDraggable` | `true`

### Borde de la hoja

Puedes configurar la hoja para que se origine desde el lado izquierdo o derecho de la pantalla. También puedes cambiar automáticamente el borde de la hoja según la dirección del diseño, configurando el borde de la hoja en `start` o `end`.

#### Hojas estándar y coplanares

Para configurar el borde de una hoja estándar o coplanar, establece la propiedad `gravity` del `CoordinatorLayout.LayoutParams` de la `View` de la hoja lateral, luego solicita un pase de diseño en la `View` de la hoja lateral.

```kt
val layoutParams = sideSheetView.layoutParams
if (layoutParams is CoordinatorLayout.LayoutParams) {
  layoutParams.gravity = sheetGravity
  sideSheetView.requestLayout()
}
```

Puedes también configurar el borde de la hoja con XML, estableciendo `android:layout_gravity` a la gravedad deseada:

```xml
<FrameLayout
  android:id="@+id/side_sheet_container"
  style="@style/Widget.Material3.SideSheet"
  android:layout_width="256dp"
  android:layout_height="match_parent"
  android:layout_gravity="start"
  app:layout_behavior="@string/side_sheet_behavior">
  <include layout="@layout/side_sheet_layout" />
</FrameLayout>
```

#### Hojas modales

Para configurar el borde de una hoja modal, pasa una constante `Gravity` al método dedicado `setSheetEdge` de `SideSheetDialog`. Por ejemplo, establece el borde de la hoja en `start` así:

```kt
sideSheetDialog.setSheetEdge(Gravity.START)
```

Nota: No se admiten cambios en tiempo de ejecución en los bordes de las hojas para las hojas modales y es posible que no funcionen como se esperaba. Si deseas cambiar el borde de la hoja en tiempo de ejecución, debes volver a crear la hoja y luego llamar a `setSheetEdge` con la nueva gravedad.

### Estilos

Elemento | Valor | Atributo de tema
--- | --- | ---
Estilo de hoja lateral estándar | `@style/Widget.Material3.SideSheet` | N/A
Estilo de hoja lateral modal | `@style/Widget.Material3.SideSheet.Modal` | `?attr/sideSheetModalStyle`

Nota: No hay un atributo de tema de estilo predeterminado para las hojas laterales estándar, porque los `SideSheetBehavior` no tienen una `View` asociada designada. Las hojas laterales modales usan `?attr/sideSheetModalStyle` como estilo predeterminado, pero no es necesario establecer `?attr/sideSheetModalStyle` en el diseño de tu hoja lateral modal porque el estilo se aplica automáticamente al `SideSheetDialog` principal.

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/res/values/styles.xml),
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/res/values/attrs.xml),
y
[temas y superposiciones de temas](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/res/values/themes.xml).

## Variantes de hojas laterales

<details>
<summary><h3>Hoja lateral estándar</h3></summary>

Las hojas laterales estándar coexisten con la región principal de la interfaz de usuario de la pantalla y permiten ver e interactuar simultáneamente con ambas regiones. Se usan comúnmente para mantener una función o contenido secundario visible en la pantalla cuando el contenido en la región principal de la interfaz de usuario se desplaza o se mueve con frecuencia.

`SideSheetBehavior` se aplica a un hijo de
[CoordinatorLayout](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout)
para hacer que ese hijo sea una hoja lateral estándar, que es una vista que aparece desde el costado de la pantalla, elevada sobre el contenido principal. Se puede arrastrar verticalmente para exponer más o menos contenido.

API y código fuente:

*   `SideSheetBehavior`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/sidesheet/SideSheetBehavior)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/SideSheetBehavior.java)

<h4 id="standard-side-sheet-example">Ejemplo de hoja lateral estándar</h4>

`SideSheetBehavior` funciona en conjunto con `CoordinatorLayout` para permitirte mostrar contenido en una hoja lateral, realizar animaciones de entrada/salida, responder a gestos de arrastrar/deslizar y más.

Aplica `SideSheetBehavior` a una `View` hija directa de `CoordinatorLayout`:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
  ...>

  <LinearLayout
    android:id="@+id/standard_side_sheet"
    style="@style/Widget.Material3.SideSheet"
    android:layout_width="256dp"
    android:layout_height="match_parent"
    android:orientation="vertical"
    app:layout_behavior="com.google.android.material.sidesheet.SideSheetBehavior">

    <!-- Contenido de la hoja lateral. -->
    <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/title"
    .../>

    <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/supporting_text"
    .../>

    <Button
    android:id="@+id/sidesheet_button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/action"
    .../>

  </LinearLayout>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En este ejemplo, la hoja lateral es `LinearLayout`.

#### Hoja lateral coplanar

Las hojas laterales coplanares son hojas laterales estándar que "aplastan" el contenido de una vista hermana a medida que la hoja lateral se expande. Las hojas laterales coplanares están en el mismo plano que su hermana, a diferencia de las hojas laterales estándar, que se muestran sobre el contenido de la pantalla.

Nota: Las hojas laterales coplanares no se recomiendan para pantallas estrechas.

##### Ejemplo de hoja lateral coplanar

Para agregar una hoja lateral coplanar a tu aplicación, sigue los pasos para
[agregar una hoja lateral estándar a tu diseño](#standard-side-sheet-example), arriba,
y simplemente establece `app:coplanarSiblingViewId` en la `View` que tiene el `layout_behavior` de la hoja lateral establecido en ella. Puedes apuntar el ID de la vista hermana coplanar a cualquier hijo del `CoordinatorLayout`. Asegúrate de establecer también
`style="@style/Widget.Material3.SideSheet"` en la vista de tu hoja lateral.

Alternativamente, puedes establecer la vista hermana coplanar mediante programación:

```kt
coplanarSideSheet.setCoplanarSiblingView(coplanarSiblingView)
```

Para eliminar la funcionalidad coplanar de una hoja lateral, simplemente establece la vista hermana coplanar en `null`:

```kt
coplanarSideSheet.setCoplanarSiblingView(null)
```

</details>

<details>
<summary><h3>Hoja lateral modal</h3></summary>

Las hojas laterales modales presentan la hoja mientras bloquean la interacción con el resto de la pantalla. Son una alternativa a los menús en línea y los diálogos simples en dispositivos móviles, ya que brindan espacio adicional para contenido, iconografía y acciones.

Las hojas laterales modales representan un scrim en el contenido que no es de la hoja lateral, para indicar que son modales y bloquean la interacción con el resto de la pantalla. Si se toca el contenido fuera del diálogo, la hoja lateral se descarta. Las hojas laterales modales se pueden arrastrar horizontalmente y descartar deslizándolas fuera de la pantalla.

API y código fuente:

*   `SideSheetDialog`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/sidesheet/SideSheetDialog)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/SideSheetDialog.java)

#### Ejemplo de hoja lateral modal

Para mostrar una hoja lateral modal, crea una instancia de `SideSheetDialog` con el `context` deseado:

```kt
val sideSheetDialog = SideSheetDialog(requireContext());
```

Luego, puedes establecer la vista de contenido de `SideSheetDialog`:

```kt
sideSheetDialog.setContentView(R.layout.side_sheet_content_layout)
```

Puedes mostrar la hoja lateral con `sideSheetDialog.show()` y descartarla con `sideSheetDialog.hide()`. `SideSheetDialog` tiene una funcionalidad integrada para cancelar automáticamente el diálogo después de que se desliza fuera de la pantalla.

</details>

## Implementación de código

Antes de que puedas usar las hojas laterales de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página
[Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

### Agregando hojas laterales

Nota: Las hojas laterales se introdujeron en `1.8.0`. Para usar las hojas laterales, asegúrate de que dependes de la
[versión de la biblioteca `1.8.0`](https://github.com/material-components/material-components-android/releases/tag/1.8.0)
o posterior.

**Uso básico de la hoja lateral estándar:**

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
  ...>

  <FrameLayout
    ...
    android:id="@+id/standard_side_sheet"
    app:layout_behavior="com.google.android.material.sidesheet.SideSheetBehavior">

    <!-- Contenido de la hoja lateral. -->

  </FrameLayout>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

### Escuchando cambios de estado y deslizamiento

Se pueden agregar `SideSheetCallback`s a un `SideSheetBehavior` para escuchar los cambios de estado y deslizamiento:

```kt
val sideSheetCallback = object : SideSheetBehavior.SideSheetCallback() {

    override fun onStateChanged(sideSheet: View, newState: Int) {
        // Hacer algo para el nuevo estado.
    }

    override fun onSlide(sideSheet: View, slideOffset: Float) {
        // Hacer algo para el desplazamiento del deslizamiento.
    }
}

// Para agregar una devolución de llamada:
sideSheetBehavior.addCallback(sideSheetCallback)

// Para eliminar una devolución de llamada:
sideSheetBehavior.removeCallback(sideSheetCallback)
```

<h3 id="setting-behavior">Configuración del comportamiento</h3>

Hay varios atributos que se pueden usar para ajustar el comportamiento de las hojas laterales estándar y modales.

Los atributos de comportamiento se pueden aplicar a las hojas laterales estándar en xml estableciéndolos en una `View` hija establecida en `app:layout_behavior`, o mediante programación:

```kt
val standardSideSheetBehavior = SideSheetBehavior.from(standardSideSheet)
// Usa esto para aplicar mediante programación los atributos de comportamiento
```

Más información sobre estos atributos y sus valores predeterminados está disponible en la sección [atributos de comportamiento](#behavior-attributes).

### Estableciendo el estado

Las hojas laterales estándar tienen los siguientes estados:

*   `STATE_EXPANDED`: La hoja lateral es visible a su altura máxima y no se está arrastrando ni asentando (ver más abajo).
*   `STATE_HIDDEN`: La hoja lateral ya no es visible y solo se puede volver a mostrar mediante programación.
*   `STATE_DRAGGING`: El usuario está arrastrando activamente la hoja lateral.
*   `STATE_SETTLING`: La hoja lateral se está asentando a una altura específica después de un gesto de arrastrar/deslizar. Esta será la altura de peek, la altura expandida o 0, en caso de que la acción del usuario haya hecho que la hoja lateral se oculte.

Puedes establecer un estado en la hoja lateral:

```kt
sideSheetBehavior.state = Sheet.STATE_HIDDEN
```

**Nota:** `STATE_SETTLING` y `STATE_DRAGGING` no deben establecerse mediante programación.

### Retroceso predictivo

#### Hojas laterales estándar y coplanares (no modales)

Para configurar el retroceso predictivo para hojas laterales estándar o coplanares (no modales) usando `SideSheetBehavior`, crea una devolución de llamada de retroceso de AndroidX que reenvíe objetos `BackEventCompat` a tu `SideSheetBehavior`:

```kt
val sideSheetBackCallback = object : OnBackPressedCallback(/* enabled= */false) {
  override fun handleOnBackStarted(backEvent: BackEventCompat) {
    sideSheetBehavior.startBackProgress(backEvent)
  }

  override fun handleOnBackProgressed(backEvent: BackEventCompat) {
    sideSheetBehavior.updateBackProgress(backEvent)
  }

  override fun handleOnBackPressed() {
    sideSheetBehavior.handleBackInvoked()
  }

  override fun handleOnBackCancelled() {
    sideSheetBehavior.cancelBackProgress()
  }
}
```

Y luego agrega y habilita la devolución de llamada de retroceso de la siguiente manera:

```kt
getOnBackPressedDispatcher().addCallback(this, sideSheetBackCallback)

sideSheetBehavior.addCallback(object : SideSheetCallback() {
  override fun onStateChanged(sideSheet: View, newState: Int) {
    when (newState) {
      STATE_EXPANDED, STATE_SETTLING -> sideSheetBackCallback.setEnabled(true)
      STATE_HIDDEN -> sideSheetBackCallback.setEnabled(false)
      else -> {
        // No hacer nada, solo cambiar la devolución de llamada habilitada para los estados anteriores.
      }
    }
  }

  override fun onSlide(sideSheet: View, slideOffset: Float) {}
})
```

#### Hojas laterales modales

El componente modal `SideSheetDialog` admite automáticamente el [retroceso predictivo](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md).
No se requiere ninguna otra integración por parte de la aplicación, aparte de los requisitos previos generales de retroceso predictivo y los pasos de migración mencionados
[aquí](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md#usage).

Visita las
[guías de diseño de retroceso predictivo](https://m3.material.io/components/side-sheets/guidelines#d77245e3-1013-48f8-a9d7-76f484e1be13)
para ver cómo se comporta el componente cuando un usuario desliza el dedo hacia atrás.

## Personalización de hojas laterales

### Tematización de hojas laterales

Las hojas laterales admiten la personalización de color, forma y más.

#### Ejemplo de tematización de hojas laterales

API y código fuente:

*   `SideSheetBehavior`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/sidesheet/SideSheetBehavior)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/SideSheetBehavior.java)
*   `SideSheetDialog`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/sidesheet/SideSheetDialog)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/sidesheet/SideSheetDialog.java)

Establecer el atributo de tema `sideSheetDialogTheme` en tu `ThemeOverlay` personalizado afectará a todas las hojas laterales.

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
  ...
  <item name="sideSheetDialogTheme">@style/ThemeOverlay.App.SideSheetDialog</item>
</style>

<style name="ThemeOverlay.App.SideSheetDialog" parent="ThemeOverlay.Material3.SideSheetDialog">
    <item name="sideSheetModalStyle">@style/Widget.App.SideSheet.Modal</item>
</style>
```

En `res/values/styles.xml`:

```xml
<style name="Widget.App.SideSheet.Modal" parent="Widget.Material3.SideSheet.Modal">
    <item name="backgroundTint">@color/shrine_pink_light</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Corner.Large</item>
</style>

<style name="ShapeAppearance.App.Corner.Large" parent="ShapeAppearance.Material3.Corner.Large">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">24dp</item>
</style>
```

**Nota:** El beneficio de usar una `ThemeOverlay` personalizada es que cualquier cambio en tu tema principal, como colores actualizados, se reflejará en la hoja lateral, siempre y cuando no se anulen en la superposición de tu tema personalizado. Si usas un `Theme` personalizado en su lugar, extendiendo desde una de las variantes `Theme.Material3.*.SideSheetDialog`, tendrás más control sobre qué atributos se incluyen exactamente en cada uno, pero también significa que tendrás que duplicar cualquier cambio que hayas realizado en tu tema principal en tu tema personalizado.
