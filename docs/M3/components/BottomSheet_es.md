<!--docs:
title: "Hojas inferiores"
layout: detail
section: components
excerpt: "Las hojas inferiores se deslizan hacia arriba desde la parte inferior de la pantalla para revelar más contenido."
iconId: bottom_sheet
path: /catalog/bottom-sheet-behavior/
-->

# Hojas inferiores

Las [hojas inferiores](https://m3.material.io/components/bottom-sheets/overview) muestran contenido secundario anclado a la parte inferior de la pantalla. Hay dos variantes de hojas inferiores.

![Tipos de hojas inferiores](assets/bottomsheet/bottomsheets-types.png)

1.  Hoja inferior estándar
2.  Hoja inferior modal

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/bottom-sheets/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/bottomsheet/package-summary)

## Anatomía

Las hojas inferiores modales están sobre un scrim, mientras que las hojas inferiores estándar no tienen scrim. Aparte de esto, ambos tipos de hojas inferiores tienen las mismas especificaciones.

![Anatomía de la hoja inferior](assets/bottomsheet/bottomsheet-anatomy.png)

1.  Contenedor
2.  Asa de arrastre (opcional)
3.  Scrim

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/bottom-sheets/guidelines#0dd76c6d-7f76-4ff4-b325-0abf28b00029).

## Propiedades clave

### Atributos de la hoja

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:backgroundTint` | N/A | `?attr/colorSurfaceContainerLow`
**Forma** | `app:shapeAppearance` | N/A | `?attr/shapeAppearanceCornerExtraLarge`
**Elevación** | `android:elevation` | N/A | `1dp`
**Ancho máximo** | `android:maxWidth` | `setMaxWidth`<br/>`getMaxWidth` | `640dp`
**Altura máxima** | `android:maxHeight` | `setMaxHeight`<br/>`getMaxHeight` | N/A

### Atributos de comportamiento

Más información sobre estos atributos y cómo usarlos en la sección [configuración del comportamiento](#setting-behavior).

Comportamiento | Método(s) relacionado(s) | Valor predeterminado
--- | --- | ---
`app:behavior_peekHeight` | `setPeekHeight`<br/>`getPeekHeight` | `auto`
`app:behavior_hideable` | `setHideable`<br/>`isHideable` | `false` para estándar<br/>`true` para modal
`app:behavior_skipCollapsed` | `setSkipCollapsed`<br/>`getSkipCollapsed` | `false`
`app:behavior_fitToContents` | `setFitToContents`<br/>`isFitToContents` | `true`
`app:behavior_draggable` | `setDraggable`<br/>`isDraggable` | `true`
`app:behavior_draggableOnNestedScroll` | `setDraggableOnNestedScroll`<br/>`isDraggableOnNestedScroll` | `true`
`app:behavior_halfExpandedRatio` | `setHalfExpandedRatio`<br/>`getHalfExpandedRatio` | `0.5`
`app:behavior_expandedOffset` | `setExpandedOffset`<br/>`getExpandedOffset` | `0dp`
`app:behavior_significantVelocityThreshold` | `setSignificantVelocityThreshold` <br/> `getSignificantVelocityThreshold` | `500 pixels/s`
`app:behavior_multipleScrollingChildrenSupported` | N/A | `false`

Para guardar el comportamiento en el cambio de configuración:

Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | ---
`app:behavior_saveFlags` | `setSaveFlags`<br/>`getSaveFlags` | `SAVE_NONE`

### Estilos

Elemento | Valor predeterminado | Atributo de tema
--- | --- | ---
**Estilo predeterminado (modal)** | `@style/Widget.Material3.BottomSheet.Modal` | `?attr/bottomSheetStyle`

**Nota**: El atributo de tema de estilo predeterminado `?attr/bottomSheetStyle` es solo para hojas inferiores modales. No hay un atributo de tema de estilo predeterminado para las hojas inferiores estándar, porque los `BottomSheetBehavior` no tienen una `View` asociada designada.

### Superposiciones de temas

Elemento | Superposición de tema | Atributo
--- | --- | ---
**Superposición de tema predeterminada** | `ThemeOverlay.Material3.BottomSheetDialog` | `?attr/bottomSheetDialogTheme`

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/res/values/styles.xml),
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/res/values/attrs.xml),
y
[temas y superposiciones de temas](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/res/values/themes.xml).

## Variantes de hojas inferiores

### Hoja inferior estándar

Las hojas inferiores estándar coexisten con la región principal de la interfaz de usuario de la pantalla y permiten ver e interactuar simultáneamente con ambas regiones. Se usan comúnmente para mantener una función o contenido secundario visible en la pantalla cuando el contenido en la región principal de la interfaz de usuario se desplaza o se mueve con frecuencia.

[`BottomSheetBehavior`](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetBehavior) se aplica a un hijo de
[CoordinatorLayout](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout) para hacer que ese hijo sea una **hoja inferior persistente**, que es una vista que aparece desde la parte inferior de la pantalla, elevada sobre el contenido principal. Se puede arrastrar verticalmente para exponer más o menos contenido.

API y código fuente:

*   `BottomSheetBehavior`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetBehavior)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java)

#### Ejemplo de hoja inferior estándar

El siguiente ejemplo muestra una hoja inferior estándar en sus estados contraído y expandido:

Contraído <div style="width:400px"></div> | Expandido <div style="width:400px"></div>
--- | ---
<img src="assets/bottomsheet/bottomsheet-standard1.png" alt="Ejemplo de hoja inferior estándar contraída." height="500"/> | <img src="assets/bottomsheet/bottomsheet-standard2.png" alt="Ejemplo de hoja inferior estándar expandida." height="500"/>

`BottomSheetBehavior` funciona en conjunto con `CoordinatorLayout` para permitirte mostrar contenido en una hoja inferior, realizar animaciones de entrada/salida, responder a gestos de arrastrar/deslizar, etc.

Aplica el `BottomSheetBehavior` a una `View` hija directa de `CoordinatorLayout`:

```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
  ...>

  <FrameLayout
    android:id="@+id/standard_bottom_sheet"
    style="@style/Widget.Material3.BottomSheet"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layout_behavior="com.google.android.material.bottomsheet.BottomSheetBehavior">

    <!-- Asa de arrastre para accesibilidad -->
    <com.google.android.material.bottomsheet.BottomSheetDragHandleView
    android:id="@+id/drag_handle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>

    <!-- Contenido de la hoja inferior. -->
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
    android:id="@+id/bottomsheet_button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/action"
    .../>

    <com.google.android.material.switchmaterial.SwitchMaterial
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/switch_label"/>

  </FrameLayout>

