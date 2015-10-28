package problem1;
import java.util.*;
public class Ch4Ex6 {
private double quiz;
private double midterm;
private double finaltest;
private double overall;
	
	public Ch4Ex6()
	{
		
	}
	public Ch4Ex6(double quiz, double midterm, double finaltest)
	{
		set_quiz(quiz);
		set_midterm(midterm);
		set_finaltest(finaltest);
	}
	public void set_quiz(double quiz)
	{
		this.quiz += quiz;
	}
	public void set_midterm(double midterm)
	{
		this.midterm = midterm;
	}
	public void set_finaltest(double finaltest)
	{
		this.finaltest = finaltest;
	}
	public double get_quiz()
	{
		return quiz/30;
	}
	public double get_midterm()
	{
		return midterm/100;
	}
	public double get_finaltest()
	{
		return finaltest/100;
	}
//	public void set_overall(int quiz, int midterm, int finaltest)
//	{
//		overall = (quiz*.25)+(midterm*.35)+(finaltest*.4);
//		this.overall = overall;
//	}8
	
	
	public String toLetter(double overall)
	{
		if(overall >= 90)
			return "A";
		else if(overall < 90 && overall >= 80)
			return "B";
		else if(overall < 80 && overall >= 70)
			return "C";
		else if(overall < 70 && overall >= 60)
			return "D";
		else
			return "F";
	}
	public double get_overall()
	{
		overall = ((get_quiz()*.25)+(get_midterm()*.35)+(get_finaltest()*.4))*100;
		return overall;
	}
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter quiz 1 score out of 10: ");
		int quiz1 = keyboard.nextInt();
		set_quiz(quiz1);
		System.out.println("Please enter quiz 2 score out of 10: ");
		int quiz2 = keyboard.nextInt();
		set_quiz(quiz2);
		System.out.println("Please enter quiz 3 score out of 10: ");
		int quiz3 = keyboard.nextInt();
		set_quiz(quiz3);
		System.out.println(get_quiz());
		System.out.println("Please enter the midterm score out of 100: ");
		midterm = keyboard.nextInt();
		set_midterm(midterm);
		System.out.println("Please enter the final test score out of 100: ");
		finaltest = keyboard.nextInt();
		set_finaltest(finaltest);
		System.out.println("The overall numeric grade is: "+ get_overall());
		System.out.println("The overall letter grade is: "+ toLetter(get_overall()));
	}
	public void final_print()
	{
		readInput();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex6 c = new Ch4Ex6();
c.final_print();
		
		
	}

}
