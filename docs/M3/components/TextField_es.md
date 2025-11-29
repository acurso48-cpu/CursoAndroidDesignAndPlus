<!--docs:
title: "Campos de texto"
layout: detail
section: components
excerpt: "Un campo de texto con una etiqueta flotante animada y otras características de Material Design."
iconId: text_field
path: /catalog/text-fields/
-->

# Campos de texto

Los [campos de texto](https://m3.material.io/components/text-fields/overview) permiten a los usuarios introducir y editar texto. Hay dos variantes de campos de texto.

!["Tipos de campos de texto. Fijo: fondo gris, el indicador gris oscuro se vuelve morado.
Contorneado: fondo transparente, el contorno gris se vuelve morado"](assets/textfields/text-field-hero.png)

1.  Campo de texto relleno
2.  Campo de texto contorneado

**Nota:** Las imágenes usan varios esquemas de colores dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/text-fields/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/textfield/package-summary)

## Anatomía

#### Campo de texto relleno

![Anatomía del campo de texto relleno](assets/textfields/textfields-filled-anatomy.png)

1.  Contenedor
2.  Ícono inicial (opcional)
3.  Texto de la etiqueta (vacío)
4.  Texto de la etiqueta (con contenido)
5.  Ícono final (opcional)
6.  Indicador activo (enfocado)
7.  Cursor
8.  Texto de entrada
9.  Texto de apoyo (opcional)
10. Indicador activo (habilitado)

#### Campo de texto contorneado

![Anatomía del campo de texto contorneado](assets/textfields/textfields-outlined-anatomy.png)

1.  Contorno del contenedor (habilitado)
2.  Ícono inicial (opcional)
3.  Texto de la etiqueta (sin contenido)
4.  Texto de la etiqueta (con contenido)
5.  Ícono final (opcional)
6.  Contorno del contenedor (enfocado)
7.  Cursor
8.  Texto de entrada
9.  Texto de apoyo (opcional)

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/text-fields/guidelines#6be8deda-2eed-4765-9e32-98c2563d6c1c).

## Propiedades clave

<details>
<summary><h3>Campo de texto relleno</h3></summary>

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:boxBackgroundColor` | `setBoxBackgroundColor`<br/>`setBoxBackgroundColorResource`<br/>`getBoxBackgroundColor` | `?attr/colorSurfaceContainerHighest` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_filled_background_color.xml))
**Forma** | `app:shapeAppearance` | N/A | `?attr/shapeAppearanceCornerExtraSmall`
**Campo de texto habilitado** | `android:enabled` | `setEnabled` | `true`

#### Atributos del ícono inicial

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono** | `app:startIconDrawable` | `setStartIconDrawable`<br/>`getStartIconDrawable` | `null`
**Descripción del contenido** | `app:startIconContentDescription` | `setStartIconContentDescription`<br/>`getStartIconContentDescription` | `null`
**Color** | `app:startIconTint` | `setStartIconTintList` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Marcable** | `app:startIconCheckable` | `setStartIconCheckable`<br/>`isStartIconCheckable` | `false`
**Tamaño** | `app:startIconMinSize` | `setStartIconMinSize`<br/>`getStartIconMinSize` | `48dp`
**Tipo de escala** | `app:startIconScaleType` | `setStartIconScaleType` <br/> `getStartIconScaleType` | `ScaleType.CENTER`

#### Atributos de la etiqueta

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto** | `android:hint` | `setHint`<br/>`getHint` | `null`
**Color** | `android:textColorHint` | `setDefaultHintTextColor`<br/>`getDefaultHintTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_label_color.xml))
**Color contraído (flotante)** | `app:hintTextColor` | `setHintTextColor`<br/>`getHintTextColor` | `?attr/colorPrimary` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_label_color.xml))
**Tipografía** | `app:hintTextAppearance` | `setHintTextAppearance` | `?attr/textAppearanceBodySmall`
**Animación** | `app:hintAnimationEnabled` | `setHintAnimationEnabled`<br/>`isHintAnimationEnabled` | `true`
**Habilitado expandido** | `app:expandedHintEnabled` | `setExpandedHintEnabled`<br/>`isExpandedHintEnabled` | `true`

**Nota:** `android:hint` siempre debe establecerse en `TextInputLayout` en lugar de en `EditText` para evitar comportamientos no deseados.

