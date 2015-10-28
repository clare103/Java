package problem1;

import java.util.*;
public class Ch4Ex4 {

	private String username;
	private String text_e;
	private String entrydate;
	
	public Ch4Ex4()
	{
		
	}
	public Ch4Ex4(String username, String text_e,String entrydate)
	{
		set_username(username);
		set_text(text_e);
		set_date(entrydate);
	}
	public void set_username(String username)
	{
		this.username = username;
	}
	public void set_text(String text_e)
	{
		this.text_e = text_e;
	}
	public void set_date(String entrydate)
	{
		this.entrydate= entrydate;
	}
	public String get_username()
	{
		return username;
	}
	public String get_text()
	{
		return text_e;
	}
	public String get_date()
	{
		return entrydate;
	}
	public String toString()
	{
		return "Username: "+username+", text entry:"+ text_e+" entry date:"+ entrydate;
	}
	public void displayEntry()
	{
		System.out.println("The username is: "+get_username()+".");
		System.out.println("The text entry is: "+get_text());
		System.out.println("The date of the entry is:"+get_date());
		System.out.println("The summary of the text is:"+getSummary());
	}
	public String getSummary()
	{
		String[] words = text_e.split(" ");
		String str = "";
		for(int i =0; i<words.length && i<= 10;i++)
		{
			str += words[i]+" ";
		}
		return str;
		
	}
	public String monthString(int monthNumber)
	{
		switch(monthNumber)
		{
		case 1:
			return "January";
		case 2:
			return "Febrary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			System.out.println("Fatal Error");
			System.exit(0);
			return "error";
		}
	}
	public void readInput_text()
	{		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the username of the blog entry: ");
		username = keyboard.nextLine();
		System.out.println("Please enter the text of the blog entry:");
		text_e = keyboard.nextLine();
	}
	public void readInput_date()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the month of the blog enter as a numerical value:");
		int month = keyboard.nextInt();
		System.out.println("Please enter the day of the text entry as a numerical value:");
		int day = keyboard.nextInt();
		System.out.println("Please enter the year of the text entry: ");
		int year = keyboard.nextInt();
		entrydate = monthString(month)+", "+ day+ ", "+ year;
	}
	public void final_print()
	{
		readInput_text();
		readInput_date();
		displayEntry();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex4 c = new Ch4Ex4();
c.final_print();
		
		
	}

}
