package LAB12;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}
