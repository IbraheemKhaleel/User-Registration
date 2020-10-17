import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
	Scanner sc = new Scanner(System.in);
	public void firstNameEntry()
	{		
		 
	      System.out.println("Enter your first name ");
	      String firstName = sc.next();
	      String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher match = pattern.matcher(firstName);
	      System.out.println(firstName + "  " + match.matches());
	      
	      
	      
		
	}
	public static void main(String[] args)
	{
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameEntry();
		
	}
}
