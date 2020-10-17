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
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher match = pattern.matcher(lastName);
        System.out.println(lastName + "  " + match.matches());
    }
    // method for valid email
    public void emailEntry()
    {
        System.out.println("Enter your email ");
        String email = sc.next();
        String emailRegex = "^[a-zA-Z.]{3,}[@][a-zA-Z]{2}[.][a-z]{2}[.][a-z]{2}$";
        Pattern pattern;
        pattern = Pattern.compile(emailRegex);
        Matcher match = pattern.matcher(email);
        System.out.println(email + "  " + match.matches());
    }
    // method for entry of password
    public void passwordEntry()
    {
        System.out.println("Enter your password with minimum 8 alphabets ");
        String password = sc.next();
        String passwordRegex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher match = pattern.matcher(password);
        System.out.println(password + "  " + match.matches());
    }
    //Main function
    public static void main(String[] args)
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstNameEntry();
        userRegistration.secondNameEntry();
        userRegistration.emailEntry();
        userRegistration.passwordEntry();
    }
}