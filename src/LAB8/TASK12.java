package LAB8;
import java.util.Scanner;
public class TASK12 {
    public static void myf(){
        int num = new Scanner(System.in).nextInt();
        if (num == 0)
            return;
        if (num % 2 != 0)
            System.out.println(num);
        myf();
    }
    public static void main(String[] args){
        myf();
    }
}
