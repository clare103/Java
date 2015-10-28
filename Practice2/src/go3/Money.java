package go3;

public class Money {
private int dollars;
private int cents;

public Money()
{
	
}
public Money(int dollars)
{
	this.dollars = dollars;
	cents = 0;
}
public Money(int dollars, int cents)
{
	this.dollars = dollars;
	this.cents = cents;
}
public int get_Dollars()
{
	return dollars;
}
public void set_Dollars(int dollars)
{
	this.dollars = dollars;
}
public int get_Cents()
{
	return cents;
}
public void set_Cents(int cents)
{
	this.cents = cents;
}
public boolean equals(Money yourMoney)
{
	return((this.dollars == yourMoney.dollars)&&(this.cents == yourMoney.cents));
}
public void add(Money m)
{
	int dollars1 = this.get_Dollars();
	int dollars2 = this.get_Dollars();
	int cents1 = this.get_Cents();
	int cents2 = m.get_Cents();
	//all info here
	int sumDollars = dollars1 + dollars2;
	int sumCents = cents1+ cents2;
	if(sumCents >100)
	{
		sumDollars = sumDollars + 1;
		sumCents = sumCents-100;
	}
	this.set_Dollars(sumDollars);
	this.set_Cents(sumCents);
}
public void minus(Money m)
{
	int dollars1 = this.get_Dollars();
	int dollars2 = this.get_Dollars();
	int cents1 = this.get_Cents();
	int cents2 = m.get_Cents();
	int sumDollars;
	int sumCents;
	if(dollars1 >= dollars2)
		sumDollars = dollars1 - dollars2;
	else
		sumDollars = dollars2 - dollars1;
	
	if(cents1 > cents2)
		sumCents = cents1 - cents2;
	else
		sumCents = cents2 - cents1;
	
	if(sumCents >=100)
	{
		sumDollars += 1;
		sumCents -= 100;
	}
	this.set_Dollars(sumDollars);
	this.set_Cents(sumCents);
	
}
public static Money set_minus(Money m1, Money m2)
{
	int dollars1 = m1.get_Dollars();
	int dollars2 = m2.get_Dollars();
	int cents1 = m1.get_Cents();
	int cents2 = m2.get_Cents();
	int sumDollars;
	int sumCents;
	if(dollars1 >= dollars2 )
		sumDollars = dollars1 - dollars2;
	else
		sumDollars = dollars2- dollars1;
	
	if(cents1 >= cents2)
		sumCents = cents1 - cents2;
	else
		sumCents = cents2 - cents1;
	
	if(sumCents >=100)
	{
		sumDollars += 1;
		sumCents -= 100;
	}
	Money output = new Money(sumDollars, sumCents);
	return output;
			
}
public static Money set_add(Money m1, Money m2)
{
	int dollars1 = m1.get_Dollars();
	int dollars2 = m2.get_Dollars();
	int cents1 = m1.get_Cents();
	int cents2 = m2.get_Cents();
	//all info we needed is added together here
	int sumDollars = dollars1 + dollars2;
	int sumCents = cents1 + cents2;
	//now we need to check if we have too many cents
	if(sumCents >= 100)
	{
		sumDollars += 1;
		sumCents -= 100;
	}
	Money output = new Money(sumDollars, sumCents);
	return output;
}
public String toString()
{
	return("$"+get_Dollars()+ "."+get_Cents());
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Money m1 = new Money(5,30);
Money m2 = new Money(6,90);
Money m3 = Money.set_add(m1,m2);
System.out.println(m3);
	}

}
