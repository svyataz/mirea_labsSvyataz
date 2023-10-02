package LAB4;

public class Skirt extends Clothes implements WomenClothing{
    @Override
    public void DressWomen() {

    }
    public Skirt(sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
