package Problem11;



	/**
	 * @param args
	 */
class Piza
{
	private String size;
	private int no_cheese;
	private int no_pep;
	private int no_ham;
	public Piza()
	{
		size = "small";
		no_cheese = 0;
		no_pep = 0;
		no_ham = 0;
	}
	public void set_size(String str)
	{
		size = str;
	}
	public void set_no_cheese(int k)
	{
		no_cheese = k;
	}
	public void set_no_pep(int k)
	{
		no_pep = k;
	}
	public void set_no_ham(int k)
	{
		no_ham = k;
	}
	public String get_size()
	{
		return size;
	}
	public int get_no_cheese()
	{
		return no_cheese;
	}
	public int get_no_pep()
	{
		return no_pep;
	}
	public int get_no_ham()
	{
		return no_ham;
	}
	public double calcCost()
	{
		double cost = 0;
		int k = get_no_cheese() + get_no_pep() + get_no_ham(); 
	if(size.equalsIgnoreCase("small"))
			{
		cost = 10+ 2 * k;
			}
	else if (size.equalsIgnoreCase("medium"))
	{
		cost = 12 + 2*k;
	}
	else if (size.equalsIgnoreCase("large"))
	{
		cost = 14 + 2*k;
	}
	else
		System.out.println("Invalid size!");
	return cost;
	}
	
	public void getDescription()
	{
		System.out.println("The size of the pizza is: "+size);
		System.out.println("The number of cheese toppings: " + get_no_cheese());
		System.out.println("The number of pepperoni toppings: "+ get_no_pep());
		System.out.println("The number of ham toppings: "+ get_no_ham());
		System.out.println("The total cost is: "+ calcCost());
	}

	public static void main(String[] args) 
	{
	Piza a = new Piza();
	a.set_size("large");
	a.set_no_cheese(1);
	a.set_no_pep(1);
	a.set_no_ham(1);
	a.getDescription();
	System.out.println();
		
		
	
	

	}

}