</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

En este ejemplo, la hoja inferior es el `FrameLayout`.

Puedes usar el `BottomSheetBehavior` para establecer atributos así:

```kt
val standardBottomSheet = findViewById<FrameLayout>(R.id.standard_bottom_sheet)
val standardBottomSheetBehavior = BottomSheetBehavior.from(standardBottomSheet)
// Usa esto para aplicar atributos de comportamiento mediante programación; p. ej.
// standardBottomSheetBehavior.setState(STATE_EXPANDED);
```

Más información sobre el uso del comportamiento para establecer atributos se encuentra en la sección [configuración del comportamiento](#setting-behavior).

### Hoja inferior modal

Las hojas inferiores modales presentan un conjunto de opciones mientras bloquean la interacción con el resto de la pantalla. Son una alternativa a los menús en línea y los diálogos simples en dispositivos móviles, ya que brindan espacio adicional para contenido, iconografía y acciones.

[`BottomSheetDialogFragment`](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetDialogFragment) es una capa delgada sobre el Fragmento de la biblioteca de soporte regular que representa tu fragmento como una **hoja inferior modal**, actuando fundamentalmente como un diálogo.

Las hojas inferiores modales representan una sombra en el contenido debajo de ellas, para indicar que son modales. Si se toca el contenido fuera del diálogo, la hoja inferior se descarta. Las hojas inferiores modales se pueden arrastrar verticalmente y descartar deslizándolas hacia abajo por completo.

API y código fuente:

*   `BottomSheetDialogFragment`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetDialogFragment)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/BottomSheetDialogFragment.java)

#### Ejemplo de hoja inferior modal

El siguiente ejemplo muestra una hoja inferior modal en sus estados contraído y expandido:

Contraído <div style="width:400px"></div> | Expandido <div style="width:400px"></div>
--- | ---
<img src="assets/bottomsheet/bottomsheet-modal1.png" alt="Ejemplo de hoja inferior modal contraída." height="500"/> | <img src="assets/bottomsheet/bottomsheet-modal2.png" alt="Ejemplo de hoja inferior modal expandida." height="500"/>

Primero, subclase `BottomSheetDialogFragment` y sobrescribe `onCreateView` para proporcionar un diseño para el contenido de la hoja (en este ejemplo, es `modal_bottom_sheet_content.xml`):

```kt
class ModalBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.modal_bottom_sheet_content, container, false)

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}
```

Luego, dentro de un `AppCompatActivity`, para mostrar la hoja inferior:

