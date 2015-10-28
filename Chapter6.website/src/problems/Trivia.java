package problems;

import java.util.Scanner;

public class Trivia {

	String answer, question, user;
	int point, total=0;
	//Trivia[] trivia;
	
	public Trivia(String question, String answer, int point)
	{
		set_answer(answer);
		set_question(question);
		set_point(point);
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
		if(correct(get_user()))
		{
			total_points(get_points());
		}
	}
	public void display()
	{
		System.out.println(get_question());
	}

	public void total_points(int point)
	{
		total = point;
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
	public void final_print()
	{
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
