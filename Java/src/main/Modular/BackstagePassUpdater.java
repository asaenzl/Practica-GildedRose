package modular;

public class BackstagePassUpdater extends ItemUpdater {
    public BackstagePassUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellin--;
        if (item.sellin < 0) {
            item.quality = 0;
        } else if (item.sellin < 5) {
            item.quality = Math.min(item.quality + 3, 50);
        } else if (item.sellin < 10) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
    }
}
