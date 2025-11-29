<!--docs:
title: "Retroceso predictivo"
layout: detail
section: foundations
excerpt: "Retroceso predictivo"
iconId: predictive_back
path: /foundations/predictive_back/
-->

# Retroceso predictivo

El retroceso predictivo es un patrón de navegación vinculado a la navegación por gestos que muestra al usuario un vistazo de a dónde lo llevará el deslizamiento hacia atrás. Antes de completar un deslizamiento, el usuario puede decidir continuar a la vista anterior o permanecer en la vista actual.

En Android 13 (T / API nivel 33), el sistema operativo introdujo la compatibilidad con el retroceso predictivo a la pantalla de inicio, que muestra al usuario una vista previa de la pantalla de inicio al deslizar hacia atrás para salir de una aplicación.

Con Android 14 (U / API nivel 34), el sistema operativo agrega compatibilidad con el retroceso predictivo dentro de la aplicación, que las aplicaciones pueden aprovechar para mostrar al usuario los destinos anteriores al deslizar hacia atrás dentro de la propia aplicación.

## Diseño y documentación de la API

-   [Directrices de Material Design: Retroceso predictivo](https://m3.material.io/foundations/interaction/gestures#22462fb2-fbe8-4e0c-b3e7-9278bd18ea0d)
-   [Directrices de diseño de Android](https://developer.android.com/design/ui/mobile/guides/patterns/predictive-back)
-   [Guía del desarrollador de retroceso predictivo de Framework y AndroidX](https://developer.android.com/guide/navigation/predictive-back-gesture)
-   [Guía del desarrollador de retroceso predictivo de Android 14](https://developer.android.com/about/versions/14/features/predictive-back)

## Uso

Para optar por el retroceso predictivo, las aplicaciones deben:

1. Migrar de las API de manejo de retroceso heredadas (`Activity#onBackPressed`, `KeyEvent.KEYCODE_BACK`, etc.) a las API de "devolución de llamada de retroceso" introducidas más recientemente (`OnBackAnimationCallback`, `OnBackPressedCallback`, etc.). Esto implica cambiar la bandera del manifiesto `android:enableOnBackInvokedCallback` a `true` y registrar devoluciones de llamada para manejar la pulsación de retroceso en Android T y superior. Se pueden encontrar más detalles sobre esta migración general de retroceso en la [Guía del desarrollador de retroceso predictivo de Framework y AndroidX](https://developer.android.com/guide/navigation/predictive-back-gesture).

2. Actualizar a la versión de la biblioteca MDC-Android **1.10.0** o superior.

Una vez completados estos pasos, obtendrás la mayoría de las animaciones de retroceso predictivo dentro de los componentes de Material de forma gratuita en los dispositivos Android U. Consulta la siguiente sección para comprender qué componentes admiten el retroceso predictivo y para conocer las consideraciones especiales para cada componente.

### Componentes de Material de retroceso predictivo

Los siguientes componentes de Material admiten el comportamiento y las animaciones de retroceso predictivo:

- [Barra de búsqueda](../components/Search.md#predictive-back) (automáticamente para `SearchView` configurado con `SearchBar`)
- [Hoja inferior](../components/BottomSheet.md#predictive-back) (automáticamente para modal, el estándar requiere integración)
- [Hoja lateral](../components/SideSheet.md#predictive-back) (automáticamente para modal, el estándar y el coplanar requieren integración)
- [Cajón de navegación](../components/NavigationDrawer.md#predictive-back) (automáticamente para `NavigationView` dentro de `DrawerLayout`)

**Nota:** Los componentes de Material anteriores solo manejan automáticamente el retroceso en el nivel de API 33+ y cuando la bandera del manifiesto `android:enableOnBackInvokedCallback` está establecida en `true`. Esto es para ser coherente con el comportamiento de otras vistas de AndroidX y Framework, así como para evitar tener prioridad sobre cualquier comportamiento de manejo de retroceso preexistente que ya haya sido implementado por las aplicaciones.

Se planea compatibilidad futura con el retroceso predictivo para los siguientes componentes de Material:

- Barra de navegación / Vista de navegación inferior
- Riel de navegación

## Charlas

-   [Novedades de Android (Google I/O 2023)](https://youtu.be/qXhjN66O7Bk?t=1193)
-   [Novedades de Material Design (Google I/O 2023)](https://youtu.be/vnDhq8W98O4?t=156)
-   [Construyendo para el futuro de Android (Google I/O 2023)](https://www.youtube.com/watch?v=WMMPXayjP8g&t=333s)

## Publicaciones de blog

-   [Segunda beta de Android 14](https://android-developers.googleblog.com/2023/05/android-14-beta-2.html)
-   [Google I/O 2023: Novedades de Jetpack](https://android-developers.googleblog.com/2023/05/whats-new-in-jetpack-io-2023.html)
