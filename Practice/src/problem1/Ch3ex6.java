package problem1;
import java.util.Scanner;
public class Ch3ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
int i_grub_pop =0;
int days = 0;
String answer;
boolean check = true;
while(check)
{
System.out.println("Enter the initial size of the grub population in pounds: ");
i_grub_pop = keyboard.nextInt();
System.out.println("Enther the number of days the grub population will repopulate: ");
days = keyboard.nextInt();
System.out.println("The total size of the grub worm pop after "+ days+" days is ");
System.out.println(total(days, i_grub_pop)+ " pounds");
System.out.println("Do you want to calculate again? (yes/no)");
answer = keyboard.next();
if(answer.equals("no"))
	check = false;
}
	}
public static int total(int days, int i_grub_pop)
{
	int duration = days/5;
	int one = 1;
	int two = 1;
	int three = 0;
	for (int i =1; i<=duration-1; i++)
	{
		three = one + two;
		one = two;
		two = three;
	}
	return i_grub_pop*three;
	}
}

