# Usando una Versión Snapshot de la Librería

Si deseas depender de la versión más puntera de la librería MDC-Android, puedes usar las [versiones snapshot](https://github.com/material-components/material-components-android/packages/81484) que se publican diariamente a través de [GitHub Packages](https://help.github.com/en/packages/publishing-and-managing-packages/about-github-packages).

Para hacerlo, necesitas [crear un token de acceso de GitHub](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line#creating-a-token) con el permiso `read:packages`, y añadir lo siguiente a tus repositorios Maven en `build.gradle`, reemplazando `<usuario_github>` y `<token_acceso_github>` con tus credenciales:

```groovy
maven {
    name = "MaterialSnapshots"
    url = uri("https://maven.pkg.github.com/material-components/material-components-android")
    credentials {
        username = "<usuario_github>"
        password = "<token_acceso_github>"
    }
}
```

Luego puedes usar una versión snapshot añadiendo una dependencia `com.google.android.material:material:<version>-SNAPSHOT` como de costumbre (consulta la última versión [aquí](https://github.com/material-components/material-components-android/packages/81484/versions)). Esto obtendrá la última versión snapshot, que tu compilación de Gradle no almacenará en caché. Si compilas después de que se haya publicado una nueva versión, se usará esa versión.

Consulta la documentación oficial sobre [Configurar Gradle para usar con GitHub Packages](https://help.github.com/en/github/managing-packages-with-github-packages/configuring-gradle-for-use-with-github-packages) para obtener información adicional.

Si prefieres depender de una versión snapshot específica, puedes añadir `com.google.android.material:material:<version>-<uniqueversion>`, donde `<uniqueversion>` es una combinación de la fecha, una marca de tiempo y un contador (consulta todas las versiones [aquí](https://github.com/material-components/material-components-android/packages/81484/versions)).

También puedes encontrar la lista de versiones a través del [explorador de GraphQL](https://developer.github.com/v4/explorer/) con la siguiente consulta:

```graphql
{
  node(id: "MDE0OlBhY2thZ2VWZXJzaW9uMjMyNDc2OQ==") {
    ... on PackageVersion {
      id
      version
      files(last: 12, orderBy: {field: CREATED_AT, direction: ASC}) {
        nodes {
          name
        }
      }
    }
  }
}
```

Alternativamente, podrías usar [JitPack](https://jitpack.io/#material-components/material-components-android) para generar lanzamientos de la librería basados en commits específicos.

## Enlaces Útiles

-   [Primeros Pasos](getting-started.md)
-   [Contribuir](contributing.md)
-   [Construyendo desde la Fuente](building-from-source.md)
-   [App de Catálogo](catalog-app.md)
-   [Documentación de Clases](https://developer.android.com/reference/com/google/android/material/classes)
-   [MDC-Android on Stack Overflow](https://www.stackoverflow.com/questions/tagged/material-components+android)
-   [Guía para Desarrolladores de Android](https://developer.android.com/training/material/index.html)
-   [Material.io](https://www.material.io)
-   [Guías de Material Design](https://material.google.com)
