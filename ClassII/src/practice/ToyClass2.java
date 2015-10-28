package practice;
import java.util.*;

public class ToyClass2 {

	private String name;
	private int number;
	
	public void set(String newName, int newNumber)
	{
		name = newName;
		number = newNumber;
	}
	
	public String toString()
	{
		return(name + " "+ number);
	}
	
	public void makeEqual(ToyClass anObject)
	{
		anObject.name = this .name;
		anObject.number = this .number;
	}
	public void tryToMakeEqual(int aNumber)
	{
		aNumber = this.number;
	}
	public boolean equals(ToyClass2 otherObject)
	{
		return((name.equals(otherObject.name))&&(number == otherObject.number));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two numbers on a line");
		System.out.println("Place a comma between the numbers");
		System.out.println("Extra blank space is OK.");
		String inputLine = keyboard.nextLine();
		
		String delimiters = ", ";
		StringTokenizer numberFactory = new StringTokenizer(inputLine, delimiters);
		String string1 = null;
		String string2 = null;
		
		if(numberFactory.countTokens()>= 2)
		{
			string1 = numberFactory.nextToken();
			string2 = numberFactory.nextToken();
		}
		else
		{
			System.out.println("Fatal error.");
			System.exit(0);
		}
		
		double number1 = Double.parseDouble(string1);
		double number2 = Double.parseDouble(string2);
		
		System.out.println("Your input ");
		System.out.println(number1 + " and "+ number2);
		
	}

}
