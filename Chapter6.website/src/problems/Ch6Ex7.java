package problems;
import java.util.*;
public class Ch6Ex7 {
	
	private char[] a = new char[20];
	private char[] b = new char[20];
	private boolean check =true;
	
	public Ch6Ex7()
	{
		Scanner keyboard = new Scanner(System.in);
//		while(check)
//		{
//			System.out.println("Would you like to continue adding?");
//			String answer = keyboard.next();
//			if(answer.equalsIgnoreCase("yes"))
//			{
//				check = true;
//			}
//			else if(answer.equalsIgnoreCase("no"))
//			{
//				check = false;
//				System.out.println("Exiting program.");
//				break;
//			}
//			else
//			{
//				System.out.println("Invalid input. Exiting");
//				System.exit(0);
//			}
			System.out.println("Please enter the first intger:(1-20)");
			String first = keyboard.next();
			System.out.println("Please enter the second integer?(1-20)");
			String second = keyboard.next();
			
			a = first.toCharArray();
			b = second.toCharArray();
			int number1 = Integer.parseInt(new String(a));
			int number2 = Integer.parseInt(new String(b));
			System.out.println(number1 + number2);
			int number3 = number1 + number2;
			char[] c = String.valueOf(number3).toCharArray();
			System.out.println(c);
			System.out.println(c.length);
//			String c = String.valueOf(a);
//			String d = String.valueOf(b);
//			int third = Integer.parseInt(c);
//			int fourth = Integer.parseInt(d);
	//		
			//System.out.println("The total of the two numbers is: ");
			//System.out.println("Total: "+(third + fourth));
			
		}
		
		
		
	
	public void display()
	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex7 e = new Ch6Ex7();
e.display();
		
		
	}

}
