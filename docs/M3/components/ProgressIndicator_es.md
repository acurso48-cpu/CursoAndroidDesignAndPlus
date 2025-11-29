<!--docs:
title: "Indicadores de progreso"
layout: detail
section: components
excerpt: "Los indicadores de progreso expresan un tiempo de espera no especificado o muestran la duración de un proceso."
iconId: progress_indicator
path: /catalog/progress-indicators/
-->

# Indicadores de progreso

Los [indicadores de progreso](https://material.io/components/progress-indicators) expresan un tiempo de espera no especificado o muestran la duración de un proceso. Los indicadores de progreso muestran el estado de un proceso en tiempo real. Hay dos variantes de indicadores de progreso.

![Imagen compuesta de tipos de indicadores de progreso lineales y circulares](assets/progressindicator/progressindicators-types.png)

1.  Indicador de progreso lineal
2.  Indicador de progreso circular

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/progress-indicators/overview/)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/progressindicator/package-summary)

## Anatomía

![Compuesto de anatomía del indicador de progreso](assets/progressindicator/progressindicators-anatomy.png)

1.  Indicador activo
2.  Pista
3.  Indicador de parada

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/progress-indicators/guidelines#f4cc8d62-23b8-47e5-8ffa-5684ef4f1975).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

![Los indicadores de progreso tienen un nuevo estilo redondeado y colorido, y más configuraciones para elegir, incluida una forma ondulada y una altura de pista variable](assets/progressindicator/order-details.gif)

Los indicadores de progreso tienen un nuevo estilo redondeado y colorido, y más configuraciones para elegir, incluida una forma ondulada y una altura de pista variable.

**Nuevas configuraciones:**

*   Altura de la pista: Gruesa (8dp)
*   Forma: Ondulada

### Estilos de M3 Expressive

<details>
<summary><h4>Ondulado</h4></summary>

Los indicadores de progreso ondulados ofrecen variantes tanto determinadas como indeterminadas, pero también te permiten personalizar su apariencia con varios parámetros de onda para obtener imágenes más expresivas.

![Indicador ondulado](assets/progressindicator/wavy-indicator.gif)

Los indicadores lineales ondulados aumentan la altura del contenedor general

**Nota**: La forma ondulada puede hacer que los procesos más largos se sientan menos estáticos y es mejor usarla cuando un estilo más expresivo es apropiado. Al usar la forma ondulada, la altura general del componente cambia. En tamaños muy pequeños, la forma ondulada puede no ser tan visible.

Hay dos variantes de indicadores de progreso ondulados: **Lineal** y **Circular**

##### Lineal

###### Indeterminado

![Indicador de progreso lineal indeterminado ondulado expresivo](assets/progressindicator/wavy-indeterminate-linear.gif)

En expresivo se agrega una nueva variante con pistas onduladas. No se agrega ningún atributo de tema dedicado para esta variante en los temas de `Material3` o `Material3Expressive`. Debe configurarse estableciendo el estilo como se muestra a continuación.

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
    android:id="@+id/linear_progress_indicator"
    style="@style/Widget.Material3Expressive.LinearProgressIndicator.Wavy"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true" />
```

###### Indeterminado grueso

![Indicador de progreso lineal indeterminado ondulado y grueso expresivo](assets/progressindicator/wavy-thick-indeterminate-linear.gif)

Una variante con una pista más gruesa se puede configurar a través del atributo `trackThickness` como se muestra a continuación. El valor recomendado es `8dp`. Para mantener la pista completamente redondeada, el `trackCornerRadius` debe establecerse en `4dp`.

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
    android:id="@+id/linear_progress_indicator"
    style="@style/Widget.Material3Expressive.LinearProgressIndicator.Wavy"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true"
    app:trackCornerRadius="4dp"
    app:trackThickness="8dp" />
```

También se puede configurar a través de los atributos como `waveLength`, `waveAmplitude`, etc., para una mayor ondulación o personalización de una pista más gruesa.

##### Circular

###### Indeterminado

![Indicador de progreso circular indeterminado ondulado expresivo](assets/progressindicator/wavy-indeterminate-circular.gif)

