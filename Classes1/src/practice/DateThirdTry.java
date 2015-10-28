package practice;
import java.util.*;

public class DateThirdTry {

	private String month;
	private int day;
	private int year;
	
	public void setDate(int newMonth, int newDay, int newYear)
	{
		month = monthString(newMonth);
		day = newDay;
		year = newYear;
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
		//The rest of the method definitions are imported from DateSecondTry
	
	}
	public void writeOutput()
	{
		System.out.println(month+" "+day+", "+ year);
	}
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter month, day, and year.");
		System.out.println("Do not use a comma.");
		month = keyboard.next();
		day = keyboard.nextInt();
		year = keyboard.nextInt();
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	public String getMonth()
	{
		return month;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateThirdTry date = new DateThirdTry();
date.readInput();
date.setDate(6, date.getDay(), date.getYear());
date.writeOutput();
	}

}
