<!--docs:
title: "Menús de botones de acción flotantes"
layout: detail
section: components
excerpt:  "Un menú FAB se abre desde un FAB para mostrar varias acciones relacionadas."
iconId: button
path: /catalog/floating-action-button-menu/
-->

# Menú de botón de acción flotante (FAB)

Un [menú de botón de acción flotante (FAB)](https://m3.material.io/components/fab-menu/overview) se abre desde un FAB para mostrar de 2 a 6 acciones relacionadas que flotan en la pantalla. Hay un tamaño de menú de FAB para todos los tamaños de FAB.

![Un tipo de menú de FAB.](assets/fabmenu/fabmenu-type.png)

El menú Fab no se usa con FAB extendidos y está disponible en conjuntos de colores primarios, secundarios y terciarios.

![Un menú de FAB en una pantalla.](assets/fabmenu/fabmenu-hero.png)

Usa el menú de FAB para mostrar varias acciones relacionadas en un estilo prominente y expresivo. Siempre debe aparecer en el mismo lugar que el FAB que lo abrió.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/fab-menu/overview)
*   [Referencia de la API](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary?hl=en#FloatingActionButtonMenu\(kotlin.Boolean,kotlin.Function0,androidx.compose.ui.Modifier,androidx.compose.ui.Alignment.Horizontal,kotlin.Function1\))

## Anatomía

![Diagrama de anatomía del menú de FAB](assets/fabmenu/fabmenu-anatomy.png)

1.  Botón de cierre
2.  Elemento de menú

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/fab-menu/guidelines#eee40b5b-ce91-458e-9005-19db241f074c).

## M3 Expressive

### Actualización de M3 Expressive

El menú de FAB agrega más opciones al FAB. Debería reemplazar el dial de velocidad y cualquier uso de FAB pequeños apilados.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

<img src="assets/fabmenu/fabmenu-expressive.png" alt="Menú de FAB de todos los tamaños expresivo" width="700"/>
El menú de FAB usa colores contrastantes y elementos grandes para centrar la atención. Se puede abrir desde cualquier tamaño de FAB.

**Nuevo componente agregado al catálogo:**

*   Un tamaño de menú que se combina con cualquier FAB
*   Reemplaza cualquier uso de FAB pequeños apilados

**Color:**

*   Colores de botón de cierre y elementos contrastantes
*   Admite color dinámico
*   Compatible con cualquier estilo de color de FAB

## Implementación de código (a través de la interoperabilidad de Compose)

El componente de menú de FAB actualmente no está disponible como un componente nativo de **Vistas**. Este documento muestra cómo usar el componente de menú de FAB de **Compose** a través de la interoperabilidad de Vistas <-> Compose.

API y código fuente de Compose:

*   `FloatingActionButtonMenu`
    *   [Documentación de la API](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary?hl=en#FloatingActionButtonMenu\(kotlin.Boolean,kotlin.Function0,androidx.compose.ui.Modifier,androidx.compose.ui.Alignment.Horizontal,kotlin.Function1\))
    *   [Código fuente](https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/FloatingActionButtonMenu.kt)
    *   [Código de muestra](https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/samples/src/main/java/androidx/compose/material3/samples/FloatingActionButtonMenuSamples.kt)

Primero, sigue la guía [Comenzar con Jetpack Compose](https://developer.android.com/develop/ui/compose/documentation) para configurar tu aplicación con Compose, si aún no lo está.

Luego, para usar el componente `FloatingActionButtonMenu` de Compose, asegúrate de agregar una dependencia a la biblioteca [Compose Material 3](https://developer.android.com/jetpack/androidx/releases/compose-material3) a tu aplicación.

Finalmente, agrega una `ComposeView` a tu aplicación siguiendo la guía de interoperabilidad [Uso de Compose en Vistas](https://developer.android.com/develop/ui/compose/migrate/interoperability-apis/compose-in-views) y usa el `FloatingActionButtonMenu` de Compose dentro de tu `ComposeView`, consultando la [documentación de la API](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary?hl=en#FloatingActionButtonMenu\(kotlin.Boolean,kotlin.Function0,androidx.compose.ui.Modifier,androidx.compose.ui.Alignment.Horizontal,kotlin.Function1\)) y el [código de muestra](https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material3/material3/samples/src/main/java/androidx/compose/material3/samples/FloatingActionButtonMenuSamples.kt).

Para una demostración funcional del uso del menú de FAB de Compose en una aplicación de Vistas a través de la interoperabilidad, echa un vistazo a [FabMenuDemoFragment.kt](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/fab/FabMenuDemoFragment.kt) en la aplicación del Catálogo de Vistas de Material Android. Esta demostración también muestra cómo manejar los esquemas de color claro, oscuro y dinámico para garantizar que el `FloatingActionButtonMenu` de Compose se vea correctamente dentro de la aplicación de Vistas.

**Nota:** Para tener una experiencia visual coherente entre el menú de FAB de Compose y tu aplicación, asegúrate de configurar el `MaterialTheme` o `MaterialExpressiveTheme` en tu `ComposeView` para que coincida con la tematización de tu aplicación de Vistas.
