package problem1;

public class Ch1Ex9 {
private int feet;
private int inches;
private int bodyweight;
	public Ch1Ex9()
	{
		
	}
	public void calculate(int feet, int inches)
	{
		if(feet > 5)
		{
			feet = feet - 5;
			int bodyweight = 110 +(feet * 60) + (inches*5);
			this.bodyweight = bodyweight;
		}
		else if(feet == 5)
		{
			int bodyweight = 110 + (inches *5);
			this.bodyweight = bodyweight;
		}
		else
			System.out.println("Can't calculate bodyweight for persons under 5 feet or invalid input");
	}
	public int get_calculate()
	{
		return bodyweight;
	}
	public void print()
	{
		System.out.println("The ideal bodyweight for this person is:\n"
					+get_calculate());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch1Ex9 c = new Ch1Ex9();
c.calculate(6, 3);
c.print();
c.calculate(5, 4);
c.print();
c.calculate(4, 3);

	}

}
