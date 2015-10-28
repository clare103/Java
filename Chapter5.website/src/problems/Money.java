package problems;

public class Money {

	private int dollars;
	private int cents;
	public Money1 money;
	
	public Money(int dollars, int cents)
	{
		set_dollars(dollars);
		set_cents(cents);
	}
	public Money(int dollars)
	{
		set_dollars(dollars);
		cents =0;
	}
	public Money()
	{
		
	}
	public static Money add(Money m1, Money m2)//use of static
	{
		int total_dollars = m1.get_dollars() + m2.get_dollars();
		int total_cents = m1.get_cents()+m2.get_cents();
		Money m3 = new Money(total_dollars, total_cents);
		return m3;
	}
	public static Money minus(Money m1, Money m2)
	{
		int total_dollars = m1.get_dollars() - m2.get_dollars();
		int total_cents = m1.get_cents() - m2.get_cents();
		Money m3 = new Money(total_dollars, total_cents);
		return m3;
	}
	public Money add(Money m1)//use of the current class
	{
		int total_dollars = this.get_dollars()+m1.get_dollars();
		int total_cents = this.get_cents()+m1.get_cents();
		Money m3 = new Money(total_dollars, total_cents);
		return m3;		
	}
	public Money minus(Money m1)
	{
		int total_dollars = this.get_dollars()-m1.get_dollars();
		int total_cents = this.get_cents() - m1.get_cents();
		Money m3 = new Money(total_dollars, total_cents);
		return m3;
	}
	public void add(Money1 money)//use of different class
	{
		int total_dollars = this.get_dollars() + money.get_dollars();
		int total_cents = this.get_cents() + money.get_cents();
		this.set_dollars(total_dollars);
		this.set_cents(total_cents);
	}
	public void minus(Money1 money)
	{
		int total_dollars = this.get_dollars() - money.get_dollars();
		int total_cents = this.get_cents() - money.get_cents();
		this.set_dollars(total_dollars);
		this.set_cents(total_cents);
	}
	public Money1 get_money()
	{
		return money;
	}
	public boolean equals(Money otherMoney)
	{
		return ((dollars == otherMoney.get_dollars()) && (cents == otherMoney.get_cents()));
	}
	public boolean other_equals(Money1 money)
	{
		return((this.dollars == money.get_dollars()&&(this.cents == money.get_cents())));
	}
	public String toString()
	{
		return "Dollars: "+dollars+". Cents: "+cents;
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Money m1 = new Money(5, 50);
Money1 m2 = new Money1(5, 50);
System.out.println(m1.equals(m2));//used for money of same class
System.out.println(m1.other_equals(m2));//used for money of diff class
m1.add(m2);
System.out.println(m2);
//System.out.println(m1.minus(m2));


	}

}
