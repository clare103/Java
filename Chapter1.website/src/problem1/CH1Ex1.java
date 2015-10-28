package problem1;
public class CH1Ex1 {
private int MET;
private double calories_burned;
private double weight;
private double kilograms;
private int minutes;
private double calories_burned_running;
private double calories_burned_sleeping;
private double calories_burned_basketball;

	public CH1Ex1()
	{
		
	}
	public void running(int MET, int minutes)
	{
		calories_burned_running = 0.0175 * MET * get_conversion() * minutes;
	}
	public double get_running()
	{
		return calories_burned_running;
	}
	public void basketball(int MET, int minutes)
	{
		calories_burned_basketball = 0.0175 * MET * get_conversion() * minutes;
	}
	public double get_basketball()
	{
		return calories_burned_basketball;
	}
	public void sleeping(int MET, int minutes)
	{	
		calories_burned_sleeping = 0.0175 * MET * get_conversion() * minutes;
	}
	public double get_sleeping()
	{
		return calories_burned_sleeping;
	}
//	public void formula(int MET, int minutes)
//	{
//		calories_burned = 0.0175 * MET * get_conversion() * minutes;
//	}
	public void conversion(double weight)
	{
		kilograms = weight * 2.2;
	}
	public double get_conversion()
	{
		return kilograms;
	}
	public void print()
	{
		System.out.println("The total amount of calories burned running are:\n" 
					+get_running()+
					"\nThe total amount of calories burned playing basketball are:\n"
					+get_basketball()+
					"\nThe total amount of calories burned sleeping are:\n"
					+get_sleeping());
				
				
	}
//	public double get_formula()
//	{
//		return calories_burned;
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CH1Ex1 c = new CH1Ex1();
c.conversion(150);
c.running(10, 30);
c.basketball(8,30);
c.sleeping(1,360);
c.print();



	}

}
