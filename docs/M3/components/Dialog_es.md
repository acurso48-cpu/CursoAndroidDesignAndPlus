# Diálogos (Dialogs)

Los [Diálogos](https://m3.material.io/components/dialogs/overview) informan a los usuarios sobre una tarea y pueden contener información crítica, requerir decisiones o involucrar múltiples tareas. Hay dos variantes de diálogos:

1.  Diálogo básico
2.  Diálogo de pantalla completa

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/dialogs/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/dialog/package-summary)

## Anatomía

#### Diálogos básicos
1.  Contenedor
2.  Icono (opcional)
3.  Titular
4.  Texto de soporte
5.  Divisor (opcional)
6.  Botón (texto de la etiqueta)
7.  Scrim (capa de oscurecimiento)

#### Diálogos de pantalla completa
1.  Contenedor
2.  Encabezado
3.  Icono (para cerrar)
4.  Encabezado
5.  Botón de texto
6.  Divisor (opcional)

## Propiedades Clave

(Tablas de atributos para contenedor, título, contenido, botones y scrim)

## Variantes de diálogos

### Diálogo básico
Los diálogos básicos interrumpen a los usuarios con información urgente, detalles o acciones. Los casos de uso comunes incluyen alertas, selección rápida y confirmación.

### Diálogo de pantalla completa
Los diálogos de pantalla completa llenan toda la pantalla, conteniendo acciones que requieren una serie de tareas para completarse. No hay una implementación específica de Material para un diálogo de pantalla completa, pero se puede implementar usando un `DialogFragment`.

## Implementación en código

Antes de poder usar los diálogos de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Ejemplo de diálogos
Los diálogos proporcionan avisos importantes en un flujo de usuario. Son intencionadamente interruptivos, por lo que deben usarse con moderación.

### Haciendo los diálogos accesibles
El contenido dentro de un diálogo debe seguir sus propias directrices de accesibilidad.

## Personalizando diálogos

### Tematizando diálogos
Los diálogos soportan la personalización de color, tipografía y forma.
