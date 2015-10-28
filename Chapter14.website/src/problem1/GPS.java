package problem1;

public class GPS {

	double x,y;
	int t;
	
	public GPS()
	{
		
	}
	public GPS(double x, double y, int t)
	{
		set_x(x);
		set_y(y);
		set_t(t);
	}
	public void set_x(double x)
	{
		this.x = x;
	}
	public void set_y(double y)
	{
		this.y = y;		
	}
	public void set_t(int t)
	{
		this.t = t;
	}
	public double get_x()
	{
		return x;
	}
	public double get_y()
	{
		return y;
	}
	public int get_t()
	{
		return t;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
