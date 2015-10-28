package problem1;
import java.util.Scanner;

public class Ch3ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
int h_dad;
int h_mom;
int feet;
int inches;
double h_male_child;
double h_female_child;
boolean check = true;
String child;
String answer;
while(check)
{	
System.out.println("Enter height of father in whole integers: ");
h_dad = keyboard.nextInt();
System.out.println("Enter height of mother in whole integers: ");
h_mom = keyboard.nextInt();
System.out.println("Enter sex of child: (male/female)");
child = keyboard.next();

if (child.equals("male"))
{
	h_male_child = ((((h_mom * (1.083)) + h_dad)/2)+0.5);
	feet = ((int)(h_male_child)/12);
	h_male_child = h_male_child - (feet * 12);
	inches = (int)(h_male_child);
	System.out.println("The predicted height of the male child is ");
	System.out.println(feet + " feet" + " " + inches+ " inches");
}
else if (child.equals("female"))
{
	h_female_child = ((((h_dad * (.923))+ h_mom)/2)+0.5);
	feet = ((int)(h_female_child)/12);
	h_female_child = h_female_child -(feet*12);
	inches = (int)(h_female_child);
	System.out.println("The predicted height of the female child is ");
	System.out.println(feet+ " feet" + " " + inches+" inches");
}
else
{
	System.out.println("Invalid child sex input");
}
	System.out.println("Would you like calculate again? (yes/no) ");
	answer = keyboard.next();
	if(answer.equals("yes"))
	{
		check = true;
	}
	else
		check = false;
	}
	}
}

