# Diseños Canónicos

**Contenidos**

*   [Librerías y APIs](#librerías-y-apis)
*   [Demos](#demos)
*   [Implementación general](#implementación-general)
*   [Demo de Vista de Lista](#demo-de-vista-de-lista)
*   [Demo de Feed](#demo-de-feed)
*   [Demo de Héroe de Vista Única](#demo-de-héroe-de-vista-única)
*   [Demo de Panel de Soporte](#demo-de-panel-de-soporte)

Las demos de diseños canónicos que se encuentran en el [catálogo de MDC](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/) son ejemplos de diseños adaptativos en los que los componentes y las vistas cambian según la configuración del dispositivo, como el tamaño de la pantalla, la orientación y/o la presencia de un pliegue físico.

Este documento discute la lógica general que se puede aplicar a implementaciones como la de la [sección de implementación general](#implementación-general), mientras que cada sección de demostración discute su implementación específica.

Consejo: Sigue el código fuente para comprender mejor los conceptos de esta documentación.

## Librerías y APIs

Para usar la librería de Material, necesitarás añadir una dependencia a la librería de Material Components para Android. Para más información, consulta la página de [primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

Las librerías de AndroidX [ConstraintLayout](https://developer.android.com/jetpack/androidx/releases/constraintlayout) y [WindowManager](https://developer.android.com/jetpack/androidx/releases/window) se usan para lograr la adaptabilidad del diseño.

Para más información sobre los componentes de navegación usados en estas demos, consulta su documentación.

## Demos

La [demo Adaptativa](https://github.com/material-components/material-components-android/tree/master/catalog/java/io/material/catalog/adaptive/) del catálogo tiene implementaciones de los siguientes diseños canónicos:

*   Demo de Vista de Lista
*   Demo de Feed
*   Demo de Héroe de Vista Única
*   Demo de Panel de Soporte

## Implementación general

Cada demo tiene una clase `Activity` principal que muestra el componente de navegación apropiado según el tamaño de la pantalla, muestra un `Fragment` principal y se comunica con esa clase `Fragment`.

Usamos `ConstraintLayout` y `ConstraintSet` para permitir que los diseños se adapten a múltiples configuraciones de pantalla y dispositivo, y la librería `WindowManager` para capturar estados plegables específicos.

### Componentes de navegación

Todas las demos muestran diferentes componentes de navegación según el tamaño de la pantalla: las pantallas pequeñas tienen una navegación inferior, las pantallas medianas tienen un riel de navegación y las pantallas grandes tienen un panel de navegación estándar.

En el XML de la `Activity` de cada demo, añadimos todos los componentes de navegación mencionados, pero por defecto solo es visible el de móvil. En el código, en la clase `Activity`, ajustamos la visibilidad de cada componente comprobando el ancho actual de la pantalla.

### Mostrando el `Fragment` principal

En el XML, tenemos un `FrameLayout` que usamos para cargar el `Fragment` de nuestra demo. En la clase `Activity`, simplemente lo reemplazamos con una nueva instancia del `Fragment`.

### Monitoreando los estados de dispositivos plegables

La `Activity` monitorea el estado del dispositivo plegable con la librería `WindowManager`. La `Activity` tiene una clase interna `StateContainer` que implementa `Consumer<WindowLayoutInfo>`, donde comprueba configuraciones plegables específicas y se comunica con el fragmento de la demo según sea necesario. Aquí también es donde podemos encontrar la posición del pliegue, que es útil para cambiar la posición de una `ReactiveGuide` para reorganizar las vistas.

### Usando `ConstraintSet`

Una forma fácil de reorganizar las vistas en un `ConstraintLayout` es creando `ConstraintSet`s. Puedes crear un conjunto de restricciones para una configuración de dispositivo específica en la clase `Fragment` y luego actualizar el diseño según sea necesario.

## Demo de Vista de Lista

Esta demo es un ejemplo de un diseño de bandeja de entrada de correo electrónico. En modo retrato muestra solo la lista de correos electrónicos, pero en modo paisaje también muestra una vista de correo electrónico seleccionado a su lado.

### Implementación

Esta demo difiere un poco de las demás porque usa dos fragmentos, `AdaptiveListViewDemoFragment` (la lista) y `AdaptiveListViewDetailDemoFragment` (el detalle). La `Activity` principal sigue la lógica general y actualiza el diseño según la orientación del dispositivo.

## Demo de Feed

Esta demo es un ejemplo de un diseño de feed de noticias. Muestra diferentes diseños para modo retrato y paisaje, y también se adapta a dispositivos plegables abiertos.

### Implementación

El `Fragment` principal infla `cat_adaptive_feed_fragment.xml` y configura dos `RecyclerView`s. También configura dos `ConstraintSet`s, un `closedLayout` y un `openLayout`, que se aplican según la orientación y el estado del plegable.

## Demo de Héroe de Vista Única

Esta demo muestra una gran vista de contenido superior en la parte superior del diseño, también llamada vista de héroe. El héroe y otros contenedores adoptan diferentes configuraciones de diseño según el tamaño de la pantalla.

### Implementación

El `Fragment` principal infla `cat_adaptive_hero_fragment.xml` y configura tres `ConstraintSet`s diferentes, `smallLayout`, `mediumLayout`, y `largeLayout`, que se aplican según el tamaño de la pantalla (pequeño, mediano, grande).

## Demo de Panel de Soporte

Esta demo es un ejemplo de un diseño que tiene una vista de contenido principal siempre visible, seguida de un panel de soporte con una lista de elementos que cambia de posición según ciertas configuraciones de pantalla.

### Implementación

El `Fragment` principal infla `cat_adaptive_supporting_panel_fragment.xml` y configura tres `ConstraintSet`s, `portraitLayout`, `landscapeLayout`, y `tableTopLayout`, que se aplican según la orientación del dispositivo y, para los plegables, también según el estado y la orientación del pliegle.
