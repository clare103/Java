package chapter14;

import java.util.*;

public class Test {

	//int type;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number");
		try
		{
		int type = keyboard.nextInt();
		System.out.println(type);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Caught exception. Invalid input");
			System.exit(0);
		}
		
		
		
	}

}
