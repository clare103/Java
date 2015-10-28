package problem1;
import java.util.*;
import java.io.*;
public class Ch3Ex12 {
	private int bodyweight;
	private String name;
	private int feet;
	private int inches;
	private String filename;
	public Ch3Ex12()
	{
		
	}
	public void set_calculate(int feet, int inches)
	{
		if(feet >5)
		{
			feet = feet -5;
			int bodyweight = 110 +(feet *60)+(inches*5);
			this.bodyweight = bodyweight;
		}
		else if(feet ==5)
		{
			int bodyweight = 110 + (inches *5);
			this.bodyweight = bodyweight;
		}
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
	public void print_weight()
	{
		System.out.println("The ideal bodyweight for " + get_name()+ " is: \n"+get_calculate());
	}
	public void final_print()
	{
		try
		{
			Scanner in = new Scanner(new FileInputStream(System.getProperty("user.home")+"/desktop/"+get_filename()));
			while(in.hasNextLine())
			{
				name = in.nextLine();
				feet = in.nextInt();
				inches = in.nextInt();
				in.nextLine();
				set_calculate(feet, inches);
				set_name(name);
				print_weight();
			}

		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			e.getMessage();
		}
	}
	public void set_filename(String filename)
	{

		this.filename = filename;
	}
	public String get_filename()
	{
		return filename;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch3Ex12 c = new Ch3Ex12();
c.set_filename("weight.txt");
c.final_print();



	}

}
