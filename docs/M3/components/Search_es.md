# Búsqueda (Search)

La [Búsqueda](https://m3.material.io/components/search/overview) es un método de navegación que permite a las personas encontrar información rápidamente en una aplicación. Los usuarios introducen una consulta en la barra de búsqueda o en el campo de texto de la vista de búsqueda y luego ven los resultados relacionados.

1.  Barra de búsqueda
2.  Vista de búsqueda

La **barra de búsqueda** es un campo de búsqueda persistente y prominente en la parte superior de la pantalla y la **vista de búsqueda** es un modal de pantalla completa que normalmente se abre al seleccionar un icono de búsqueda.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/search/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/search/package-summary)

## Anatomía

#### Barra de búsqueda
1.  Contenedor
2.  Botón de icono principal
3.  Texto de soporte
4.  Avatar o icono final (opcional)

#### Vista de búsqueda
1.  Contenedor
2.  Encabezado
3.  Botón de icono principal
4.  Texto de soporte
5.  Botón de icono final
6.  Texto de entrada
7.  Divisor

## M3 Expresivo

### Actualización de M3 Expresivo
Actualizaciones de `SearchBar`: Nuevo atributo de texto de búsqueda centrado, nuevo ancho máximo, nuevo atributo de color al elevarse con el scroll, y actualizaciones de padding e insets.

### Estilos de M3 Expresivo
La forma recomendada de mostrar una `SearchBar` es ahora dentro de un `AppBarLayout`.

## Propiedades Clave

(Tablas de atributos, estilos y atributos de tema para `SearchBar` y `SearchView`)

## Implementación en código

Antes de poder usar los componentes de Búsqueda de Material, necesitas añadir una dependencia a la librería. La Búsqueda de Material se introdujo en la versión `1.8.0`.

### Añadiendo la barra de búsqueda
El componente `SearchBar` extiende `Toolbar`, por lo que soporta un icono de navegación, elementos de menú y cualquier otra API de `Toolbar`.

### Añadiendo la vista de búsqueda
El componente `SearchView` proporciona una implementación de una vista de búsqueda a pantalla completa. Expone su `EditText` principal a través de un método `getEditText()`.

### Haciendo los componentes de búsqueda accesibles
Debes establecer una descripción de contenido en los componentes.

### Predictive back (Navegación hacia atrás predictiva)
El componente `SearchView` soporta automáticamente la navegación hacia atrás predictiva.

## Personalizando la barra de búsqueda

(Secciones sobre animaciones, modos de entrada, barra de estado translúcida, etc.)

### Comportamiento de desplazamiento (Scrolling)
La `SearchBar` se puede usar en modo fijo, de desaparición con el scroll, o de elevación con el scroll.

### Poniéndolo todo junto
(Ejemplo de código XML que muestra cómo usar `SearchBar` y `SearchView` dentro de un `CoordinatorLayout`)
