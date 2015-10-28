import java.util.Scanner;
public class problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the first number: ");
double num1 = keyboard.nextDouble();
System.out.println("Enter the second number: ");
double num2 = keyboard.nextDouble();
double num3 = num1 + num2;
double num4 = num1 - num2;
double num5 = num1 * num2;
System.out.println("Sum: "+ num3 + " Diff: "+ num4 + " Product: "+ num5);

	}

}
