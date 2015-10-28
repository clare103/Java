package problems;
import java.util.*;
import java.lang.*;
public class Ch6Ex13 {

	Object[] Trivia = new Object[5];
	String answer, user, question;
	//Object question, answer, user;
	int point, total;
	
	public Ch6Ex13()
	{
		for(int i =0; i < 5; i++)
		{
		Trivia[i] = new Object();
		}
		((Ch6Ex13) Trivia[0]).set_question("Where would you like to work?");
		((Ch6Ex13)Trivia[0]).set_answer("BuzzMob");
		((Ch6Ex13)Trivia[0]).set_point(1);
		System.out.println(((Ch6Ex13)Trivia[0]).question);
		select();
		if(correct(get_user()))
		{
			total_points(((Ch6Ex13)Trivia[0]).get_points());
		}
		
		((Ch6Ex13)Trivia[1]).set_question("What makes this place of work, the place you want to work?");
		((Ch6Ex13)Trivia[1]).set_answer("Programming");
		((Ch6Ex13)Trivia[1]).set_point(2);		
		System.out.println(((Ch6Ex13)Trivia[1]).get_question());
		select();
		if(correct(get_user()))
		{
			total_points(((Ch6Ex13)Trivia[1]).get_points());
		}
		
		((Ch6Ex13)Trivia[2]).set_question("How can you improve yourself as a programmer?");
		((Ch6Ex13)Trivia[2]).set_answer("Do programming on your own time.");
		((Ch6Ex13)Trivia[2]).set_point(3);	
		System.out.println(((Ch6Ex13)Trivia[2]).get_question());
		select();
		if(correct(get_user()))
		{
			total_points(((Ch6Ex13)Trivia[2]).get_points());
		}
		
		((Ch6Ex13)Trivia[3]).set_question("What is your favorite programming language?");
		((Ch6Ex13)Trivia[3]).set_answer("Java");
		((Ch6Ex13)Trivia[3]).set_point(4);		
		System.out.println(((Ch6Ex13)Trivia[3]).get_question());
		select();
		if(correct(get_user()))
		{
			total_points(((Ch6Ex13)Trivia[3]).get_points());
		}
				
		((Ch6Ex13)Trivia[4]).set_question("Do you think you did enough to get the job?");
		((Ch6Ex13)Trivia[4]).set_answer("Yes!");
		((Ch6Ex13)Trivia[4]).set_point(5);		
		System.out.println(((Ch6Ex13)Trivia[4]).get_question());
		select();
		if(correct(get_user()))
		{
			total_points(((Ch6Ex13)Trivia[4]).get_points());
		}
		
		System.out.println("Congrats the game is finished and the total amount of points you earned is: "+ total);
	}
	public void total_points(int total)
	{
		total += point;
	}
	public void set_user(String user)
	{
		this.user = user;
	}
	public String get_user()
	{
		return user;
	}
	public void set_answer(String answer)
	{
		this.answer = answer;
	}
	public String get_answer()
	{
		return answer;
	}
	public void set_question(String question)
	{
		this.question = question;
	}
	public String get_question()
	{
		return question;
	}
	public void set_point(int point)
	{
		this.point = point;
	}
	public int get_points()
	{
		return point;
	}
	public String toString()
	{
		return "The question is: "+ question+"\n"+ "The answer is: "+answer+"\n"
				+"The point value is: "+ point;
	}
	public boolean correct(String user)
	{
		if(user.contains("buzzmob")||user.contains("programming")||user.contains("java")|| user.contains("yes"))
			{
			System.out.println("Correct");
			return true;
			}
		else
		{
			System.out.println("Incorrect. No points gained and moving on to the next question");
			return false;
		}
	}
	public void select()
	{
		Scanner keyboard = new Scanner(System.in);
		String user = keyboard.nextLine();
		user.toLowerCase();
		set_user(user);		
	}
	public void display()
	{
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Ch6Ex13 a = new Ch6Ex13();
	a.display();
	}

}
