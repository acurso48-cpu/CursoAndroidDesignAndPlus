# Guía Definitiva: Unidades y Recursos para un Diseño Adaptativo y Escalable

## 1. La Unidad Fundamental para Layouts: `dp`

Antes de nada, es crucial entender la unidad que hace posible la adaptabilidad: el `dp` (Density-Independent Pixel).

### El Problema: Píxeles (`px`) no son fiables

Imagina que defines un botón con `android:layout_width="150px"`.
*   **En un dispositivo antiguo (baja densidad, ~160dpi):** Los píxeles son grandes. Tu botón se verá de un tamaño razonable.
*   **En un dispositivo moderno (alta densidad, ~480dpi):** Los píxeles son diminutos. Tu mismo botón se verá **físicamente mucho más pequeño**.

### La Solución: `dp` (Píxeles Independientes de la Densidad)

El `dp` es una unidad abstracta que asegura que un elemento tenga un **tamaño físico consistente** en cualquier pantalla.

**La regla base es:** `1 dp` equivale a `1 px` en una pantalla de `160 dpi` (densidad `mdpi`).

Android convierte tus `dp` a `px` en tiempo de ejecución. **Veamos un ejemplo con un botón de `100dp`:**

*   **Dispositivo 1: Pantalla `mdpi` (160 dpi)**
    *   Android usa la fórmula: `100dp * (160/160)` = **100 píxeles**.

*   **Dispositivo 2: Pantalla `xhdpi` (320 dpi)**
    *   Android calcula: `100dp * (320/160)` = **200 píxeles**.

*   **Dispositivo 3: Pantalla `xxhdpi` (480 dpi)**
    *   Android calcula: `100dp * (480/160)` = **300 píxeles**.

**Resultado:** Aunque el número de píxeles cambia, el botón ocupa el **mismo espacio físico** en las tres pantallas.

> **Regla de Oro:** Usa siempre `dp` para definir el tamaño de vistas, márgenes, padding y cualquier dimensión que no sea texto.

## 2. La Unidad Fundamental para Texto: `sp`

El `sp` (Scale-Independent Pixel) es la unidad **exclusiva para el tamaño del texto**. Se ajusta a la densidad como el `dp`, pero además **respeta la configuración de tamaño de fuente del usuario** en los ajustes de accesibilidad.

### El Ejemplo de la Accesibilidad

Imagina un usuario que aumenta el tamaño de la fuente en su teléfono.
*   Si tu texto usa `android:textSize="16dp"`, **NO cambiará**, creando un problema de accesibilidad.
*   Si tu texto usa `android:textSize="16sp"`, **SÍ se hará más grande**, adaptándose a la necesidad del usuario.

### ¿Cómo funciona?

La fórmula del `sp` añade el factor de escala del usuario:
`px = sp * (densidad/160) * factor_de_escala_del_usuario`

> **Regla de Oro:** Usa siempre `sp`, y únicamente `sp`, para todos los tamaños de texto (`android:textSize`).

## 3. Entendiendo los Tamaños de Pantalla (Breakpoints)

La estrategia moderna se basa en agrupar el espacio en **"Window Size Classes"**.

*   **Compact (0-599dp):** Teléfonos en vertical. Layouts de una columna.
*   **Medium (600-839dp):** Tablets en vertical o móviles grandes en horizontal. Ideal para dos paneles.
*   **Expanded (840dp+):** Tablets en horizontal o plegables abiertos. Para layouts complejos de múltiples paneles.

Usa estas clases como guía para aplicar los calificadores `w<N>dp` y `sw<N>dp`.

## 4. Calificadores de Recursos (Resource Qualifiers)

Son sufijos en las carpetas de `res` para que Android elija el recurso correcto.

*   **`sw<N>dp` (Smallest Width):** Basado en el lado más corto. Ideal para distinguir entre teléfono y tablet (`layout-sw600dp`).
*   **`w<N>dp` (Available Width):** Basado en el ancho actual. Ideal para aprovechar el espacio horizontal (`layout-w720dp`).
*   **`land` / `port`:** Para orientación.
*   **Combinados:** `layout-sw600dp-land` (para tablets en horizontal).

## 5. Estructura de `res` para una App en Crecimiento

### a) Nomenclatura Consistente

*   **Layouts:** `fragment_user_profile.xml`, `item_product_list.xml`
*   **IDs:** `profile_image_avatar`, `profile_button_save`
*   **Strings:** `profile_title`, `login_error_message`
*   **Drawables:** `ic_add_circle.xml`, `bg_button_primary.xml`

### b) Centraliza Estilos y Temas

*   **`themes.xml`:** Solo para temas de la app.
*   **`styles.xml`:** Define estilos reutilizables para widgets (`MyButton.Primary`).
*   **`colors.xml`:** Nombra los colores por su función (`brand_primary`), no por su valor (`red`).
*   **`dimens.xml`:** Define un sistema de espaciado y tamaños de fuente (`spacing_medium`, `font_size_title`).

## 6. Ejemplo de Estructura Completa

```
res/
├── drawable/         # Iconos vectoriales, selectores, shapes
├── font/             # Fuentes personalizadas (.ttf)
├── layout/           # Layouts por defecto (móvil vertical)
├── layout-sw600dp/   # Layouts para tablets
├── menu/             # Menús XML
├── mipmap-xxxhdpi/   # EXCLUSIVAMENTE para iconos de la app (launcher icons)
├── values/           # Archivos base: strings, dimens, colors, styles
├── values-es/        # Traducción al español (solo contiene strings.xml)
├── values-night/     # Sobrescribe colores/estilos para Modo Oscuro
└── xml/              # Archivos de configuración (ej. network_security_config.xml)
```

### Propósito de las Carpetas Clave:

*   **`drawable`:** Contiene todos los recursos gráficos que no son el icono de la app.
*   **`mipmap`:** Es solo para los iconos de la aplicación. El sistema la optimiza para encontrar el mejor icono.
*   **`values`:** El corazón de tu sistema de diseño y localización. Las carpetas con calificadores (`-es`, `-night`) solo deben contener los archivos que sobreescriben valores, no una copia de todo.

## 7. Buenas Prácticas Finales

*   **Empieza por el caso base:** Diseña siempre primero para móvil en vertical (`layout`).
*   **Prefiere `w<N>dp` y `sw<N>dp` sobre `land`:** Son más flexibles y se adaptan a multiventana y plegables.
*   **No dupliques layouts:** Si solo cambia un margen, sobreescribe un valor en `values-sw600dp/dimens.xml`.
*   **Usa `VectorDrawable`:** Prefiere siempre vectores (XML) sobre imágenes (PNG) para iconos. Son más ligeros y escalan sin perder calidad.
