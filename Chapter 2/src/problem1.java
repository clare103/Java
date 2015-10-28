import java.util.Scanner;
public class problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
double pre;
double n;
System.out.println("Enter value of n: ");
n = keyboard.nextDouble();
double guess=n/2;
double r;

for(int i=0; i<5; i++)
{	
	pre=guess;
	r = n/guess;
	guess = (guess + r)/2;
}
System.out.println(guess);
	}

}
