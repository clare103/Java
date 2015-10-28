package problem1;
import java.util.*;
public class Ch2Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter the distance of the commute in miles: ");
double distance = keyboard.nextDouble();
System.out.println("Please enter the automobiles fuel consumption rate in miles per gallon:");
double fuel_cons = keyboard.nextDouble();
System.out.println("Please enter the price of a gallon of gas:");
double gas = keyboard.nextDouble();
double cost = (distance/fuel_cons)*gas;
System.out.println(cost);
	}

}
