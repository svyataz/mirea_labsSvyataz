package LAB3;

public class TASK1 {
    public static void main(String[] args) {
        Double test_Double = Double.valueOf(12);
        String st = "20.7";
        Double test_Double2 = Double.parseDouble(st);

        byte b = test_Double.byteValue();
        short s = test_Double.shortValue();
        int i = test_Double.intValue();
        long l = test_Double.longValue();
        float f = test_Double.floatValue();
        double d = test_Double.doubleValue();

        System.out.println(test_Double);

        String stod = Double.toString(3.14);
        System.out.println(stod);
    }
}
