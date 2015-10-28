package problem1;

public class Ch4Ex2 {
private int num;
private int den;
private double num_den;
	public Ch4Ex2()
	{
		
	}
	
	public void set_n(int num)
	{
		this.num = num;
	}
	public int get_n()
	{
		return num;
	}
	public void set_d(int den)
	{
		this.den = den;
	}
	public int get_d()
	{
		return den;
	}
	
		public void reduce()
		{
			int a,i;
			a = this.num<this.den?this.num:this.den;
			for(i = a; i>1; i--)
			{
				if(this.num%i==0 && this.den%i==0)
				{
					this.num = this.num/i;
					this.den = this.den/i;
				}
			}
		}
	
	public void print()
	{
		System.out.println("The original fraction is: "+get_n()+"/"+get_d());
		reduce();
		System.out.println(get_n()+"/"+get_d());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex2 c = new Ch4Ex2();
c.set_n(60);
c.set_d(20);
c.print();
	}

}
