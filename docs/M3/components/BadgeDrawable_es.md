<!--docs:
title: "Insignias"
layout: detail
section: components
excerpt: "Las insignias pueden contener información dinámica, como el número de solicitudes pendientes."
iconId: badge
path: /catalog/badging/
-->

# Insignias

Las [insignias](https://m3.material.io/components/badges/overview) muestran notificaciones,
recuentos o información de estado en los elementos de navegación y los iconos. Hay dos variantes de insignias.

<img src="assets/badge/small-badge-hero.png" alt="Insignia pequeña" height="250"/> | <img src="assets/badge/large-badge-hero.png" alt="Insignia grande" height="250"/>
--- | ---
1 | 2

1.  Insignia pequeña
2.  Insignia grande

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/badges/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/badge/package-summary)

## Anatomía

<img src="assets/badge/badges-anatomy.png" alt="Anatomía de insignias pequeñas y grandes" width="800"/>

1.  Insignia pequeña
2.  Contenedor de insignia grande
3.  Etiqueta de insignia grande

Más detalles sobre los elementos de la anatomía en las [directrices del componente](https://m3.material.io/components/badges/guidelines#07608fcc-43f7-47b3-b5cb-ee617753b877).

## Propiedades clave

### Atributos de `BadgeDrawable`

| Característica | Atributos relevantes |
|---|---|
| Color | `app:backgroundColor` <br> `app:badgeTextColor` |
| Ancho | `app:badgeWidth` <br> `app:badgeWithTextWidth` |
| Altura | `app:badgeHeight` <br> `app:badgeWithTextHeight` |
| Forma | `app:badgeShapeAppearance` <br> `app:badgeShapeAppearanceOverlay` <br> `app:badgeWithTextShapeAppearance` <br> `app:badgeWithTextShapeAppearanceOverlay` |
| Etiqueta | `app:badgeText` (para texto) <br> `app:number` (para números) |
| Longitud de la etiqueta | `app:maxCharacterCount` (para todo el texto) <br> `app:maxNumber` (solo para números) |
| Color del texto de la etiqueta | `app:badgeTextColor` |
| Apariencia del texto de la etiqueta | `app:badgeTextAppearance` |
| Gravedad de la insignia | `app:badgeGravity` |
| Alineación del desplazamiento | `app:offsetAlignmentMode` |
| Relleno horizontal | `app:badgeWidePadding` |
| Relleno vertical | `app:badgeVerticalPadding` |
| Desplazamiento vertical de la fuente grande| `app:largeFontVerticalOffsetAdjustment` |
| Borde fijo de la insignia | `app:badgeFixedEdge` |

**Nota:** Si se especifican tanto `app:badgeText` como `app:number`, la etiqueta de la insignia será `app:badgeText`.

## Implementación de código

Antes de poder usar las insignias de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, ve a la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** Este componente todavía está en desarrollo y es posible que no admita toda la gama de personalización que generalmente admiten los componentes de Material Android, por ejemplo, los atributos temáticos.

Un `BadgeDrawable` representa información dinámica, como el número de solicitudes pendientes en una [`BottomNavigationView`](BottomNavigation.md) o un [`TabLayout`](Tabs.md).

### Agregar insignias

![Dos variantes de insignias](assets/badge/badges-hero.png)

1.  Insignia pequeña en un elemento de navegación
2.  Insignia grande en un elemento de navegación
3.  Insignia grande con caracteres máximos en un elemento de navegación

API y código fuente:

*   `BadgeDrawable`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/badge/BadgeDrawable)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/badge/BadgeDrawable.java)
*   `BadgeUtils`
    *   [Definición de la clase](https://developer.android.com/reference/com/google/android/material/badge/BadgeUtils)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/badge/BadgeUtils.java)

Crea una instancia de `BadgeDrawable` llamando a `create(Context)` o `createFromAttributes(Context, AttributeSet, int, int)`.

El enfoque utilizado para agregar y mostrar un `BadgeDrawable` encima de su vista de anclaje depende del nivel de la API:

En la API 18+ (API compatibles con [ViewOverlay](https://developer.android.com/reference/android/view/ViewOverlay))

1.  Agrega `BadgeDrawable` como una [ViewOverlay](https://developer.android.com/reference/android/view/ViewOverlay) a la vista de anclaje deseada.
2.  Actualiza las coordenadas de `BadgeDrawable` (centro y límites) en función de su vista de anclaje usando `#updateBadgeCoordinates(View)`.

Ambos pasos se han encapsulado en un método de utilidad:

```java
BadgeUtils.attachBadgeDrawable(badgeDrawable, anchor);
```

En Pre API-18

1.  Establece `BadgeDrawable` como el primer plano del antecesor `FrameLayout` de la vista de anclaje.
2.  Actualiza las coordenadas de `BadgeDrawable` (centro y límites) en función de su vista de anclaje, en relación con el espacio de coordenadas de su antecesor `FrameLayout`.

Opción 1: `BadgeDrawable` creará y envolverá dinámicamente la vista de anclaje en un `FrameLayout`, luego insertará el `FrameLayout` en la posición original de la vista de anclaje en la jerarquía de vistas. La misma sintaxis que en la API 18+

```java
BadgeUtils.attachBadgeDrawable(badgeDrawable, anchor);
```

Opción 2: Si no deseas que `BadgeDrawable` modifique tu jerarquía de vistas, puedes especificar un `FrameLayout` para mostrar la insignia en su lugar.

```java
BadgeUtils.attachBadgeDrawable(badgeDrawable, anchor, anchorFrameLayoutParent);
```

### Modos de gravedad de `BadgeDrawable`

`BadgeDrawable` ofrece dos modos de gravedad para controlar cómo se alinea la insignia con su vista de anclaje. De forma predeterminada, (`TOP_END`) la insignia se alinea con los bordes superior y final del anclaje (con algunos desplazamientos). Alternativamente, puedes usar `TOP_START` para alinear la insignia con los bordes superior e inicial del anclaje. Ten en cuenta que `BOTTOM_START` y `BOTTOM_END` están obsoletos y no se recomienda su uso.

### Ubicación y desplazamientos de `BadgeDrawable`

De forma predeterminada, `BadgeDrawable` está alineado con los bordes superior y final de su vista de anclaje (con algunos desplazamientos si `offsetAlignmentMode` es `legacy`). Llama a `setBadgeGravity(int)` para cambiarlo a uno de los otros modos admitidos. Para ajustar los desplazamientos de la insignia en relación con el centro del anclaje, usa `setHorizontalOffset(int)` o `setVerticalOffset(int)`

Independientemente de los desplazamientos, las insignias se mueven automáticamente dentro de los límites de su primera vista antecesora que no recorta a sus hijos, para garantizar que la insignia no se recorte si hay suficiente espacio.

### Compatibilidad con TalkBack

`BadgeDrawable` proporciona un getter para su descripción de contenido, que se basa en el número o texto mostrado (si lo hay). Para especificar la descripción del contenido, al desarrollador se le proporcionan los siguientes métodos:
`setContentDescriptionForText(CharSequence)`
`setContentDescriptionQuantityStringsResource(@PluralsRes int)`
`setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int)`
`setContentDescriptionNumberless(CharSequence)`
