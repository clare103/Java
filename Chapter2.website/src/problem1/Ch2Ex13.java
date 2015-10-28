package problem1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ch2Ex13 {
	private int bodyweight;
	public String name;
	public Ch2Ex13()
	{
		
	}
	public void calculate(int feet, int inches)
	{
		if(feet > 5)
		{
			feet = feet - 5;
			int bodyweight = 110 +(feet * 60) + (inches*5);
			this.bodyweight = bodyweight;
		}
		else if(feet == 5)
		{
			int bodyweight = 110 + (inches *5);
			this.bodyweight = bodyweight;
		}
		else
			System.out.println("Can't calculate bodyweight for persons under 5 feet or invalid input");
	}
	public int get_calculate()
	{
		return bodyweight;
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	public String get_name()
	{
		return name;
	}
	public void print()
	{
		
			System.out.println("The ideal bodyweight for " + get_name()+ " is:\n"
					+get_calculate());
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fileIn = null;
		//Scanner fileIn1 = null;
		//Scanner fileIn2 = null;
		try
		{
	fileIn = new Scanner(new FileInputStream(System.getProperty("user.home")+"/desktop/"+"weight.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		String name1;
		int feet1;
		int inches1;
		System.out.println("Text left to read?: "+fileIn.hasNextLine());
		name1 = fileIn.nextLine();
		feet1 = fileIn.nextInt();
		inches1 = fileIn.nextInt();
		fileIn.nextLine();
		String name2 = fileIn.nextLine();
		int feet2 = fileIn.nextInt();
		int inches2 = fileIn.nextInt();
		fileIn.nextLine();
		String name3 = fileIn.nextLine();
		int feet3 = fileIn.nextInt();
		int inches3 = fileIn.nextInt();
		Ch2Ex13 c = new Ch2Ex13();
		c.calculate(feet1, inches1);
		c.set_name(name1);
		c.print();
		c.calculate(feet2, inches2);
		c.set_name(name2);
		c.print();
		c.calculate(feet3, inches3);
		c.set_name(name3);
		c.print();
		
	}

}
