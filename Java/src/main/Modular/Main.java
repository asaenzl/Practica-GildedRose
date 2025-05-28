package modular;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        };

        Modular app = new Modular(items);

        System.out.println("Items before update:");
        for (Item item : items) {
            System.out.println(item);
        }

        app.updateQuality();

        System.out.println("\nItems after update:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
