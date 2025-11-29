pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Material Components"
include(":components")

// ---------------- Explicación (Julián - Curso Android Nov/2025 Getafe) ----------------
//
// ¡Este es el archivo `settings.gradle.kts`, el "mapa" de nuestro proyecto!
//
// ¿Qué hace este archivo?
//
// Este archivo es el responsable de definir qué módulos forman parte de nuestro proyecto y dónde
// Gradle puede encontrar los plugins y las dependencias que necesitamos.
//
// --- Bloque `pluginManagement` ---
//
// `pluginManagement { ... }`
// Aquí le decimos a Gradle dónde buscar los plugins que usamos en nuestros archivos de compilación.
// Es como darle a Gradle una lista de tiendas donde puede ir a buscar las herramientas que necesita.
//
// --- Bloque `dependencyResolutionManagement` ---
//
// `dependencyResolutionManagement { ... }`
// De manera similar al bloque anterior, aquí definimos los repositorios donde Gradle buscará las
// bibliotecas (dependencias) que usamos en nuestra app. Los más comunes son `google()` (para las
// bibliotecas de Android y Jetpack) y `mavenCentral()` (un gran repositorio de bibliotecas de Java y Kotlin).
//
// --- `rootProject.name` y `include` ---
//
// `rootProject.name = "Material Components"`
// Aquí le damos un nombre a nuestro proyecto raíz.
//
// `include(":components")`
// ¡Esta es la parte clave! Aquí le decimos a Gradle qué módulos forman parte de nuestro proyecto.
// En este caso, le estamos diciendo que incluya el módulo `components` en la compilación.
// Si tuviéramos más módulos (por ejemplo, para una versión de la app para Wear OS o Android TV),
// los añadiríamos aquí también.
