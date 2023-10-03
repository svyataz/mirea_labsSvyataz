package LAB8;

import java.util.Scanner;

public class TASK14 {
    public static void myf(int num){
        if (num / 10 == 0) {
            System.out.println(num % 10);
            return;
        }
        myf(num / 10);
        System.out.println(num % 10);
    }
    public static void main(String[] args){
        int num = new Scanner(System.in).nextInt();
        myf(num);
    }
}
