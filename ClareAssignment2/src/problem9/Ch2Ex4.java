package problem9;
import java.util.Scanner;
public class Ch2Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter distance in miles: ");
		double distance = keyboard.nextDouble();
		System.out.println("Enter miles per gallon of vehicle: ");
		double mpg = keyboard.nextDouble();
		System.out.println("Enter price of gas per gallon: ");
		double gas = keyboard.nextDouble();
		System.out.println("The total cost of the trip is: " + distance / mpg * gas );
		
	}

}