En Expressive se agrega una nueva variante con pistas onduladas. No hay ningún atributo de tema para esta variante agregado en los temas de `Material3` o `Material3Expressive`. Debe configurarse estableciendo el estilo como se muestra a continuación.

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:id="@+id/circular_progress_indicator"
    style="@style/Widget.Material3Expressive.CircularProgressIndicator.Wavy"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true" />
```

###### Indeterminado grueso

![Indicador de progreso circular indeterminado ondulado y grueso expresivo](assets/progressindicator/wavy-thick-indeterminate-circular.gif)

Una variante con una pista más gruesa se puede configurar a través del atributo `trackThickness` como se muestra a continuación. El valor recomendado es `8dp`. Para mantener la pista completamente redondeada, el `trackCornerRadius` debe establecerse en `4dp`. También se recomienda aumentar el `indicatorSize` a `52dp`.

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:id="@+id/circular_progress_indicator"
    style="@style/Widget.Material3Expressive.CircularProgressIndicator.Wavy"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true"
    app:indicatorSize="52dp"
    app:trackCornerRadius="4dp"
    app:trackThickness="8dp" />
```

También se puede configurar a través de los atributos como `waveLength`, `waveAmplitude`, etc. para una mayor ondulación o personalización de una pista más gruesa.

</details>

<details><summary><h4>Plano</h4></summary>

Hay dos variantes de indicadores de progreso planos: **Lineal** y **Circular**.

##### Lineal

###### Indeterminado

![Indicador de progreso lineal indeterminado plano expresivo](assets/progressindicator/flat-indeterminate-linear.gif)

El estilo predeterminado de `LinearProgressIndicator` en los temas de `Material3Expressive` es el mismo que en los temas de `Material3` con una pista plana de 4 dp de grosor, `colorPrimary` para el color del indicador y `colorPrimaryContainer` para el color de la pista.

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
    android:id="@+id/linear_progress_indicator"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true" />
```

###### Indeterminado grueso

![Indicador de progreso lineal indeterminado plano y grueso expresivo](assets/progressindicator/flat-thick-indeterminate-linear.gif)

Para tener una pista plana gruesa, se puede configurar a través del atributo `trackThickness` como se muestra a continuación. El valor recomendado es `8dp`. Para mantener la pista completamente redondeada, el `trackCornerRadius` debe establecerse en `4dp`.

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
    android:id="@+id/linear_progress_indicator"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true"
    app:trackCornerRadius="4dp"
    app:trackThickness="8dp" />
```

##### Circular

###### Indeterminado

![Indicador de progreso circular indeterminado plano expresivo](assets/progressindicator/flat-indeterminate-circular.gif)

El estilo predeterminado de `CircularProgressIndicator` en los temas de `Material3Expressive` es el mismo que en los temas de `Material3` con una pista de 4 dp, color de indicador `colorPrimary` y color de pista `colorPrimaryContainer`. Sin embargo, en el modo indeterminado, tiene una nueva animación y la pista inactiva también es visible de forma predeterminada.

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:id="@+id/circular_progress_indicator"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:indeterminate="true" />
```

###### Indeterminado grueso

![Indicador de progreso circular indeterminado plano y grueso expresivo](assets/progressindicator/flat-thick-indeterminate-circular.gif)

Para tener una pista plana gruesa, se puede configurar a través del atributo `trackThickness` como se muestra a continuación. El valor recomendado para `trackThickness` es `8dp`. Para mantener la pista completamente redondeada, el `trackCornerRadius` debe establecerse en `4dp`. También se recomienda aumentar el `indicatorSize` a `44dp`.

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:id="@+id/circular_progress_indicator"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:indeterminate="true"
    app:indicatorSize="44dp"
    app:trackCornerRadius="4dp"
    app:trackThickness="8dp" />
```

</details>

## Propiedades clave

### Atributos comunes

