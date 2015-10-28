package problem1;
import java.util.*;
public class CH1Ex3 {
private String first;
private String last;
	public CH1Ex3()
	{
		
	}
	public void set_firstname(String first)
	{
		first = first.toLowerCase();
		String a = first.substring(0,1);
		String b = first.substring(1,2).toUpperCase();
		String c = first.substring(2,first.length());
		this.first = b + c + a + "ay";
				
	}
	public String get_firstname()
	{
		return first;
	}
	public void set_lastname(String last)
	{
		last = last.toLowerCase();
		String a = last.substring(0,1);
		String b = last.substring(1,2).toUpperCase();
		String c = last.substring(2,last.length());
		this.last = b + c + a + "ay";
	}
	public String get_lastname()
	{
		return last;
	}
	public void print()
	{
		System.out.println("The pig latin conversion is: "+ get_firstname()+" "+ get_lastname());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CH1Ex3 c = new CH1Ex3();
c.set_firstname("Ross");
c.set_lastname("CLARE");
c.print();
	}

}
