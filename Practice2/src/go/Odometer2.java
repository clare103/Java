package go;

public class Odometer2 {
int miles;
int MPG;
public Odometer2()
{
	miles = 0;
	MPG = 0;
}

public Odometer2(int miles, int MPG)
{
	super();
	this.miles = miles;
	this.MPG = MPG;
}
public void reset()
{
	miles = 0;
}
public void set_FuelEff(int MPG)
{
	this.MPG = MPG;
}
public int get_FuelEff()
{
	return MPG;
}
public void set_Miles(int miles)
{
	this.miles = miles;
}
public int get_Miles()
{
	return miles;
}
public void addMiles(int miles)
{
	this.miles+=miles;
}
public int get_FuelConsumption()
{
	return miles/MPG;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Odometer2 o = new Odometer2(200, 20);
o.addMiles(100);
o.addMiles(50);
System.out.println("Total miles: "+ o.get_Miles()+"\nFuel Efficiency: "+ o.get_FuelEff());
System.out.println("Fuel Consumption: "+ o.get_FuelConsumption());
o.reset();
o.set_FuelEff(10);
o.set_Miles(500);
o.addMiles(300);
System.out.println("Total miles: "+o.get_Miles()+"\nFuel Efficiency: "+ o.get_FuelEff());
System.out.println("Gas consumption: "+ o.get_FuelConsumption());
	}

}
