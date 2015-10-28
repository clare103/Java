package problems;
import java.util.*;
public class Ch6Ex14 {

	public int[] PIN = {0,1,2,3,4,5,6,7,8,9};
	public int[] PIN_RAND = new int[10];
	public int[] NEW_PIN = new int[5];
	public int[] cross_check = new int[5];
	public int[] answer_array = new int[5];
	public int number;
	
	public Ch6Ex14()
	{
		
	}
	
	public void randomize(int[] a)
	{
		Random generator = new Random();
		System.out.print("PIN:");
		for(int i =0; i < a.length; i++)
		{
			int r = generator.nextInt(3)+1;
			System.out.print(" "+ PIN[i]);
			PIN_RAND[i] = r;
		}
		System.out.println();
		System.out.print("NUM:");
		for(int g=0; g < PIN_RAND.length; g++)
		{
			System.out.print(" "+ PIN_RAND[g]);
		}
	}
	public boolean check_length(int a)
	{
		if(0 >a || a > 99999)
			return false;
		return true;
	}
	public boolean check(int[] a)
	{
		for(int i =0; i < a.length; i++)
		{
			if(a[i] < 0 || a[i] > 9)
				return false;
		}
		return true;
		
	}
	public boolean check_correct(int[] NEW_PIN, int[] cross_check)
	{
		for(int i =0; i < 5; i++)
		{
			if(NEW_PIN[i] != cross_check[i])
			{
				System.out.println("Wrong!");
				return false;
			}
		}
		System.out.println("Correct!");
		return true;
	}
	public void assign(int[] answer_array, int[] PIN_RAND, int[] NEW_PIN)
	{
		for(int i=0; i < 10; ++i)
		{
			for(int g =0; g < 5; g++)
			{
				if(i == answer_array[g])
				{			
				NEW_PIN[g] = PIN_RAND[i];
				}
			}			
		}
		System.out.println();
		for(int g=0; g<5; g++)
		{
			System.out.print(NEW_PIN[g]);
		}
	}
	public void select()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a 5 digit password:");
		System.out.println("If you enter a password with less than 5 digits, then will fill the remaining digits. (e.g.12300)");
		int number = keyboard.nextInt();
		for(int i=4; i >= 0; i--)
		{
			answer_array[i] = number%10;
			number /= 10;
		}		
	}
	public void select_again()
	{
		System.out.println();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the 5 digit encrypted number:");
		int new_number = keyboard.nextInt();
		for(int i=4; i >= 0; i--)
		{
			cross_check[i] = new_number%10;
			new_number /= 10;
		}
		check_correct(NEW_PIN, cross_check);
	}
	public void reprint()
	{
		System.out.println("This is the int reprinted out.");
		for(int i =0; i < 5; i++)
		{
			System.out.print(answer_array[i]);
		}
	}
	public void display()
	{
		select();
		reprint();
		System.out.println();
		randomize(PIN);
		assign(answer_array, PIN_RAND, NEW_PIN);
		select_again();
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex14 a = new Ch6Ex14();
a.display();
		
	}

}
