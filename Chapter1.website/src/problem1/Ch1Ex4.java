package problem1;

public class Ch1Ex4 {
private int startweight;
private int endweight;
private int mouseweight;
private double coke_sweetner = .001;
private double consumable;
private double kill_amount = .01;
	public Ch1Ex4()
	{
		
	}
	public void set_startweight(int startweight)
	{
		this.startweight = startweight;
	}
	public int get_startweight()
	{
		return startweight;
	}
	public void set_kill(double kill_amount,int endweight, int mouseweight)
	{
		this.consumable = (kill_amount * endweight)/(mouseweight * coke_sweetner);
	}
	public double get_kill()
	{
		return consumable;
	}
	public void set_endweight(int endweight)
	{
	this.endweight = endweight;
	}
	public int get_endweight()
	{
	return endweight;
	}
	public void print()
	{
		System.out.println("The startweight is:\n" +
				get_startweight()+
				"\nThe desired endweight is:\n"
				+get_endweight()+
				"\nThe total amount diet coke the deiter can safely drink is:\n" +
				get_kill());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch1Ex4 c = new Ch1Ex4();
c.set_kill(.02,150,5);
c.set_startweight(200);
c.set_endweight(150);
c.print();

	}

}
