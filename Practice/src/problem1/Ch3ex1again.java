package problem1;
import java.util.Scanner;
import java.lang.Math;
public class Ch3ex1again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
double r;
System.out.println("Enter an integer: ");
double n = keyboard.nextDouble();
double guess = n/2;
double pre = 0.0;

while(Math.abs(pre-guess)>(guess/100))
{
	pre = guess;
	r = n/guess;
	guess = (guess + r)/2;
}
System.out.println(guess);
}
	}


