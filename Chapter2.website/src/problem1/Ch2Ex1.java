package problem1;
import java.util.Scanner;
public class Ch2Ex1 {

	public Ch2Ex1()
	{
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value for n:");
		double n = keyboard.nextDouble();
		double pre;
		double guess = n/2;
		double r;
for(int i = 0; i<5; i ++)
{
	pre = guess;
	r = n/guess;
	guess = (guess + r)/2;
	System.out.println(guess);
}
		
	}

}
