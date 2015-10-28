package go;

public class Odometer {
 int milesD;
 int fuelMPG;

public Odometer()
{
	fuelMPG = 0;
	milesD=0;
}
public Odometer(int milesD, int fuelMPG)
{
	super();
	this.milesD = milesD;
	this.fuelMPG = fuelMPG;
}

public void reset()
{
	this.milesD = 0;
}
public void set_fuelEff(int fuelMPG)
{
this.fuelMPG = fuelMPG;	
}
public int get_fuelEff()
{
	return fuelMPG;
}
public void setMiles(int milesD)
{
	this.milesD = milesD;
}
public int getMiles()
{
	return milesD;
}

public void milesPerTrip(int milesD)
{
	this.milesD = this.milesD +milesD;
	
}
public int getNumOfGalOfGas()
{
	return milesD/fuelMPG;
}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Odometer o = new Odometer(200,20);
o.milesPerTrip(300);
o.milesPerTrip(100);
System.out.println("Total miles covered: "+ o.getMiles()+"\nWith a fuel efficiency of: "+ o.get_fuelEff());
System.out.println("Gas consumption: "+ o.getNumOfGalOfGas());
o.reset();
System.out.println("Check: "+ o.getMiles()+"\ncheck: "+o.get_fuelEff());

	}

}
