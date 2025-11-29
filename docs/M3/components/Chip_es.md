# Chips

Los [Chips](https://material.io/components/chips) son elementos compactos que representan una entrada, un atributo o una acción. Los chips ayudan a las personas a introducir información, hacer selecciones, filtrar contenido o activar acciones. Hay cuatro variantes de chips:

1.  Chip de asistencia
2.  Chip de filtro
3.  Chip de entrada
4.  Chip de sugerencia

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/chips/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/chip/package-summary)

## Anatomía

<details><summary><h4>Asistencia</h4></summary>
1. Contenedor
2. Texto de la etiqueta
3. Icono principal
</details>
<details><summary><h4>Filtro</h4></summary>
1. Contenedor
2. Texto de la etiqueta
3. Icono principal
4. Icono final
</details>
<details><summary><h4>Entrada</h4></summary>
1. Contenedor
2. Texto de la etiqueta
3. Icono final
4. Icono principal
</details>
<details><summary><h4>Sugerencia</h4></summary>
1. Contenedor
2. Texto de la etiqueta
</details>

## Propiedades Clave

(Tablas de atributos para el contenedor, la miniatura, el texto, el icono de cierre y ChipGroup)

## Variantes de chips

Elige el tipo de chip según su propósito y autor.

### Chip de asistencia
Representan acciones inteligentes o automatizadas.

### Chip de filtro
Usan etiquetas o palabras descriptivas para filtrar contenido.

### Chip de entrada
Representan una pieza discreta de información en forma compacta, como una entidad o texto.

### Chip de sugerencia
Ayudan a acotar la intención de un usuario presentando sugerencias generadas dinámicamente.

## Implementación en código

Antes de poder usar los chips de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Añadiendo chips
Un `Chip` se puede añadir en un layout y sus cambios se pueden observar con listeners.

### Haciendo los chips accesibles
Los chips soportan etiquetado de contenido para accesibilidad. También se ha aumentado el área táctil por defecto y se puede personalizar.

### Agrupando chips con `ChipGroup`
Los chips se usan más comúnmente en grupos. Recomendamos usar `ChipGroup` porque está diseñado para manejar diseños de múltiples chips y patrones de comportamiento.

### Usando `ChipDrawable` de forma independiente
Un `ChipDrawable` independiente se puede usar en contextos que requieren un `Drawable`, como en campos de texto que "chipifican" contactos.

## Personalizando chips

### Tematizando chips
Los chips soportan la personalización de color, tipografía y forma.