#### Atributos del texto de entrada (establecidos en `TextInputEditText`)

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto de entrada** | `android:text` | `setText`<br/>`getText` | `@null`
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceBodyLarge`
**Color del texto de entrada** | `android:textColor` | `setTextColor`<br/>`getTextColors`<br/>`getCurrentTextColor` | `?attr/colorOnSurface`
**Color del cursor** | N/A (el color proviene del atributo de tema `?attr/colorControlActivated`) | N/A | `?attr/colorPrimary`
**Color de resaltado del texto** | N/A (el color proviene del atributo de tema `?android:attr/textColorHighlight`) | N/A | [`@color/m3_highlighted_text`](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_highlighted_text.xml)

#### Atributos del texto de entrada (establecidos en `TextInputLayout`)

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color del cursor** | `app:cursorColor` en niveles de API 28+ | `setCursorColor`<br/>`getCursorColor`<br/>en niveles de API 28+ | `@null` (usa `?attr/colorControlActivated` de forma predeterminada)
**Color del cursor de error** | `app:cursorErrorColor` en niveles de API 28+ | `setCursorErrorColor`<br/>`getCursorErrorColor`<br/>en niveles de API 28+ | `?attr/colorError` en niveles de API 28+, `?attr/colorControlActivated` en caso contrario

#### Atributos del ícono final

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Modo** | `app:endIconMode` | `setEndIconMode`<br/>`getEndIconMode` | `END_ICON_NONE`
**Color** | `app:endIconTint` | `setEndIconTintList` | `colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Ícono personalizado** | `app:endIconDrawable` | `setEndIconDrawable`<br/>`getEndIconDrawable` | `null`
**Descripción del contenido del ícono personalizado** | `app:endIconContentDescription` | `setEndIconContentDescription`<br/>`getEndIconContentDescription` | `null`
**Ícono personalizado marcable** | `app:endIconCheckable` | `setEndIconCheckable`<br/>`isEndIconCheckable` | `true`
**Ícono de error** | `app:errorIconDrawable` | `setErrorIconDrawable`<br/>`getErrorIconDrawable` | [`@drawable/mtrl_ic_error`](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/drawable/mtrl_ic_error.xml)
**Color del ícono de error** | `app:errorIconTint` | `setErrorIconTintList` | `?attr/colorError`
**Tamaño** | `app:endIconMinSize` | `setEndIconMinSize`<br/>`getEndIconMinSize` | `48dp`
**Tipo de escala** | `app:endIconScaleType` | `setEndIconScaleType` <br/> `getEndIconScaleType` | `ScaleType.CENTER`

#### Atributos del indicador de activación

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color** | `app:boxStrokeColor` | `setBoxStrokeColor`<br/>`setBoxStrokeColorStateList`<br/>`getBoxStrokeColor` | `?attr/colorOutline` y `?attr/colorPrimary` (enfocado) (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_stroke_color.xml))
**Color de error** | `app:boxStrokeErrorColor` | `setBoxStrokeErrorColor`<br/>`getBoxStrokeErrorColor` | `?attr/colorError`
**Ancho** | `app:boxStrokeWidth` | N/A | `1dp`
**Ancho enfocado** | `app:boxStrokeWidthFocused` | N/A | `2dp`