Los siguientes atributos se comparten entre los indicadores de progreso lineales y circulares:

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Grosor de la pista** | `app:trackThickness` | `setTrackThickness`<br>`getTrackThickness` | `4dp`
**Color del indicador** | `app:indicatorColor` | `setIndicatorColor`<br>`getIndicatorColor` | `colorPrimary`
**Color de la pista** | `app:trackColor` | `setTrackColor`<br>`getTrackColor` | `colorPrimaryContainer` (lineal)<br>`@android:color/transparent` (circular)
**Radio de la esquina de la pista** | `app:trackCornerRadius` | `setTrackCornerRadius`<br>`setTrackCornerRadiusFraction`<br>`getTrackCornerRadius` | `50%`
**Tamaño del espacio entre el indicador y la pista** | `app:indicatorTrackGapSize` | `setIndicatorTrackGapSize`<br>`getIndicatorTrackGapSize` | `4dp`
**Comportamiento de la animación de mostrar** | `app:showAnimationBehavior` | `setShowAnimationBehavior`<br>`getShowAnimationBehavior` | `none`
**Comportamiento de la animación de ocultar** | `app:hideAnimationBehavior` | `setHideAnimationBehavior`<br>`getHideAnimationBehavior` | `none`
**Retraso (en ms) para mostrar** | `app:showDelay` | N/A | 0
**Retraso mínimo (en ms) para ocultar** | `app:minHideDelay` | N/A | 0
**Longitud de onda** | `app:wavelength` | `setWavelength` | 0
**Longitud de onda en modo determinado** | `app:wavelengthDeterminate` | `setWavelengthDeterminate`<br>`getWavelenthDeterminate` | `wavelength`
**Longitud de onda en modo indeterminado** | `app:wavelengthIndeterminate` | `setWavelengthIndeterminate`<br>`getWavelengthIndeterminate` | `wavelength`
**Amplitud de onda** | `app:waveAmplitude` | `setWaveAmplitude`<br>`getWaveAmplitude` | 0
**Velocidad de onda** | `app:waveSpeed` | `setWaveSpeed`<br>`getWaveSpeed` | 0
**Escala de duración del animador indeterminado** | `app:indeterminateAnimatorDurationScale` | `setIndeterminateAnimatorDurationScale` | 1
**Progreso de aumento de la amplitud de onda** | `app:waveAmplitudeRampProgressMin` | `setWaveAmplitudeRampProgressRange` | 0.1
**Progreso de disminución de la amplitud de onda** | `app:waveAmplitudeRampProgressMax` | `setWaveAmplitudeRampProgressRange` | 0.9

### Atributos específicos del tipo lineal

Los indicadores de progreso de tipo lineal también tienen los siguientes atributos:

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Tipo de animación indeterminada** | `app:indeterminateAnimationType` | `setIndeterminateAnimationType`<br>`getIndeterminateAnimationType` | `disjoint`
**Dirección del indicador** | `app:indicatorDirectionLinear` | `setIndicatorDirection`<br>`getIndicatorDirection` | `leftToRight`
**Tamaño del indicador de parada de la pista** | `app:trackStopIndicatorSize` | `setTrackStopIndicatorSize`<br>`getTrackStopIndicatorSize` | `4dp`
**Relleno del indicador de parada de la pista** | `app:trackStopIndicatorPadding` | `setTrackStopIndicatorPadding`<br>`getTrackStopIndicatorPadding` | `none`
**Radio de la esquina interior de la pista** | `app:trackInnerCornerRadius` | `setTrackInnerCornerRadius`<br>`setTrackInnerCornerRadiusFraction`<br>`getTrackInnerCornerRadius` | `none` (usa `trackCornerRadius`)

### Atributos específicos del tipo circular

Los indicadores de progreso de tipo circular también tienen los siguientes atributos:

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Tamaño del girador (diámetro exterior)** | `app:indicatorSize` | `setIndicatorSize`<br>`getIndicatorSize` | `40dp`
**Inserción** | `app:indicatorInset` | `setIndicatorInset`<br>`getIndicatorInset` | `4dp`
**Dirección del indicador** | `app:indicatorDirectionCircular` | `setIndicatorDirection`<br>`getIndicatorDirection` | `clockwise`
**Tipo de animación indeterminada** | `app:indeterminateAnimationTypeCircular` | `setIndeterminateAnimationType`<br>`getIndeterminateAnimationType` | `advance`

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo lineal predeterminado** | `Widget.Material3.LinearProgressIndicator` | `?attr/linearProgressIndicatorStyle`
**Estilo circular predeterminado** | `Widget.Material3.CircularProgressIndicator` | `?attr/circularProgressIndicatorStyle`
**Estilo circular mediano** | `Widget.Material3.CircularProgressIndicator.Medium` | NA
**Estilo circular pequeño** | `Widget.Material3.CircularProgressIndicator.Small` | NA
**Estilo circular extra pequeño** | `Widget.Material3.CircularProgressIndicator.ExtraSmall` | NA

