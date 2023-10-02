package LAB4;

public class Pants extends Clothes implements MenClothing,  WomenClothing{
    @Override
    public void DressMan() {

    }

    @Override
    public void DressWomen() {

    }
    public Pants(sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