#### Atributos de texto de ayuda/error/contador

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto de ayuda habilitado** | `app:helperTextEnabled` | `setHelperTextEnabled`<br/>`isHelperTextEnabled` | `false`
**Texto de ayuda** | `app:helperText` | `setHelperText`<br/>`getHelperText` | `null`
**Color del texto de ayuda** | `app:helperTextColor` | `setHelperTextColor`<br/>`getHelperTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del texto de ayuda** | `app:helperTextAppearance` | `setHelperTextAppearance` | `?attr/textAppearanceBodySmall`
**Texto de error habilitado** | `app:errorEnabled` | `setErrorEnabled`<br/>`isErrorEnabled` | `false`
**Texto de error** | N/A | `setError`<br/>`getError` | `null`
**Región activa de accesibilidad del texto de error** | `app:errorAccessibilityLiveRegion` | `setErrorAccessibilityLiveRegion`<br/>`getErrorAccessibilityLiveRegion` | `ViewCompat.ACCESSIBILITY_LIVE_REGION_POLITE`
**Color del texto de error** | `app:errorTextColor` | `setErrorTextColor`<br/>`getErrorCurrentTextColors` | `?attr/colorError`
**Tipografía del texto de error** | `app:errorTextAppearance` | `setErrorTextAppearance` | `?attr/textAppearanceBodySmall`
**Contador de texto habilitado** | `app:counterEnabled` | `setCounterEnabled`<br/>`isCounterEnabled` | `false`
**Longitud del contador de texto** | `app:counterMaxLength` | `setCounterMaxLength`<br/>`getCounterMaxLength` | `-1`
**Tipografía del contador de texto** | `app:counterTextAppearance`<br/>`app:counterOverflowTextAppearance` | `setCounterTextAppearance`<br/>`setCounterOverflowTextAppearance` | `?attr/textAppearanceBodySmall`
**Color del contador de texto** | `app:counterTextColor`<br/>`app:counterOverflowTextColor` | `setCounterTextColor`<br/>`setCounterOverflowTextColor`<br/>`getCounterTextColor`<br/>`getCounterOverflowTextColor` | `?attr/colorOnSurfaceVariant` (`app:counterTextColor`) (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))<br/>`?attr/colorError` (`app:counterOverflowTextColor`)

#### Atributos de prefijo/sufijo

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Prefijo** | `app:prefixText` | `setPrefixText`<br/>`getPrefixText` | `null`
**Color del prefijo** | `app:prefixTextColor` | `setPrefixTextColor`<br/>`getPrefixTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del prefijo** | `app:prefixTextAppearance` | `setPrefixTextAppearance` | `?attr/textAppearanceTitleMedium`
**Sufijo** | `app:suffixText` | `setSuffixText`<br/>`getSuffixText` | `null`
**Color del sufijo** | `app:suffixTextColor` | `setSuffixTextColor`<br/>`getSuffixTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del sufijo** | `app:suffixTextAppearance` | `setSuffixTextAppearance` | `?attr/textAppearanceTitleMedium`

#### Estilos

Elemento | Estilo | Atributo de estilo de tema predeterminado
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.TextInputLayout.FilledBox` | `?attr/textInputFilledStyle`
**Estilo denso** | `Widget.Material3.TextInputLayout.FilledBox.Dense` | `?attr/textInputFilledDenseStyle`
**Estilo de menú desplegable expuesto** | `Widget.Material3.TextInputLayout.FilledBox.ExposedDropdownMenu` | `?attr/textInputFilledExposedDropdownMenuStyle`
**Estilo de menú desplegable expuesto denso** | `Widget.Material3.TextInputLayout.FilledBox.Dense.ExposedDropdownMenu` | N/A

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/values/styles.xml)
y
[attrs](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/values/attrs.xml).

</details>

<details>
<summary><h3>Campo de texto contorneado</h3></summary>

#### Atributos del contenedor

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color del trazo** | `app:boxStrokeColor` | `setBoxStrokeColor`<br/>`setBoxStrokeColorStateList`<br/>`getBoxStrokeColor` | `?attr/colorOutline` y `?attr/colorPrimary` (enfocado) (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_stroke_color.xml))
**Color del trazo de error** | `app:boxStrokeErrorColor` | `setBoxStrokeErrorColor`<br/>`getBoxStrokeErrorColor` | `?attr/colorError`
**Ancho del trazo** | `app:boxStrokeWidth` | N/A | `1dp`
**Ancho del trazo enfocado** | `app:boxStrokeWidthFocused` | N/A | `2dp`
**Forma** | `app:shapeAppearance` | N/A | `?attr/shapeAppearanceCornerExtraSmall`
**Campo de texto habilitado** | `android:enabled` | `setEnabled` | `true`

#### Atributos del ícono inicial

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Ícono** | `app:startIconDrawable` | `setStartIconDrawable`<br/>`getStartIconDrawable` | `null`
**Descripción del contenido** | `app:startIconContentDescription` | `setStartIconContentDescription`<br/>`getStartIconContentDescription` | `null`
**Color** | `app:startIconTint` | `setStartIconTintList` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Marcable** | `app:startIconCheckable` | `setStartIconCheckable`<br/>`isStartIconCheckable` | `false`

