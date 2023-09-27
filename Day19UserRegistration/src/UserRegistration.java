
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        String MobileNo = sc.nextLine();

        Matcher matcher = pattern.matcher(MobileNo);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Mobile Number is Invalid");

        }
    }
}