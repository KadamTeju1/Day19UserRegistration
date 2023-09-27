import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    ArrayList<String> List = new ArrayList<>();
    public void firstName(){
        List.add("Shilpa");
        List.add("Mrunali");

        String regex = "[A-Z{1}][a-z]{3,7}";
        Pattern pattern = Pattern.compile(regex);

        for (int i=0; i<List.size();i++){
            Matcher matcher = pattern.matcher(List.get(i));
            System.out.println("The first name is :" );
            System.out.println(List.get(i)+ "->" +matcher.matches());
        }
    }
    public static void main(String[] args) {
        UserRegistration regexDemo = new UserRegistration();
        regexDemo.firstName();

    }
}
