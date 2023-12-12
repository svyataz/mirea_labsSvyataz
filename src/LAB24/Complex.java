package LAB24;

public  class Complex {
    int real;
    int image;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
    }
}
