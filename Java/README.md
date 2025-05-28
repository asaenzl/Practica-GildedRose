# Gilded Rose principios de construccion, correcion

## Angelica Saenz

### El siguiente codigo pretende documentarse explicando como se usa las tecnicas mostradas en clase

## Clases Creadas en java:

| Principio | Aplicación |
|-----------|------------|
| **S**: Responsabilidad única | Cada clase tiene una sola responsabilidad. |
| **O**: Abierto/Cerrado | Puedes agregar nuevos ítems sin modificar las clases existentes. |
| **L**: Sustitución de Liskov | Las subclases de `ItemUpdater` pueden usarse sin alterar el comportamiento esperado. |
| **I**: Segregación de interfaces | No aplica directamente aquí, pero el diseño es simple y enfocado. |
| **D**: Inversión de dependencias | `Modular` depende de la abstracción `ItemUpdater`, no de clases concretas. |

# Arquitectura del codigo
```
Modular
  └── usa → ItemUpdater (estrategia)
            ├── AgedBrieUpdater
            ├── BackstagePassUpdater
            ├── SulfurasUpdater
            └── DefaultItemUpdater
```

## Clases:

### 🧱 1. `Item.java`

📌 **Función:**
Representa un producto con sus propiedades fundamentales:

- `name`: nombre del ítem
- `sellIn`: días restantes para vender el ítem
- `quality`: calidad del ítem

✅ **Principios aplicados:**

- **SRP (Responsabilidad Única):**
  La clase tiene una única responsabilidad: modelar los datos de un ítem. No contiene lógica de negocio.

- **Alta cohesión:**
  Todos sus atributos están relacionados entre sí y su único método (`toString()`) está directamente vinculado a su propósito de representar datos.
-----

### 🧱 2. `ItemUpdater.java` (abstracta)

📌 **Función:**
Define la interfaz común (estrategia) para actualizar ítems.

✅ **Principios aplicados:**

- **Strategy Pattern:** Es la interfaz de estrategia.
- **OCP (Abierto/Cerrado):** Puedes agregar nuevas estrategias sin modificar esta clase.
- **DIP (Inversión de dependencias):** `Modular` depende de esta abstracción, no de clases concretas.

---

### 🧱 3. `AgedBrieUpdater.java`

📌 **Función:**
Implementa la lógica específica para actualizar "Aged Brie".

✅ **Principios aplicados:**

- **SRP:** Solo actualiza ítems tipo "Aged Brie".
- **OCP:** Puedes modificar esta clase sin afectar otras.
- **LSP (Sustitución de Liskov):** Puede usarse donde se espera un `ItemUpdater`.

---

### 🧱 4. `BackstagePassUpdater.java`

📌 **Función:**
Implementa la lógica para "Backstage passes".

✅ **Principios aplicados:**

- Igual que `AgedBrieUpdater`: **SRP**, **OCP**, **LSP**.

---

### 🧱 5. `SulfurasUpdater.java`

📌 **Función:**
Implementa la lógica para "Sulfuras", que no cambia.

✅ **Principios aplicados:**

- **SRP:** Solo maneja ítems legendarios.
- **LSP:** Puede sustituir a cualquier `ItemUpdater`.

---

### 🧱 6. `DefaultItemUpdater.java`

📌 **Función:**
Lógica para ítems normales (sin reglas especiales).

✅ **Principios aplicados:**

- **Reutilización:** Se puede usar para muchos ítems comunes.
- **KISS:** Lógica simple y clara.
- **DRY:** Evita repetir lógica en múltiples lugares.

---

### 🧱 7. `ItemUpdaterFactory.java`

📌 **Función:**
Selecciona la estrategia adecuada (`ItemUpdater`) según el nombre del ítem.

✅ **Principios aplicados:**

- **Strategy Pattern:** Es el selector de estrategia.
- **OCP:** Puedes agregar nuevas estrategias sin modificar otras clases.
- **Desacoplamiento:** `Modular` no necesita saber qué clase usar.

---

### 🧱 8. `Modular.java`

📌 **Función:**
Coordina la actualización de todos los ítems usando sus estrategias.

✅ **Principios aplicados:**

- **DIP:** Depende de `ItemUpdater`, no de clases concretas.
- **SRP:** Solo se encarga de recorrer y actualizar ítems.
- **Legibilidad y mantenibilidad:** Código limpio y fácil de extender.

---

### 🧱 9. `Main.java`

📌 **Función:**
Punto de entrada para probar el sistema.

✅ **Principios aplicados:**

- **Separación de responsabilidades:** Solo ejecuta y muestra resultados.
- **Reutilización:** Puedes cambiar los ítems sin tocar la lógica del sistema.



----

### Correr en Java

Correr solamente la carpeta modular y la clase main. Ignorar la carpeta java y test

```
src/main/Main
```