#### Atributos de la etiqueta

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto** | `android:hint` | `setHint`<br/>`getHint` | `null`
**Color** | `android:textColorHint` | `setDefaultHintTextColor`<br/>`getDefaultHintTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_label_color.xml))
**Color contraído (flotante)** | `app:hintTextColor` | `setHintTextColor`<br/>`getHintTextColor` | `?attr/colorPrimary`
**Tipografía** | `app:hintTextAppearance` | `setHintTextAppearance` | `?attr/textAppearanceBodySmall`
**Número máximo de líneas** | `app:hintMaxLines` | `setHintMaxLines`<br/>`getHintMaxLines` | `1`

**Nota:** `android:hint` siempre debe establecerse en `TextInputLayout` en lugar de en `EditText` para evitar comportamientos no deseados.

#### Atributos del texto de entrada (establecidos en `TextInputEditText`)

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto de entrada** | `android:text` | `setText`<br/>`getText` | `@null`
**Tipografía** | `android:textAppearance` | `setTextAppearance` | `?attr/textAppearanceBodyLarge`
**Color del texto de entrada** | `android:textColor` | `setTextColor`<br/>`getTextColors`<br/>`getCurrentTextColor` | `?attr/colorOnSurface`
**Color del cursor** | N/A (el color proviene del atributo de tema `?attr/colorControlActivated`) | N/A | `?attr/colorPrimary`
**Color de resaltado del texto** | N/A (el color proviene del atributo de tema `?android:attr/textColorHighlight`) | N/A | [`@color/m3_highlighted_text`](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/color/res/color/m3_highlighted_text.xml)

#### Atributos del texto de entrada (establecidos en `TextInputLayout`)

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Color del cursor** | `app:cursorColor` en niveles de API 28+ | `setCursorColor`<br/>`getCursorColor`<br/>en niveles de API 28+ | `@null` (usa `?attr/colorControlActivated` de forma predeterminada)
**Color del cursor de error** | `app:cursorErrorColor` en niveles de API 28+ | `setCursorErrorColor`<br/>`getCursorErrorColor`<br/>en niveles de API 28+ | `?attr/colorError` en niveles de API 28+, `?attr/colorControlActivated` en caso contrario

#### Atributos del ícono final

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Modo** | `app:endIconMode` | `setEndIconMode`<br/>`getEndIconMode` | `END_ICON_NONE`
**Color** | `app:endIconTint` | `setEndIconTintList` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Ícono personalizado** | `app:endIconDrawable` | `setEndIconDrawable`<br/>`getEndIconDrawable` | `null`
**Descripción del contenido del ícono personalizado** | `app:endIconContentDescription` | `setEndIconContentDescription`<br/>`getEndIconContentDescription` | `null`
**Ícono personalizado marcable** | `app:endIconCheckable` | `setEndIconCheckable`<br/>`isEndIconCheckable` | `true`
**Ícono de error** | `app:errorIconDrawable` | `setErrorIconDrawable`<br/>`getErrorIconDrawable` | [`@drawable/mtrl_ic_error`](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/drawable/mtrl_ic_error.xml)
**Color del ícono de error** | `app:errorIconTint` | `setErrorIconTintList` | `?attr/colorError`

#### Atributos de texto de ayuda/error/contador

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Texto de ayuda habilitado** | `app:helperTextEnabled` | `setHelperTextEnabled`<br/>`isHelperTextEnabled` | `false`
**Texto de ayuda** | `app:helperText` | `setHelperText`<br/>`getHelperText` | `null`
**Color del texto de ayuda** | `app:helperTextColor` | `setHelperTextColor`<br/>`getHelperTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del texto de ayuda** | `app:helperTextAppearance` | `setHelperTextAppearance` | `?attr/textAppearanceBodySmall`
**Texto de error habilitado** | `app:errorEnabled` | `setErrorEnabled`<br/>`isErrorEnabled` | `false`
**Texto de error** | N/A | `setError`<br/>`getError` | `null`
**Región activa de accesibilidad del texto de error** | `app:errorAccessibilityLiveRegion` | `setErrorAccessibilityLiveRegion`<br/>`getErrorAccessibilityLiveRegion` | `ViewCompat.ACCESSIBILITY_LIVE_REGION_POLITE`
**Color del texto de error** | `app:errorTextColor` | `setErrorTextColor`<br/>`getErrorCurrentTextColors` | `?attr/colorError`
**Tipografía del texto de error** | `app:errorTextAppearance` | `setErrorTextAppearance` | `?attr/textAppearanceBodySmall`
**Contador de texto habilitado** | `app:counterEnabled` | `setCounterEnabled`<br/>`isCounterEnabled` | `false`
**Longitud del contador de texto** | `app:counterMaxLength` | `setCounterMaxLength`<br/>`getCounterMaxLength` | `-1`
**Tipografía del contador de texto** | `app:counterTextAppearance`<br/>`app:counterOverflowTextAppearance` | `setCounterTextAppearance`<br/>`setCounterOverflowTextAppearance` | `?attr/textAppearanceBodySmall`
**Color del contador de texto** | `app:counterTextColor`<br/>`app:counterOverflowTextColor` | `setCounterTextColor`<br/>`setCounterOverflowTextColor`<br/>`getCounterTextColor`<br/>`getCounterOverflowTextColor` | `?attr/colorOnSurfaceVariant` (`app:counterTextColor`) (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))<br/>`?attr/colorError` (`app:counterOverflowTextColor`)

