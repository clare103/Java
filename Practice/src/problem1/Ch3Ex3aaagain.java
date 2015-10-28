package problem1;
import java.util.Scanner;
public class Ch3Ex3aaagain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mom;
int dad;
int feet;
int inches = 0;
double malechild;
double femalechild;
boolean check = true;
String answer;
String answer1;
Scanner keyboard = new Scanner(System.in);

while(check)
{
	System.out.println("Enter gener of child: ");
	answer = keyboard.next();
	System.out.println("Enter mom height: ");
	mom = keyboard.nextInt();
	System.out.println("Enter dad height: ");
	dad = keyboard.nextInt();
	if(answer.equalsIgnoreCase("male"))
	{
		malechild = (((mom * 1.083)+dad)/2) + 0.5;
		feet = ((int)(malechild)/12);
		malechild = malechild - (feet*12);
		inches = (int)malechild;
		System.out.println(feet + " "+inches);
		
	}
	else if(answer.equalsIgnoreCase("female"))
	{
		femalechild = (((dad * .923)+mom)/2)+0.5;
		feet = ((int)(femalechild)/12);
		femalechild = femalechild - (feet*12);
		inches = (int)femalechild;
		System.out.println(feet + " "+ inches);
		
	}
	else	
		System.out.println("invalid gender.");
		

	
System.out.println("Would you like to continue? yes/no");
answer1 = keyboard.next();
if(answer1.equalsIgnoreCase("yes"))
	check=true;
else if(answer1.equalsIgnoreCase("no"))
	check=false;
else
	System.out.println("please enter yes or no.");

}
		
		
	}
}

