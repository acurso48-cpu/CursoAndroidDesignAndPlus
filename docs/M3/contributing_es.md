# Guía General de Contribución

Las políticas y procedimientos de contribución de Material Components se pueden encontrar en la [página de contribución](https://github.com/material-components/material-components/blob/develop/CONTRIBUTING.md) del repositorio principal de documentación de Material Components.

Para solicitudes de funcionalidades más grandes, podríamos pedirte que escribas un [Documento de Diseño](https://docs.google.com/document/d/1ISW8sVEQpAs1X-pQ0zf2q3Sbz5NRS8jfjs-jnjo9iWk/edit).

Para hacer una contribución, necesitarás poder construir la librería desde el código fuente y ejecutar nuestras pruebas.

## Proceso de Pull Request

Debido a que el código de material-components-android se almacena en dos ubicaciones (es decir, GitHub y Google), los PRs (Pull Requests) no se fusionan directamente en el repositorio. En su lugar, una vez que un PR está completo (es decir, el CLA firmado, la CI pasando, el diseño revisado, el código revisado), el PR se convertirá en un commit atribuido al autor original que se sincroniza con el repositorio. Aunque la lista de PRs no muestre PRs fusionados, sí aceptamos contribuciones.

## Construyendo desde la Fuente

Echa un vistazo a nuestras [instrucciones](building-from-source.md) sobre cómo construir la librería desde el código fuente.

## Ejecutando Pruebas

Material Components for Android tiene pruebas de JVM así como pruebas de Emulador.

Para ejecutar las pruebas de JVM, haz:

```sh
./gradlew test
```

Para ejecutar las pruebas de emulador, asegúrate de tener [un dispositivo virtual configurado](https://developer.android.com/studio/run/managing-avds.html) y haz:

```sh
./gradlew connectedAndroidTest
```

## Convenciones de Código

Dado que todos queremos pasar más tiempo codificando y menos tiempo lidiando con los espacios en blanco, Material Components for Android utiliza convenciones y estilos de código para fomentar la consistencia. Un código con un estilo consistente es más fácil (¡y menos propenso a errores!) de revisar, mantener y entender.

### Sé consistente

Si la guía de estilo no es explícita sobre una situación particular, la regla cardinal es **ser consistente**. Por ejemplo, echa un vistazo al código circundante y sigue su ejemplo, o busca casos similares en otras partes de la base del código.

### Java

Seguimos la [Guía de Estilo de Java de Google](https://google.github.io/styleguide/javaguide.html).

### XML

-   Indentación de 2 espacios
-   El nombramiento de recursos (incluyendo los IDs) es `minúsculas_con_guiones_bajos`
-   Orden de los atributos:
    1.  `xmlns:android`
    2.  otros `xmlns:`
    3.  `android:id`
    4.  `style`
    5.  atributos `android:layout_`
    6.  atributos `android:padding`
    7.  otros atributos `android:`
    8.  atributos `app:`
    9.  atributos `tool:`

## Enlaces Útiles

-   [Primeros Pasos](getting-started.md)
-   [Usando la Versión Snapshot](using-snapshot-version.md)
-   [Construyendo desde la Fuente](building-from-source.md)
-   [App de Catálogo](catalog-app.md)
-   [Documentación de Clases](https://developer.android.com/reference/com/google/android/material/classes)
-   [MDC-Android on Stack Overflow](https://www.stackoverflow.com/questions/tagged/material-components+android)
-   [Guía para Desarrolladores de Android](https://developer.android.com/training/material/index.html)
-   [Material.io](https://www.material.io)
-   [Guías de Material Design](https://material.google.com)
