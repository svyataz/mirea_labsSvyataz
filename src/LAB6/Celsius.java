package LAB6;

public class Celsius implements Convertable{
    double term;

    public Celsius(double term) {
        this.term = term;
    }

    @Override
    public double convert(Convertable iter) {
        if (iter instanceof Fahrenheit){
            return ((5.0 / 9.0) * (term)) + 32;
        }
        return term + 273;
    }
}
