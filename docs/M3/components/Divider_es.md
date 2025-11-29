# Divisores (Dividers)

Los [Divisores](https://m3.material.io/components/divider/overview) son líneas delgadas que agrupan el contenido en listas u otros contenedores. Son una forma de agrupar visualmente componentes y crear jerarquía.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/divider/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/divider/package-summary)

## Anatomía

1.  Divisor

## Propiedades Clave

(Tabla de atributos y estilos)

## Tipos de divisor

Hay dos tipos de divisores:

*   De ancho completo
*   Con sangría (Inset)

### Divisor de ancho completo
Los divisores de ancho completo separan secciones más grandes de contenido no relacionado.

### Divisor con sangría
Los divisores con sangría separan contenido relacionado dentro de una sección.

## Implementación en código

Antes de poder usar los divisores de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Añadiendo `MaterialDivider`
El `MaterialDivider` es una vista que se puede usar en layouts para separar contenido.

### Añadiendo un divisor pesado (heavy)
Los divisores pesados se usan para indicar una ruptura visual entre secciones principales.

### Añadiendo `MaterialDividerItemDecoration`
El `MaterialDividerItemDecoration` es un `RecyclerView.ItemDecoration` que se puede usar como un divisor entre los elementos de un `LinearLayoutManager`.

### Haciendo los divisores accesibles
El divisor es un elemento decorativo y no requiere precauciones especiales de accesibilidad.

## Personalizando divisores

### Tematizando divisores
Los divisores soportan la personalización de color.
