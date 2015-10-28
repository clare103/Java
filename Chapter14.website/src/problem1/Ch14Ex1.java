package problem1;

import java.util.*;

public class Ch14Ex1 {

	ArrayList<Double> JudgesScore = new ArrayList<Double>(7); 
	ArrayList<Double> Difficulty = new ArrayList<Double>(1);
	public boolean done = false;
	String answer;
	double next, sum, total;
	int max_index, min_index, index;	
	Scanner keyboard = new Scanner(System.in);
	

	public Ch14Ex1()
	{
		
	}
	public void increment_max()
	{
		max_index++;
	}
	public void increment_min()
	{
		min_index++;
	}
	public void reset()
	{
		index = 0;
	}

	public void set_total(double total)
	{
		this.total = total;
	}
	public double get_total()
	{
		return total;
	}
	
	public void input()
	{
		System.out.println("Input an entry for degree of difficulty:");
		next = keyboard.nextDouble();
		Difficulty.add(next);				
		while(!done)
		{	
			System.out.println("Input the next judge's score:");
			next = keyboard.nextDouble();
			JudgesScore.add(next);
			System.out.print("More items for the list? ");
			answer = keyboard.next();
			System.out.println();
			if(!(answer.equalsIgnoreCase("yes")))
				done = true;
		}
		System.out.println();
		System.out.println("The list contains: ");
		for(double entry : JudgesScore)
			System.out.println(entry);
		for(double score : JudgesScore)
			sum += score;
		System.out.println("The total score is: " + sum);				
	}
	public void remove()
	{
		double max = 0;
		double min = 10;
		reset();
		for(double score : JudgesScore)
		{
			if(score > max)
			{
				max = score;
				max_index = index;
			}				
			index++;			
		}
		System.out.println("The max index is: "+max_index);
		System.out.println("The max element is: "+ JudgesScore.get(max_index));
		reset();

		System.out.println();
		
		for(double score1 : JudgesScore)
		{
			if(score1 < 10)
			{
				min = score1;
				min_index = index;
			}
			index++;
		}
		System.out.println("The min index is: "+ min_index);
		System.out.println("The min element is: "+ JudgesScore.get(min_index));
		
		System.out.println("The annotated list is: ");
		JudgesScore.remove(min_index);
		JudgesScore.remove(max_index);
		for(double element: JudgesScore)
		{
			System.out.println(element);
		}
	}
	
	public void compute()
	{
		double total = sum * Difficulty.get(0);
		System.out.println("The total is:" + total);
	}
	public void display()
	{
		input();
		remove();
		compute();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch14Ex1 c = new Ch14Ex1();
		c.display();
		
	}

}
