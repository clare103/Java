package problem1;
import java.util.*;
public class Ch4Ex1 {
private int number;
private int r_number;
private int n_number;
	public Ch4Ex1()
	{
		
	}
	public Ch4Ex1(int number)
	{
		if(number > 99)
		{
		this.number = 99;
		}
		else if(number == 0)
		{
			this.number = 0;
		}
		else
			this.number = number;
	}
	private String numberString(int r_number)
	{
		switch(r_number)
		{
		case 99:
			return "Ninety-nine";
		default:
			System.out.println("fatal error");
			System.exit(0);
			return "error";
		}
	}
	
	public void print()
	{
		for(int i = 0; i<=number; i++)
		{
			int r_number = number-i;
			int n_number = number-i-1;
			
			System.out.println(numberString(r_number) +" bottles of beer on the wall");
			System.out.println(numberString(r_number)+" bottles of beer,");
			System.out.println("Take one down, pass it around,");
			if(n_number == -1)
			{
				n_number =0;
				System.out.println((n_number)+" bottles of beer on the wall.");
			}
			else if(n_number == 0 || n_number >0)
			{
			System.out.println((n_number)+" bottles of beer on the wall.");
			System.out.println("....");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex1 c = new Ch4Ex1(99);
c.print();
	}

}
