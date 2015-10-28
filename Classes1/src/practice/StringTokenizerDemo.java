package practice;
import java.util.*;
public class StringTokenizerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard =new Scanner(System.in);
		System.out.println("Enter your last name");
		System.out.println("followed by your first and middle names.");
		System.out.println("If you have no middle name,");
		System.out.println("enter \"None\".");
		String inputLine = keyboard.nextLine();
		
		String delimiters = ", ";//comma and a blank space
		StringTokenizer nameFactory = new StringTokenizer(inputLine, delimiters);
		
		String lastName = nameFactory.nextToken();
		String firstName = nameFactory.nextToken(); 
		String middleName = nameFactory.nextToken();
		if(middleName.equalsIgnoreCase("None"))
		{
			middleName = "";//empty string
		}
		System.out.println("Hello "+ firstName + " "+ middleName+ " "+ lastName);
		
	}

}
