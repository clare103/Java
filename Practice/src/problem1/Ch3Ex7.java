package problem1;
import java.lang.Math;
import java.util.Scanner;
public class Ch3Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
double x;
double y;
String answer;
double sum=1;
boolean check = true;
while (check)
{
	System.out.println("Input value of x: ");
	x = keyboard.nextDouble();
	for(int i=1; i<=12; i++)
	{
		y=i;
		if(i==11)
			y=50;
		else if (i==12)
			y=100;
		sum=1;
		for(int j=1; j<=y; j++)
		{
			sum = sum+ Math.pow(x,j)/factorial(j);
		}
		System.out.println("For n="+y+ ", e^x = "+sum);
	}
	System.out.println("Continue calculating? yes/no");
	answer = keyboard.next();
	if(answer.equals("no"))
		check =false;
	else
		System.out.println("Invalid input.");
	}
}
	
	public static double factorial (double n)
	{
		double product = 1;
		for (int i=1; i<=n; i++)
			product = product *i;
		return product;
	}

	}


