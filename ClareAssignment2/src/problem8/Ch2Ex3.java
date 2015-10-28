package problem8;
import java.util.Scanner;
public class Ch2Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter number 1");		
		int num1 = keyboard.nextInt();
		System.out.println("Enter number 2");
		int num2 = keyboard.nextInt();
		int num3 = num1 + num2;
		int num4 = num1 * num2;
		int num5 = num1 - num2;
		System.out.println("The sum of the two numbers entered = " + num3);
		System.out.println("The product of the two numbers entered = " + num4);
		System.out.println("The difference of the two numbers entered = " + num5);
		
	}

}
