package LAB14;
import java.util.Scanner;
import java.util.regex.*;
public class TASK3 {
    public static void main(String[] args){
        String regex = "(\\[0]?)(\\[1-9]*)(\\[0]*).(\\[0-9]{2})(//USD?)(//RUB?)(//EUR?)";
        String s =  new Scanner(System.in).nextLine();
        Pattern p2 = Pattern. compile (regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

    }
}
