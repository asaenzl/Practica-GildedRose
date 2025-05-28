package modular;

public class DefaultItemUpdater extends ItemUpdater {
    public DefaultItemUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellin--;
        if (item.quality > 0) {
            item.quality--;
            if (item.sellin < 0 && item.quality > 0) {
                item.quality--;
            }
        }
    }
}
