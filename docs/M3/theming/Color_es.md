# Temas de Color

El sistema de temas de color de Material 3 se puede usar para crear un esquema de color que refleje tu marca o estilo.

El sistema de temas de color de Material 3 utiliza un enfoque organizado para aplicar colores a tu interfaz de usuario. Los componentes de Material usan colores del tema y sus variaciones para estilizar fondos, texto y más.

## Documentación de Diseño y API

-   [Guías de Material Design: Color](https://m3.material.io/styles/color/overview/)

## Usando el Sistema de Temas de Color

Todos los componentes de Material 3 usan un estilo `Widget.Material3`, y estos estilos hacen referencia a atributos de color del tema de Material 3 (`Theme.Material3`). Es fácil personalizar esos atributos de color en toda tu aplicación simplemente sobrescribiéndolos en tu tema. Proporcionamos tres grupos de colores de acento (Primario, Secundario, Terciario), cada uno con 4-5 roles de color que puedes personalizar para representar el color de tu marca:

<!-- La siguiente tabla está autogenerada. No editar. -->
Rol de color | Atributo de Android | Línea base clara | Dinámico claro 31-33 | Dinámico claro 34+ | Línea base oscura | Dinámico oscuro 31-33 | Dinámico oscuro 34+
--- | --- | --- | --- | --- | --- | --- | ---
Primary | colorPrimary | primary40 | system_accent1_600 | system_primary_light | primary80 | system_accent1_200 | system_primary_dark
On Primary | colorOnPrimary | white | system_accent1_0 | system_on_primary_light | primary20 | system_accent1_800 | system_on_primary_dark
...
<!-- Fin de la tabla autogenerada. -->

Al cambiar estos atributos de color, puedes cambiar fácilmente los estilos de todos los componentes de Material que usan tu tema.

El sistema de temas de color de Material Design proporciona colores adicionales que no representan tu marca, pero definen tu UI y aseguran combinaciones de colores accesibles. Estos atributos de color adicionales son los siguientes:

<!-- La siguiente tabla está autogenerada. No editar. -->
Rol de color | Atributo de Android | Línea base clara | Dinámico claro 31-33 | Dinámico claro 34+ | Línea base oscura | Dinámico oscuro 31-33 | Dinámico oscuro 34+
--- | --- | --- | --- | --- | --- | --- | ---
Error | colorError | error40 | error40 | system_error_light | error80 | error80 | system_error_dark
On Error | colorOnError | white | white | system_on_error_light | error20 | error20 | system_on_error_dark
...
<!-- Fin de la tabla autogenerada. -->

## Usando Colores de Superficie

A partir de la versión 1.11.0-alpha02 y superiores, los componentes de Material3 usarán los siguientes roles de color de superficie tonal por defecto (en lugar de las superposiciones de elevación que implicaban mezclar los colores de Superficie y Primario):

-   `colorSurfaceContainer`
-   `colorSurfaceContainerLow`
-   `colorSurfaceContainerHigh`
-   `colorSurfaceContainerLowest`
-   `colorSurfaceContainerHighest`
-   `colorSurfaceDim`
-   `colorSurfaceBright`

**Nota:** Al resolver estos colores de superficie tonal, por favor usa `MaterialColors.getColor()` para evitar resolver colores inesperados.

Estos roles de color se usan como el color de contenedor/fondo por defecto en los componentes a continuación. Por favor, revisa las [directrices de colores de superficie](https://m3.material.io/styles/color/the-color-system/color-roles#0abbf8b7-61e1-49ee-9f97-4967beb1e4fe) para más detalles.

### Usando Superficie con Superposición de Elevación

**Nota:** La superficie con superposición de elevación ha sido reemplazada por colores de superficie tonal en los componentes de Material. Si usas los estilos de Material o los estilos por defecto en el tema de Material, el color del contenedor ya no responderá al color de superposición de elevación. La utilidad de superposición de elevación no ha sido eliminada de la implementación. Si la superficie con superposición de elevación es necesaria para fines de migración, por favor establece el color del contenedor correspondiente a `?attr/colorSurface`. El mantenimiento de la superposición de elevación ha sido descontinuado.

## Usando colores dinámicos

A partir de Android S, el framework proporciona la capacidad de soportar colores dinámicos en tu UI basados en el fondo de pantalla del usuario o la elección de color en el dispositivo.

Para ayudar en la aplicación de colores dinámicos, la librería de Material 3 proporciona 3 superposiciones de tema para ser usadas sobre los temas base de Material 3:

-   `ThemeOverlay.Material3.DynamicColors.Light`
-   `ThemeOverlay.Material3.DynamicColors.Dark`
-   `ThemeOverlay.Material3.DynamicColors.DayNight`

Para facilitar la implementación de soluciones de color dinámico, la librería de Material 3 proporciona una clase de ayuda: `com.google.android.material.color.DynamicColors`.

**Nota:** No importa qué enfoque sigas, tendrás que tener aplicados primero los temas base de M3 (por ejemplo, `Theme.Material3.DayNight.NoActionBar`) para que las superposiciones de tema de color dinámico funcionen.

## Colores Personalizados

Material 3 usa un tono púrpura para los colores de acento por defecto si los colores dinámicos no están disponibles. Si necesitas diferentes colores de marca en tu app, puedes querer definir colores personalizados para tu tema.

## Usando la Armonización de Colores

La armonización de colores resuelve el problema de "¿Cómo nos aseguramos de que cualquier color reservado particular (p. ej., los usados para semántica o marca) se vea bien junto al color generado dinámicamente por el usuario?"

## Utilidades de mapeo de roles de color

Los esquemas de M3 también incluyen roles para gran parte del significado semántico y otros usos convencionales del color. La clase `ColorRoles` está disponible para obtenerlos.

## Colores Dinámicos Basados en Contenido

El color basado en contenido describe la capacidad del sistema de color para generar y aplicar un esquema de color basado en el contenido dentro de la app (como la carátula de un álbum).

## Control de Contraste

El control de contraste de color permite a los usuarios ajustar los niveles de contraste de su UI en el sistema.
