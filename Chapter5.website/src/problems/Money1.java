package problems;

public class Money1 {
	
	private int dollars;
	private int cents;
	
	public Money1(Money1 money)
	{
		dollars = money.dollars;
		cents = money.cents;
	}
	public Money1(int dollars, int cents)
	{
		set_dollars(dollars);
		set_cents(cents);
	}
	public Money1(int dollars)
	{
		set_dollars(dollars);
		cents =0;
	}
	
	public void set_dollars(int dollars)
	{
		this.dollars = dollars;
	}
	public void set_cents(int cents)
	{
		this.cents = cents;
	}
	public int get_dollars()
	{
		return dollars;
	}
	public int get_cents()
	{
		return cents;
	}
	public String toString()
	{
		return "Dollars: "+dollars+". Cents: "+cents;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
