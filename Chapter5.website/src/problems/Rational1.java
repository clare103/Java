package problems;

public class Rational1 {
	
	private int num;
	private int denom;
	
	public Rational1()
	{
		num=0;
		denom =1;
	}

	public Rational1(int num, int denom)
	{
		set_num(num);
		set_denom(denom);
	}
	public Rational1(int wholenumber)
	{
		num = wholenumber;
		denom = 1;
	}
	public void normalize(Rational1 r1)
	{
		if(num > 0 && denom < 0)
		{
			r1.num = -r1.num;
			r1.denom = -r1.denom;
		}
		else if(num < 0 && denom < 0)
		{
			r1.num = -r1.num;
			r1.denom = -r1.denom;
		}
	}
	public void set_num(int num)
	{
		this.num = num;
	}
	public void set_denom(int denom)
	{
		this.denom = denom;
	}
	public int get_num()
	{
		return num;
	}
	public int get_denom()
	{
		return denom;
	}
	public String toString()
	{
		return "The fraction is: "+num+"/"+denom;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
