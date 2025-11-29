# Carruseles (Carousels)

Los [Carruseles](https://m3.material.io/components/carousel/overview) contienen una colección de elementos que pueden entrar o salir de la vista.

Los elementos del carrusel enfatizan lo visual, pero también pueden contener texto breve que se adapta al tamaño del elemento.

Hay cuatro diseños de carrusel:

*   Navegación múltiple (Multi-browse)
*   No contenido (Uncontained)
*   Héroe (Hero)
*   Pantalla completa

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/carousel/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/carousel/package-summary)

## Anatomía

(Secciones de anatomía para cada tipo de carrusel)

## Propiedades Clave

(Tabla de atributos de orientación y alineación)

## Diseños de carrusel

### Navegación múltiple (`MultiBrowseCarouselStrategy`)
Una estrategia de navegación múltiple permite una navegación rápida de muchos elementos pequeños. Es la estrategia por defecto.

### No contenido (`UncontainedCarouselStrategy`)
Una estrategia no contenida ajusta tantos elementos como sea posible en el carrusel sin alterar el tamaño del elemento.

### Héroe (`HeroCarouselStrategy`)
Una estrategia de héroe resalta contenido grande, como películas, para una navegación y selección más consideradas.

### Pantalla completa (`FullScreenCarouselStrategy`)
Una estrategia de pantalla completa muestra un elemento a la vez que ocupa todo el espacio del carrusel.

## Implementación en código

Antes de poder usar los carruseles de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Añadiendo un carrusel
El carrusel se construye sobre `RecyclerView`. Para convertir una lista horizontal en un carrusel, envuelve el diseño del ítem de tu `RecyclerView` en un `MaskableFrameLayout` y establece el `layoutManager` en `CarouselLayoutManager`.

## Personalizando el carrusel

### Estableciendo el tamaño y la forma del elemento
La apariencia se personaliza principalmente a través del tamaño del `RecyclerView` y el `MaskableFrameLayout`, y el atributo `shapeAppearance` de este último.

### Reaccionando a los cambios en el tamaño de la máscara
Puedes escuchar los cambios en el tamaño de la máscara con un `onMaskChangedListener`.

### Controlando la alineación focal
Puedes controlar la alineación de los elementos focales (grandes) con el atributo `app:carousel_alignment`.
