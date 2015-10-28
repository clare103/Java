package problems;

import java.util.*;

public class Ch6Ex12 {

	String[] questions = new String[5];
	String[] answers = new String[5];	
	int[] difficulty = {1,2,3,4,5};
	int totalpoints;
	
	public Ch6Ex12()
	{
		questions[0] = "Where would you like to work?";
		questions[1] = "What makes this place of work, the place you want to work?";
		questions[2] = "How can you improve yourself as a programmer?";
		questions[3] = "What is your favorite programming language?";
		questions[4] = "Do you think you did enough to get the job?";
		
		answers[0] = "BuzzMob";
		answers[1] = "Programming";
		answers[2] = "Do programming on your own time.";
		answers[3] = "Java";
		answers[4] = "Yes!";
		
		select();
	}
	
	public void select()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(questions[0]);
		String answer = keyboard.nextLine();
		answer.toLowerCase();
		if(answer.contains("buzzmob"))
		{
			System.out.println("Correct");
			System.out.println("You have gained: "+difficulty[0]+" points");			
			totalpoints += difficulty[0];
		}
		else
		{
			System.out.println("Wrong. Next question coming up!");
			System.out.println("The correct answer is: "+ answers[0]);
		}
		System.out.println(questions[1]);
		answer = keyboard.nextLine();
		answer.toLowerCase();
		if(answer.contains("program"))
		{
			System.out.println("Correct");
			System.out.println("You have gained: "+ difficulty[1]+" points");
			totalpoints += difficulty[1];
		}
		else
		{
			System.out.println("Wrong. Next question coming up!");
			System.out.println("The correct answer is: "+ answers[1]);
			
		}
		System.out.println(questions[2]);
		answer = keyboard.nextLine();
		answer.toLowerCase();
		if(answer.contains("programming"))
		{
			System.out.println("Correct!");
			System.out.println("You have gained: "+ difficulty[2] + " points");
			totalpoints += difficulty[2];
		}
		else
		{
			System.out.println("Wrong. Next question comming up!");
			System.out.println("The correct answer is: "+ answers[2]);
			
		}
		System.out.println(questions[3]);
		answer = keyboard.nextLine();
		answer.toLowerCase();
		if(answer.contains("java"))
		{
			System.out.println("Correct!");
			System.out.println("You have gained: "+ difficulty[3]+ " points");
			totalpoints += difficulty[3];
		}
		else
		{
			System.out.println("Wrong. Next question coming up!");
			System.out.println("The correct answer is: "+ answers[3]);
			
		}
		System.out.println(questions[4]);
		answer = keyboard.nextLine();
		answer.toLowerCase();
		if(answer.contains("yes"))
		{
			System.out.println("Correct!");
			System.out.println("You have gained: "+ difficulty[4]+" points");
			totalpoints+= difficulty[4];
			System.out.println("Game over because all of the questions have been answered!");
		}
		else
		{
			System.out.println("Wrong. Game Over!");
			System.out.println("The correct answer is: "+ answers[4]);
			
		}
		System.out.println("The total amount of points you have earned is: "+ totalpoints);
		System.out.println("Congrats!");
		
	}
	public void display()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex12 a = new Ch6Ex12();
a.display();
		
		
		
	}

}