Para obtener la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/res/values/styles.xml)
y
[atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/res/values/attrs.xml).

### Actualización del contraste no textual

Para cumplir con los últimos requisitos de accesibilidad, se han actualizado `LinearProgressIndicator` y `CircularProgressIndicator` con atributos adicionales:

-   `app:indicatorTrackGapSize`: tamaño del espacio entre el indicador y la pista, 4 dp de forma predeterminada.
-   `app:trackStopIndicatorSize`: tamaño de la parada al final de la pista, 4 dp de forma predeterminada. Solo se aplica a la configuración determinada lineal.

Se han agregado estilos `*.Legacy` para volver al comportamiento anterior (**no recomendado**):

-   `Widget.Material3.LinearProgressIndicator.Legacy`
-   `Widget.Material3.CircularProgressIndicator.Legacy`

## Variantes de indicadores de progreso

Material Design ofrece dos tipos de indicadores de progreso visualmente distintos:

1.  Lineal
2.  Circular

**Nota:** Solo un tipo debe representar cada tipo de actividad en una aplicación. Por ejemplo, si una acción de actualización muestra un indicador circular en una pantalla, esa misma acción no debe usar un indicador lineal en otra parte de la aplicación.

Los indicadores de progreso se comportan de manera diferente según el tiempo de progreso que se está rastreando:

*   **Indicadores de progreso determinados** se llenan del 0% al 100%. Úsalo cuando se conozca el progreso y el tiempo de espera.
*   **Indicadores de progreso indeterminados** se mueven a lo largo de una pista fija, creciendo y encogiéndose en tamaño. Úsalo cuando se desconozca el progreso y el tiempo de espera.

![Indicadores de progreso determinados e indeterminados](assets/progressindicator/determinate-indeterminate.gif)

1.  Determinado
2.  Indeterminado

<details>

<summary><h3>Indicadores de progreso lineales</h3></summary>

Los indicadores de progreso lineales muestran el progreso animando un indicador a lo largo de una pista fija y visible. El comportamiento del indicador depende de si se conoce el progreso de un proceso.

Los indicadores de progreso lineales admiten operaciones tanto determinadas como indeterminadas.

*   Las operaciones determinadas muestran que el indicador aumenta de ancho de 0 a 100% de la pista, en sincronía con el progreso del proceso.
*   Las operaciones indeterminadas muestran que el indicador crece y se encoge continuamente a lo largo de la pista hasta que se completa el proceso.

API y código fuente:

*   `LinearProgressIndicator`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/progressindicator/LinearProgressIndicator)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/LinearProgressIndicator.java)

El siguiente ejemplo muestra un indicador de progreso lineal determinado.

![Animación del indicador de progreso lineal determinado: el indicador morado llena la pista gris](assets/progressindicator/linear-determinate.gif)

En el diseño:

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
  android:layout_width="match_parent" android:layout_height="wrap_content" />
```

El siguiente ejemplo muestra un indicador de progreso lineal indeterminado.

![Animación del indicador de progreso lineal indeterminado: el indicador morado se desplaza a lo largo de la pista gris](assets/progressindicator/linear-indeterminate.gif)

En el diseño:

```xml
<com.google.android.material.progressindicator.LinearProgressIndicator
  android:layout_width="match_parent" android:layout_height="wrap_content"
  android:indeterminate="true" />
