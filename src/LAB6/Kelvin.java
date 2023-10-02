package LAB6;

public class Kelvin implements Convertable{
    double term;
    public Kelvin(double term) {
        this.term = term;
    }
    @Override
    public double convert(Convertable iter) {
        if (iter instanceof Celsius){
            return term - 273 ;
        }
        return ((5.0 / 9.0) * (term - 273) + 32);
    }
}
