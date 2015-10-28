import java.util.Scanner;
public class problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the purchase price: ");
double price = keyboard.nextDouble();
System.out.println("Enter the years of service: ");
double years = keyboard.nextDouble();
System.out.println("Enter the salvage value: ");
double salvage = keyboard.nextDouble();
double depreciation = ((price - salvage)/years);
System.out.println(depreciation);
	}

}
