package chapter9;
import java.io.*;
import java.util.*;

public class Integers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
	int n=0;
	double average=0;
	int sum=0;
	int num;
	boolean error = true;
	do
	{
	try
	{	
		error = false;
		System.out.println("Enter the total number of values: ");
		n = keyboard.nextInt();
		if(n < 0)
			throw new Exception("Numbers must be greater than 0");
	}
	catch(Exception e)
	{
		String message = e.getMessage();
		System.out.println(message);
		System.exit(0);
	}
	}while(error);
	int i;
	for(i = 0; i < n; i++)
	{
		System.out.println("Enter number: "+ (i+1));
		num = keyboard.nextInt();
		while(num <0)
		{
			System.out.println("Negative numbers are not allowed, please enter number "+(i+1)+" again: ");
			num = keyboard.nextInt();
		}
		sum +=num;
	}
	average = sum/(double)i;
	System.out.println("The average is "+ average);
	}
}