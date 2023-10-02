package LAB6;

public class ConvertableTest {
    public static void main(String[] args){
        Convertable inst = new Celsius(22);
        System.out.println(inst.convert(new Fahrenheit(12)));
        System.out.println(inst.convert(new Kelvin(22)));
    }
}
