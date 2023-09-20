package LAB2;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
