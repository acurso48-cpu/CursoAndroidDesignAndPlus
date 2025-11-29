# Cómo cambiar el nombre de un módulo (ej: "app" a "app2")

Cambiar el nombre de un módulo en un proyecto de Android Studio (por ejemplo, renombrar `app` a `app2`) es una tarea sencilla y segura si se utiliza la herramienta de refactorización integrada en el IDE.

## Método Recomendado: Usar "Refactor > Rename" en Android Studio

Esta es la forma más segura y rápida, ya que Android Studio se encarga de actualizar todas las referencias necesarias automáticamente.

1.  **Abre la vista de Proyecto**: En la ventana de herramientas de la izquierda, selecciona la vista **Project**.

2.  **Selecciona el módulo**: Haz clic derecho sobre el directorio del módulo que quieres renombrar (en este caso, `app`).

3.  **Elige la opción para renombrar**:
    *   En el menú contextual, ve a **Refactor > Rename**.
    *   Aparecerá un diálogo. Elige la opción **Rename module and directory**.

4.  **Introduce el nuevo nombre**:
    *   Escribe el nuevo nombre para tu módulo (por ejemplo, `app2`).
    *   Presiona **OK**.

5.  **Sincroniza con Gradle**: Android Studio realizará los cambios y te pedirá que sincronices el proyecto. Haz clic en **"Sync Now"** en la barra que aparecerá.

Con estos pasos, el IDE renombrará la carpeta del módulo y actualizará automáticamente el fichero `settings.gradle.kts` (o `settings.gradle`), asegurando que todo el proyecto siga funcionando correctamente.

## Solución de Problemas Comunes: La configuración de ejecución no se actualiza

A veces, después de renombrar el módulo, la configuración de ejecución en la barra de herramientas de Android Studio (el desplegable que usas para correr la app) sigue mostrando el nombre antiguo (ej. `app`).

Esto ocurre porque las configuraciones de ejecución se guardan de forma independiente y no siempre se actualizan con la refactorización.

### Cómo solucionarlo:

1.  **Edita las configuraciones**: Haz clic en el desplegable que muestra el nombre antiguo y selecciona **"Edit Configurations..."**.
2.  **Selecciona la configuración**: En la ventana que se abre, elige la configuración que quieres arreglar (normalmente se llamará como el módulo antiguo, `app`).
3.  **Cambia el módulo**: A la derecha, busca el campo desplegable **"Module"**. Estará seleccionado el módulo antiguo (probablemente en rojo). Despliégalo y selecciona el módulo con su nuevo nombre (ej. `MaterialComponents.components`).
4.  **Renombra la configuración (Recomendado)**: Para evitar confusiones, cambia el campo **"Name"** en la parte superior de la ventana al nuevo nombre del módulo (ej. `components`).
5.  **Aplica los cambios**: Haz clic en **Apply** y luego en **OK**.

Después de esto, el desplegable mostrará el nombre correcto y podrás ejecutar tu proyecto normalmente.

---

## Método Alternativo: Manual (No recomendado)

Este método es útil solo si no puedes acceder a Android Studio o si la refactorización automática falla por alguna razón. Implica más pasos y un mayor riesgo de cometer errores.

### Paso 1: Cierra Android Studio
Es una buena práctica cerrar el IDE para prevenir problemas de sincronización.

### Paso 2: Renombra la carpeta
1.  Usando tu explorador de archivos, ve a la raíz de tu proyecto (`D:/CursoAndroid25/MaterialComponents/`).
2.  Cambia el nombre de la carpeta `app` a `app2`.

### Paso 3: Actualiza el fichero `settings.gradle.kts`
1.  Abre el archivo `settings.gradle.kts` (o `settings.gradle`) que se encuentra en la raíz del proyecto.
2.  Modifica la línea `include(':app')` para que refleje el nuevo nombre: `include(':app2')`.

### Paso 4: Vuelve a abrir el proyecto y sincroniza
1.  Abre Android Studio de nuevo.
2.  Sincroniza el proyecto con los archivos de Gradle (`File > Sync Project with Gradle Files` o el botón "Sync Now").

Aunque este método funciona, el uso de la herramienta **Refactor** del IDE es siempre preferible para evitar inconsistencias en el proyecto.