```

#### Tipo de animación indeterminada multicolor

Para el indicador de progreso lineal, hay dos tipos de animación indeterminada:

*   `disjoint` - se anima como ciclos repetidos con dos segmentos separados en el mismo color a la vez.

    ![Animación del indicador de progreso lineal indeterminado desarticulado: el indicador rojo se desplaza a lo largo de la pista 2x y luego cambia a amarillo](assets/progressindicator/linear-multicolor-disjoint.gif)

*   `contiguous` - se anima como ciclos repetidos con tres segmentos adyacentes en diferentes colores.

    ![Animación del indicador de progreso lineal indeterminado contiguo: los indicadores rojo, amarillo y azul se mueven secuencialmente y cubren la pista](assets/progressindicator/linear-multicolor-contiguous.gif)

**Nota:** Hay un requisito mínimo de 3 colores de indicador para usar la animación **contigua**. De lo contrario, se lanzará una IllegalArgumentException.

</details>

<details>

<summary><h3>Indicadores de progreso circulares</h3></summary>

Los indicadores de progreso circulares muestran el progreso animando un indicador a lo largo de una pista circular invisible en el sentido de las agujas del reloj. Se pueden aplicar directamente a una superficie, como un botón o una tarjeta.

Los indicadores de progreso circulares admiten procesos tanto determinados como indeterminados.

*   Los indicadores circulares determinados llenan la pista circular invisible con color, a medida que el indicador se mueve de 0 a 360 grados.
*   Los indicadores circulares indeterminados crecen y se encogen en tamaño mientras se mueven a lo largo de la pista invisible.

API y código fuente:

*   `CircularProgressIndicator`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/progressindicator/CircularProgressIndicator)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/CircularProgressIndicator.java)

El siguiente ejemplo muestra un indicador de progreso circular determinado.

<img src="assets/progressindicator/circular_determinate.gif" alt="Animación del indicador de progreso circular determinado: el indicador morado dibuja un círculo en el sentido de las agujas del reloj desde la parte superior" width="600"/>

En el diseño:

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
  android:layout_width="wrap_content" android:layout_height="wrap_content" />
```

El siguiente ejemplo muestra un indicador de progreso circular indeterminado.

<img src="assets/progressindicator/circular-indeterminate.gif" alt="
Animación del indicador de progreso circular indeterminado: el indicador morado sigue un círculo en el sentido de las agujas del reloj desde la parte superior" width="600"/>

En el diseño:

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator
  android:layout_width="wrap_content" android:layout_height="wrap_content"
  android:indeterminate="true" />
```

</details>

## Implementación de código

Antes de poder usar los indicadores de progreso, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

Los indicadores de progreso informan a los usuarios sobre el estado de los procesos en curso, como la carga de una aplicación, el envío de un formulario o el guardado de actualizaciones. Comunican el estado de una aplicación e indican las acciones disponibles, como si los usuarios pueden navegar fuera de la pantalla actual.

**Nota:** Cuando muestres el progreso de una secuencia de procesos, indica el progreso general en lugar del progreso de cada actividad.

### Agregar indicadores de progreso determinados

Se puede agregar un indicador de progreso determinado a un diseño:

```xml
<!-- Indicador de progreso lineal -->
<com.google.android.material.progressindicator.LinearProgressIndicator
  android:layout_width="match_parent"
  android:layout_height="wrap_content" /><!-- Indicador de progreso circular -->
<com.google.android.material.progressindicator.CircularProgressIndicator
android:layout_width="wrap_content" android:layout_height="wrap_content" />
```

### Agregar indicadores de progreso indeterminados

Se puede agregar un indicador de progreso indeterminado:

```xml
<!-- Indicador de progreso lineal -->
<com.google.android.material.progressindicator.LinearProgressIndicator
  android:layout_width="match_parent" android:layout_height="wrap_content"
  android:indeterminate="true" /><!-- Indicador de progreso circular -->
