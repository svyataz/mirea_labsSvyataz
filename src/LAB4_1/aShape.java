package LAB4_1;

abstract public class aShape {
    protected String color;
    protected boolean filled;

    public aShape() {
    }

    public aShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}
