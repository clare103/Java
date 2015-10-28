package problems;

import java.util.Scanner;

public class Ch6Ex10 {

	public int[] positions = {1,2,3,4,5,6,7,8,9};
	public char[] letter = {'X','O'};
	public char[] empty_array = new char[9];
	enum cards {FACEUP_X,FACEUP_O};
	char FACEUP_X = letter[0];
	char FACEUP_O = letter[1];
	public char player;
	public int[][] board = new int[3][3];
	public int choice1, choice2, count1, count2,total1, total2;
	public boolean check = true;
	public boolean try_again = true;
	
	public Ch6Ex10()
	{
		while(try_again)
		{
		Scanner keyboard = new Scanner(System.in);
		display_board(positions);
		while(check_spaces_left(empty_array)== true && check_win(empty_array)!= true)
		{
		select();
		display_pick(empty_array);
		System.out.println();
		print_current();
		}
		if(check_win(empty_array)== true)
		{
			System.out.println("Congrats player "+get_player()+" has won!");
			System.out.println("Would you like to play again?(y/n)");
			String answer = keyboard.next();
			if(answer.equalsIgnoreCase("y"))
			{
				try_again = true;
			}
			else if(answer.equalsIgnoreCase("n"))
			{
				try_again = false;
				System.out.println("Thanks for playing. Good bye!");
				break;
			}
			else
			{
				System.out.println("Invalid input. Exiting program");
				System.exit(0);
			}
		}
		else if(check_spaces_left(empty_array) == false)
		{
			System.out.println("No winner. Would you like to play again?(y/n)");
			String answer = keyboard.next();
			if(answer.equalsIgnoreCase("y"))
			{
				try_again = true;
			}
			else if(answer.equalsIgnoreCase("n"))
			{
				try_again = false;
				System.out.println("Thanks for playing. Good bye!");
				break;
			}
			else
			{
				System.out.println("Invalid input. Exiting program");
				System.exit(0);
			}
		}
	}
}
	public void set_player(boolean check)
	{
		if(get_check() == true)
		{
			player = FACEUP_X;
			set_check(false);
		}
		else if(get_check() == false)
		{
			player = FACEUP_O;
			set_check(true);
		}
		else
		{
			System.exit(0);
		}
			
	}
	public void set_check(boolean check)
	{
		this.check= check;
	}
	public boolean get_check()
	{
		return check;
	}
	public char get_player()
	{
		return player;
	}
	public void set_choice1(int choice1)
	{
		this.choice1 = choice1;
	}
	public void set_choice2(int choice2)
	{
		this.choice2 = choice2;
	}
	public int get_choice1()
	{
		return choice1;
	}
	public int get_choice2()
	{
		return choice2;
	}
	
	public void reset1()
	{
		count1 =0;
	}
	public void reset2()
	{
		count2 = 0;
	}
	public void add_count1()
	{
		count1++;
	}
	public void add_count2()
	{
		count2++;
	}
	public int get_count1()
	{
		return count1;
	}
	public int get_count2()
	{
		return count2;
	}
	
	public void set_count1(int count1)
	{
		this.count1 = count1;
	}
	public void set_count2(int count2)
	{
		this.count2 = count2;
	}