```kt
val modalBottomSheet = ModalBottomSheet()
modalBottomSheet.show(supportFragmentManager, ModalBottomSheet.TAG)
```

`BottomSheetDialogFragment` es una subclase de `AppCompatFragment`, lo que significa que necesitas usar `Activity.getSupportFragmentManager()`.

**Nota:** No llames a `setOnCancelListener` o `setOnDismissListener` en un `BottomSheetDialogFragment`. Puedes sobrescribir `onCancel(DialogInterface)` o `onDismiss(DialogInterface)` si es necesario.

`BottomSheetDialogFragment` envuelve la vista en un `BottomSheetDialog`, que tiene su propio `BottomSheetBehavior`. Puedes definir tu propio `BottomSheetBehavior` sobrescribiendo `onCreateDialog`.

**Nota:** Si sobrescribes `onCreateDialog`, no debes sobrescribir `onCreateView`.

```kt

import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ModalBottomSheet : BottomSheetDialogFragment() {

  override fun onCreateDialog(
    savedInstanceState: Bundle?,
  ): Dialog {
    val bottomSheetDialog: BottomSheetDialog =
      BottomSheetDialog(
        getContext(), R.style.ThemeOverlay_Catalog_BottomSheetDialog_Scrollable
      )
    bottomSheetDialog.setContentView(R.layout.bottom_sheet_content)
    // Establecer atributos de comportamiento
    bottomSheetDialog.getBehavior().setPeekHeight(123)
    return bottomSheetDialog
  }
}
```

## Implementación del código

Antes de que puedas usar las hojas inferiores de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, consulta la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

<details>
  <summary><h3>Escuchar los cambios de estado y deslizamiento</h3></summary>

Se puede agregar un `BottomSheetCallback` a un `BottomSheetBehavior`:

```kt
val bottomSheetCallback = object : BottomSheetBehavior.BottomSheetCallback() {

    override fun onStateChanged(bottomSheet: View, newState: Int) {
        // Hacer algo para el nuevo estado.
    }

    override fun onSlide(bottomSheet: View, slideOffset: Float) {
        // Hacer algo para el desplazamiento del deslizamiento.
    }
}

// Para agregar la devolución de llamada:
bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallback)

// Para eliminar la devolución de llamada:
bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallback)
```

</details>

<details>
  <summary><h3>Manejo de inserciones y pantalla completa</h3></summary>

