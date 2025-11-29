# Movimiento

El movimiento de Material es un sistema para ayudar a crear animaciones estilizadas y consistentes en toda una aplicación. En la librería se proporcionan atributos de tema de interpolación y duración semánticos, atributos de tema de resorte (spring) semánticos, componentes que usan movimiento temático para sus animaciones incorporadas y un conjunto de transiciones para eventos de navegación o animaciones personalizadas.

El sistema de movimiento de interpolación y duración está disponible en la versión `1.6.0` o posterior. El sistema de movimiento de física está disponible en la versión `1.13.0` o posterior.

1.  [Temas](#theming)
2.  [Transiciones](#transitions)

## Temas

El sistema de movimiento de Material está respaldado por un conjunto de ranuras de interpolación y duración y un conjunto de ranuras de resorte. Estos son los bloques de construcción para crear cualquier animación con estilo de Material. Estas ranuras se implementan como atributos de tema, similares a los atributos de color o forma.

### Resortes (Springs)

El sistema de movimiento de resorte (o física) es un conjunto de seis atributos de resorte con opinión, destinados a ser utilizados con la [librería de AndroidX Dynamic Animation](https://developer.android.com/develop/ui/views/animations/spring-animation#add-support-library). Un atributo de resorte se configura como un estilo compuesto por un valor de amortiguación y rigidez.

El sistema de resortes proporciona resortes en tres velocidades: rápido, lento y predeterminado. Se elige una velocidad en función del tamaño del componente que se está animando o de la distancia recorrida.

Además, para cada velocidad hay dos tipos de resortes: espaciales y de efectos. Los resortes espaciales se usan para animaciones que mueven algo en la pantalla. Los resortes de efectos se usan para animar propiedades como el color o la opacidad donde el valor de la propiedad no debe sobrepasarse.

Esto hace un total de seis atributos de resorte:
`motionSpringFastSpatial`, `motionSpringFastEffects`, `motionSpringSlowSpatial`, `motionSpringSlowEffects`, `motionSpringDefaultSpatial`, `motionSpringDefaultEffects`.

Los atributos de resorte se pueden personalizar (o "tematizar") sobrescribiendo su valor a tu propio estilo `MaterialSpring`.

#### Animaciones personalizadas usando el sistema de movimiento de resorte
Para crear una animación de resorte, necesitarás declarar una dependencia en la librería de AndroidX Dynamic Animation. Con tu `SpringAnimation` configurado, usa `MotionUtils.resolveThemeSpring()` para resolver un atributo de resorte de tu tema en un objeto `SpringForce`.

### Curvas (interpolación y duración)

Los atributos de tema de interpolación (easing) y duración componen el sistema de movimiento de curva. La interpolación es una curva que determina cuánto tiempo tarda un objeto en empezar y dejar de moverse. La duración determina el tiempo total de la animación.

El sistema de curvas de Material incluye siete atributos de interpolación (interpoladores):
`motionEasingStandardInterpolator`, `motionEasingStandardDecelerateInterpolator`, `motionEasingStandardAccelerateInterpolator`, `motionEasingEmphasizedInterpolator`, `motionEasingEmphasizedDecelerateInterpolator`, `motionEasingEmphasizedAccelerateInterpolator`, `motionEasingLinearInterpolator`.

Por defecto, estos valores de atributo están establecidos en interpoladores que se sienten cohesivos. Sin embargo, se pueden sobrescribir para reflejar el estilo único de tu aplicación.

El sistema de curvas de Material también incluye 16 atributos de duración para ser emparejados con una interpolación, desde `motionDurationShort1` (50ms) hasta `motionDurationExtraLong4` (1000ms).

#### Animaciones personalizadas usando el sistema de movimiento de curva
Al implementar tus propias animaciones, usa un atributo de tema de interpolación y duración para que tus animaciones se integren con las animaciones usadas por los componentes de Material.

## Transiciones

Material proporciona un conjunto de patrones de transición que ayudan a los usuarios a entender y navegar por una aplicación. La librería de Material Components para Android proporciona soporte para los cuatro patrones de movimiento definidos en la especificación de Material:

1.  [Transformación de contenedor](#container-transform)
2.  [Eje compartido (o Adelante y Atrás)](#shared-axis)
3.  [Desvanecimiento a través (o Nivel Superior)](#fade-through)
4.  [Desvanecimiento (o Entrada y Salida)](#fade)

La librería ofrece clases de transición para estos patrones, construidas tanto sobre la [librería de Transición de AndroidX](https://developer.android.com/reference/androidx/transition/package-summary) (`androidx.transition`) como sobre el [Framework de Transición de Android](https://developer.android.com/training/transitions) (`android.transition`).

### Transformación de contenedor (`MaterialContainerTransform`)
El patrón de **transformación de contenedor** está diseñado para transiciones entre elementos de la UI que incluyen un contenedor. Este patrón crea una conexión visible entre dos elementos de la UI. Es una transición de elemento compartido.

### Eje compartido (`MaterialSharedAxis`)
El patrón de **eje compartido** se usa para transiciones entre elementos de la UI que tienen una relación espacial o de navegación. Este patrón usa una transformación compartida en el eje x, y, o z.

### Desvanecimiento a través (`MaterialFadeThrough`)
El patrón de **desvanecimiento a través** se usa para transiciones entre elementos de la UI que no tienen una relación fuerte entre sí.

### Desvanecimiento (`MaterialFade`)
El patrón de **desvanecimiento** se usa para elementos de la UI que entran o salen dentro de los límites de la pantalla, como un diálogo que se desvanece en el centro de la pantalla.