	public boolean check_win(char[] a)
	{
		if(a[0] == FACEUP_X && a[1] == FACEUP_X && a[2] == FACEUP_X)
			return true;
		else if(a[3] == FACEUP_X && a[4] == FACEUP_X && a[5] == FACEUP_X)
			return true;
		else if(a[6] == FACEUP_X && a[7] == FACEUP_X && a[8] == FACEUP_X)
			return true;
		else if(a[0] == FACEUP_X && a[3] == FACEUP_X && a[6] == FACEUP_X)
			return true;
		else if(a[1] == FACEUP_X && a[4] == FACEUP_X && a[7] == FACEUP_X)
			return true;
		else if(a[2] == FACEUP_X && a[5] == FACEUP_X && a[8] == FACEUP_X)
			return true;
		else if(a[0] == FACEUP_X && a[4] == FACEUP_X && a[8] == FACEUP_X)
			return true;
		else if(a[2] == FACEUP_X && a[4] == FACEUP_X && a[6] == FACEUP_X)
			return true;
		else if(a[0] == FACEUP_O && a[1] == FACEUP_O && a[2] == FACEUP_O)
			return true;
		else if(a[3] == FACEUP_O && a[4] == FACEUP_O && a[5] == FACEUP_O)
			return true;
		else if(a[6] == FACEUP_O && a[7] == FACEUP_O && a[8] == FACEUP_O)
			return true;
		else if(a[0] == FACEUP_O && a[3] == FACEUP_O && a[6] == FACEUP_O)
			return true;
		else if(a[1] == FACEUP_O && a[4] == FACEUP_O && a[7] == FACEUP_O)
			return true;
		else if(a[2] == FACEUP_O && a[5] == FACEUP_O && a[8] == FACEUP_O)
			return true;
		else if(a[0] == FACEUP_O && a[4] == FACEUP_O && a[8] == FACEUP_O)
			return true;
		else if(a[2] == FACEUP_O && a[4] == FACEUP_O && a[6] == FACEUP_O)
			return true;
		else
			return false;
	}
	
	public boolean check_spaces_left(char[] a)
	{
		for(int i=0; i < a.length-1; i++)
		{
			if(a[i] == '\u0000')
				return true;
		}
		return false;
	}
	
	public void display_board(int[] a)
	{
		reset1();
		for(int i =0; i <3; i++)
		{
			for(int g=0; g<3; g++)
			{
				System.out.print(a[count1]);
				add_count1();
			}
			System.out.println();
		}
	}
	public void display_pick(char[] a)
	{
		calculate_choices();
		reset1();
		
		for(int i =0; i<3; i++)
		{
			for(int g =0; g<3; g++)
			{
				if(count1 == total1)
				{
					empty_array[count1] = get_player();
					add_count1();
				}
				else
				{
					add_count1();
				}
			}
			System.out.println();
		}
	}
	public void print_current()
	{
		reset1();
		for(int i =0; i < 3; i++)
		{
			for(int g = 0; g < 3; g++)
			{
				if(empty_array[count1] == '\u0000')
				{
					System.out.print(positions[count1]);
					add_count1();
				}
				else if(empty_array[count1] != '\u0000')
				{
					System.out.print(empty_array[count1]);
					add_count1();
				}
				else
				{
					System.out.println("Error.");
					System.exit(0);
				}
			}
			System.out.println();
		}
		
	}

	public void select()
	{
		set_player(get_check());
		System.out.println("Player 1 = X, Player 2 = O");
		System.out.println("The current player's turn is: Player "+get_player());
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter first coordinate of current player:(1-3)");
		int choice1 = keyboard.nextInt();
		set_choice1(choice1);
		System.out.println("Please enter second coordinate of current player:(1-3)");
		int choice2 = keyboard.nextInt();
		set_choice2(choice2);
	}
	public void calculate_choices()
	{
		if(get_choice1() == 1 && get_choice2() != 1)
		{
			set_total1(get_choice2()-1);
		}
		else if(get_choice1() == 1 && get_choice2() == 1)
		{
			set_total1(0);
		}
		else if(get_choice1() ==2)
		{
			set_total1(2 +get_choice2());
		}
		else
		{
			set_total1( 5 + get_choice2());
		}

	}
	public void set_total1(int total1)
	{
		this.total1= total1;
	}
	public void set_total2(int total2)
	{
		this.total2= total2;
	}
	public void total1_reset()
	{
		total1 = 0;
	}
	public void total2_reset()
	{
		total2 =0;
	}
	public int get_total1()
	{
		return total1;
	}
	public int get_total2()
	{
		return total2;
	}
	public void display()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex10 a = new Ch6Ex10();
a.display();
	}

}
