package problem1;

public class Ch4Ex3 {

	private double miles_d;
	private double fuel_e;
	private double gas;
	
	public Ch4Ex3()
	{
		fuel_e= 0;
		miles_d=0;
	}
	public Ch4Ex3(double miles_d, double fuel_e)
	{
		this.miles_d = miles_d;
		this.fuel_e = fuel_e;
		
	}
	public void reset()
	{
		miles_d = 0;
	}
	public void setFuel(double fuel_e)
	{
		this.fuel_e = fuel_e;
	}
	public void addMiles(double miles_d)
	{
		this.miles_d += miles_d;
	}

	public double get_gas()
	{
		return miles_d/fuel_e;
	}
	
	public double getMiles()
	{
		return miles_d;
	}
	public double getFuel()
	{
		return fuel_e;
	}
	public void print()
	{
		System.out.println("The car's fuel efficiency = "+ fuel_e);
		System.out.println("The total miles driven are: "+ miles_d);
		System.out.println("The number of gallons of gasoline that the vehicle has consumed since the odometer was last reset is: "+ get_gas());				
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Ch4Ex3 c = new Ch4Ex3(5, 20);
		 c.addMiles(40);
		 c.print();
		 c.reset();
		 c.print();

		
		
		
	}

}
