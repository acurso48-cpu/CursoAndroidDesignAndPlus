# Deslizadores (Sliders)

Los [Deslizadores](https://m3.material.io/components/sliders/) permiten a los usuarios hacer selecciones de un rango de valores. Hay tres variantes de deslizadores.

1.  Estándar
2.  Centrado
3.  De rango

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/sliders/overview/)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/slider/package-summary)

## Anatomía

1.  Indicador de valor (opcional)
2.  Indicadores de parada (opcional)
3.  Pista activa
4.  Control (Handle)
5.  Pista inactiva
6.  Icono insertado (opcional)

## M3 Expresivo

### Actualización de M3 Expresivo
El deslizador incluye configuraciones expresivas para orientación, tamaños de forma y un icono insertado.

## Propiedades Clave

(Tablas de atributos para la pista, el control (thumb), la etiqueta de valor y las marcas de paso (tick marks))

## Variantes de deslizadores

### Deslizador estándar
Seleccionan un valor de un rango de valores.

### Deslizador centrado
Seleccionan un valor de un rango de valores positivos y negativos.

### Deslizador de rango
Un deslizador con dos controles se llama deslizador de rango. Seleccionan dos valores en un deslizador para crear un rango.

## Implementación en código

Antes de poder usar los deslizadores de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Haciendo los deslizadores accesibles
Los deslizadores soportan el establecimiento de descriptores de contenido para su uso con lectores de pantalla.

### Estableciendo un `LabelFormatter`
Usando un `LabelFormatter` puedes mostrar el valor seleccionado usando letras para indicar magnitud (ej: 1.5K, 3M).

## Personalizando deslizadores

### Tematizando deslizadores
Los deslizadores soportan la personalización de color y tipografía.