#### Atributos de prefijo/sufijo

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Prefijo** | `app:prefixText` | `setPrefixText`<br/>`getPrefixText` | `null`
**Color del prefijo** | `app:prefixTextColor` | `setPrefixTextColor`<br/>`getPrefixTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del prefijo** | `app:prefixTextAppearance` | `setPrefixTextAppearance` | `?attr/textAppearanceTitleMedium`
**Sufijo** | `app:suffixText` | `setSuffixText`<br/>`getSuffixText` | `null`
**Color del sufijo** | `app:suffixTextColor` | `setSuffixTextColor`<br/>`getSuffixTextColor` | `?attr/colorOnSurfaceVariant` (ver todos los [estados](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/color/m3_textfield_indicator_text_color.xml))
**Tipografía del sufijo** | `app:suffixTextAppearance` | `setSuffixTextAppearance` | `?attr/textAppearanceTitleMedium`

#### Estilos

Elemento | Estilo | Atributo de estilo de tema predeterminado
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.TextInputLayout.OutlinedBox` | `?attr/textInputStyle` y `?attr/textInputOutlinedStyle`
**Estilo denso** | `Widget.Material3.TextInputLayout.OutlinedBox.Dense` | `?attr/textInputOutlinedDenseStyle`
**Estilo de menú desplegable expuesto** | `Widget.Material3.TextInputLayout.OutlinedBox.ExposedDropdownMenu` | `?attr/textInputOutlinedExposedDropdownMenuStyle`
**Estilo de menú desplegable expuesto denso** | `Widget.Material3.TextInputLayout.OutlinedBox.Dense.ExposedDropdownMenu` | N/A

Para la lista completa, consulta
[estilos](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/values/styles.xml)
y
[attrs](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/values/attrs.xml).

</details>

## Variantes de campos de texto

### Campo de texto relleno

Los [campos de texto rellenos](https://material.io/components/text-fields/#filled-text-field)
tienen más énfasis visual que los campos de texto contorneados, lo que los hace destacar cuando están rodeados de otro contenido y componentes.

#### Ejemplos de campos de texto rellenos

El siguiente ejemplo muestra un campo de texto relleno con una etiqueta.

<img src="assets/textfields/textfields-filled.png" alt="Campo de texto relleno con una etiqueta." width="700"/>

En el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/textInputFilledStyle"
    android:id="@+id/filledTextField"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/label">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
    />

</com.google.android.material.textfield.TextInputLayout>
```

En el código:

```kt
// Obtener texto de entrada
val inputText = filledTextField.editText?.text.toString()

filledTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
    // Responder al cambio de texto de entrada
}
```

Consulta la sección [implementación de código](#code-implementation) a continuación para ver más
ejemplos.

### Campo de texto contorneado

Los [campos de texto contorneados](https://material.io/components/text-fields/#outlined-text-field)
tienen menos énfasis visual que los campos de texto rellenos. Cuando aparecen en formularios,
por ejemplo, donde se colocan muchos campos de texto juntos, su énfasis reducido
ayuda a simplificar el diseño.

**Nota:** El campo de texto contorneado es el estilo predeterminado.

#### Ejemplos de campos de texto contorneados

El siguiente ejemplo muestra un campo de texto contorneado.

<img src="assets/textfields/textfields-outlined.png" alt="Ejemplos de campos de texto contorneados" width="700"/>

En el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/outlinedTextField"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/label">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
    />

</com.google.android.material.textfield.TextInputLayout>
```

En el código:

```kt
// Obtener texto de entrada
val inputText = outlinedTextField.editText?.text.toString()

outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
    // Responder al cambio de texto de entrada
}
```

