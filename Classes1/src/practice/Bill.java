package practice;
import java.util.Scanner;
public class Bill {

	public static final double RATE = 150.00;
	private int hours, minutes;
	private double fee;
	
	public void inputTimeWorked()
	{
		System.out.println("Enter number of full hours worked");
		System.out.println("followed by number of minutes:");
		Scanner keyboard = new Scanner(System.in);
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt();
	}
	private double computeFee(int hoursWorked, int minutesWorked)
	{
		minutesWorked = hoursWorked*60 + minutesWorked;
		int quarterHours = minutesWorked/15;
		//Any remaining fraction of a quarter hour is not charged for
		return quarterHours*RATE;
	}
	public void updateFee()
	{
		fee = computeFee(hours, minutes);
	}
	public void outputBill()
	{
		System.out.println("Time worked: ");
		System.out.println(hours + " hours and "+ minutes + " minutes");
		System.out.println("Rate: $"+ RATE+" per quarter hour.");
		System.out.println("Amount due: $"+ fee);
	}
			
			
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the law offices of ");
		System.out.println("Dewey, Cheatham, and Howe.");
		Bill yourBill = new Bill();
		yourBill.inputTimeWorked();
		yourBill.updateFee();
		yourBill.outputBill();
		System.out.println("We have placed a lien on your hourse");
		System.out.println("It has been our pleasure to serve you.");
		
	}

}
