package problems;

public class HourlyEmployee extends Employee {

	private double wageRate;
	private double hours;
	
	public HourlyEmployee()
	{
		super();
		wageRate =0;
		hours =0;
	}
	
	public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours)
	{
		super(theName, theDate);
		if((theWageRate >= 0)&& (theHours >= 0))
		{
			wageRate = theWageRate;
			hours = theHours;
		}
		else
		{
			System.out.println("Fatal Error: creating an illegal hourly employee.");
			System.exit(0);
		}
	}
	
	public HourlyEmployee(HourlyEmployee originalObject)
	{
		super(originalObject);
		wageRate = originalObject.wageRate;
		hours = originalObject.hours;
	}
	public double getRate()
	{
		return wageRate;
	}
	public double getHours()
	{
		return hours;
	}
	public double getPay()
	{
		return wageRate * hours;
	}
	public void setHours(double hoursWorked)
	{
		if(hoursWorked >= 0)
		{
			hours = hoursWorked;
		}
		else
		{
			System.out.println("Fatal Error: Negative hours worked.");
			System.exit(0);
		}
	}
	public void setRate(double newWageRate)
	{
		if(newWageRate >= 0)
		{
			wageRate = newWageRate;
		}
		else
		{
			System.out.println("Fatal Error: Negative wage rate.");
			System.exit(0);
		}
	}
	public String toString()
	{
		return (getName()+ " "+ getHireDate().toString()+"\n$"+ wageRate+ " per hour for "+ hours + " hours");
	}
	public boolean equals(HourlyEmployee other)
	{
		return (getName().equals(other.getName())
				&& getHireDate().equals(other.getHireDate())
				&& wageRate == other.wageRate
				&& hours == other.hours);				
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HourlyEmployee joe = new HourlyEmployee("Joe Worker", new Date("January",1, 2004), 50.50,160);
System.out.println("joe's longer name is "+ joe.getName());
System.out.println("Changing joe's name to Joesphine.");
joe.setName("Josephine");

System.out.println("joes record is as follows:");
System.out.println(joe); 
	}

}
