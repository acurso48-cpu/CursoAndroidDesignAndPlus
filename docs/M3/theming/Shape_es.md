# Temas de Forma

Material Design fomenta la expresión de la marca a través de las formas. La librería de Material Components ofrece una librería de `shape` que se puede usar para crear formas no estándar usando un `MaterialShapeDrawable`, un `Drawable` que puede dibujar formas personalizadas teniendo en cuenta sombras, elevación, escala y color.

Además de la librería de formas, la librería de Material Components proporciona un mecanismo con el cual personalizar fácilmente las formas de los componentes a nivel de tema. Los temas de forma ofrecen una nueva dimensión con la cual personalizar la apariencia de tu aplicación.

## Documentación de Diseño y API

-   [Guías de Material Design 3: Forma](https://m3.material.io/styles/shape/overview/)

## Cómo funciona

### `MaterialShapeDrawable` y `ShapeAppearanceModel`

`MaterialShapeDrawable` comienza con una ruta generada por un `ShapeAppearanceModel`. Un `ShapeAppearanceModel` está hecho de `CornerTreatment`s y `EdgeTreatment`s que se combinan para crear una ruta de forma personalizada, y generalmente se pasa al constructor de un `MaterialShapeDrawable`.

La librería `shape` proporciona algunas subclases de `CornerTreatment` y `EdgeTreatment` para facilitar la construcción de nuevas formas:

-   [`CutCornerTreatment`](https://developer.android.com/reference/com/google/android/material/shape/CutCornerTreatment)
-   [`RoundedCornerTreatment`](https://developer.android.com/reference/com/google/android/material/shape/RoundedCornerTreatment)
-   [`TriangleEdgeTreatment`](https://developer.android.com/reference/com/google/android/material/shape/TriangleEdgeTreatment)

Both `CornerTreatment` and `EdgeTreatment` can be subclassed to create custom
corners and edges.

**Nota:** Al subclasificar `CornerTreatment` o `EdgeTreatment`, asegúrate de implementar la interfaz `Cloneable` para garantizar que `ShapeAppearanceModel` pueda crear copias profundas de los tratamientos de esquina y borde.

### Tematizando `MaterialShapeDrawable`s

Los componentes respaldados por `MaterialShapeDrawable`s pueden usar temas en toda una aplicación.

#### Estilos de forma

Nombre del Estilo | Descripción | Tamaños de Esquina
--- | --- | ---
`ShapeAppearance.Material3.Corner.None` | Sin esquinas (i.e., completamente rectangular) | 0dp
`ShapeAppearance.Material3.Corner.ExtraSmall` | Forma con tamaño de esquina extra pequeño | 4dp
...
`ShapeAppearance.Material3.Corner.Full` | Forma con tamaño de esquina completo | 50%

Estos son los estilos de forma que proporcionan la escala de formas de Material 3. Las familias de formas en estos estilos (i.e., `cornerFamily`) se mapean al atributo de tema `?attr/shapeCornerFamily`.

#### Atributos de tema de forma

Se pueden establecer atributos de tema a nivel de tema para cambiar los valores de forma que los componentes usan para establecer sus formas.

Nombre del Atributo | Descripción | Valor por defecto
--- | --- | ---
`shapeCornerFamily` | La familia de esquina para todos los estilos de apariencia de forma | `rounded`
`shapeAppearanceCornerExtraSmall` | La referencia de estilo que contiene la apariencia de forma con esquinas extra pequeñas | `ShapeAppearance.Material3.Corner.ExtraSmall`
...

### Familia de esquina y tamaños de esquina

Rol de Forma | Atributo de Android | valores
--- | --- | ---
Familia de Esquina | shapeCornerFamily | Rounded
...

**Nota**: No hay una verificación de cordura para los valores de forma mapeados a estos atributos de tema. Es responsabilidad del desarrollador garantizar la corrección relativa.

## Uso

### Construyendo una apariencia de forma

Las formas de los componentes están respaldadas por "apariencias de forma", que son referencias de estilo que definen aspectos de la forma. `ShapeAppearanceModel` usa el estilo `shapeAppearance` y crea tratamientos de esquina y borde a partir de los valores de `shapeAppearance`.

#### Atributos `shapeAppearance` y `shapeAppearanceOverlay`

Se proporcionan dos atributos para establecer el estilo de forma de un componente:

-   `shapeAppearance`: Referencia de estilo que contiene valores de forma.
-   `shapeAppearanceOverlay`: Referencia de estilo que contiene valores de forma que se superponen sobre un estilo `shapeAppearance`.

**Nota:** Los estilos `shapeAppearance` requieren que se establezcan tanto `cornerSize` como `cornerFamily`, mientras que `shapeAppearanceOverlay` no.

### Usando `shapeAppearance` en el tema

La librería de Material Components soporta la tematización de formas a nivel de aplicación. Para aplicar formas de tema en tu app, especifica los atributos de tema de forma en tu tema.

### Personalizando formas de componentes

#### Sobrescrituras de componentes a nivel de tema
Puedes cambiar la forma de un componente en toda la app definiendo un `shapeAppearanceOverlay` personalizado en el estilo del componente y luego estableciendo el estilo por defecto del componente en tu tema (`materialCardViewStyle`, etc.).

#### Sobrescrituras de componentes individuales
También puedes cambiar la forma de un componente individual caso por caso estableciendo el atributo `shapeAppearanceOverlay` en el componente en tu layout.

### Componentes soportados

Los componentes que soportan temas de forma tienen un atributo `shapeAppearance`, un atributo `shapeAppearanceOverlay`, y están respaldados por un `MaterialShapeDrawable`.
