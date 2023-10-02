package LAB4_1;

public class aSquare extends aRectangle{
    private double side;
    public aSquare(double side) {
        this.side = side;
    }

    public aSquare() {
    }

    public aSquare(String color, boolean filled, double side) {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side  * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side +
                '}';
    }
}
