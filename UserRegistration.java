import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    Scanner sc = new Scanner(System.in);
    // method for entry of first name
    public void firstNameEntry()
    {
        System.out.println("Enter your first name ");
        String firstName = sc.next();
        String firstNameRegex = "^[A-Z]+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher match = pattern.matcher(firstName);
        System.out.println(firstName + "  " + match.matches());
    }
    //method for entry of second name
    public void secondNameEntry()
    {
        System.out.println("Enter your last name ");
        String lastName = sc.next();
        String lastNameRegex;
        lastNameRegex = "^[A-Z]+[a-zA-Z]{2,}$";
        Pattern pattern2 = Pattern.compile(lastNameRegex);
        Matcher match2 = pattern2.matcher(lastName);
        System.out.println(lastName + "  " + match2.matches());
    }
    //Main function
    public static void main(String[] args)
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstNameEntry();
        userRegistration.secondNameEntry();
    }
}