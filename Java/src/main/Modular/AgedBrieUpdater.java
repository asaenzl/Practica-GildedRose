package modular;

public class AgedBrieUpdater extends ItemUpdater {
    public AgedBrieUpdater(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellin--;

        if (item.quality < 50) {
            item.quality++;

            if (item.sellin < 0 && item.quality < 50) {
                item.quality++;
            }
        }
    }
}
