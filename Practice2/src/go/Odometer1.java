package go;

public class Odometer1 
{ 
	double miles; 
	double fuelEfficiency; 
	public Odometer1() 
	{
		setFuelEfficiency(0); 
		setMiles(0); 
	} 
	public Odometer1(double miles,double fuelEfficiency)
	{ 
		setFuelEfficiency(fuelEfficiency);
		setMiles(miles); 
		} 
	public void reset() 
	{
		miles=0; 
	} 
	public void setMiles(double miles)
	{
		this.miles=miles; 
	} 
	public double getMiles() 
	{
		return miles; 
	}
	public double getFuelEfficiency()
	{
		return fuelEfficiency; 
	}
	public void setFuelEfficiency(double fuelEfficiency)
	{
		this.fuelEfficiency=fuelEfficiency;
	}
	public void addMiles(double miles) 
	{
		this.miles=this.miles+miles;
	}
	public double getGasolineConsumption() 
	{
		return miles/fuelEfficiency;
		}
	public static void main(String args[]) 
	{
		Odometer1 o = new Odometer1(200,20);
		o.addMiles(300);
		o.addMiles(100);
		System.out.println("total miles covered = "+o.getMiles()+" with fuel efficiency "+o.getFuelEfficiency());
		System.out.println("gasoline consumes= "+o.getGasolineConsumption()+"gallons");
		o.reset();
		o.setFuelEfficiency(10);
		o.addMiles(200);
		o.addMiles(1000);
		System.out.println("total miles covered = "+o.getMiles()+" with fuel efficiency "+o.getFuelEfficiency());
		System.out.println("gasoline consumed= "+o.getGasolineConsumption()+"gallons");
		o.reset();
		o.setFuelEfficiency(5);
		o.addMiles(200);
		o.addMiles(1000);
		System.out.println("total miles covered = "+o.getMiles()+" with fuel efficiency "+o.getFuelEfficiency());
		System.out.println("gasoline consumed= "+o.getGasolineConsumption()+"gallons");
		o.reset();
		o.setFuelEfficiency(2);
		o.addMiles(2000);
		o.addMiles(1000);
		System.out.println("total miles covered = "+o.getMiles()+" with fuel efficiency "+o.getFuelEfficiency());
		System.out.println("gasoline consumed= "+o.getGasolineConsumption()+"gallons");
		}
	}