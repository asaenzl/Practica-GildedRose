package modular;

public class Modular {
    Item[] items;

    public Modular(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = ItemUpdaterFactory.create(item);
            updater.update();
        }
    }
}
