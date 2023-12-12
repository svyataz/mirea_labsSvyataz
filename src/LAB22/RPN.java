package LAB22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RPN {
    public static void main(String[] args){
        System.out.println(RPNC("2 3 * 4 5 * +"));
    }
    static int RPNC(String RPN){
        int A, B;
        List<String> notation = new ArrayList<>(Arrays.asList(RPN.split(" ")));
        int n = notation.size();
        int sign_flag = -1, num_flag = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n/2; i++){
            for(int j = 0; j < notation.size(); j++){
                try {
                    stack.push(Integer.parseInt(notation.get(j)));
                    num_flag += 1;
                } catch(NumberFormatException e){
                     sign_flag = j;
                     break;
                }
            }
            for (int j = 0; j < num_flag; j++){
                notation.remove(sign_flag - j - 1);
            }
            sign_flag -= num_flag;
            num_flag = 0;
            B =stack.pop();
            A =stack.pop();
            switch (notation.get(sign_flag)){
                case "-":
                    stack.push(A - B);
                    break;
                case "+":
                    stack.push(A + B);
                    break;
                case "*":
                    stack.push(A * B);
                    break;
                case "/":
                    stack.push(A / B);
                    break;
            }
            notation.remove(sign_flag);
        }

        return stack.pop();
    }
}
