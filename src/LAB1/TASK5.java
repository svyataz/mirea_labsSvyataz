package LAB1;
import java.math.BigInteger;

public class TASK5 {
    private static BigInteger factorial(int n){
        BigInteger ans= BigInteger.ONE;
        for(int i = 1; i < n + 1; i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.printf("факториал  - %d", factorial(100000));
    }
}
