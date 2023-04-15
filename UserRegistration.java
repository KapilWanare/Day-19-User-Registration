import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //uc1
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Kapil");
        if (matcher.matches())
            System.out.println("valid firstname");
        else
            System.out.println("Invalid firstname");

        //uc2
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher("Wanare");
        if (matcher1.matches())
            System.out.println("valid lastname");
        else
            System.out.println("Invalid lastname");

        
    }
}
