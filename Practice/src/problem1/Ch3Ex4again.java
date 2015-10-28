package problem1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch3Ex4again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
DecimalFormat newFormat = new DecimalFormat("#.##"); 

double pencil;
int year;
double inflation;
double inflationprice;
System.out.println("Enter current price of pencils: ");
pencil = keyboard.nextDouble();
System.out.println("Enter years from now the pencils will be purchased: ");
year = keyboard.nextInt();
System.out.println("Enter current inflation rate(percentage): ");
inflation = keyboard.nextDouble();
for(int i=0;i<year; i++)
{
	inflationprice = pencil * (inflation/100);
	pencil = inflationprice + pencil;
	
}
double twoDecimal = Double.valueOf(newFormat.format(pencil));
System.out.println("The price of 200 pencils in "+year+" years ");
System.out.println("with inflation at "+inflation+ "% is "+ " $"+twoDecimal+ " dollars.");
}
	}


