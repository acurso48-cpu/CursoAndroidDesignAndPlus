<!--docs:
title: "Barras de herramientas acopladas y flotantes"
layout: detail
section: components
excerpt: "Las barras de herramientas acopladas y flotantes muestran las acciones de uso frecuente relevantes para la página actual"
iconId: docked_and_floating_toolbars
path: /catalog/docked-and-floating-toolbars/
-->

# Barras de herramientas acopladas y flotantes

Las barras de herramientas acopladas y flotantes muestran las acciones de uso frecuente relevantes para la página actual.

![Barras de herramientas acopladas y flotantes](assets/dockedandfloatingtoolbars/docked-and-floating-toolbar-types.png)

1.  [Barra de herramientas acoplada](DockedToolbar.md): Abarca todo el ancho de la ventana. Es mejor usarla para acciones globales que permanecen iguales en varias páginas.
2.  [Barra de herramientas flotante](FloatingToolbar.md): Flota sobre el contenido del cuerpo. Es mejor usarla para acciones contextuales relevantes para el contenido del cuerpo o la página específica.

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/toolbars/overview)

## Anatomía

![Diagrama de anatomía de las barras de herramientas acopladas y flotantes](assets/dockedandfloatingtoolbars/docked-and-floating-toolbar-anatomy.png)

1.  Contenedor
2.  Elementos

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/toolbars/guidelines#d6b7bcb1-295d-41e6-a051-37f12e1c96ab).

## Actualización de M3 Expressive

Antes de poder usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/dockedandfloatingtoolbars/floating-and-docked-toolbar-expressive.png" alt="La barra de herramientas flotante y acoplada" width="700">

1.  Flotante, esquema de color vibrante y combinado con FAB
2.  Acoplado con acción principal incrustada en lugar de FAB

La **barra de aplicaciones inferior** está siendo obsoleta y debe reemplazarse por la **barra de herramientas acoplada**, que funciona de manera similar, pero es más corta y tiene más flexibilidad. La **barra de herramientas flotante** se creó para una mayor versatilidad, una mayor cantidad de acciones y una mayor variedad en su ubicación. un icono insertado.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

**Tipos y nombres**

*   Se agregó la **[barra de herramientas acoplada](DockedToolbar.md)** para reemplazar la **[barra de aplicaciones inferior](BottomAppBar.md)**

    *   Tamaño: Altura más corta
    *   Color: Estándar o vibrante
    *   Flexibilidad: Más opciones de diseño y elementos

*   Se agregó la **[barra de herramientas flotante](FloatingToolbar.md)** con los siguientes atributos:

    *   Diseño: Horizontal o vertical
    *   Color: Estándar o vibrante
    *   Flexibilidad: Puede contener muchos elementos y componentes. Se puede combinar con FAB.

*   La **barra de aplicaciones inferior** todavía está disponible, pero no se recomienda
