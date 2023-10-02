package LAB4_1;

public class aCircle extends  aShape{
    protected double radius;

    public aCircle() {
    }

    public aCircle(double radius) {
        this.radius = radius;
    }

    public aCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "aCircle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
