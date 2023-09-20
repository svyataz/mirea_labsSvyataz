package LAB1;
import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество " +
                "элементов массива: ");
        int n = sc.nextInt(), i = 0;
        int[] test_list = new int[n];
        System.out.println("Введите " +
                "элемент массива: ");
        test_list[0] = sc.nextInt();
        int test_list_sum = test_list[0],
                test_list_min = test_list[0],
                test_list_max = test_list[0];
        while(i < n - 1){
            i++;
            System.out.println("Введите " +
                    "элемент массива: ");
            test_list[i] = sc.nextInt();
            if(test_list_max < test_list[i]) test_list_max = test_list[i];
            if(test_list_min > test_list[i]) test_list_min = test_list[i];
            test_list_sum += test_list[i];
        }
        System.out.println("сумма элементоа массива: " + test_list_sum + "\n" +
                "максимальный элемент массива: " + test_list_max + "\n" +
                "минимальный элемент массива: " + test_list_min);
    }
}
