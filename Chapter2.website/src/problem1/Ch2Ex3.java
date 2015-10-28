package problem1;
import java.util.*;
public class Ch2Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter the first integer:");
int num1 = keyboard.nextInt();
System.out.println("Please enter the second integer:");
int num2 = keyboard.nextInt();
int sum = num1+num2;
int difference = num1-num2;
double product = num1*num2;
System.out.println("The sum of these two numbers is:"+ sum);
System.out.println("The difference of these two numbers is:"+difference);
System.out.println("The product of these two numbers is:"+product);
	}

}
