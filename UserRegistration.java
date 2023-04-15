import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //uc1
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Kapil");
        if (matcher.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
    }
}
