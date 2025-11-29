# Snackbar

Los [Snackbars](https://m3.material.io/components/snackbar/overview) proporcionan mensajes breves sobre los procesos de la aplicación en la parte inferior de la pantalla.

Los Snackbars informan a los usuarios de un proceso que una aplicación ha realizado o realizará. Aparecen temporalmente y no requieren la entrada del usuario para desaparecer.

Los Snackbars también pueden ofrecer la posibilidad de realizar una acción, como deshacer o reintentar.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/snackbar/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/snackbar/package-summary)

## Anatomía

1.  Contenedor
2.  Texto de soporte
3.  Acción (opcional)
4.  Botón de cerrar (opcional)

## Propiedades Clave

(Tablas de atributos para la etiqueta de texto, el contenedor y la acción)

## Implementación en código

Antes de poder usar los snackbars de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Añadiendo un snackbar
La clase `Snackbar` proporciona métodos estáticos `make` para producir un snackbar. Las duraciones disponibles son `LENGTH_INDEFINITE`, `LENGTH_LONG` y `LENGTH_SHORT`.

**Nota:** Los Snackbars funcionan mejor si se muestran dentro de un `CoordinatorLayout`.

### Haciendo el snackbar accesible
Los Snackbars soportan etiquetado de contenido para accesibilidad.

### Mostrando un snackbar
Para mostrarlo, usa el método `show`. Solo se mostrará un snackbar a la vez.

### Anclando un snackbar
Puedes usar el método `setAnchorView` para hacer que un `Snackbar` aparezca encima de una vista específica.

### Añadiendo una acción
Para añadir una acción, usa el método `setAction`.

## Personalizando el snackbar

### Tematizando el snackbar
Los Snackbars soportan la personalización de color y tipografía.
