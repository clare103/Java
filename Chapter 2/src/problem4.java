import java.util.Scanner;
public class problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter distance of commute in miles: ");
double miles = keyboard.nextDouble();
System.out.println("Enter MPG of car: ");
double mpg = keyboard.nextDouble();
System.out.println("Enter the price of gas: ");
double price = keyboard.nextDouble();
double total = (miles / mpg)*price;
System.out.println(total);

	}

}
