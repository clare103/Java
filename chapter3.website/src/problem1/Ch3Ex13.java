package problem1;
import java.util.*;
import java.io.*;
public class Ch3Ex13 {
String original="";
String reverse ="";
String filename;
String longestw="";
int count =0,max=-1;
	public Ch3Ex13()
	{
		
	}
	public boolean set_isPalindrome(String original)
	{
		 String reverse="";
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         return true;
	      else
	         return false;
	 
	}
	public void set_filename()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the file name:");		
		this.filename = input.nextLine();		
	}
	public String get_filename()
	{
		return filename;
	}
	public void final_print()
	{
		set_filename();
		try
		{
			Scanner in = new Scanner(new FileInputStream(System.getProperty("user.home")+"/desktop/"+filename));
			while(in.hasNext())
			{
				original=in.next();
				original.toLowerCase();
				set_isPalindrome(original);
				if(set_isPalindrome(original))
				{
					count = original.length();
					if(count > max)
					{
						max = count;
						longestw= original;
					}
				}
														
			}
			System.out.println("The longest palindrome is: "+longestw);
			in.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			e.getMessage();
		}

		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch3Ex13 c = new Ch3Ex13();
		c.final_print();

	}

}
