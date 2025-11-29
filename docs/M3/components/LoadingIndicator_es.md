<!--docs:
title: "Indicadores de carga"
layout: detail
section: components
excerpt: "Los indicadores de carga expresan un tiempo de espera no especificado de un proceso."
iconId: loading_indicator
path: /catalog/loading-indicators/
-->

# Indicadores de carga

Los [indicadores de carga](https://m3.material.io/components/loading-indicator/overview) muestran el progreso de un tiempo de espera corto. Tiene dos configuraciones.

![Configuraciones del indicador de carga](assets/loadingindicator/loadingindicator-configurations.gif)

1.  Predeterminado (contenido)
2.  No contenido

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/loading-indicator/overview)

## Anatomía

![Anatomía del indicador de carga](assets/loadingindicator/anatomy.png)

1.  Indicador activo
2.  Contenedor (opcional)

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/loading-indicator/guidelines#a6bb9df2-568a-41d4-a4e9-08ac8f844a7d).

## M3 Expressive

### Actualización de M3 Expressive

El indicador de carga es un nuevo componente agregado a la biblioteca en la actualización M3 Expressive.

El indicador de carga está diseñado para mostrar el progreso que se carga en menos de cinco segundos. Debería reemplazar la mayoría de los usos del indicador de progreso circular indeterminado.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Indicadores de carga:**

*   Pueden estar contenidos o no contenidos
*   Usan la forma y el movimiento para captar la atención
*   Pueden escalar en tamaño

## Propiedades clave

#### Atributos

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color del indicador** | `app:indicatorColor` | `setIndicatorColor`</br>`getIndicatorColor` | `colorPrimary`
**Color del contenedor** | `app:containerColor` | `setContainerColor`</br>`getContainerColor` | `transparent`
**Tamaño del indicador** | `app:indicatorSize` | `setIndicatorSize`</br>`getIndicatorSize` | 38dp
**Ancho del contenedor** | `app:containerWidth` | `setContainerWidth`</br>`getContainerWidth` | 48dp
**Altura del contenedor** | `app:containerHeight` | `setContainerHeight`</br>`getContainerHeight` | 48dp
**Retraso (en ms) para mostrar** | `app:showDelay` | N/A | 0
**Retraso mínimo (en ms) para ocultar** | `app:minHideDelay` | N/A | 0

#### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.LoadingIndicator` | `?attr/loadingIndicatorStyle`
**Estilo contenido** | `Widget.Material3.LoadingIndicator.Contained` | N/A

Consulta la lista completa de [estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/loadingindicator/res/values/styles.xml) y [atributos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/loadingindicator/res/values/attrs.xml).

## Implementación de código

Antes de poder usar los indicadores de carga de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

Los indicadores de carga informan a los usuarios sobre los procesos en curso indeterminados, como la carga de una aplicación, el envío de un formulario o el guardado de actualizaciones. Comunican el estado de una aplicación e indican las acciones disponibles, como si los usuarios pueden navegar fuera de la pantalla actual. Se recomienda como reemplazo de los indicadores de progreso circulares indeterminados.

**Nota:** Usa indicadores de progreso si los procesos pueden pasar de indeterminados a determinados.

### Agregar indicadores de carga

Los indicadores de carga captan la atención a través del movimiento. Transforma la forma en una secuencia con un posible cambio de color, si se especifican varios colores para el indicador. Opcionalmente, se dibuja un contenedor completamente redondeado detrás de la forma que se transforma.

Código fuente:

*   `LoadingIndicator`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/loadingindicator/LoadingIndicator.java)

Se puede agregar un indicador de carga a un diseño:

```xml
<!-- Indicador de carga (no contenido) -->
<com.google.android.material.loadingindicator.LoadingIndicator
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

![Animación del indicador de carga no contenido](assets/loadingindicator/loading-indicator.gif)

```xml
<!-- Indicador de carga con un contenedor -->
<com.google.android.material.loadingindicator.LoadingIndicator
    style="@style/Widget.Material3.LoadingIndicator.Contained"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

![Animación del indicador de carga contenido](assets/loadingindicator/loading-indicator-contained.gif)

### Hacer accesibles los indicadores de carga

Los indicadores de carga tienen un soporte limitado para las interacciones del usuario. Considera establecer el descriptor de contenido para usar con lectores de pantalla.

Eso se puede hacer en XML a través del atributo `android:contentDescription` o mediante programación de la siguiente manera:

```kt
loadingIndicator.contentDescription = contentDescription
```

Para los indicadores de carga contenidos, asegúrate de que el color del indicador y el color del contenedor tengan suficiente contraste (3:1).
