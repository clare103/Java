package problem1;

import java.util.*;
import java.lang.*;


public class RandomBox<T> {

	Scanner keyboard = new Scanner(System.in);
	public int choice;
	public String type, input;
	public ArrayList strings = new ArrayList();
	public ArrayList integers = new ArrayList();
	public boolean check = true;
	//boolean try_again = true;
	
	public RandomBox()
	{
		
		while(check)
		{
		menu();
		activate_choice();		
		keep_going();
		}
	}
	public void menu()
	{
		System.out.println("This is a menu of choices that you have for the Lottery box.");
		System.out.println("Please select an item from the list:(1-4)");
		System.out.println("1.Add an item to the box.");
		System.out.println("2.Randomly draw an item from the box.");
		System.out.println("3.Check if the box is empty.");
		System.out.println("4.Print the contents of the box.");
		choice = keyboard.nextInt();
		if(choice >4 || choice <= 0)
		{
			System.out.println("Invalid choice.");
			System.out.println("Exiting program.");
			System.exit(0);
		}
		set_choice(choice);		
	}
	
	public void keep_going()
	{
		String answer="";
		boolean try_again = true;
		while(try_again)
		{
		System.out.println("Would you like to view the menu again?");
		answer = keyboard.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			check = true;
			try_again = false;
			break;
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			check = false;
			try_again = false;
			break;
		}
		else
		{
			System.out.println("Invalid answer. Please answer 'yes' or 'no'");			
		}
		}
	
	}
	
	public void activate_choice()
	{
		if(get_choice() ==1)
		{
			determine_type();
			add();
		}
		else if(get_choice() == 2)
		{
			drawItem();
		}
		else if(get_choice() == 3)
		{
			isEmpty();
		}
		else if(get_choice() == 4)
		{
			print_contents();
		}
		else
		{
			System.out.println("Error. Exiting program");
			System.exit(0);
		}
			
	}
	
	public void print_contents()
	{
		if(type.equalsIgnoreCase("name"))
		{
			for(Object a : strings)
			{
				System.out.println(a);
			}
		}
		else
		{
			for(Object b : integers)
			{
				System.out.println(b);
			}
		}
	}
	
	public void determine_type()
	{
		System.out.println("Would you like a lottery by name or by number?");
		type = keyboard.next();
		if(type.equalsIgnoreCase("name"))
		{
			set_type(type);
		}
		else if(type.equalsIgnoreCase("number"))
		{
			set_type(type);
		}
		else
		{
			System.out.println("Invalid answer. Exiting program.");
			System.exit(0);
		}
		
	}
	
	public void drawItem()
	{
		Random generator = new Random();
		
		if(isEmpty1())
			System.out.println("null");
		else if(type.equalsIgnoreCase("numbers"))
		{		
		int n = generator.nextInt(integers.size());
		System.out.println(integers.get(n));
		}
		else
		{
		int r = generator.nextInt(strings.size());
		System.out.println(strings.get(r));
		}	
			
	}
	
	public boolean isEmpty1()
	{
		if((type.equalsIgnoreCase("name")&&strings.isEmpty())
				||(type.equalsIgnoreCase("number")&&integers.isEmpty()))
		{
			//System.out.println("The box is empty.");
			return true;
		}
		else
		{
			//System.out.println("The box is not empty.");
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if((type.equalsIgnoreCase("name")&&strings.isEmpty())
				||(type.equalsIgnoreCase("number")&&integers.isEmpty()))
		{
			System.out.println("The box is empty.");
			return true;
		}
		else
		{
			System.out.println("The box is not empty.");
			return false;
		}
	}
	public boolean check_input()
	{
		return true;
	}
	public void add()
	{
		System.out.println("Please enter what you would like to add to the box");	
		if(get_type().equalsIgnoreCase("name"))
		{
			String input = keyboard.next();
			if(input.getClass().equals(String.class))
			{
			strings.add(input);			
			}
			else
			{
				System.out.println("Invalid input.Exiting program.");
				System.exit(0);
			}						
		}
		else if(get_type().equalsIgnoreCase("number"))
		{
			try
			{
				int input = keyboard.nextInt();
				integers.add(input);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Caught exception. Invalid input.Exiting program");
				e.printStackTrace();
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Error.Exiting program");
			System.exit(0);
		}
		
	}
	
	public void set_type(String type)
	{
		this.type = type;
	}
	public String get_type()
	{
		return type;
	} 
	public void set_choice(int choice)
	{
		this.choice = choice;
	}
	public int get_choice()
	{
		return choice;
	}
	public void display()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomBox d = new RandomBox();
		d.display();
	}

}
