package problem1;

public class problem1 
{
	public static final double kilograms = 150 * (1/2.2);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double run = .0175 * 10 * kilograms * 30;
double basketball = .0175 * 8 * kilograms * 30;
double sleep = .0175 * 1 * kilograms * 360;
double total = run + basketball + sleep;
System.out.println(kilograms + " kilograms = 150 pounds");// converts pounds to kilograms
System.out.println(run + " is the total amount of calories burnt for a 150 pound person running 6mph for 30 minutes");
System.out.println(basketball + " is the total amount of calories burnt for a 150 pound person playing basketball for 30 minutes");
System.out.println(sleep + " is the total amount of calories burnt for a 150 pound person sleeping 6 hours");
System.out.println(total + " is the total amount of calories burnt for all activities");
	}

 
}

