package problem1;



public class Ch4Ex11 {

	private String size;
	private int cheese, pep, ham;
	
	public Ch4Ex11()
	{
		
	}
	public Ch4Ex11(String size, int cheese, int pep, int ham)
	{
		set_size(size);
		set_cheese(cheese);
		set_pep(pep);
		set_ham(ham);
	}
	public void set_size(String size)
	{
		if(size.equalsIgnoreCase("small")||(size.equalsIgnoreCase("medium")||(size.equalsIgnoreCase("large"))))	
		this.size = size;
		else
		{
			System.out.println("Invalid size: (small/medium/large)");
			System.exit(0);
		}
	}
	public void set_cheese(int cheese)
	{
		this.cheese = cheese;
	}
	public void set_pep(int pep)
	{
		this.pep = pep;
	}
	public void set_ham(int ham)
	{
		this.ham = ham;
	}
	public String get_size()
	{
		return size;
	}
	public int get_cheese()
	{
		return cheese;
	}
	public int get_pep()
	{
		return pep;
	}
	public int get_ham()
	{
		return ham;
	}
	public double calcCost()
	{
		if(get_size().equalsIgnoreCase("small"))
		{
			return(10 + (get_ham() + get_cheese()+ get_pep())*2);
		}
		else if(get_size().equalsIgnoreCase("medium"))
			return(12 + (get_ham()+ get_cheese()+ get_pep())*2);
		else
			return (14 + (get_ham()+ get_cheese()+ get_pep())*2);
	}
	public void getDescription()
	{
		System.out.println("The size of the pizza is: "+ get_size());
		System.out.println("The number of pepperoni toppings is: "+ get_pep());
		System.out.println("The number of ham toppings is: "+ get_ham());
		System.out.println("The number of cheese toppings is: "+ get_cheese());
		System.out.println("The total cost of the pizza is:"+ calcCost());
		System.out.println();
	}
	public String toString()
	{
		return "\nSize: " + size + "\nNumber of ham toppings: "+ ham+".\nNumber of cheese toppings: "+ cheese+".\nNumber of pepperoni toppings: "+pep;
	}
	public void final_print()
	{
		Ch4Ex11 pizza1 = new Ch4Ex11("large",1,1,2);
		pizza1.getDescription();
		Ch4Ex11 pizza2 = new Ch4Ex11("medium",1,1,1);
		pizza2.getDescription();
		Ch4Ex11 pizza3 = new Ch4Ex11("small",1,2,1);
		pizza3.getDescription();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex11 c = new Ch4Ex11();
c.final_print();
	}

}
