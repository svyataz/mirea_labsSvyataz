package LAB7;

public class MathFunc implements MathCalculable{

    public double Circle_area(double r){
        return PI * r * r;
    }

    @Override
    public double pow(double num, int power) {
        double ans = 1;
        if (power < 0) {
            for (int i = 0; i > power; i--)
                ans /= num;
        }else {
            for (int i = 0; i < power; i++)
                ans *= num;
        }
        return ans;
    }

    @Override
    public double absFactorial(int num) {
        double ans = 1;
        for (int i = 1; i < num + 1; i++)
            ans*=i;
        return ans;
    }
}
