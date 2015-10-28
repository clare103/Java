package practice;

import java.util.Scanner;

public class Date {

	private String month;
	private int day;
	private int year;
	
	public Date()
	{
		month = "January";
		day = 1;
		year =1000;
				
	}
	
	public Date(int monthInt, int day, int year)
	{
		setDate(monthInt, day, year);
		
	}
	public Date(String monthString, int day, int year)
	{
		setDate(monthString, day, year);
	}
	public Date(int year)
	{
		setDate(1,1,year);
	}
	public Date(Date aDate)
	{
		if(aDate == null)//not a real date
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}
	public void setDate(int monthInt, int day, int year)
	{
		if(dateOK(monthInt, day, year))
		{
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		}
		else
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	public void setDate(String monthString, int day, int year)
	{
		if(dateOK(monthString, day, year))
		{
			this.month = monthString;
			this.day = day;
			this.year = year;
		}
		else
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	public void setDate(int year)
	{
		setDate(1,1,year);
	}
	public void setYear(int year)
	{
		if((year < 1000)|| (year > 9999))
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
		else
			this.year = year;
	}
	public void setMonth(int monthNumber)
	{
		if((monthNumber <= 0)|| (monthNumber > 12))
		{
			System.out.println("fatal error");
			System.exit(0);
			
		}
		else
			month = monthString(monthNumber);
	}
	public void setDay(int day)
	{
		if((day <= 0)|| (day > 31))
		{
			System.out.println("fatal error");
			System.exit(0);
		}
		else
			this.day = day;
	}
	public int getMonth()
	{
		if (month.equalsIgnoreCase("January"))
	        return 1;
	    else if (month.equalsIgnoreCase("February"))
	        return 2;
	    else if (month.equalsIgnoreCase("March"))
	        return 3;
	    else if (month.equalsIgnoreCase("April"))
	        return 4;
	    else if (month.equalsIgnoreCase("May"))
	        return 5;
	    else if (month.equals("June"))
	        return 6;
	    else if (month.equalsIgnoreCase("July"))
	        return 7;
	    else if (month.equalsIgnoreCase("August"))
	        return 8;
	    else if (month.equalsIgnoreCase("September"))
	        return 9;
	    else if (month.equalsIgnoreCase("October"))
	        return 10;
	    else if (month.equalsIgnoreCase("November"))
	        return 11;
	    else if (month.equalsIgnoreCase("December"))
	        return 12;
	else
	{
	System.out.println("Fatal Error"); System.exit(0);
	return 0; //Needed to keep the compiler happy
	}
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return(month + " "+ day+ ", "+ year);
	}
	public boolean equals(Date otherDate)
	{
		return((month.equalsIgnoreCase(otherDate.month))
			                   && (day == otherDate.day) && (year ==
                otherDate.year));
	}
	public boolean precedes(Date otherDate)
	{
		return((year < otherDate.year) ||
				   (year == otherDate.year && getMonth() <
				   otherDate.getMonth()) ||
				   (year == otherDate.year && month.equals(otherDate.month)&& day < otherDate.day));
	}
	public void readInput()
	{
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while(tryAgain)
		{
			System.out.println("Enter month, day, and year");
			System.out.println("do not use commas or other punctuations.");
			String monthInput = keyboard.next();
			int dayInput = keyboard.nextInt();
			int yearInput = keyboard.nextInt();
			if(dateOK(monthInput, dayInput, yearInput))
			{
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			}
			else
				System.out.println("Illegal date. Reenter input.");
		}
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
	private boolean dateOK(int monthInt, int dayInt, int yearInt)
	{
		return ( (monthInt >= 1) && (monthInt <= 12) &&
                (dayInt >= 1) && (dayInt <= 31) &&
               (yearInt >= 1000) && (yearInt <= 9999) );
	}
	private boolean dateOK(String monthString, int dayInt, int yearInt)
	{
		return (monthOK(monthString)&&(dayInt >= 1) && (dayInt <= 31) &&
				                   (yearInt >= 1000) && (yearInt <= 9999) );
	}
	private boolean monthOK(String month)
	{
		return (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") ||
				               month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||
				                 month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") ||
				                 month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") ||
				                 month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||
				                 month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December") );
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date("december",16,1770),
				date2 = new Date(1,27,1756),
				date3 = new Date(1882),
				date4 = new Date();
		System.out.println("Whose birthday is "+date1+ "?");
		System.out.println("Whose birthday is "+date2 + "?");
		System.out.println("Whose birthday is "+date3+ "?");
		System.out.println("The default date is: "+ date4+".");
		
	}

}
