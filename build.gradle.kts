// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// ---------------- Explicación (Julián - Curso Android Nov/2025 Getafe) ----------------
//
// Este es el archivo de compilación de Gradle de nivel superior (`build.gradle.kts`).
//
// ¿Qué hace este archivo?
//
// Este archivo es el centro de configuración para todo tu proyecto. Aquí es donde se definen
// los plugins de Gradle que se aplicarán a todos los módulos del proyecto. Piensa en él como
// el "director de orquesta" que coordina las herramientas de compilación para todos los módulos.
//
// En este caso, estamos declarando dos plugins:
//
// 1.  `alias(libs.plugins.android.application) apply false`:
//     -   Esto declara el plugin de la aplicación de Android. Se encarga de compilar el código de tu 
//         aplicación, empaquetar los recursos y generar el archivo APK o AAB final.
//     -   `apply false` significa que el plugin no se aplica directamente a este archivo de compilación 
//         de nivel superior, sino que se pone a disposición de los módulos del proyecto para que 
//         puedan aplicarlo si lo necesitan (como lo hace el módulo `components`).
//
// 2.  `alias(libs.plugins.kotlin.android) apply false`:
//     -   Este es el plugin de Kotlin para Android. Proporciona soporte para compilar código Kotlin 
//         y lo integra con el sistema de compilación de Android.
//     -   Al igual que el plugin anterior, `apply false` indica que este plugin estará disponible 
//         para que los módulos individuales lo apliquen.
//
// En resumen, este archivo establece las bases para la compilación de todo tu proyecto, asegurando
// que todos los módulos tengan acceso a las herramientas necesarias para compilar código de Android
// y Kotlin.
//
