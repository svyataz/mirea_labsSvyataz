package LAB18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
    public static void main(String[] args){
        Exception2 ex = new Exception2();
        for(int i = 0; i < 4; i++){
            ex.exceptionDemo();
        }
    }
}
