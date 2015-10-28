package problems;

import java.util.Random;
import java.util.Scanner;

public class UsingEnum {
	enum Cards {FACEUP_1,FACEUP_2, FACEDOWN};
	private int count1=0;
	private int count2=0;
	private char FACEDOWN = '*';
	private int[] set1 = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
	private int[] empty_array = new int[16];
	private int[][] facedown_board = new int[4][4];
	//private int[][] faceup_board = new int[4][4];
	private int choice1, choice2,choice3,choice4;
	private int total1, total2,array_value1,array_value2;
	
	public UsingEnum(int[][] a)
	{
		if(a.length == 0 || a[0].length ==0)
		{
			System.out.println("Empty grade records.Aborting");
			System.exit(0);
		}
	}
	
	public UsingEnum(UsingEnum copy)
	{
		//set3 = copy.set3;
	}
	
	public UsingEnum()
	{
	//fillBoard(facedown_board);
	//fillBoard(faceup_board, set1);	
	randomize(set1);
	while(equals(set1, empty_array)!= true)
	{
		empty_array_check();
		print_current();
		select();
		display_picks(set1);			
	}
	print_current();
	System.out.println("Congrats you won!");
	System.exit(0);
		
	
}
	public boolean equals(int[]a, int[] b)
	{
		if(a.length == b.length)
			for(int i =0; i < a.length; i++)
				if(a[i] != b[i])
					return false;
		return true;
	}
	public boolean continues()
	{
		return(empty_array[get_total1()] == 0 && empty_array[get_total2()]== 0);
			
	}
	public void empty_array_check()
	{
		for(int i =0; i < 16; i++)
		{
			if(empty_array_check(i))
			{
				System.out.println("There are still cards left to be chosen. The game goes on!");
				System.out.println("Please choose two different coordinates that have not already been selected.");
				total1_reset();
				total2_reset();
				break;
			}
		}
	}
	public boolean empty_array_check(int i)
	{
		return(empty_array[i] == 0);
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
	public void set_choice1(int choice1)
	{
		this.choice1 = choice1;
	}
	public void set_choice2(int choice2)
	{
		this.choice2 = choice2;
	}
	public void set_choice3(int choice3)
	{
		this.choice3 = choice3;
	}
	public void set_choice4(int choice4)
	{
		this.choice4 = choice4;
	}
	public int get_choice1()
	{
		return choice1;
	}
	public int get_choice2()
	{
		return choice2;
	}
	public int get_choice3()
	{
		return choice3;
	}
	public int get_choice4()
	{
		return choice4;
	}
	public void reset1()
	{
		count1 =0;
	}
	public void reset2()
	{
		count2 = 0;
	}
	public void set_count1(int count1)
	{
		this.count1 = count1;
	}
	public void set_count2(int count2)
	{
		this.count2 = count2;
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
	public void set_array1(int array_value1)
	{
		this.array_value1 = array_value1;
	}
	public void set_array2(int array_value2)
	{
		this.array_value2 = array_value2;
	}
	public int get_array1()
	{
		return array_value1;
	}
	public int get_array2()
	{
		return array_value2;
	}
	public void getIndexOf(int toSearch, int[] a)
	{
		reset1();
		reset2();
		int i,g;
		for(i=0; i< a.length; i++)
			if(a[i]== toSearch)
			{
				set_count1(i);
				break;
			}
		for(g= get_count1()+1; g <a.length; g++)
			if(a[g] == toSearch)
				set_count2(g);
		
	}
//	public void fillBoard(int[][] a, int[] b)
//	{
//		randomize(b);
//		reset1();
//		for(int i=0;i <4; i++)
//		{	
//		
//		for(int g=0;g < 4; g++)
//		{
//			System.out.print(b[count1]);
//			add_count1();			
//		}
//		System.out.println();
//		}
//		System.out.println();
//		for(int d =0; d< count1; d++)
//			System.out.print(b[d]+" ");
//		System.out.println();
//	}
	public void fillBoard(int[][] a)
	{
		reset2();
		for(int i=0;i <4; i++)
		{
		for(int g=0;g < 4; g++)
		{
			System.out.print(FACEDOWN);

		}
		System.out.println();
		}
		System.out.println();
		
	}
	public void set_swap(int j,int g, int[]a)
	{
		int temp;
		temp = a[j];
		a[j] = a[g];
		a[g] = temp;	
	}
	
	public void randomize(int[] a)
	{
		Random rand = new Random();
		for(int i=0; i< a.length;i++)
		{
			int randomPosition= rand.nextInt(a.length);
			int temp = a[i];
			a[i] = a[randomPosition];
			a[randomPosition] = temp;
		}				
	}
	public void select()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter first coordinate of first pick:(1-4)");
		int choice1 = keyboard.nextInt();
		set_choice1(choice1);
		System.out.println("Please enter second coordinate of second pick:(1-4)");
		int choice2 = keyboard.nextInt();
		set_choice2(choice2);
		System.out.println("Please enter first coordinate of second pick:(1-4)");
		int choice3 = keyboard.nextInt();
		set_choice3(choice3);
		System.out.println("Please enter second coordinate of second pick:(1-4)");
		int choice4 = keyboard.nextInt();
		set_choice4(choice4);
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
			set_total1(3 +get_choice2());
		}
		else if(get_choice1() == 3)
		{
			set_total1( 7 + get_choice2());
		}
		else
		{
			set_total1(11 + get_choice2());				
		}
		
		if(get_choice3() == 1 && get_choice4() != 1)
		{
			set_total2( get_choice4()-1);
		}
		else if(get_choice3() == 1 && get_choice4() == 1)
		{
			set_total2(0);
		}
		else if(get_choice3() ==2)
		{
			set_total2(3 +get_choice4());
		}
		else if(get_choice3() == 3)
		{
			set_total2(7 + get_choice4());
		}
		else
		{
			set_total2(11 + get_choice4());				
		}
	}
	public boolean check_matches(int array_value1, int array_value2)
	{
		return(get_array1() == get_array2());
	}
	
