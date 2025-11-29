# Tarjetas (Cards)

Las [Tarjetas](https://m3.material.io/components/cards/overview) contienen contenido y acciones sobre un único tema. Hay tres variantes de tarjetas.

1.  Tarjeta elevada
2.  Tarjeta rellena
3.  Tarjeta contorneada

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/cards/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/card/package-summary)

## Anatomía

1.  Contenedor
2.  Titular
3.  Subtítulo
4.  Texto de soporte
5.  Imagen
6.  Botones

## Propiedades Clave

### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor por defecto
--- | --- | --- | ---
**Color** | `app:cardBackgroundColor` | `setCardBackgroundColor`, `getCardBackgroundColor` | `?attr/colorSurface` (contorneada), `?attr/colorSurfaceContainerHighest` (rellena), `?attr/colorSurfaceContainerLow` (elevada)
**Color de primer plano** | `app:cardForegroundColor` | `setCardForegroundColor`, `getCardForegroundColor` | Transparente
**Color del borde** | `app:strokeColor` | `setStrokeColor`, `getStrokeColor` | `?attr/colorOutline` (no marcada), `?attr/colorSecondary` (marcada)
**Ancho del borde** | `app:strokeWidth` | `setStrokeWidth`, `getStrokeWidth` | `1dp` (contorneada), `0dp` (elevada o rellena)
**Forma** | `app:shapeAppearance` | `setShapeAppearanceModel`, `getShapeAppearanceModel` | `?attr/shapeAppearanceCornerMedium`
**Elevación** | `app:cardElevation` | `setCardElevation`, `setCardMaxElevation` | `0dp` (contorneada o rellena), `1dp` (elevada)
**Color de la onda (ripple)** | `app:rippleColor` | `setRippleColor`, `getRippleColor` | `?attr/colorOnSurfaceVariant` al 20% de opacidad

**Nota:** Recomendamos que las tarjetas en móviles tengan márgenes de `8dp`.

**Nota:** Sin un `app:strokeColor`, la tarjeta no renderizará un borde, independientemente del valor de `app:strokeWidth`.

### Atributos del icono de marcado

Elemento | Atributo | Método(s) relacionado(s) | Valor por defecto
--- | --- | --- | ---
**Icono** | `checkedIcon` | `setCheckedIcon`, `getCheckedIcon` | `@drawable/ic_mtrl_checked_circle.xml`
**Color** | `checkedIconTint` | `setCheckedIconTint`, `getCheckedIconTint` | `?attr/colorOutline` (no marcada), `?attr/colorSecondary` (marcada)
**Marcable** | `android:checkable` | `setCheckable`, `isCheckable` | `false`
**Tamaño** | `checkedIconSize` | `setCheckedIconSize`, `getCheckedIconSize` | `24dp`
**Margen** | `checkedIconMargin` | `setCheckedIconMargin`, `getCheckedIconMargin` | `8dp`
**Gravedad** | `checkedIconGravity` | `setCheckedIconGravity`, `getCheckedIconGravity` | `TOP_END`

### Estados

Las tarjetas pueden tener los siguientes estados:

*   **Por defecto:** No marcada y no arrastrada.
*   **Marcada (`android:state_checked`):** `true` si la tarjeta está marcada.
*   **Arrastrada (`app:state_dragged`):** `true` cuando se está arrastrando una tarjeta.

### Estilos

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo por defecto** | `Widget.Material3.CardView.Outlined` | `?attr/materialCardViewStyle`
**Estilos adicionales** | `Widget.Material3.CardView.Elevated`, `Widget.Material3.CardView.Filled` | `?attr/materialCardViewOutlinedStyle`, `?attr/materialCardViewFilledStyle`, `?attr/materialCardViewElevatedStyle`

## Variantes de tarjetas

Hay tres tipos de tarjetas: Elevada, Rellena y Contorneada. Cada una proporciona la misma legibilidad y funcionalidad, por lo que el tipo que uses depende solo del estilo.

### Tarjeta elevada

Las tarjetas elevadas tienen una sombra, proporcionando más separación del fondo.

### Tarjeta rellena

Las tarjetas rellenas proporcionan una separación sutil del fondo. Esto tiene menos énfasis que las tarjetas elevadas o contorneadas.

### Tarjeta contorneada

Las tarjetas contorneadas tienen un límite visual alrededor del contenedor. Esto puede proporcionar un mayor énfasis que los otros tipos.

## Implementación en código

Antes de poder usar una tarjeta de Material, necesitas añadir una dependencia a la librería de componentes de Material para Android.

Las tarjetas soportan el [marcado](#haciendo-las-tarjetas-marcables) y el [arrastre](#haciendo-las-tarjetas-arrastrables), pero esos comportamientos no están implementados por defecto.

### Haciendo las tarjetas marcables

Cuando una tarjeta está marcada, mostrará un icono de marca y cambiará su color de primer plano. No hay un comportamiento por defecto para habilitar/deshabilitar el estado de marca. Se muestra un ejemplo de cómo hacerlo en respuesta a un clic largo.

### Haciendo las tarjetas arrastrables

Las tarjetas tienen un `app:state_dragged` con cambios en el primer plano y la elevación para transmitir movimiento. Recomendamos usar `ViewDragHelper` para establecer el estado de arrastre.

### Haciendo las tarjetas accesibles

El contenido dentro de una tarjeta debe seguir sus propias directrices de accesibilidad. Si tienes una tarjeta arrastrable, debes establecer un `AccessibilityDelegate` en ella.

## Personalizando tarjetas

### Tematizando tarjetas

Las tarjetas soportan la personalización de color, tipografía y forma.
