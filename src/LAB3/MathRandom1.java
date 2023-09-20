package LAB3;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
public class MathRandom1 {
    public static void main(String[] args){
        Random rand = new Random();
        int test_list_len = rand.nextInt(10);
        double[] test_list = new double[test_list_len];
        for(int i = 0; i < test_list_len; i++){
            test_list[i] = Math.random();
        }
        Arrays.sort(test_list);
        System.out.println(Arrays.toString(test_list));
    }

}
