package problems;
import java.util.*;
public class Ch6Ex1 {

	private double difficulty;
	private static int judges =7;
	private float[] score = new float[judges];
	private float max;
	private float min;
	private float overall;
	
	
	public Ch6Ex1(double[] a)
	{
		if(a.length == 0)
		{
			System.out.println("Empty score records.Exiting");
			System.exit(0);
		}
		difficulty = a.length;
	}
	public Ch6Ex1(Ch6Ex1 copy)
	{
		difficulty = copy.difficulty;
		score[judges]= copy.score[judges];
		max = copy.max;
		min = copy.min;
		
	}
	public Ch6Ex1()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the difficulty of the dive: (1.2-3.8) ");
		difficulty = keyboard.nextDouble();
		
		System.out.println("Enter the judges score starting from the first one:(1-10) ");
		score[0] = keyboard.nextFloat();
		max = score[0];
		min = score[0];
		overall = score[0];
		for(int index = 1; index <score.length;index++)
		{
			score[index] =keyboard.nextFloat();
			if(score[index] > max)
				max = score[index];
			else if(score[index] < min)
				min = score[index];
			
			overall+= score[index];
		}
	}
	public void set_min(float min)
	{
		this.min = min;
	}
	public void set_max(float max)
	{
		this.max = max;
	}
	public float get_min()
	{
		return min;
	}
	public float get_max()
	{
		return max;
	}
	public void display()
	{
		System.out.println("The highest score is: "+max);
		System.out.println("The lowest score is:"+ min);
		System.out.println("The scores are: ");
		for(int index = 0; index<score.length;index++)
			System.out.print(score[index]+" ");
		System.out.println("The final score is:"+ ((overall-min-max)*difficulty)*.6);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex1 d = new Ch6Ex1();
d.display();

	}

}
