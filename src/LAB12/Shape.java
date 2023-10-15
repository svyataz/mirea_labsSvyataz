package LAB12;

import java.awt.*;
import java.util.Random;
abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    public abstract void draw(Graphics g);
}
