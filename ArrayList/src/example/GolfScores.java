package example;

import java.util.*;
public class GolfScores {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Double> score = new ArrayList<Double>();

System.out.println("This program reads gold scores and shows");
System.out.println("how much each differs from the average.");

System.out.println("Enter golf scores:");
fillArrayList(score);
showDifference(score);
	}

public static void fillArrayList(ArrayList<Double> a)
{
	System.out.println("Enter a list of nonnegative numbers.");
	System.out.println("Mark the end of the list with a negative number.");
	Scanner keyboard = new Scanner(System.in);
	
	double next;
	int index =0;
	next = keyboard.nextDouble();
	while(next >= 0)
	{
		a.add(next);
		next = keyboard.nextDouble();
	}
}
	

public static double computeAverage(ArrayList<Double> a)
{
	double total= 0;
	for(Double element : a)
		total = total+ element;
		int numberOfScores = a.size();
		if(numberOfScores > 0)
		{
			return (total/numberOfScores);
		}
		else
		{
			System.out.println("ERROR: Trying to average 0 numbers.");
			System.out.println("computeAverage returns 0.");
			return 0;
		}	
}
		
public static void showDifference(ArrayList<Double> a)
{
	double average = computeAverage(a);
	System.out.println("Average of the "+ a.size() + " scores = " + average);
	System.out.println("The scores are:");
	for(Double element : a)
		System.out.println(element + " differs from average by "+ (element - average));
}
}


