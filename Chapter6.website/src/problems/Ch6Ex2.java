package problems;

import java.util.*;

public class Ch6Ex2 {


	private static int count1=0;
	private static int count2=0;
	private int[] set1 = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
	private int[] set3 = new int[16];
	private char[] set2 ={'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
	private int[][] facedown_board = new int[4][4];
	private int[][] faceup_board = new int[4][4];
	private int choice1, choice2,choice3,choice4;
	private int total1, total2;
	
	public Ch6Ex2(int[][] a)
	{
		if(a.length == 0 || a[0].length ==0)
		{
			System.out.println("Empty grade records.Aborting");
			System.exit(0);
		}
	}
	
	public Ch6Ex2(Ch6Ex2 copy)
	{
		//set3 = copy.set3;
	}
	
	public Ch6Ex2()
	{
	fillBoard(facedown_board);
	fillBoard(faceup_board, set1,set3);	
	select();	
	display_picks(set1, set3);
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
	public void set_count1()
	{
		count1=1;
	}
	public void set_count2()
	{
		count2=1;
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
	public void fillBoard(int[][] a, int[] b, int[] c)
	{
		System.out.println("   | 1 2 3 4 ");
		System.out.println("---+---------");
		randomize(b);
		reset1();
		for(int i=0;i <4; i++)
		{	
		System.out.print(" "+(i + 1)+ " | ");
		
		for(int g=0;g < 4; g++)
		{
			System.out.print(b[count1]+" ");
			c[count1] = b[count1];
			add_count1();
			
		}
		System.out.println();
		}
		System.out.println();
		for(int d =0; d< count1; d++)
			System.out.print(c[d]+" ");
	}
	public void fillBoard(int[][] a)
	{
		System.out.println("   | 1 2 3 4 ");
		System.out.println("---+---------");
		reset2();
		for(int i=0;i <4; i++)
		{	
		System.out.print(" "+(i + 1)+ " | ");
		for(int g=0;g < 4; g++)
		{
			System.out.print(set2[count2]+" ");
			add_count2();
			
		}
		System.out.println();
		}
		System.out.println();
		
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
		if(get_choice1() == 1)
		{
			total1 = get_choice2();
		}
		else if(get_choice1() ==2)
		{
			total1 = 4 +get_choice2();
		}
		else if(get_choice1() == 3)
		{
			total1 = 8 + get_choice2();
		}
		else if(get_choice1() == 4)
		{
			total1 = 12 + get_choice2();				
		}
		
		if(get_choice3() == 1)
		{
			total2 = get_choice4();
		}
		else if(get_choice3() ==2)
		{
			total2 = 4 +get_choice4();
		}
		else if(get_choice3() == 3)
		{
			total2 = 8 + get_choice4();
		}
		else if(get_choice3() == 4)
		{
			total2 = 12 + get_choice4();				
		}
	}
	
	public void display_picks(int[] a, int[] b)
	{
		System.out.println("   | 1 2 3 4 ");
		System.out.println("---+---------");
		
		calculate_choices();
		set_count1();
		set_count2();
		for(int i = 0; i<4; i++)
		{
			System.out.print(" "+(i + 1)+ " | ");
			for(int g=0; g<4;g++)
			{
				if(count1 == total1)
				{
					System.out.print(set3[count1-1]+" ");
					add_count1();
					if(count2 == total2)
					{	
						System.out.print(set3[count2]+" ");
						add_count2();
					}
				}
				
				else//(count1 != total1 || count2 != total2)
				{
					System.out.print("* ");
					add_count1();
					add_count2();
				}
			}
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

	Ch6Ex2 d = new Ch6Ex2();
	d.display();
	}

}
