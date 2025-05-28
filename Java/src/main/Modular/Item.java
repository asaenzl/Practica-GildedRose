package modular;

//Representa un producto con name, sellIn y quality.

public class Item {
    public String name;
    public int sellin;
    public int quality;

    public Item(String name, int sellin, int quality){
        this.name = name;
        this.sellin = sellin;
        this.quality = quality;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.sellin + ", " + this.quality;
    }
}
