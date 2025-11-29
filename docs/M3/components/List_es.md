# Listas

Las [Listas](https://m3.material.io/components/lists) son índices continuos y verticales de texto o imágenes.

Los elementos de la lista pueden tener texto y valores de soporte.

**Nota:** Las imágenes usan varios esquemas de color dinámicos.

## Documentación de Diseño y API

*   [Especificación de Material 3 (M3)](https://m3.material.io/components/lists/overview/)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/listitem/package-summary)

## Anatomía

1.  Miniatura de video principal (opcional)
2.  Contenedor
3.  Titular
4.  Texto de soporte (opcional)
5.  Texto de soporte final (opcional)
6.  Icono principal (opcional)
7.  Texto de la etiqueta del avatar principal (opcional)
8.  Icono final (opcional)
9.  Contenedor del avatar principal (opcional)
10. Divisor (opcional)

## Tamaños de los elementos de la lista

Los elementos de la lista vienen en tres tamaños:

1.  **De una línea:** contienen un máximo de una línea de texto.
2.  **De dos líneas:** contienen un máximo de dos líneas de texto.
3.  **De tres líneas:** contienen un máximo de tres líneas de texto.

## Implementación en código

Se recomienda implementar Listas con un `RecyclerView` siguiendo las directrices de diseño de la [especificación de Material 3 (M3)](https://m3.material.io/components/lists/overview/).

Ejemplo de un `ViewHolder` con un elemento de lista de una línea:

```xml
<LinearLayout ...>
  <ImageView .../>
  <TextView .../>
</LinearLayout>
```

*   Usa listas para ayudar a los usuarios a encontrar un elemento específico y actuar sobre él.
*   Ordena los elementos de la lista de manera lógica (como alfabética o numérica).
*   Mantén los elementos cortos y fáciles de escanear.
*   Muestra iconos, texto y acciones en un formato consistente.

## M3 Expresivo

Una variante expresiva de la Lista está en progreso y está disponible para su uso a través de un nuevo `ListItemLayout`.

`ListItemLayout` es un contenedor para el contenido de la Lista al que se le aplican los siguientes estados de posición de `Drawable`:

- `android.R.attr.state_first`
- `android.R.attr.state_middle`
- `android.R.attr.state_last`
- `android.R.attr.state_single`

Los hijos de `ListItemLayout` que deseen ser afectados por el estado de posición del `ListItemLayout` deben duplicar el estado estableciendo `android:duplicateParentState=true`. Se recomienda `MaterialCardView` como hijo de `ListItemLayout`.

Puedes actualizar la apariencia de un `ListItemLayout` según su posición en una lista llamando a `ListItemLayout.updateAppearance(position, itemCount)`. Si usas un `RecyclerView`, puedes usar `ListItemViewHolder` en su lugar y llamar a `ListItemViewHolder.bind()` al vincular el `ViewHolder` para hacer esto automáticamente.

También puedes implementar listas de varias secciones llamando a `ListItemLayout.updateAppearance(position, itemCount)` con `position` e `itemCount` relativos a la sección en lugar de a toda la lista.
