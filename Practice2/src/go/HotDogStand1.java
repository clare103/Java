package go;

public class HotDogStand1 {
int standID;
int noHDS;
static int totalHDS;

public HotDogStand1(int standID, int noHDS)
{
	super();
	this.standID = standID;
	this.noHDS = noHDS;
}
public int getNoHDS()
{
	return noHDS;
}
public static int totalNoHDS()
{
	return totalHDS + 60;
}
public void setNoHDS(int noHDS)
{
	this.noHDS = noHDS;
}
public void justSold()
{
	totalHDS++;
	this.noHDS++;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HotDogStand1 h1 = new HotDogStand1(1,10);
HotDogStand1 h2 = new HotDogStand1(2,20);
HotDogStand1 h3 = new HotDogStand1(3,30);
h1.justSold();
h2.justSold();
h3.justSold();
System.out.println("Hot dog stand1 sales: "+ h1.noHDS);
System.out.println("Hot dog stand2 sales: "+ h2.noHDS);
System.out.println("Hot dog stand3 sales: "+ h3.noHDS);
System.out.println("Total sold: "+ totalNoHDS());

	}

}
