package Problem11;
//import java.util.*;

	/**
	 * @param args
	 */
class Main
{
	private String size;
	private int no_of_cheese_toppings;
	private int no_of_pepperoni_toppings;
	private int no_of_ham_toppings;
	public Main()
	{
		size = "Small";
		no_of_cheese_toppings =0;
		no_of_pepperoni_toppings=0;
		no_of_ham_toppings=0;
	}
	public void set_size(String str)
	{
		size = str;
	}
	public void set_no_of_cheese_toppings(int k)
	{
		no_of_cheese_toppings =k;
	}
	public void set_no_of_pepperoni_toppings(int k)
	{
		no_of_pepperoni_toppings =k;
	}
	public void set_no_of_ham_toppings(int k)
	{
		no_of_ham_toppings =k;
		
	}
	public String get_size()
	{
		return size;
	}
	public int get_no_of_cheese_toppings()
	{
		return no_of_cheese_toppings;
	}
	public int get_no_of_pepperoni_toppings()
	{
		return no_of_pepperoni_toppings;
	}
	public int get_no_of_ham_toppings()
	{
		return no_of_ham_toppings;
	}
	public double calcCost()
	{
		double cost = 0;
		int k = get_no_of_cheese_toppings() + get_no_of_pepperoni_toppings()+get_no_of_ham_toppings();
	if(size.equalsIgnoreCase("small"))
	{
		cost = 10+2*k;
	}
	else if(size.equalsIgnoreCase("medium"))
	{
		cost = 12 +2*k;
	}
	else if(size.equalsIgnoreCase("large"))
	{
		cost = 14 +2*k;
	}
	return cost;
	}
	public void getDescription()
	{
		System.out.println("The pizza size is "+ size+".");
		System.out.println("Number of cheese toppings: "+ get_no_of_cheese_toppings());
		System.out.println("Number of pepperoni toppings: " + get_no_of_pepperoni_toppings());
		System.out.println("Number of ham toppings: "+ get_no_of_ham_toppings());
		System.out.println("The cost of this pizza is: "+ calcCost()+" dollars.");
	}
	public static void main(String[] args)
	{
		Main a = new Main();
		a.set_size("large");
		a.set_no_of_cheese_toppings(1);
		a.set_no_of_pepperoni_toppings(1);
		a.set_no_of_ham_toppings(2);
		a.getDescription();
		System.out.println(" ");
		Main b = new Main();
		b.set_size("small");
		b.set_no_of_cheese_toppings(1);
		b.getDescription();
		System.out.println(" ");
		Main c = new Main();
		c.set_size("medium");
		c.set_no_of_cheese_toppings(1);
		c.set_no_of_ham_toppings(2);
		c.getDescription();
	}
}

	