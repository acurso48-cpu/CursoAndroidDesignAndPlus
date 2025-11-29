plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.kuvuni.materialcomponents"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kuvuni.materialcomponents"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

// ---------------- Explicación (Julián - Curso Android Nov/2025 Getafe) ----------------
//
// ¡Este es el archivo `build.gradle.kts` del módulo `components`, el corazón de nuestra app!
//
// ¿Qué hace este archivo?
//
// Aquí es donde definimos todo lo específico de nuestro módulo de la aplicación. Es como la "sala de máquinas"
// donde configuramos cómo se compila nuestra app, qué bibliotecas usa y cómo se empaqueta.
//
// --- Plugins ---
//
// `plugins { ... }`
// Aquí aplicamos los plugins que declaramos en el archivo de nivel superior. Al decir `apply true` (o simplemente
// no poner `apply false`), le estamos diciendo a Gradle: "¡Usa estas herramientas para construir este módulo!".
//
// --- Bloque `android` ---
//
// `android { ... }`
// Este es el bloque principal de configuración para una aplicación de Android. Aquí definimos:
//
// -   `namespace`: Un identificador único para nuestro código fuente (similar al `package` de Java).
// -   `compileSdk`: La versión de la API de Android con la que se compila nuestra app. ¡Siempre a la última!
// -   `defaultConfig`: La configuración por defecto para nuestra aplicación:
//     -   `applicationId`: El identificador único de nuestra app en la Play Store.
//     -   `minSdk`: La versión mínima de Android en la que nuestra app puede funcionar.
//     -   `targetSdk`: La versión de Android para la que nuestra app ha sido diseñada y probada.
//     -   `versionCode` y `versionName`: Para controlar las actualizaciones de nuestra app en la Play Store.
// -   `buildTypes`: Aquí definimos cómo se compila nuestra app para diferentes escenarios (p. ej., `debug` vs `release`).
//     -   `release`: La configuración para cuando publicamos nuestra app. `isMinifyEnabled = true` activaría ProGuard/R8.
// -   `compileOptions` y `kotlinOptions`: Para configurar la versión de Java y Kotlin que usamos en nuestro proyecto.
//
// --- Bloque `dependencies` ---
//
// `dependencies { ... }`
// ¡La parte más emocionante! Aquí es donde declaramos todas las bibliotecas (dependencias) que nuestra app necesita.
// Es como decir: "¡Quiero usar Material Design, `core-ktx` para escribir menos código y `appcompat` para la 
// compatibilidad con versiones anteriores de Android!".
//
// -   `implementation`: La dependencia es necesaria para compilar el código principal de la app.
// -   `testImplementation`: La dependencia solo se usa para ejecutar tests unitarios.
// -   `androidTestImplementation`: La dependencia solo se usa para ejecutar tests de instrumentación (en un dispositivo o emulador).
//
