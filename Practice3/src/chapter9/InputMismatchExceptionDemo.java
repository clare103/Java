package chapter9;

import java.util.*;

public class InputMismatchExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		boolean done = false;
		while(!done)
		{
		try
		{
			System.out.println("Enter a whole number: ");
			number = keyboard.nextInt();
			done = true;
		}
		catch(InputMismatchException e)
		{
			keyboard.nextLine();//infinite loop w/o this line
			System.out.println("Not a correctly written whole number. ");
			System.out.println("Try again.");
		}
		}
		System.out.println("You entered " + number);
	}
}