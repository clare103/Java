package problem1;
import java.util.Scanner;
public class Ch3Ex4aaagain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
double pencil;
double inflation;
double inflationrate;
int year;
System.out.println("Enter number of years from now the pencils will be purchased: ");
year = keyboard.nextInt();
System.out.println("Enter price of pencils: ");
pencil = keyboard.nextDouble();
System.out.println("Enter the current inflation rate: ");
inflation = keyboard.nextDouble();
for(int i=0; i<year; i++)
{
	inflationrate = pencil*(inflation/100);
	pencil = inflationrate + pencil;
	
}
System.out.println(pencil);
	}

}