`BottomSheetBehavior` puede manejar automáticamente las inserciones (como para [de borde a borde](https://developer.android.com/training/gestures/edge-to-edge)) especificando cualquiera de estos como verdadero en la vista:

*   `app:paddingBottomSystemWindowInsets`
*   `app:paddingLeftSystemWindowInsets`
*   `app:paddingRightSystemWindowInsets`
*   `app:paddingTopSystemWindowInsets`

En la API 21 y superior, la hoja inferior modal se representará en pantalla completa (de borde a borde) si la barra de navegación es transparente y `enableEdgeToEdge` es verdadero. Para habilitar de borde a borde de forma predeterminada para las hojas inferiores modales, puedes sobrescribir `?attr/bottomSheetDialogTheme` como en el siguiente ejemplo (`enableEdgeToEdge` ya es verdadero en `ThemeOverlay.Material3.BottomSheetDialog`):

```xml
<style name="AppTheme" parent="Theme.Material3.*">
  ...
  <item name="bottomSheetDialogTheme">@style/ThemeOverlay.App.BottomSheetDialog</item>
</style>

<style name="ThemeOverlay.App.BottomSheetDialog" parent="ThemeOverlay.Material3.BottomSheetDialog">
    <item name="android:navigationBarColor">@android:color/transparent<item>
</style>
```

Se pueden agregar inserciones automáticamente si alguno de los atributos de relleno anteriores se establece en verdadero en el estilo, ya sea actualizando el estilo pasado al constructor o actualizando el estilo predeterminado especificado por el atributo `?attr/bottomSheetDialogTheme` en tu tema.

`BottomSheetDialog` también agregará relleno en la parte superior cuando la hoja inferior se deslice debajo de la barra de estado, para evitar que el contenido se dibuje debajo de ella.

`BottomSheetDialog` también admite [Protecciones](https://developer.android.com/reference/androidx/core/view/insets/Protection). Si usas [Protecciones de gradiente](https://developer.android.com/reference/androidx/core/view/insets/GradientProtection), `BottomSheetBehavior` proporciona un método `getDefaultBottomGradientProtection()` que devolverá una `GradientProtection` inferior que es del color `?attr/colorSurfaceContainerLow` para Material3 o posterior, o `?attr/colorSurface` si no se define de otra manera.

</details>

<details>
  <summary><h3>Retroceso predictivo</h3></summary>

#### Hojas inferiores modales

Los componentes modales `BottomSheetDialogFragment` y `BottomSheetDialog` admiten automáticamente el [retroceso predictivo](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md). No se requiere ninguna integración adicional por parte de la aplicación, aparte de los requisitos previos generales del retroceso predictivo y los pasos de migración mencionados [aquí](/third_party/java_src/android_libs/material_components/docs/foundations/PredictiveBack.md#usage).

Visita las [guías de diseño del retroceso predictivo](https://m3.material.io/components/bottom-sheets/guidelines#3d7735e2-73ea-4f3e-bd42-e70161fc1085) para ver cómo se comporta el componente cuando un usuario desliza el dedo hacia atrás.

#### Hojas inferiores estándar (no modales)

Para configurar el retroceso predictivo para las hojas inferiores estándar (no modales) usando `BottomSheetBehavior`, crea una devolución de llamada de retroceso de AndroidX que reenvíe los objetos `BackEventCompat` a tu `BottomSheetBehavior`:

```kt
val bottomSheetBackCallback = object : OnBackPressedCallback(/* enabled= */false) {
  override fun handleOnBackStarted(backEvent: BackEventCompat) {
    bottomSheetBehavior.startBackProgress(backEvent)
  }

  override fun handleOnBackProgressed(backEvent: BackEventCompat) {
    bottomSheetBehavior.updateBackProgress(backEvent)
  }

  override fun handleOnBackPressed() {
    bottomSheetBehavior.handleBackInvoked()
  }

  override fun handleOnBackCancelled() {
    bottomSheetBehavior.cancelBackProgress()
  }
}
```

Y luego agrega y habilita la devolución de llamada de retroceso de la siguiente manera:

```kt
getOnBackPressedDispatcher().addCallback(this, bottomSheetBackCallback)

bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetCallback() {
  override fun onStateChanged(bottomSheet: View, newState: Int) {
    when (newState) {
      STATE_EXPANDED, STATE_HALF_EXPANDED -> bottomSheetBackCallback.setEnabled(true)
      STATE_COLLAPSED, STATE_HIDDEN -> bottomSheetBackCallback.setEnabled(false)
      else -> {
        // No hacer nada, solo cambiar la devolución de llamada habilitada para los estados "estables".
      }
    }
  }

  override fun onSlide(bottomSheet: View, slideOffset: Float) {}
})
```

</details>

<details>
  <summary><h3>Establecer el estado</h3></summary>

Las hojas inferiores estándar y modales tienen los siguientes estados:

*   `STATE_COLLAPSED`: La hoja inferior es visible pero solo muestra su altura mínima. Este estado suele ser la "posición de reposo" de una hoja inferior y debe tener suficiente altura para indicar que hay contenido adicional con el que el usuario puede interactuar.
*   `STATE_EXPANDED`: La hoja inferior es visible a su altura máxima y no se está arrastrando ni asentando.
*   `STATE_HALF_EXPANDED`: La hoja inferior está medio expandida (solo aplicable si `behavior_fitToContents` se ha establecido en falso) y no se está arrastrando ni asentando (ver más abajo).
*   `STATE_HIDDEN`: La hoja inferior ya no es visible y solo se puede volver a mostrar mediante programación.
*   `STATE_DRAGGING`: El usuario está arrastrando activamente la hoja inferior hacia arriba o hacia abajo.
*   `STATE_SETTLING`: La hoja inferior se está asentando a una altura específica después de un gesto de arrastrar/deslizar. Esta será la altura mínima, la altura expandida o 0, en caso de que la acción del usuario haya hecho que la hoja inferior se oculte.

**Nota:** `STATE_SETTLING` y `STATE_DRAGGING` no deben establecerse mediante programación.

Puedes establecer un estado en la hoja inferior:

```kt
bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
```

</details>

<details>
  <summary><h3>Configuración del comportamiento</h3></summary>

Hay varios atributos que se pueden usar para ajustar el comportamiento de las hojas inferiores estándar y modales.

Los atributos de comportamiento se pueden aplicar a las hojas inferiores estándar en xml estableciéndolos en una `View` hija establecida en `app:layout_behavior`, o mediante programación:

```kt
val standardBottomSheetBehavior = BottomSheetBehavior.from(standardBottomSheet)
// Usa esto para aplicar atributos de comportamiento mediante programación
```

Los atributos de comportamiento se pueden aplicar a las hojas inferiores modales usando atributos y estilos de tema a nivel de aplicación:

```xml
<style name="ModalBottomSheet" parent="Widget.Material3.BottomSheet.Modal">
  <!-- Aplicar atributos aquí -->
</style>

<style name="ModalBottomSheetDialog" parent="ThemeOverlay.Material3.BottomSheetDialog">
  <item name="bottomSheetStyle">@style/ModalBottomSheet</item>
</style>

<style name="AppTheme" parent="Theme.Material3.*">
  <item name="bottomSheetDialogTheme">@style/ModalBottomSheetDialog</item>
</style>
```

O mediante programación:

```kt
val modalBottomSheetBehavior = (modalBottomSheet.dialog as BottomSheetDialog).behavior
// Usa esto para aplicar atributos de comportamiento mediante programación
```

Más información sobre estos atributos y sus valores predeterminados está disponible en la sección [atributos de comportamiento](#behavior-attributes).

</details>

<details>
  <summary><h3>Hacer que las hojas inferiores sean accesibles</h3></summary>

El contenido dentro de una hoja inferior debe seguir sus propias pautas de accesibilidad, como establecer descripciones de contenido para las imágenes.

Para admitir el arrastre de hojas inferiores con servicios de accesibilidad como TalkBack, Voice Access, Switch Access, etc., proporcionamos un widget conveniente, `BottomSheetDragHandleView`, que recibirá y manejará automáticamente los comandos de accesibilidad para expandir y contraer la hoja inferior adjunta cuando el modo de accesibilidad esté habilitado. El asa también admite tocar para alternar entre los estados expandido y contraído, así como tocar dos veces para ocultar. Para usar `BottomSheetDragHandleView`, puedes agregarlo en la parte superior del contenido de tu hoja inferior. Mostrará un indicador visual personalizable para todos los usuarios. Consulta el ejemplo en la siguiente sección para ver cómo agregar un asa de arrastre a tu hoja inferior.

**Nota:** `BottomSheetDragHandleView` tiene un ancho y alto mínimos predeterminados de 48dp para cumplir con el requisito mínimo de objetivo táctil. Por lo tanto, deberás conservar al menos 48dp en la parte superior para colocar un asa de arrastre.

</details>

## Personalización de las hojas inferiores

### Tematización de las hojas inferiores

Las hojas inferiores admiten la personalización de color y forma.

#### Ejemplo de tematización de la hoja inferior

API y código fuente:

*   `BottomSheetBehavior`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetBehavior)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/BottomSheetBehavior.java)
*   `BottomSheetDialogFragment`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetDialogFragment)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/bottomsheet/BottomSheetDialogFragment.java)

El siguiente ejemplo muestra una hoja inferior con tematización de Material, en sus estados contraído y expandido.

<img src="assets/bottomsheet/bottomsheet-theming.png" alt="Hoja inferior con color de fondo rosa. Contraída a la izquierda y expandida a la derecha." height="550"/>

##### Implementación de la tematización de la hoja inferior

Establecer el atributo de tema `bottomSheetDialogTheme` en tu `ThemeOverlay` personalizado afectará a todas las hojas inferiores.

En `res/values/themes.xml`:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
  ...
  <item name="bottomSheetDialogTheme">@style/ThemeOverlay.App.BottomSheetDialog</item>
</style>

<style name="ThemeOverlay.App.BottomSheetDialog" parent="ThemeOverlay.Material3.BottomSheetDialog">
    <item name="bottomSheetStyle">@style/ModalBottomSheetDialog</item>
</style>
```

En `res/values/styles.xml`:

```xml
<style name="ModalBottomSheetDialog" parent="Widget.Material3.BottomSheet.Modal">
    <item name="backgroundTint">@color/shrine_pink_light</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.LargeComponent</item>
</style>

<style name="ShapeAppearance.App.LargeComponent" parent="ShapeAppearance.Material3.LargeComponent">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">24dp</item>
</style>
```

**Nota:** El beneficio de usar una `ThemeOverlay` personalizada es que cualquier cambio en tu tema principal, como colores actualizados, se reflejará en la hoja inferior, siempre que no se anulen en la superposición de tu tema personalizado. Si usas un `Theme` personalizado en su lugar, extendiendo desde una de las variantes `Theme.Material3.*.BottomSheetDialog`, tendrás más control sobre qué atributos se incluyen exactamente en cada uno, pero también significa que tendrás que duplicar cualquier cambio que hayas realizado en tu tema principal en tu tema personalizado.
