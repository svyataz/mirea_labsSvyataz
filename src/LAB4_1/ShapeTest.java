package LAB4_1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape inst;
        inst = new Square(12);
        System.out.println(inst.getArea());
        System.out.println(inst.getPerimeter());
        System.out.println(inst.getType());
        System.out.println(inst.toString());
        inst = new Circle(12);
        System.out.println(inst.getArea());
        System.out.println(inst.getPerimeter());
        System.out.println(inst.getType());
        System.out.println(inst.toString());
        inst = new Rectangle(12, 5);
        System.out.println(inst.getArea());
        System.out.println(inst.getPerimeter());
        System.out.println(inst.getType());
        System.out.println(inst.toString());
    }
}
