<!--docs:
title: "Material Text View"
layout: detail
section: components
excerpt: "MaterialTextView muestra texto al usuario."
iconId: text_view
path: /catalog/material-text-view/
-->

# Material text view

Una vista de texto de material es un derivado de `AppCompatTextView` que muestra texto al usuario. Para proporcionar texto editable por el usuario, consulta
[EditText](https://developer.android.com/reference/android/widget/EditText).

## Propiedades clave

### Atributos

`MaterialTextView` admite todos los atributos estándar que se pueden cambiar para un
[`AppCompatTextView`](https://developer.android.com/reference/android/support/v7/widget/AppCompatTextView).
A diferencia de `AppCompatTextView`, que solo admite la especificación de la altura de la línea en un XML de diseño de vista, `MaterialTextView` admite la capacidad de leer la altura de la línea desde un estilo `TextAppearance`, que se puede aplicar a `MaterialTextView` ya sea usando el atributo `style` o usando el atributo `android:textAppearance`.

Los siguientes atributos adicionales se pueden cambiar en `TextAppearance` y aplicar a un `MaterialTextView`:

Característica | Atributos relevantes
--- | ---
Altura de línea | `android:lineHeight`

## Implementación de código

API y código fuente:

*   `MaterialTextView`

    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/textview/MaterialTextView)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textview/MaterialTextView.java)

    **Nota:** Si usas nuestros temas completos (lo que recomendamos), `TextView` se inflará automáticamente a `MaterialTextView`; de lo contrario, deberás especificar `<com.google.android.material.textview.MaterialTextView` en tu xml.

El código de ejemplo de cómo incluir el componente en tu diseño se enumera aquí como referencia.

```xml
<LinearLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  android:layout_width="match_parent"
  android:layout_height="match_parent">
    <TextView
      android:id="@+id/text_view_id"
      android:layout_height="wrap_content"
      android:layout_width="wrap_content"
      android:text="@string/hello" />
</LinearLayout>
```
