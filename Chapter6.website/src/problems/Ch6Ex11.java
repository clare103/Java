package problems;
import java.util.*;
public class Ch6Ex11 {
	
	public int[] columns = {1,2,3,4,5,6,7};
	public char[] rows = {'A','B','C','D'};
	public char[] empty_rows = new char[28];
	public char seat_taken = 'X';
	public Object first_digit_obj;
	public Object second_digit_obj;
	public int first_digit_int;
	public char second_digit_char;
	public boolean check = true;
	public int count1, count2,count3,total1,total2,total3;

	public Ch6Ex11()
	{
		display_seats(rows);
		while(seats_left(empty_rows) == true && check == true)
		{
			select();
			if(all_checks()== true)
			{
				calculate_choices();
				display_pick(empty_rows);
				System.out.println();
				print_current(empty_rows);
			}
			else
				continue;
		}

	}
	public boolean all_checks()
	{	if(
		check_integer(get_first_digit_obj())== true &&
		check_char(get_second_digit_obj())== true &&
		check_valid_char(rows, get_second_digit_char()) == true &&
		check_valid_int(columns, get_first_digit_int()) == true)
		return true;
	else
		return false;
	}
	public void set_total1(int total1)
	{
		this.total1 = total1;
	}
	public int get_total1()
	{
		return total1;
	}
	public void set_total2(int total2)
	{
		this.total2 = total2;
	}
	public int get_total2()
	{
		return total2;
	}
	public void set_total3(int total3)
	{
		this.total3 = total3;
	}
	public int get_total3()
	{
		return total3;
	}
	public void reset1()
	{
		count1 =0;
	}
	public void add_count1()
	{
		count1++;
	}
	public void reset2()
	{
		count2 = 0;
	}
	public void add_count2()
	{
		count2++;
	}
	public void reset3()
	{
		count3 =0;
	}
	public void add_count3()
	{
		count3++;
	}
	public void set_first_digit_obj(Object first_digit_obj)
	{
		this.first_digit_obj = first_digit_obj;
	}
	public Object get_first_digit_obj()
	{
		return first_digit_obj;
	}
	public void set_first_digit(int first_digit_int)
	{
		this.first_digit_int = first_digit_int;
	}
	public int get_first_digit_int()
	{
		return first_digit_int;
	}
	public void set_second_digit_char(char second_digit_char)
	{
		this.second_digit_char = second_digit_char;
	}
	public char get_second_digit_char()
	{
		return second_digit_char;
	}
	public void set_second_digit_obj(Object second_digit_obj)
	{
		this.second_digit_obj = second_digit_obj;
	}
	public Object get_second_digit_obj()
	{
		return second_digit_obj;
	}
	public void set_seat_taken(char seat_taken)
	{
		this.seat_taken = seat_taken;
	}
	public char get_seat_taken()
	{
		return seat_taken;
	}
	
	public boolean check_integer(Object first_digit)
	{		
		try
		{
			Integer.parseInt((String)first_digit);
			set_first_digit(Integer.parseInt((String)first_digit));
			return true;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please input an integer.");
			return false;
		}
		catch(Exception g)
		{
			System.out.println("Invalid character");
			return false;
		}
	}
	
	public boolean check_char(Object second_digit)
	{
		if(second_digit instanceof Character)
		{
		set_second_digit_char(second_digit.toString().toCharArray()[0]);
		return true;
		}
		System.out.println("Please pick a valid letter!");
		return false;
	}
	
