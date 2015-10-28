package homework2;
import java.util.Scanner;
public class Ch1Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner (System.in);
System.out.println("Enter the number of coupons:");
int coupons = keyboard.nextInt();
int candybars = coupons / 10;
coupons = coupons - (candybars * 10);
int gumballs = coupons / 3;
coupons = coupons - (gumballs*3);
System.out.println("The total amount of candybars = " + candybars);
System.out.println("The total amount of gumballs = " + gumballs);
System.out.println("The remaining coupons = " + coupons);
	}

}
