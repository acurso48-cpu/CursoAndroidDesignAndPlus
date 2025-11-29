# Interruptor (Switch)

Los [Interruptores](https://m3.material.io/components/switch/overview) activan o desactivan el estado de una única configuración.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

Los interruptores se usan mejor para ajustar configuraciones y otras opciones independientes. Realizan una selección binaria, como encendido y apagado o verdadero y falso. Los efectos de un interruptor deben comenzar inmediatamente, sin necesidad de guardar.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/switch/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/switchmaterial/package-summary)

## Anatomía

1.  Pista (Track)
2.  Control (Handle) (anteriormente "thumb")
3.  Icono

## Propiedades Clave

(Tablas de atributos para el interruptor, el control, el icono, la pista y la etiqueta de texto)

### Estados del interruptor

Los interruptores pueden estar encendidos o apagados. Tienen estados de habilitado, hover, enfocado y presionado.

## Implementación en código

Antes de poder usar los interruptores de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

**Nota:** El widget `MaterialSwitch` proporciona una implementación completa del componente interruptor de Material Design. Extiende de `SwitchCompat` de la librería de soporte, pero no del widget `Switch` del framework. Como tal, no se auto-infla y debe ser especificado explícitamente en los layouts.

### Añadiendo un interruptor

(Se muestra un ejemplo de cómo añadir `MaterialSwitch` a un layout y cómo escuchar sus cambios de estado en el código).

### Haciendo el interruptor accesible

Los interruptores soportan etiquetado de contenido para accesibilidad y son legibles por la mayoría de los lectores de pantalla.

## Personalizando el interruptor

### Tematizando el interruptor

El interruptor soporta la personalización de color y tipografía.
(Se proporcionan ejemplos de tematización).

<details><summary><h2>Interruptor (obsoleto)</h2></summary>
(Se incluye la documentación para la clase obsoleta `SwitchMaterial`)
</details>
