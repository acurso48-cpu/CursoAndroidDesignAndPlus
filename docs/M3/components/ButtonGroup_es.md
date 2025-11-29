<!--docs:
title: "Grupos de botones"
layout: detail
section: components
excerpt: "Un componente de botón personalizable con estilos visuales actualizados."
iconId: materialbutton
path: /catalog/buttons/
-->

# Grupos de botones

Los [grupos de botones](https://m3.material.io/components/button-groups/overview) organizan los botones y agregan interacciones entre ellos. Hay dos variantes de un grupo de botones.

![2 tipos de grupos de botones](assets/buttons/buttongroup-types.png)

1.  Grupo de botones estándar
2.  Grupo de botones conectados

**Nota:** Las imágenes utilizan varios esquemas de color dinámicos.

## Documentación de diseño y API

*   [Especificaciones de Material 3 (M3)](https://m3.material.io/components/button-groups/overview)
*   [Referencia de la API](https://developer.android.com/reference/com/google/android/material/button/package-summary)

## Anatomía

Los grupos de botones son contenedores invisibles que agregan relleno entre los botones y modifican la forma del botón. No contienen ningún botón de forma predeterminada.

![Anatomía de un grupo de botones](assets/buttons/buttongroup-anatomy.png)

1.  Contenedor

Más detalles sobre los elementos de la anatomía en las [guías del componente](https://m3.material.io/components/button-groups/guidelines#8fcef838-b0f2-4663-9df5-a8c140822fa6).

## M3 Expressive

### Actualización de M3 Expressive

Antes de que puedas usar los estilos de componentes `Material3Expressive`, sigue las [instrucciones de configuración de temas de `Material3Expressive`](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md#material3expressive-themes).

<img src="assets/buttons/buttongroup-expressive.png" alt="Grupo de botones estándar en 3 de 5 tamaños disponibles, y grupo de botones segmentados con solo botones de icono y solo botones comunes." height="500"/>

Los grupos de botones aplican cambios de forma, movimiento y ancho a los botones y botones de icono para hacerlos más interactivos.
[Más sobre M3 Expressive](https://m3.material.io/blog/building-with-m3-expressive)

Los grupos de botones son componentes nuevos agregados en Expressive.

**Tipos y nombres:**

*   Se agregó el grupo de botones estándar
*   Se agregó el grupo de botones conectados
    *   Usar en lugar del botón segmentado, que está obsoleto

**Configuraciones:**

*   Funciona con todos los tamaños de botón: XS, S, M, L y XL
*   Aplica la forma predeterminada a todos los botones: redondo o cuadrado

### Estilos de M3 Expressive

Estilos predeterminados en los temas expresivos:

-   Grupo de botones estándar: `Widget.Material3Expressive.MaterialButtonGroup`
-   Grupo de botones conectados: `Widget.Material3Expressive.MaterialButtonGroup.Connected`

## Propiedades clave

### Atributos de forma y tamaño

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Forma del grupo (esquinas exteriores)** | `app:shapeAppearance` | `setShapeAppearance`<br>`getShapeAppearance` | `none`
**Tamaño de las esquinas interiores** | `app:innerCornerSize` | `setInnerCornerSize`<br>`getInnerCornerSize` | `none`
**Espaciado entre botones** | `android:spacing` | `setSpacing`<br>`getSpacing` | `12dp`
**Cambio de tamaño del hijo** | `app:childSizeChange` | N/A | `15%` en presionado,<br>de lo contrario, `0%`
**Modo de desbordamiento del hijo** | `app:overflowMode` | `setOverflowMode`<br>`getOverflowMode` | `none`
**Icono del botón de desbordamiento** | `app:overflowButtonIcon` | `setOverflowButtonIcon` | `abc_ic_menu_overflow_material` (3 puntos)

### Atributos adicionales de los botones hijos

Elemento | Atributo | Método(s) relacionado(s) | Valor predeterminado
--- | --- | --- | ---
**Título del elemento del menú de desbordamiento** | `app:layout_overflowText`| N/A | valor `text` del botón, si no se especifica o está vacío
**Icono del elemento del menú de desbordamiento** | `app:layout_overflowIcon`| N/A | `null`

### Estilos y atributos de tema

Elemento | Estilo | Atributo de tema
--- | --- | ---
**Estilo predeterminado** | `Widget.Material3.MaterialButtonGroup` | `?attr/materialButtonGroupStyle`
**Estilo del botón de icono de desbordamiento** | `?attr/materialIconButtonStyle` | `?attr/materialButtonGroupOverflowButtonStyle`
**Estilo del menú de desbordamiento** | `?attr/popupMenuStyle` | `?attr/materialButtonGroupOverflowPopupMenuStyle`

## Variantes de grupos de botones

<details>

<summary><h3>Grupo de botones estándar</h3></summary>

El grupo de botones estándar contiene varios botones individuales relacionados. Se conserva la forma del botón individual.

![Ejemplos de uso del grupo de botones estándar](assets/buttons/standard-button-group.png)

#### Ejemplos de grupos de botones

Código fuente:

*   `MaterialButtonGroup`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButtonGroup.java)
*   `MaterialButton`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un grupo de botones con tres botones que tienen etiquetas de texto.

En el diseño:

```xml
<com.google.android.material.button.MaterialButtonGroup
    android:id="@+id/buttonGroup"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 1"
    />
    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 2"
    />
    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 3"
    />
</com.google.android.material.button.MaterialButtonGroup>
```

</details>

<details>

<summary><h3>Grupo de botones conectados</h3></summary>

Además de los grupos de botones estándar, el grupo de botones conectados también anula la forma del botón individual para que visualmente pertenezcan más a un grupo con un espaciado de 2dp, esquinas interiores de 8dp y esquinas exteriores completamente redondeadas.

![Ejemplos de uso del grupo de botones conectados](assets/buttons/connected-button-group.png)

#### Ejemplos de grupos de botones conectados

Código fuente:

*   `MaterialButtonGroup`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButtonGroup.java)
*   `MaterialButton`
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra un grupo de botones conectados con tres botones que tienen etiquetas de texto. Para diseñar correctamente un grupo de botones como un grupo de botones conectados, se debe establecer el estilo específico.

En el diseño:

```xml
<com.google.android.material.button.MaterialButtonGroup
    android:id="@+id/buttonGroup"
    style="@style/Widget.Material3.MaterialButtonGroup.Connected"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 1" />
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 2" />
    <Button
        style="?attr/materialButtonOutlinedStyle"
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Botón 3" />
</com.google.android.material.button.MaterialButtonGroup>
```

</details>

## Implementación del código

Antes de poder usar los grupos de botones de Material, debes agregar una dependencia a la biblioteca de componentes de Material para Android. Para obtener más información, consulta la página [Primeros pasos](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md).

**Nota:** `<Button>` se infla automáticamente como `<com.google.android.material.button.MaterialButton>` a través de `MaterialComponentsViewInflater` cuando se usa un tema `Theme.Material3.*`.

### Hacer que los grupos de botones sean adaptables

`MaterialButtonGroup` hereda de `LinearLayout`. Se puede configurar para lograr diferentes arreglos de hijos para diferentes tamaños de pantalla o pantallas plegables usando `layout_width` y `layout_weight`.

<details>

<summary><h4>Tamaños de botón fijos</h4></summary>

Cuando los botones hijos no deben ajustarse mientras cambia el tamaño de la pantalla, considera usar `layout_width` en todos los botones.

![Grupo de botones con arreglo fijo](assets/buttons/group-arrangement-fixed.png)

```xml
<com.google.android.material.button.MaterialButtonGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingBottom="8dp"
    android:gravity="center_horizontal"
    android:spacing="4dp">
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_button_previous_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_previous_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_button_play_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_play_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_button_next_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_next_icon"/>
</com.google.android.material.button.MaterialButtonGroup>
```

</details>

<details>

<summary><h4>Tamaños de botón flexibles</h4></summary>

Cuando todos los botones hijos son igualmente importantes o sus tamaños son proporcionales entre sí, considera usar `layout_weight` en todos los botones.

![Grupo de botones con arreglo flexible](assets/buttons/group-arrangement-flexible.png)

```xml
<com.google.android.material.button.MaterialButtonGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingBottom="8dp"
    android:gravity="center_horizontal"
    android:spacing="4dp">
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:contentDescription="@string/cat_button_previous_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_previous_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="2"
        android:contentDescription="@string/cat_button_play_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_play_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:contentDescription="@string/cat_button_next_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_next_icon"/>
</com.google.android.material.button.MaterialButtonGroup>
```

</details>

<details>

<summary><h4>Tamaños de botón mixtos</h4></summary>

Cuando solo algunos botones son flexibles para diferentes tamaños de pantalla, considera usar `layout_weight` en estos botones pero usa `layout_width` en el resto como se muestra a continuación.

![Grupo de botones con arreglo mixto](assets/buttons/group-arrangement-mixed.png)

```xml
<com.google.android.material.button.MaterialButtonGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingBottom="8dp"
    android:gravity="center_horizontal"
    android:spacing="4dp">
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_button_previous_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_previous_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="2"
        android:contentDescription="@string/cat_button_play_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_play_icon"/>
    <Button
        style="?attr/materialIconButtonFilledStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/cat_button_next_icon"
        android:gravity="center"
        app:iconGravity="textStart"
        app:icon="@drawable/cat_button_next_icon"/>
</com.google.android.material.button.MaterialButtonGroup>
```

</details>

### Manejo de desbordamiento

El desbordamiento ocurre cuando el tamaño de la pantalla o el tamaño del grupo de botones no es suficiente para mostrar todos los botones hijos. De forma predeterminada (modo `none`), el texto del botón se recortará o ajustará.

#### Modo de desbordamiento - menú

![Modo de menú de desbordamiento del grupo de botones](assets/buttons/buttongroup-overflow-menu.png)

Establecer `overflowMode=menu` oculta dinámicamente los botones hijos que no caben en el ancho de la pantalla actual en un menú emergente. Se agregará automáticamente un botón de icono al final del grupo de botones para alternar el menú emergente, una vez que sea necesario. El estilo de este botón de icono se puede establecer a través del atributo `materialButtonGroupOverflowButtonStyle` en tu superposición de tema. El icono se puede configurar a través de `overflowButtonIcon` en el grupo de botones.

Cada botón hijo oculto estará representado por un `MenuItem` en el menú emergente. Puedes especificar el título del elemento del menú a través de `layout_overflowText` y el icono del elemento del menú a través de `layout_overflowIcon` en el botón específico.

**Nota:** No uses el modo de desbordamiento de `menu` para alternar el grupo de botones, ya que el grupo de botones de alternancia debe demostrar todas las opciones disponibles y la selección actual.

**Nota:** Esta función asume que todos los botones hijos deben estar visibles en el grupo o como un elemento de menú en el menú de desbordamiento. La visibilidad de todos los botones hijos será administrada por el grupo de botones al establecer `overflowMode=menu`.

#### Modo de desbordamiento - ajuste

![Modo de ajuste de desbordamiento del grupo de botones](assets/buttons/buttongroup-overflow-wrap.png)

Establecer `overflowMode=wrap` hará que los botones se ajusten a la siguiente línea cuando no quepan en la línea actual. Esto puede ser útil cuando deseas mostrar todos los botones sin ocultarlos en un menú, pero tienes una cantidad limitada de espacio horizontal. Los botones mantendrán su forma y tamaño como se define en el diseño.

Este modo es útil en los casos:

*   **Diseños responsivos:** Cuando deseas que los botones se adapten a diferentes tamaños de pantalla ajustándose a la siguiente línea en lugar de ocultarse.
*   **Interfaces con mucho contenido:** Cuando tienes muchos botones y quieres asegurarte de que todos estén visibles, incluso en pantallas más pequeñas.
*   **Accesibilidad:** Cuando necesitas mostrar todos los botones pero no hay suficiente espacio.

##### Configuración

No uses el modo de desbordamiento de `wrap` con `layout_width="wrap_content"`, `orientation="vertical"` o `layout_weight` en los botones hijos, debido a comportamientos esperados indefinidos. El `layout_width` se puede establecer en un tamaño de dp fijo o `match_parent`. La altura del grupo está determinada por el número de filas ajustadas y el espaciado. Por lo tanto, se ignorará el valor de `layout_height`.

##### Gravedad del ajuste

Para que los botones hijos se ajusten a la posición correcta, deben tener establecido `layout_gravity`. Cuando se usa `start|top`, se puede ignorar `android:gravity` en `MaterialButtonGroup`. Si se usa `end|top`, `android:gravity` en `MaterialButtonGroup` también debe establecerse en `end`.

### Hacer que los botones sean accesibles

Los botones admiten el etiquetado de contenido para la accesibilidad y la mayoría de los lectores de pantalla, como TalkBack, pueden leerlos. El texto representado en los botones se proporciona automáticamente a los servicios de accesibilidad. Por lo general, no se necesitan etiquetas de contenido adicionales.

Para obtener más información sobre las etiquetas de contenido, consulta la [guía de ayuda de accesibilidad de Android](https://support.google.com/accessibility/android/answer/7158690).

## Personalización de grupos de botones

### Tematización de botones

Los botones admiten la personalización de color, tipografía y forma.

#### Ejemplo de tematización de botones

API y código fuente:

*   `MaterialButton`
    *   [Descripción de la clase](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)
    *   [Código fuente de la clase](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/button/MaterialButton.java)

El siguiente ejemplo muestra los tipos de botones de texto, delineado y relleno con tematización de Material.

!["Tematización de botones con tres botones (texto, delineado y relleno) con tematización de color rosa y esquinas cortadas."](assets/buttons/button-theming.png)

##### Implementación de la tematización de botones

Usa atributos y estilos de tema en `res/values/styles.xml` para agregar el tema a todos los botones. Esto afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="colorPrimary">@color/shrine_pink_100</item>
    <item name="colorOnPrimary">@color/shrine_pink_900</item>
    <item name="textAppearanceLabelLarge">@style/TextAppearance.App.Button</item>
    <item name="shapeCornerFamily">cut</item>
</style>

<style name="TextAppearance.App.Button" parent="TextAppearance.Material3.LabelLarge">
    <item name="fontFamily">@font/rubik</item>
    <item name="android:fontFamily">@font/rubik</item>
</style>
```

Usa atributos de tema de estilo predeterminado, estilos y superposiciones de tema. Esto agrega el tema a todos los botones pero no afecta a otros componentes:

```xml
<style name="Theme.App" parent="Theme.Material3.*">
    ...
    <item name="borderlessButtonStyle">@style/Widget.App.Button.TextButton</item>
    <item name="materialButtonOutlinedStyle">@style/Widget.App.Button.OutlinedButton</item>
    <item name="materialButtonStyle">@style/Widget.App.Button</item>
</style>

<style name="Widget.App.Button.TextButton" parent="Widget.Material3.Button.TextButton">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button.TextButton</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="Widget.App.Button.OutlinedButton" parent="Widget.Material3.Button.OutlinedButton">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button.TextButton</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="Widget.App.Button" parent="Widget.Material3.Button">
    <item name="materialThemeOverlay">@style/ThemeOverlay.App.Button</item>
    <item name="android:textAppearance">@style/TextAppearance.App.Button</item>
    <item name="shapeAppearance">@style/ShapeAppearance.App.Button</item>
</style>

<style name="ThemeOverlay.App.Button.TextButton" parent="ThemeOverlay.Material3.Button.TextButton">
    <item name="colorOnContainer">@color/shrine_pink_900</item>
</style>

<style name="ThemeOverlay.App.Button" parent="ThemeOverlay.Material3.Button">
    <item name="colorContainer">@color/shrine_pink_100</item>
    <item name="colorOnContainer">@color/shrine_pink_900</item>
</style>

<style name="ShapeAppearance.App.Button" parent="">
    <item name="cornerFamily">cut</item>
    <item name="cornerSize">4dp</item>
</style>
```

Usa uno de los estilos en el diseño. Eso afectará solo a este botón:

```xml

<Button style="@style/Widget.App.Button".../>
```

### Centrado óptico

El centrado óptico significa desplazar el contenido de `MaterialButton` (icono y/o etiqueta) cuando la forma es asimétrica. Antes del centrado óptico, solo proporcionábamos centrado con formas horizontalmente asimétricas.

Para activar el centrado óptico para un botón determinado, usa `setOpticalCenterEnabled(true)`. El centrado óptico está deshabilitado de forma predeterminada. Cuando está habilitado, la cantidad de desplazamiento del icono y/o texto se calcula como un valor con la proporción fija a la diferencia entre el tamaño de la esquina izquierda en dp y el tamaño de la esquina derecha en dp. La cantidad de desplazamiento se aplica al relleno inicial y al relleno final.
