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

        //uc3
        Pattern pattern2 = Pattern.compile("^([a-z]{3}[.][a-z]{3}@([a-z]{2}[.][a-z]{2})[.][a-z]{2,}$)");
       // System.out.println("Enter email : ");
        Matcher matcher2 = pattern2.matcher("abc.xyz@bl.co.in");
        if (matcher2.matches())
            System.out.println("valid email");
        else
            System.out.println("Invalid email");

        //uc4
        Pattern pattern3 = Pattern.compile("^(\\+?\\d{1,3})\s\\d{10}$");
        Matcher matcher3 = pattern3.matcher("+91 9822042799");
        if (matcher3.matches())
            System.out.println("valid phone no");
        else
            System.out.println("Invalid phone no");

        //uc5
        //rule1: minimum 8 chracters
        Pattern pattern4 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher4 = pattern4.matcher("mySecretPassword");
        if (matcher4.matches())
            System.out.println("valid password_rule1");
        else
            System.out.println("Invalid password)rule1");

        //uc6
        //rule2: minimum 8 chracters with atleat 1 capital chracter
        Pattern pattern5 = Pattern.compile("^(?=[a-z]*[A-Z]).{8,}$");
        Matcher matcher5 = pattern5.matcher("pPassword");
        if (matcher5.matches())
            System.out.println("valid password_rule2");
        else
            System.out.println("Invalid password)rule2");

    }
}