	public void print_current()
	{
		reset1();
		reset2();
		for(int i =0; i<4; i++)
		{
			for(int g=0; g<4; g++)
			{
				
				if(empty_array[count1] != 0)
				{
					System.out.print(empty_array[count1]);
					add_count1();
					add_count2();
				}
				else if(empty_array[count2] != 0)
				{
					System.out.print(empty_array[count2]);
					add_count1();
					add_count2();
				}
				else
				{
					System.out.print("*");
					add_count1();
					add_count2();
				}
				
			}
			System.out.println();
		}
	}
	
	public void display_picks(int[] a)
	{		
		calculate_choices();
		reset1();
		reset2();
		for(int i = 0; i<4; i++)
		{
			for(int g=0; g<4;g++)
			{
				if(count1 == total1)
				{
					set_swap(count1, count2, set1);
					System.out.print(set1[count1]);
					set_array1(set1[count1]);
					add_count1();
					add_count2();
				}
				else if(count2 == total2)
				{	
					set_swap(count1, count2, set1);
					System.out.print(set1[count2]);
					set_array2(set1[count2]);
					add_count1();
					add_count2();
				}
				
				else
				{
					System.out.print("*");
					add_count1();
					add_count2();
				}
				
			}
			System.out.println();
		}
		//System.out.println("Is it a match?");
		//System.out.println(check_matches(array_value1, array_value2));
		if(check_matches(array_value1, array_value2))
		{
			System.out.println("Congrats its a match!");
			getIndexOf(array_value1,set1);
			//System.out.println("Index of first number is: "+get_count1());
			//System.out.println("Index of second number is: "+ get_count2());
			empty_array[get_count1()] = array_value1;
			empty_array[get_count2()] = array_value2;
		}
		else
		{
			System.out.println("Not a match!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i =0; i < 20; i++)
				System.out.println();
		}
			
	}
	public void display()
	{
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
