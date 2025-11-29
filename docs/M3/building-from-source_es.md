<!--docs:
title: "Construyendo desde el código fuente"
layout: landing
section: docs
path: /docs/building-from-source/
-->

# Construyendo desde el código fuente más reciente

Si vas a contribuir a la biblioteca, o necesitas una versión más nueva que la que ha sido lanzada, Material Components for Android también puede ser construido desde el código fuente.
Para hacerlo:

Clona el repositorio:

```sh
git clone https://github.com/material-components/material-components-android.git
```

Luego, construye los AARs de la biblioteca usando Gradle:

```sh
./gradlew publishToMavenLocal
```

**Nota:** Para asegurarte de que tu versión local de MDC-Android se usará y no entrará en conflicto con las versiones existentes, considera cambiar la versión especificada como
`mdcLibraryVersion` en el archivo `build.gradle` de nivel superior de la biblioteca a algo único antes de ejecutar el comando anterior.

Esto generará AARs y artefactos de Maven para cada uno de los módulos de la biblioteca en el repositorio local de Maven en tu máquina (`~/.m2/repository`).

To use the AARs in your app locally, add `mavenLocal()` as a repository in your
project's top-level `build.gradle` file. Finally, add the MDC-Android library
dependency as you would normally, using the version specified as
`mdcLibraryVersion` in the library's top-level `build.gradle` file.

## Enlaces útiles

-   [Primeros pasos](getting-started_es.md)
-   [Contribuyendo](contributing_es.md)
-   [Aplicación de catálogo](catalog-app_es.md)
-   [Usando la versión Snapshot](using-snapshot-version_es.md)
-   [Documentación de clases](https://developer.android.com/reference/com/google/android/material/classes)
-   [MDC-Android en Stack Overflow](https://www.stackoverflow.com/questions/tagged/material-components+android)
-   [Guía para desarrolladores de Android](https://developer.android.com/training/material/index.html)
-   [Material.io](https://www.material.io)
-   [Guías de Material Design](https://material.google.com)
