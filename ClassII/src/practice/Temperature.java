package practice;
import java.util.*;

public class Temperature {

	private double degrees;
	
	public Temperature()
	{
		degrees =0;
	}
	public Temperature(double initialDegrees)
	{
		degrees = initialDegrees;
	}
	public void setDegrees(double newDegrees)
	{
		degrees = newDegrees;
	}
	public double getDegrees()
	{
		return degrees;
	}
	public String toString()
	{
		return (degrees +"C");
	}
	public boolean equals(Temperature otherTemperature)
	{
		return (degrees == otherTemperature.degrees);
	}
	public static double toCelcius(double degreesF)
	{
		return 5*(degreesF - 32)/9;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double degreesF,degreesC;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter degrees Fahrenheit:");
		degreesF = keyboard.nextDouble();
		
		degreesC = toCelcius(degreesF);
		Temperature temperatureObject = new Temperature(degreesC);
		System.out.println("Equivalent Celcius temperature is "+ temperatureObject.toString());
	}

}
