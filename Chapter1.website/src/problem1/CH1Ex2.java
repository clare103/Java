package problem1;
 
public class CH1Ex2 {
private int gumballs=0;
private int candybars=0;
private int coupons;
private boolean check = true;

public CH1Ex2()
{
	
}

public void spending(int coupons)
{
	while(check)
	{
		if(coupons >= 10)
		{
		candybars ++;
		coupons = coupons-10;
		}
		else if(coupons >= 3 && coupons < 10)
		{
		gumballs++;
		coupons = coupons-3;
		}
		else
		{
			this.coupons = coupons;
			check = false;
		}
	}
}
public String get_spending()
{
	return candybars + " " + gumballs + " " + coupons;
}

public void print()
{
	System.out.println("The total amount of candybars is:\n"
			+candybars+
			"\nThe total amount of gumballs is:\n"
			+gumballs+
			"\nThe remaining amount of coupons is:\n"
			+coupons);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CH1Ex2 c = new CH1Ex2();
c.spending(22);
c.print();

	}

}
