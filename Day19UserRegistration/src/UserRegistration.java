

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[a-z]{8,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password ");
        String password = sc.nextLine();

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Password ");
        } else {
            System.out.println("Password is not Valid");
        }
    }
}