<com.google.android.material.progressindicator.CircularProgressIndicator
android:layout_width="wrap_content" android:layout_height="wrap_content"
android:indeterminate="true" />
```

### Cambiar de indeterminado a determinado

Los indicadores de progreso indeterminados pueden pasar sin problemas a indicadores de progreso determinados estableciendo el `progreso` mediante programación:

```kt
int progress = getLoadingProgress ()
indicator.setProgressCompat(progress, true)
```

**Nota:** Una vez que los indicadores de progreso indeterminados se cambian al modo determinado (o se inicializan como determinados), se pueden volver a establecer en modo indeterminado mediante la llamada al método `setIndeterminate(true)`.

### Hacer accesibles los indicadores de progreso

Los indicadores de progreso heredan el soporte de accesibilidad de la clase `ProgressBar` en el marco. Considera establecer el descriptor de contenido para usar con lectores de pantalla.

Eso se puede hacer en XML a través del atributo `android:contentDescription` o mediante programación de la siguiente manera:

```kt
progressIndicator.contentDescription = contentDescription
```

**Nota:** Dependiendo del grosor de la pista del indicador de progreso lineal, el componente podría tener una altura menor o igual a 4 dp. Existe una limitación conocida en el indicador de enfoque (cuadro verde) al usar talkback. No podrá dibujar el indicador de enfoque si los límites del componente son menores o iguales a 4 dp en cualquier dimensión. Considera usar `android:paddingTop` y `android:paddingBottom` para aumentar la altura de los límites cuando esté disponible.

## Personalización de los indicadores de progreso

### Tematización de los indicadores de progreso

Los indicadores de progreso admiten la personalización de color y tamaño.

API y código fuente:

*   `LinearProgressIndicator`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/progressindicator/LinearProgressIndicator)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/LinearProgressIndicator.java)
*   `CircularProgressIndicator`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/progressindicator/CircularProgressIndicator)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/progressindicator/CircularProgressIndicator.java)

El siguiente ejemplo muestra un indicador de progreso circular con tematización de Material.

!["Animación del indicador de progreso circular: el segmento del círculo rosa rodea el centro, luego el segmento del círculo rosa llena el círculo"](assets/progressindicator/circular-theming.gif)

#### Implementación de la tematización del indicador de progreso

Usa atributos de tema y estilos en `res/values/styles.xml`, que se aplica a todos los indicadores de progreso circulares y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
  ...
  <item name="colorPrimary">@color/shrine_pink_100</item>
</style>
```

Usa un atributo de tema de tipo predeterminado, estilos y una superposición de tema, que se aplica a todos los indicadores de progreso circulares pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
  ...
  <item name="circularProgressIndicatorStyle">
    @style/Widget.App.CircularProgressIndicator
  </item>
</style>

<style name="Widget.App.CircularProgressIndicator"
parent="Widget.Material3.CircularProgressIndicator.Legacy">
<item name="materialThemeOverlay">
  @style/ThemeOverlay.App.CircularProgressIndicator
</item>
<item name="trackThickness">20dp</item>
</style>

<style name="ThemeOverlay.App.CircularProgressIndicator" parent="">
<item name="colorPrimary">@color/shrine_pink_100</item>
</style>
```

Usa el estilo en el diseño, lo que afecta solo a este indicador de progreso circular específico:

```xml
<com.google.android.material.progressindicator.CircularProgressIndicator...style="@style/Widget.App.CircularProgressIndicator"  />
```

### Mostrar u ocultar el indicador de progreso

De forma predeterminada, el indicador de progreso se mostrará u ocultará sin animaciones. Puedes cambiar los comportamientos de la animación a través de `app:showAnimationBehavior` (o el método `setShowAnimationBehavior`) y `app:hideAnimationBehavior` (o el método `setHideAnimationBehavior`).

Los modos de comportamiento son:

*   `none` (predeterminado): muestra/oculta la vista inmediatamente cuando se cambia la visibilidad a través del método `show`, `hide` o `setVisibility`.
*   `outward` - para el tipo lineal, muestra la vista expandiéndose desde la línea de base (o el borde inferior) y oculta la vista colapsando hasta el borde superior; para el tipo circular, muestra la vista expandiéndose desde el borde interior y oculta la vista colapsando hasta el borde exterior.
*   `inward` - para el tipo lineal, muestra la vista expandiéndose desde el borde superior y oculta la vista colapsando hasta la línea de base (borde inferior); para el tipo circular, muestra la vista expandiéndose desde el borde exterior y oculta la vista colapsando hasta el borde interior.
*   `escape`: para el tipo lineal, se escapa en la dirección de la progresión; para el tipo circular, no tiene efecto.

Cuando el comportamiento de la animación de ocultar no es ninguno, la visibilidad de la vista se cambiará después de que finalice la animación. Usa el método `setVisibilityAfterHide` para establecer la visibilidad de destino como `Visibility.INVISIBLE` (predeterminado) o `Visibility.GONE`.

### Agregar esquinas redondeadas

Los indicadores de progreso pueden tener esquinas redondeadas a través de `app:trackCornerRadius` (en dp o fracción) o los métodos `setTrackCornerRadius` y `setTrackCornerRadiusFraction`.
