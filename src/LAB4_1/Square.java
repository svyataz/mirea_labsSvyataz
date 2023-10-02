package LAB4_1;

public class Square extends Shape{
    final private double side1;
    public Square(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getArea() {
        return side1 * side1;
    }

    @Override
    public double getPerimeter() {
        return side1  * side1;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                '}';
    }
}
