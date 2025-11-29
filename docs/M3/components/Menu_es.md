# Menús

Los [Menús](https://m3.material.io/components/menus/overview) muestran una lista de opciones en superficies temporales. Hay dos variantes de menús:

1.  Menú desplegable (Dropdown menu)
2.  Menú desplegable expuesto (Exposed dropdown menu)

Los menús permiten a los usuarios hacer una selección entre múltiples opciones. Aparecen cuando los usuarios interactúan con un botón, acción u otro control. Son menos prominentes y ocupan menos espacio que los controles de selección, como un conjunto de botones de radio.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/menus/overview)
*   [Referencia de la API](https://developer.android.com/reference/android/view/Menu)

## Anatomía

#### Menú desplegable
1.  Elemento de la lista
2.  Icono principal
3.  Icono final
4.  Texto final
5.  Contenedor
6.  Divisor

#### Menú desplegable expuesto
1.  Texto
2.  Contenedor
3.  Etiqueta
4.  Texto de selección/entrada
5.  Icono final

## Propiedades Clave

(Tablas de atributos y estilos para ambos tipos de menús)

## Variantes de menús

### Menús desplegables
Muestran una lista de opciones, activada por un icono, botón o acción. Su ubicación varía según el elemento que los abre.

*   **Menús de desbordamiento (Overflow menus):** Se muestran desde el icono "más".
*   **Menús contextuales:** Aparecen cuando se presiona un elemento durante un tiempo determinado.
*   **Menús emergentes (Popup menus):** Se muestran cuando se hace clic en un botón.
*   **Menús de ventana emergente de lista (List popup window menus):** Una alternativa a los menús emergentes.

### Menú desplegable expuesto
Muestran el elemento de menú actualmente seleccionado sobre una lista de opciones. Algunas variaciones pueden aceptar la entrada del usuario. Se implementa a través de `TextInputLayout`.

*   **Variación no editable:** Se deshabilita la entrada del usuario con `android:inputType="none"`.
*   **Establecer un valor por defecto:** Se puede establecer un valor preseleccionado con `setText()`.

## Implementación en código

Antes de poder usar los menús de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Ejemplos de menú
Se muestra un recurso de menú XML típico y un `TextInputLayout` para un menú desplegable expuesto.

### Haciendo los menús accesibles
Los menús son legibles por la mayoría de los lectores de pantalla. El texto se proporciona automáticamente a los servicios de accesibilidad.

## Personalizando menús

### Tematizando menús
Los menús soportan la personalización de color, tipografía y forma.
