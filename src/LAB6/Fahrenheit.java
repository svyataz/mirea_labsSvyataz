package LAB6;

public class Fahrenheit implements Convertable{
    double term;

    public Fahrenheit(double term) {
        this.term = term;
    }

    @Override
    public double convert(Convertable iter) {
        if (iter instanceof Celsius){
            return (9 / 5) * (term) - 32;
        }
        return ((9 / 5) * (term) - 32) + 273;
    }
}
