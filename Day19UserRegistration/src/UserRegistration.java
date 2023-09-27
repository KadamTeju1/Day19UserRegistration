

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\"[ A-Z] \"");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Uppercase");
        String uppercase = sc.nextLine();

        CharSequence Uppercase = null;
        Matcher matcher = pattern.matcher(Uppercase);
        if (matcher.matches()) {
            System.out.println("Valid Uppercase");
        } else {
            System.out.println("Uppercase is not Valid");
        }
    }
}