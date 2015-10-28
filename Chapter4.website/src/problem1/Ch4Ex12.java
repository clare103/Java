package problem1;

public class Ch4Ex12 {

	
	private int numPizzas;
	private Ch4Ex11 pizza1,pizza2, pizza3;
	
	public Ch4Ex12()
	{
		
	}
	
	public Ch4Ex12(int numPizzas, Ch4Ex11 pizza1, Ch4Ex11 pizza2, Ch4Ex11 pizza3)
	{
		set_numPizzas(numPizzas);
		set_Pizza1(pizza1);
		set_Pizza2(pizza2);
		set_Pizza3(pizza3);		
	}
		
	public void set_numPizzas(int numPizzas)
	{
		if(numPizzas >3 && numPizzas < 1)
		{
			System.out.println("Invalid number of pizzas: (1-3)");
			System.exit(0);
		}
		else
			this.numPizzas = numPizzas;
	}
	public int get_numPizzas()
	{
		return numPizzas;
	}
	public void set_Pizza1(Ch4Ex11 pizza1)
	{
		this.pizza1 = pizza1;
	}
	public void set_Pizza2(Ch4Ex11 pizza2)
	{
		this.pizza2 = pizza2;
	}
	public void set_Pizza3(Ch4Ex11 pizza3)
	{
		this.pizza3 = pizza3;
	}
	public Ch4Ex11 getPizza1()
	{
		return pizza1;
	}
	public Ch4Ex11 getPizza2()
	{
		return pizza2;
	}
	public Ch4Ex11 getPizza3()
	{
		return pizza3;
	}
	
	public double calcTotal()
	{
		double orderTotal = 0;
		double p2Cost =0;
		double p3Cost = 0;
		
		double p1Cost = pizza1.calcCost();
		
		if(pizza2 != null && pizza3!=null)
		{	
		p2Cost = pizza2.calcCost();
		p3Cost = pizza3.calcCost();
		}
		else if(pizza2 == null && pizza3 != null)
			p3Cost = pizza3.calcCost();
		else
		{
			p2Cost = pizza2.calcCost();
		}
		orderTotal = (p1Cost) + (p2Cost) + (p3Cost);		
		return orderTotal;
	}
	
	
	public void displayOrder()
	{
		System.out.println("Pizza 1: "+ pizza1);
		
		if(pizza2 != null && pizza3 == null)
			System.out.println("Pizza 2: "+ pizza2);
		else if (pizza3 !=null && pizza2 == null)		
			System.out.println("Pizza 3: "+ pizza3);
		else if(pizza2 == null && pizza3 == null)
			System.out.println();
		else
		{
			System.out.println("Pizza 2: "+ pizza2);
			System.out.println("Pizza 3: "+ pizza3);
		}
			System.out.println("Order Total: "+calcTotal());
		
	}
	public void final_print()
	{
		Ch4Ex11 pizza1 = new Ch4Ex11("large",1,1,0);	
		Ch4Ex11 pizza2 = new Ch4Ex11("medium",2,2,0);
		Ch4Ex11 pizza3 = new Ch4Ex11("small",1,1,1);
		Ch4Ex12 order = new Ch4Ex12(3, pizza1,pizza2,pizza3);
		order.displayOrder();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex12 c = new Ch4Ex12();
c.final_print();
	}

}
