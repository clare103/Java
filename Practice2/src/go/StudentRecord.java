package go;

public class StudentRecord {
double quiz;
double midterm;
double finaltest;
double overall;
String letter;

public StudentRecord(double quiz, double midterm, double finaltest)
{
	super();
	this.quiz = quiz;
	this.midterm = midterm;
	this.finaltest = finaltest;
}
public void set_quiz(double quiz)
{
	this.quiz += quiz; 
}

public void set_midterm(double midterm)
{
	this.midterm = midterm;
}
public void set_final(double finaltest)
{
	this.finaltest = finaltest;
}
public void set_overall(double overall)
{
	this.overall = overall;
}

public double get_overall()
{
	double overall =((get_quiz()*.25)+(get_midterm()*.35)+(get_finaltest()*.4))*100;
	return overall;
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
public String get_letter()
{
	if(get_overall() >= 90 && get_overall() <= 100)
	{
		return "A";
	}
	else if(get_overall() < 90 && get_overall() >= 80)
	{
		return "B";
		
	}
	else if(get_overall() < 80 && get_overall() >=70)
	{
		return "C";
		
	}
	else if(get_overall() <70 && get_overall() >=60)
	{
		return "D";
		
	}
	else if(get_overall() < 60 && get_overall() >= 0)
	{
		return "F";
	}
	else
		return "Invalid score, check calculations.";
}

public void display()
{
	System.out.println("The students final letter grade is: "+ get_letter());
}
public void reset()
{
	this.quiz = 0;
	this.midterm =0;
	this.finaltest =0;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentRecord r = new StudentRecord(0,0,0);
r.set_quiz(8);
r.set_quiz(9);
r.set_quiz(10);
r.set_midterm(90);
r.set_final(90);
r.display();
System.out.println("Overall quiz: "+ r.get_overall());
System.out.println(r.get_quiz());
r.reset();
r.set_quiz(5);
r.set_quiz(5);
r.set_quiz(5);
r.set_midterm(85);
r.set_final(90);
r.display();
System.out.println("Overall score percentage: "+ r.get_overall());
System.out.println(r.get_quiz());	
	}

}
