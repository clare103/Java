package problem1;

public class Ch4Ex7 {

	private double value;
	private char scale;
	
	public Ch4Ex7()
	{
		value = 0;
		scale = 'C';
	}
	public Ch4Ex7(double value, char scale)
	{
		set_value(value);
		set_scale(scale);
	}
	public void set_value(double value)
	{
		this.value = value;
	}
	public void set_scale(char scale)
	{
		this.scale = scale;
	}
	public char get_scale()
	{
		return scale;
	}
	public double get_value_C()
	{
		if(scale == 'C')
			return value;
		else
		{
			return 5*(value - 32)/9;
		}
	}
	public double get_value_F()
	{
		if(scale == 'F')
			return value;
		else
		{
			return (9*(value)/5)+32;
		}
	}
	private boolean isGreater(Ch4Ex7 another)
	{
		return(this.get_value_C()>another.get_value_C());
	}
	private boolean equals(Ch4Ex7 another)
	{
		return(this.get_value_C()>another.get_value_C());
	}
	private boolean isLess(Ch4Ex7 another)
	{
		return(this.get_value_C()<another.get_value_C());
	}
	public String toString()
	{
		return "temperature:"+ value + " "+ scale;
	}
	public void final_print()
	{
		Ch4Ex7 c = new Ch4Ex7(30, 'F');
		Ch4Ex7 d = new Ch4Ex7(15, 'C');
		
		System.out.println("Is "+c+" greater than "+d+"? "+c.isGreater(d));
		System.out.println("Is "+c+" less than "+ d +"? "+c.isLess(d));
		System.out.println("Is "+c+" equal to "+ d + "? "+c.equals(d));
		System.out.println("Temp in F = "+c+" is "+ c.get_value_C()+" C.");
		System.out.println("Temp in C = "+d+" is "+ d.get_value_F()+" F.");

		Ch4Ex7 e = new Ch4Ex7(0,'C');
		Ch4Ex7 f = new Ch4Ex7(-40, 'C');
		Ch4Ex7 g = new Ch4Ex7(100, 'C');

		System.out.println("0 degrees C = " +e.get_value_F()+" F.");
		System.out.println("-40 degrees C = "+ f.get_value_F()+ " F.");
		System.out.println("100 degrees C = "+ g.get_value_F()+ " F.");
			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex7 a = new Ch4Ex7();
a.final_print();
}
}
