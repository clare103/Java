package arrays;
import java.util.*;
public class Diving {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
double[] scores = new double[7];
double lowest = 11, highest = -1;
//double sum =0;
double difficulty = 0;
//double finalscore;
boolean invalid = true;
while(invalid)
{
	try
	{
	System.out.println("Enter degree of difficulty[1.2-3.8]: ");
	difficulty = keyboard.nextDouble();
	if(difficulty > 3.8 || difficulty <1.2)
	{
		System.out.println("Please enter value in the range[1.2-3.8]");
		invalid = true;
	}
	else
		invalid = false;
	
	}catch(Exception ex)
	{
		System.out.println("Invalid characters found. Try again");
	}
}
for (int i=0; i<7; i++)
{
	invalid = true;
	while(invalid)
	{
		try
		{
			System.out.println("Enter the score for judge"+(i+1)+":");
			scores[i] = keyboard.nextDouble();
			if(scores[i] > 10 || scores[i] <0)
			{
				System.out.println("Please enter value in the range[0-10]");
				invalid = true;
			}
			else
				invalid = false;
			
		}catch (Exception ex)
		{
			System.out.println("Invalid characters found.Try again");
		}
	}
	if(scores[i] > highest)
	{
		highest = scores[i];
	}
	if(scores[i] < lowest)
	{
		lowest = scores[i];
	}
}
float sumOfJudgesScores = 0;
for(int i = 0; i<7; i++)
{
	sumOfJudgesScores += scores[i];
}
sumOfJudgesScores -= (highest + lowest);
float overallScore = (float)(sumOfJudgesScores*difficulty*0.6);
System.out.println("The overall score for the diver is " + overallScore);
	}

}
