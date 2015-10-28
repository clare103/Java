package problems;

public class Rational {

	private int num;
	private int denom;
	private Rational1 rational;
	
	public Rational()
	{
		num=0;
		denom =1;
	}
	public Rational(int num, int denom)
	{
		set_num(num);
		set_denom(denom);
	}
	public Rational(int wholenumber)
	{
		num = wholenumber;
		denom = 1;
	}
	private static Rational add(Rational r1, Rational r2)
	{
		if(r1.denom != r2.denom)
		{
		int newdenom = r1.denom * r2.denom;
		int newnum = r1.num * r2.denom;
		int newnum2 = r2.num * r1.denom;
		int newnum3 = newnum + newnum2;
		Rational r3= new Rational(newnum3, newdenom);
		r3.normalize(r3);
		return r3;
		}
		else
		{
			int newdenom1 = r1.denom;
						int newnum3 = r1.num + r2.num;
			Rational r3= new Rational(newnum3, newdenom1);
			r3.normalize(r3);
			return r3;
			
		}
	}
	private static Rational minus(Rational r1, Rational r2)
	{
		if(r1.denom != r2.denom)
		{
		int newdenom = r1.denom * r2.denom;
		
		int newnum = r1.num * r2.denom;
		int newnum2 = r2.num * r1.denom;
		int newnum3 = newnum - newnum2;
		Rational r3 = new Rational(newnum3, newdenom);
		r3.normalize(r3);
		return r3;
		}
		else
		{
		int newdenom1 = r1.denom;	
		int newnum3 = r1.num - r2.num;
		Rational r3 = new Rational(newnum3, newdenom1);
		r3.normalize(r3);
		return r3;
		}
	}
	private static Rational multiply(Rational r1, Rational r2)
	{
		int newdenom = r1.denom * r2.denom;
		int newnum = r1.num * r2.num;
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
		return r3;
	}
	private static Rational divide(Rational r1, Rational r2)
	{
		int newnum = r1.num * r2.denom;
		int newdenom = r1.denom * r2.num;
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
		return r3;
	}
	public Rational add(Rational r1)
	{
		if(this.denom != r1.denom)
		{
		int newdenom = this.denom * r1.denom;
		int newnum = this.num * r1.denom;
		int newnum2 = r1.num * this.denom;
		int newnum3 = newnum + newnum2;
		Rational r3= new Rational(newnum3, newdenom);
		r3.normalize(r3);
		return r3;
		}
		else
		{
			int newdenom1 = r1.denom;
			int newnum3 = this.num + r1.num;
			Rational r3= new Rational(newnum3, newdenom1);
			r3.normalize(r3);
			return r3;
			
		}
	}
	public Rational minus(Rational r1)
	{
		if(this.denom != r1.denom)
		{
		int newdenom = this.denom * r1.denom;
		
		int newnum = this.num * r1.denom;
		int newnum2 = r1.num * this.denom;
		int newnum3 = newnum - newnum2;
		Rational r3 = new Rational(newnum3, newdenom);
		r3.normalize(r3);
		return r3;
		}
		else
		{
		int newdenom1 = r1.denom;	
		int newnum3 = this.num - r1.num;
		Rational r3 = new Rational(newnum3, newdenom1);
		r3.normalize(r3);
		return r3;
		}
	}
	public Rational multiply(Rational r1)
	{
		int newdenom = this.denom * r1.denom;
		int newnum = this.num * r1.num;
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
		return r3;
	}
	public Rational divide(Rational r1)
	{
		int newnum = this.num * r1.denom;
		int newdenom = this.denom * r1.num;
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
		return r3;
	}
	public void add(Rational1 rational)
	{
		if(this.denom != rational.get_denom())
		{
		int newdenom = this.denom * rational.get_denom();
		int newnum = this.num * rational.get_denom();
		int newnum2 = rational.get_num() * this.denom;
		int newnum3 = newnum + newnum2;
		Rational r3= new Rational(newnum3, newdenom);
		r3.normalize(r3);
		System.out.println(r3);
		}
		else
		{
			int newdenom1 = rational.get_denom();
			int newnum3 = this.num + rational.get_num();
			Rational r3= new Rational(newnum3, newdenom1);
			r3.normalize(r3);	
			System.out.println(r3);
		}	
	}
	public void minus(Rational1 rational)
	{
		if(this.denom != rational.get_denom())
		{
		int newdenom = this.denom * rational.get_denom();
		
		int newnum = this.num * rational.get_denom();
		int newnum2 = rational.get_num() * this.denom;
		int newnum3 = newnum - newnum2;
		Rational r3 = new Rational(newnum3, newdenom);
		r3.normalize(r3);
		}
		else
		{
		int newdenom1 = rational.get_denom();	
		int newnum3 = this.num - rational.get_num();
		Rational r3 = new Rational(newnum3, newdenom1);
		r3.normalize(r3);
		}
	}
	public void multiply(Rational1 rational)
	{
		int newdenom = this.denom * rational.get_denom();
		int newnum = this.num * rational.get_num();
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
	}
	public void divide(Rational1 rational)
	{
		int newnum = this.num * rational.get_denom();
		int newdenom = this.denom * rational.get_num();
		Rational r3 = new Rational(newnum, newdenom);
		r3.normalize(r3);
	}
	public void normalize(Rational r1)
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
	public boolean equals(Rational otherRational)
	{
		return(this.num * otherRational.denom)==(otherRational.num*this.denom);
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
Rational r1 = new Rational(-1,2);
Rational1 r2 = new Rational1(-1,2);
//System.out.println(add(r1,r2));
//System.out.println(minus(r1,r2));
//System.out.println(multiply(r1,r2));
//System.out.println(divide(r1,r2));
r1.add(r2);

		
		
	}

}
