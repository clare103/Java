package problem1;
import java.util.Scanner;
import java.lang.Math;
public class Ch3Ex7again {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x;
double y;
String answer;
boolean check = true;
double sum=1;
while(check)
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter value of x: ");
	x = keyboard.nextDouble();
	for (int i=1;i<=12; i++)
	{
		y=i;
		if(i==11)
			y=50;
		else if(i==12)
			y=100;
		sum=1;
		for(int j=1;j<=y; j++)
		{
			sum= sum+ Math.pow(x,j)/factorial(j);
		}
		System.out.println("For n ="+y+ ",e^x = "+sum);
		
		}

	System.out.println("Continue Calculating: yes/no");
	answer = keyboard.next();
	if(answer.equals("no"))
		check = false;
}
}
	public static double factorial(double n)
	{
		double product =1;
				for(int i=1; i<=n; i++)
				product = product*i;
		return product;
	}

}
