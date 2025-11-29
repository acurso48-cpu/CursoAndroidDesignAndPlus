# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# ---------------- Explicación y Traducción (Julián - Curso Android Nov/2025 Getafe) ----------------

# --- Explicación ---
#
# Este archivo, `proguard-rules.pro`, se utiliza para definir reglas específicas para ProGuard 
# (o R8, el optimizador de código que usa Android por defecto).
#
# ¿Qué hace ProGuard/R8?
#
# Cuando compilas tu aplicación en modo `release`, ProGuard/R8 realiza tres tareas principales:
#
# 1.  **Ofuscación (Obfuscation)**: Renombra clases, métodos y campos con nombres cortos y sin sentido 
#     (p. ej., `a`, `b`, `c`). Esto hace que sea muy difícil para otros hacer ingeniería inversa de tu aplicación.
# 2.  **Optimización (Optimization)**: Analiza y optimiza el código para que se ejecute de manera más eficiente.
# 3.  **Reducción (Shrinking)**: Elimina el código y los recursos no utilizados, lo que reduce el tamaño 
#     final de tu APK o AAB.
#
# ¿Para qué sirven las reglas en este archivo?
#
# A veces, ProGuard/R8 puede ser demasiado agresivo y eliminar código que cree que no se usa, 
# pero que en realidad es necesario (por ejemplo, si se accede a él a través de la reflexión).
#
# Las reglas en este archivo le dicen a ProGuard/R8: "¡Oye, no toques esto!". Se usan para especificar 
# qué clases, métodos o campos no deben ser renombrados ni eliminados. Esto asegura que tu aplicación 
# siga funcionando correctamente después de la ofuscación y la optimización.

# --- Traducción de los comentarios originales ---

# Añade aquí las reglas de ProGuard específicas del proyecto.
# Puedes controlar el conjunto de archivos de configuración aplicados usando
# la configuración de proguardFiles en build.gradle.
#
# Para más detalles, consulta
#   http://developer.android.com/guide/developing/tools/proguard.html

# Si tu proyecto usa WebView con JS, descomenta lo siguiente
# y especifica el nombre de clase completamente calificado para la interfaz de JavaScript
# clase:
#-keepclassmembers class fqcn.de.la.interfaz.de.javascript.para.webview {
#   public *;
#}

# Descomenta esto para preservar la información del número de línea para
# depurar las trazas de la pila.
#-keepattributes SourceFile,LineNumberTable

# Si mantienes la información del número de línea, descomenta esto para
# ocultar el nombre del archivo fuente original.
#-renamesourcefileattribute SourceFile
