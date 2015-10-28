package problem1;
import java.util.*;
public class Ch2Ex7 {
private int price;
private int quarters;
private int dimes;
private int nickels;
private int change;
private boolean check = true;
	public Ch2Ex7()
	{
		
	}
	public void set_price(int price)
	{
		this.price = price;
	}
	public int get_price()
	{
		return price;
	}
	public void set_change(int price)
	{
		this.change = 100 - price;
		
		while(check)
		{
			if(change > 25)
			{
				quarters++;
				change = change -25;
			}
			else if(change >=10 && change <25)
			{
				dimes++;
				change = change - 10;
			}
			else if(change >=5 && change <= 10)
			{
				nickels++;
				change = change -5;
			}
			else
				check = false;
		}
	}
	public int get_change()
	{
		return change;
	}
	public void print()
	{
	System.out.println("You bought an item for "+get_price()+ " cents and gave me a dollar,\n" +
						"so your change is:");
	System.out.println(quarters +" quarters,");
	System.out.println(dimes + " dimes, and");
	System.out.println(nickels +" nickels");
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch2Ex7 c = new Ch2Ex7();
c.set_price(55);
c.set_change(55);
c.print();
	}

}
