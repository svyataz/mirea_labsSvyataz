package LAB2;
import LAB2.Author;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {

        String email;
        Author inst = new Author("svyat", "svyat@mail.com", 'M');
        System.out.println("email: "+inst.getEmail());
        Scanner source = new Scanner(System.in);
        System.out.println("Enter your email:");
        email = source.nextLine();
        inst.setEmail(email);
        System.out.println("Email: " + inst.getEmail());
    }
}
