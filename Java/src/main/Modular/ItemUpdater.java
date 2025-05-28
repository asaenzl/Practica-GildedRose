package modular;

// Clase abstracta: debe declararse como 'abstract' si tiene métodos abstractos
public abstract class ItemUpdater {
    protected Item item; // 'Item' con mayúscula, porque es una clase

    public ItemUpdater(Item item) {
        this.item = item;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void update();
}
