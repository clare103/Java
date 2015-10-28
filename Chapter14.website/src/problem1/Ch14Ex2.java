package problem1;

import java.util.*;

public class Ch14Ex2 {

	public String search_target;
	int choice;
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
	Scanner keyboard = new Scanner(System.in);
	
	public Ch14Ex2()
	{
		menu();
		if(get_choice() == 1)
		{
			add();
		}
		else if(get_choice() == 2)
		{
			display_contacts();
		}
		else if(get_choice() == 3)
		{
			determine_search();
			display_search();
		}
		else if(get_choice() == 4)
		{
			determine_search();
			delete_search();
		}
		else
		{
			System.out.println("Error: System exiting");
			System.exit(0);
		}
		contacts.add(new Contact("Ross","Clare","blah.com","8832941"));
		contacts.add(new Contact("David", "hassellhoff", "blah.com", "8832941"));
		set_search_target("David");
		System.out.println(display_search());		
	}
	public void determine_search()
	{
		System.out.println("What contact would you like to search for?");
		System.out.println("Please enter a search target?");
		search_target = keyboard.nextLine();
	}
	public void set_search_target(String search_target)
	{
		this.search_target = search_target;
	}
	public String get_search_target()
	{
		return search_target;
	}	
	public void add()
	{
		Scanner keyboard = new Scanner(System.in);
		String first_name, last_name, email_address, phone_number;
		System.out.println("Please enter the first name of the person you would like to add.");
		first_name = keyboard.next();
		System.out.println("Please enter the last name of the person you would like to add.");
		last_name = keyboard.nextLine();
		System.out.println("Please enter the email address of the person you would like to add.");
		email_address = keyboard.nextLine();
		System.out.println("Please enter the phone number of the person you would like to add.");
		phone_number = keyboard.nextLine();
		contacts.add(new Contact(first_name, last_name, email_address, phone_number));	
	}
	public void display_contacts()
	{
		for(Contact contactss : contacts)
		{
			System.out.println(contactss);
			System.out.println();
		}
	}
	
	public int display_search_index()
	{
		for(Contact c : contacts)
		{
			if(c.get_first_name().contains(search_target)|| c.get_last_name().contains(search_target)||
					c.get_email_address().contains(search_target)|| c.get_phone_number().contains(search_target))
				return contacts.indexOf(c);
		}
		return -1;
	}
	
	
	public Contact display_search()
	{
		return contacts.get(display_search_index());
	}
	public void delete_search()
	{
		System.out.println("Contact: "+contacts.get(display_search_index())+"\nhas been deleted");		
		contacts.remove(display_search_index());		
	}
	
	public void menu()
	{
		System.out.println("Here is the display menu.");
		System.out.println("Would you like to:");
		System.out.println("1: Add a contact.");
		System.out.println("2: Display all contacts.");
		System.out.println("3: Search for a specific contact and display it.");
		System.out.println("4: Search for a specific contact and delete it.");
		System.out.println("Please enter 1-4");
		choice = keyboard.nextInt();	
		set_choice(choice);
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
	Ch14Ex2 a = new Ch14Ex2();
	//a.add();
	a.display();
		
		
	}

}