	public void display_seats(char[] a)
	{
		for(int i=0; i < 7; i++)
		{		
			System.out.print((i+1)+" ");
			for(int g = 0; g< rows.length; g++)
			{				
				System.out.print(rows[g]+" ");
			}
			System.out.println();
		}
	}
	public void select()
	{
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please select which seat you would like:(1A)");
		Object answer = keyboard.next();
		String answer1 = answer.toString(); 
		String answer_first = Character.toString(answer1.toCharArray()[0]);
		char answer_second =answer1.toCharArray()[1];
		set_first_digit_obj(answer_first);
		set_second_digit_obj(answer_second);
				
	}
	public void calculate_choices()
	{
		if(get_first_digit_int() == 1)
		{
			set_total1(1);
		}
		else if(get_first_digit_int() == 2)
		{
			set_total1(2);
		}
		else if(get_first_digit_int() == 3)
		{
			set_total1(3);
		}
		else if(get_first_digit_int() == 4)
		{
			set_total1(4);
		}
		else if(get_first_digit_int() == 5)
		{
			set_total1(5);
		}
		else if(get_first_digit_int() == 6)
		{
			set_total1(6);
		}
		else if(get_first_digit_int() == 7)
				set_total1(7);
		else
			System.out.println();
		
		if(get_second_digit_char() == rows[0])
		{
			set_total2(1);
		}
		else if(get_second_digit_char() == rows[1])
		{
			set_total2(2);
		}
		else if(get_second_digit_char() == rows[2])
		{
			set_total2(3);
		}
		else if(get_second_digit_char() == rows[3])
				set_total2(4);
		else
			System.out.println();
		
		if(get_total1() == 1 && get_total2() == 1)
		{
			set_total3(0);
		}
		else if(get_total1() == 1 &&get_total2() != 1)
		{
			set_total3(get_total2()-1);
		}
		else if(get_total1() == 2)
		{
			set_total3(3 + get_total2());
		}
		else if(get_total1() == 3)
		{
			set_total3(7+get_total2());
		}
		else if(get_total1() == 4)
		{
			set_total3(11+get_total2());			
		}
		else if(get_total1() == 5)
		{
			set_total3(15+get_total2());		
		}
		else if(get_total1() == 6)
		{
			set_total3(19+get_total2());	
		}
		else if(get_total1() == 7)
			set_total3(23+get_total2());
		else
			System.out.println();
		
	}
	public void display_pick(char[] a)
	{
		reset1();
		for(int i=1; i<= 7;i++)
		{
			
			for(int g =0; g<rows.length;g++)
			{
				if(total3 == count1) 
				{
					empty_rows[count1] = get_seat_taken();
					break;
				}

				else
				{
					add_count1();				
				}
			}
			
		}
	}
	public void print_current(char[] a)
	{
	
		reset3();
		for(int i =1; i<= 7;i++)
		{
			System.out.print(i+" ");
			for(int g =0; g< rows.length;g++)
			{				
				if(empty_rows[count3] == '\u0000')
 				{
					System.out.print(rows[g]+" ");			
					add_count3();
				}
				else if(empty_rows[count3] != '\u0000')
				{
					
					System.out.print(empty_rows[count3]+" ");
					
					add_count3();
				}
			}
			
			System.out.println();
		}
		System.out.println("Would you like to continue seat selection?(yes/no)");
		continue_picking();
		
	}
	public void continue_picking()
	{
		boolean try_again = true;
		while(try_again)
		{
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			try_again = false;
			break;
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			System.out.println("Have a great flight!");
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid answer, please select yes or no");
			continue;
		}
		}
	}
	public boolean check_valid_char(char[] a, char o)
	{
		
		for(int i=0; i< a.length;i++)
		{
			if(a[i] == o)
				return true;
		}
		System.out.println("Not a valid seat. Please re-pick!");
		return false;
	}
	public boolean check_valid_int(int[] a, int o)
	{
		if(o > 0 && o < 8 )
		{
			for(int i=0; i < a.length; i++)
			{
				if(a[i] == o)
					return true;
			}
		}
			System.out.println("Not a valid seat row. Please re-pick!");
			return false;
	}
	public boolean seats_left(char[] o)
	{
		for(int i=0; i < empty_rows.length ;i++)
		{
			if(empty_rows[i] != seat_taken)
				return true;
		}
		System.out.println("No seats are left!");
		System.out.println("Exiting program");
		System.exit(0);
		return false;
	}
	public boolean seat_not_avail(char[] o)
	{
		if(o[get_total3()] == seat_taken)
		{
			System.out.println("Seat not available. Please re-pick a seat.");
		}
		return(o[get_total3()] == seat_taken);
	}
	public void display()
	{
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex11 a = new Ch6Ex11();
a.display();
		
		
	}

}
