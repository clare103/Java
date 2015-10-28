package problems;

public class Fraction {

	private double num;
	private double denom;
	
	public Fraction()
	{
		num =0;
		denom = 0;
	}
	public Fraction(double num, double denom)
	{
		set_num(num);
		set_denom(denom);
	}
	public void set_num(double num)
	{
		this.num = num;
	}
	public void set_denom(double denom)
	{
		this.denom= denom;
	}
	public double get_num()
	{
		return num;
	}
	public double get_denom()
	{
		return denom;
	}
	private boolean equals(Fraction anotherFraction)
	{
		return(((num/denom)) == ((anotherFraction.num/anotherFraction.denom)));
	}
	public String toString()
	{
		return "Numerator:" + num+ " Denomenator: "+denom;
	}
	
	public void display()
	{
		Fraction a = new Fraction(1,3);
		Fraction b = new Fraction(20,50);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fraction c = new Fraction();
c.display();
	}

}