Consulta la sección [implementación de código](#code-implementation) a continuación para ver más
ejemplos.

## Implementación de código

Antes de poder usar los campos de texto de Material, debes agregar una dependencia a la
biblioteca de componentes de Material para Android. Para obtener más información, ve a la
página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

<details>
<summary><h3>Agregar campo de texto</h3></summary>

!["Campos de texto en una pantalla"](assets/textfields/textfields-hero.png)

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/textField"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/label">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
    />

</com.google.android.material.textfield.TextInputLayout>
```

**Nota:** Un campo de texto se compone de un `TextInputLayout` y un
`TextInputEditText` como hijo directo. Usar un `EditText` como hijo podría
funcionar, pero `TextInputEditText` proporciona soporte de accesibilidad para el campo de texto
y permite a `TextInputLayout` un mayor control sobre los aspectos visuales del
texto de entrada. Si se usa un `EditText`, asegúrate de establecer su
`android:background` en `@null` para que `TextInputLayout` pueda establecer el
fondo apropiado en él.

</details>

<details>
<summary><h3>Hacer que los campos de texto sean accesibles</h3></summary>

Las API del componente de campo de texto de Android admiten tanto el texto de la etiqueta como el texto de ayuda,
que explican qué se solicita para un campo de texto. Aunque son opcionales, se recomienda
encarecidamente su uso.

#### Descripción del contenido

Cuando uses **íconos personalizados**, debes establecer una descripción del contenido en ellos para
que los lectores de pantalla, como TalkBack, puedan anunciar su propósito o
acción.

Para el ícono inicial, eso se puede lograr a través del atributo
`app:startIconContentDescription` o el método `setStartIconContentDescription`.
Para el ícono final, eso se puede lograr a través del atributo
`app:endIconContentDescription` o el método `setEndIconContentDescription`.

Cuando establezcas un **mensaje de error** que contenga caracteres especiales que los lectores
de pantalla u otros sistemas de accesibilidad no puedan leer, debes establecer una
descripción del contenido a través del atributo `app:errorContentDescription` o el
método `setErrorContentDescription`. De esa manera, el error anunciará la
descripción del contenido en lugar del mensaje de error.

**Nota:** Los íconos que no tienen detectores de clics establecidos en ellos funcionan como elementos
decorativos y, por lo tanto, los lectores de pantalla los omiten.

#### `EditText` personalizado

Si estás usando un `EditText` personalizado como hijo de `TextInputLayout` y tu campo de
texto requiere un soporte de accesibilidad diferente al que ofrece
`TextInputLayout`, puedes establecer un `TextInputLayout.AccessibilityDelegate` a través del
método `setTextInputAccessibilityDelegate`. Este método debe usarse en lugar
de proporcionar un `AccessibilityDelegate` directamente en el `EditText`.

</details>

<details>
<summary><h3>Uso de campos de texto mediante programación</h3></summary>

Si construyes el hijo `TextInputEditText` de un `TextInputLayout`
mediante programación, debes usar el contexto de `TextInputLayout` para crear la vista.
Esto permitirá que `TextInputLayout` pase el estilo apropiado al
editor de texto.

```kt
val textInputLayout = TextInputLayout(context)
val editText = TextInputEditText(textInputLayout.context)
```

</details>

<details>
<summary><h3>Agregar un ícono inicial a un campo de texto</h3></summary>

<img src="assets/textfields/textfields-leading-icon.png" alt="Campo de texto con un ícono inicial." width="700"/>

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:startIconDrawable="@drawable/ic_search_24dp"
    app:startIconContentDescription="@string/content_description_start_icon">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

</details>

<details>
<summary><h3>Agregar un ícono final a un campo de texto</h3></summary>

**Conmutador de contraseña:**

<img src="assets/textfields/textfields-trailing-icon-password-toggle.png" alt="Campo de texto con un menú desplegable expuesto." width="700"/>

Cuando `TextInputEditText` está configurado para mostrar una contraseña, se puede agregar un ícono
para alternar entre enmascarar la contraseña o mostrar la contraseña como texto sin formato.

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:endIconMode="password_toggle">

    <com.google.android.material.textfield.TextInputEditText
        ...
        android:inputType="textPassword"
    />

</com.google.android.material.textfield.TextInputLayout>
```

**Borrar texto:**

<img src="assets/textfields/textfields-trailing-icon-clear-text.png" alt="Campo de texto con un ícono final para borrar texto." width="700"/>

Se puede configurar un ícono para que se muestre cuando haya texto presente. Se puede presionar el ícono
para borrar el texto de entrada.

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:endIconMode="clear_text">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

**Ícono personalizado:**

<img src="assets/textfields/textfields-trailing-icon-custom.png" alt="Campo de texto con un ícono final personalizado." width="700"/>

Es posible establecer un `Drawable` personalizado como ícono final del campo de texto a través de
`app:endIconMode="custom"`. Debes especificar un dibujable y una descripción del contenido
para el ícono, y tienes la opción de especificar comportamientos personalizados.

En el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:endIconMode="custom"
    app:endIconDrawable="@drawable/ic_accelerator_24dp"
    app:endIconContentDescription="@string/content_description_end_icon">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

Opcionalmente, en el código:

```kt
textField.setEndIconOnClickListener {
  // Responder a las pulsaciones del ícono final
}

textField.addOnEditTextAttachedListener {
  // Si se deben realizar cambios específicos cuando se adjunta el editor de texto (y
  // por lo tanto, cuando se le agrega el ícono final), establece un
  // OnEditTextAttachedListener.

  // Ejemplo: El comportamiento de visibilidad del ícono de borrar texto depende de si el
  // EditText tiene entrada presente. Por lo tanto, se establece un OnEditTextAttachedListener
  // para que se puedan llamar cosas como editText.getText().
}

textField.addOnEndIconChangedListener {
  // Si se deben realizar cambios específicos si/cuando se cambia el endIconMode
  //, establece un OnEndIconChangedListener.

  // Ejemplo: Si el ícono de alternar contraseña está configurado y se establece un EndIconMode
  // diferente, TextInputLayout debe asegurarse de que el
  // TransformationMethod del editor de texto siga siendo PasswordTransformationMethod. Debido a
  // eso, se usa un OnEndIconChangedListener.
}
```

**Nota:** Debes optar por usar la API `EndIconMode` en lugar de establecer un
`Drawable` compuesto final/derecho en el `TextInputEditText`. Lo mismo se aplica a
los atributos `passwordToggle*` ahora obsoletos.

**Importante:** Llamar a `setEndIconMode` inicializará el ícono con sus
características predeterminadas, como dibujables predeterminados, y en el caso del modo personalizado,
un dibujable vacío. Puedes agregar personalizaciones después de llamar a `setEndIconMode`.
La excepción para esto es si se especificó un dibujable en XML a través del
atributo `app:endIconDrawable`. Un dibujable de ícono final establecido en XML tendrá
precedencia y anulará un ícono predeterminado existente.

Para la lista completa, consulta
[modos de ícono final](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/res/values/attrs.xml#L149).

</details>

<details>
<summary><h3>Implementación de un menú desplegable expuesto</h3></summary>

<img src="assets/textfields/menus-exposed-dropdown-outlined.png" alt="Campo de texto con un menú desplegable expuesto." height="400"/>

En el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    style="@style/Widget.Material3.TextInputLayout.*.ExposedDropdownMenu">

    <AutoCompleteTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="none"
        app:simpleItems="@array/simple_items"
    />

</com.google.android.material.textfield.TextInputLayout>
```

La matriz de cadenas especificada por `app:simpleItems` se usará como las cadenas de elementos predeterminadas
para el autocompletado. O también puedes establecerlo mediante programación:

```kt
val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
(textField.editText as? MaterialAutoCompleteTextView)?.setSimpleItems(items)
```

Alternativamente, para tener más control sobre la representación de los elementos de autocompletado,
también puedes proporcionar un adaptador de elementos personalizado mediante:

```kt
val items = listOf("Item 1", "Item 2", "Item 3", "Item 4")
val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items)
(textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)
```

Y un diseño de elemento personalizado (`list_item.xml`):

```xml
<TextView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="16dp"
    android:ellipsize="end"
    android:maxLines="1"
    android:textAppearance="?attr/textAppearanceTitleMedium"
/>
```

</details>

<details>
<summary><h3>Agregar texto de ayuda a un campo de texto</h3></summary>

<img src="assets/textfields/textfields-helper-text.png" alt="Campo de texto con texto de ayuda." width="700"/>

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:helperTextEnabled="true"
    app:helperText="@string/helper_text">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

</details>

<details>
<summary><h3>Agregar un contador a un campo de texto</h3></summary>

<img src="assets/textfields/textfields-counter.png" alt="Campo de texto con un contador." width="700"/>

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:counterEnabled="true"
    app:counterMaxLength="20">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

</details>

<details>
<summary><h3>Agregar errores a un campo de texto</h3></summary>

<img src="assets/textfields/textfields-error.png" alt="Campo de texto con un error." width="700"/>

En el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:errorEnabled="true">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

En el código:

```kt
// Establecer texto de error
passwordLayout.error = getString(R.string.error)

// Borrar texto de error
passwordLayout.error = null
```

**Nota:** El texto de error no nulo reemplazará cualquier texto de ayuda existente, y
el texto de ayuda no nulo reemplazará cualquier texto de error existente.

</details>

<details>
<summary><h3>Agregar un prefijo/sufijo a un campo de texto</h3></summary>

<img src="assets/textfields/textfields-prefix-suffix.png" alt="Campo de texto con un prefijo/sufijo." width="700"/>

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    app:prefixText="@string/prefix"
    app:suffixText="@string/suffix">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

</details>

<details>
<summary><h3>Establecer las dimensiones del campo de texto</h3></summary>

El `android:layout_width` predeterminado recomendado es `245dp`.

De forma predeterminada, los campos de texto tienen un ancho máximo de `488dp` y un ancho mínimo de
`56dp` para diseños sin etiqueta. Si hay una etiqueta presente, el ancho mínimo
recomendado es `88dp`. `android:minWidth` y `android:maxWidth` (así como
`android:minEms` y `android:maxEms`) deben establecerse en `TextInputLayout`
en lugar de en `TextInputEditText` para evitar comportamientos no deseados.

Puedes anular esos valores en un estilo personalizado que herede de un
estilo `TextInputLayout` o realizando cambios directamente en el diseño:

```xml
<com.google.android.material.textfield.TextInputLayout
    android:id="@+id/textField"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:minWidth="@dimen/custom_min_width"
    android:maxWidth="@dimen/custom_max_width"
    android:hint="@string/label">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
    />

</com.google.android.material.textfield.TextInputLayout>
```

**Nota:** El `android:layout_width` del `TextInputLayout` debe ser
`wrap_content` para que se usen esas dimensiones mínimas y máximas.

</details>

## Personalización de campos de texto

### Tematización de campos de texto

Los campos de texto admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de campo de texto

API y código fuente:

*   `TextInputLayout`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/textfield/TextInputLayout)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/TextInputLayout.java)
*   `TextInputEditText`
    *   [Definición de clase](https://developer.android.com/reference/com/google/android/material/textfield/TextInputEditText)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/textfield/TextInputEditText.java)

El siguiente ejemplo muestra tipos de campos de texto rellenos y contorneados con tematización de Material.

!["Tematización de campos de texto rellenos y contorneados con colores rosa y marrón y esquinas cortadas"](assets/textfields/textfields-theming.png)

##### Implementación de la tematización del campo de texto

Usar atributos y estilos de tema en `res/values/styles.xml` agrega temas a todos
los campos de texto y afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="colorError">@color/shrine_red</item>
    <item name="textAppearanceTitleMedium">@style/TextAppearance.App.TitleMedium</item>
    <item name="textAppearanceBodySmall">@style/TextAppearance.App.BodySmall</item>
    <item name="shapeAppearanceCornerExtraSmall">@style/ShapeAppearance.App.Corner.ExtraSmall</item>
</style>

<style name="TextAppearance.App.TitleMedium" parent="TextAppearance.Material3.TitleMedium">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="TextAppearance.App.BodySmall" parent="TextAppearance.Material3.BodySmall">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>

<style name="ShapeAppearance.App.Corner.ExtraSmall" parent="ShapeAppearance.Material3.Corner.ExtraSmall">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">4dp</item>
</style>
```

Usar atributos de estilo de tema predeterminados, estilos y superposiciones de temas agrega temas a
todos los campos de texto pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="textInputStyle">@style/Widget.App.TextInputLayout</item>
</style>

<style name="Widget.App.TextInputLayout" parent="Widget.Material3.TextInputLayout.*">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.TextInputLayout</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Corner.ExtraSmall</item>
    <item name="hintTextColor">?attr/colorOnSurface</item>
</style>

<style name="ThemeOverlay.App.TextInputLayout" parent="">
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnSurface">@color/shrine_pink_900</item>
    <item name="colorError">@color/shrine_red</item>
    <item name="textAppearanceTitleMedium">@style/TextAppearance.App.TitleMedium</item>
    <item name="textAppearanceBodySmall">@style/TextAppearance.App.BodySmall</item>
    <item name="editTextStyle">@style/Widget.Material3.TextInputEditText.*</item>
</style>
```

Usar el estilo en el diseño afecta solo a este campo de texto:

```xml
<com.google.android.material.textfield.TextInputLayout
    ...
    style="@style/Widget.App.TextInputLayout">

    ...

</com.google.android.material.textfield.TextInputLayout>
```

**Nota:** Cuando establezcas una `materialThemeOverlay` en un estilo `TextInputLayout`
personalizado, no olvides establecer `editTextStyle` en un estilo
`@style/Widget.Material3.TextInputEditText.*` o en uno personalizado que
herede de ese. <br/> Los estilos `TextInputLayout` establecen
`materialThemeOverlay` para anular `editTextStyle` con el estilo `TextInputEditText`
específico necesario. Por lo tanto, no es necesario que especifiques una etiqueta de estilo
en el editor de texto.
