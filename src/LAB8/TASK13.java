package LAB8;

import java.util.Scanner;

public class TASK13 {
    public static void myf(){
        int num = new Scanner(System.in).nextInt();
        if (num == 0) return;
        System.out.println(num);
        num = new Scanner(System.in).nextInt();
        if (num == 0) return;
        myf();
    }
    public static void main(String[] args){
        myf();
    }
}
