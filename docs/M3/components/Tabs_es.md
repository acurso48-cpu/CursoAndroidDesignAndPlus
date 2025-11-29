# Pestañas (Tabs)

Las [Pestañas](https://m3.material.io/components/tabs/overview) organizan el contenido a través de diferentes pantallas, conjuntos de datos y otras interacciones. Hay dos variantes de pestañas:

1.  Pestañas primarias
2.  Pestañas secundarias

Las **pestañas primarias** se colocan en la parte superior del panel de contenido debajo de una barra de aplicaciones. Muestran los principales destinos de contenido.

Las **pestañas secundarias** se usan dentro de un área de contenido para separar aún más el contenido relacionado y establecer una jerarquía.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/tabs/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/tabs/package-summary)

## Anatomía

#### Pestañas primarias
1.  Contenedor
2.  Insignia (Badge) (opcional)
3.  Icono (opcional)
4.  Etiqueta
5.  Divisor
6.  Indicador activo

#### Pestañas secundarias
1.  Contenedor
2.  Insignia (Badge) (opcional)
3.  Etiqueta
4.  Divisor
5.  Indicador activo

## Propiedades Clave

(Tablas de atributos para contenedor, icono, etiqueta, contenedor del ítem e indicador)

## Implementación en código

Antes de poder usar las pestañas de Material, necesitas añadir una dependencia a la librería de Material Components para Android.

### Añadiendo pestañas
Un `TabLayout` puede ser añadido a un layout. Luego se pueden añadir `TabItem`s como hijos. Se pueden observar cambios en la selección de pestañas con `addOnTabSelectedListener`.

### Haciendo las pestañas accesibles
Los componentes de pestañas de Android soportan descripciones de contenido para lectores de pantalla.

### Usando pestañas con ViewPager
Se puede configurar un `TabLayout` con un `ViewPager` para crear dinámicamente `TabItem`s y sincronizar la pestaña seleccionada con los deslizamientos de página.

### Usando pestañas con ViewPager2
La configuración de un `TabLayout` con un `ViewPager2` se maneja a través de la clase `TabLayoutMediator`.

### Añadiendo insignias (badges) a las pestañas
Las pestañas soportan insignias con la clase `BadgeDrawable`.

### Añadiendo pestañas fijas
Las pestañas fijas muestran todas las pestañas en una pantalla, cada una con un ancho fijo. Se configuran con `app:tabMode="fixed"`.

### Añadiendo pestañas desplazables
Las pestañas desplazables se muestran sin anchos fijos y son desplazables. Se configuran con `app:tabMode="scrollable"`.

## Personalizando pestañas

### Tematizando pestañas
Las pestañas soportan la personalización de color y tipografía.
