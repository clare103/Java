package practice;

public class DateFourthTry {

	private String month;
	private int day,year;
	
	public String toString()
	{
		return(month + " "+ day + ", "+ year);
	}
	
	public void writeOutput()
	{
		System.out.println(month + " "+ day + ", "+ year);
	}
	public boolean equals(DateFourthTry otherDate)
	{
		return((month.equals(otherDate.month)) && (day == otherDate.day)&&(year == otherDate.year));
	}
	public boolean precedes(DateFourthTry otherDate)
	{
		return((year < otherDate.year) || (year == otherDate.year && getMonth()< otherDate.getMonth())|| (year == otherDate.year && month.equals(otherDate.month)&& day < otherDate.day));
	}
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
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateFourthTry date1 = new DateFourthTry();
DateFourthTry date2 = new DateFourthTry();
date1.setDate(6, 17, 1882);
date2.setDate(6,17,1882);
if(date1.equals(date2))
	System.out.println(date1 + " equals "+date2);
else
	System.out.println(date1 + " does not equal "+ date2);

date1.setDate(7, 28, 1750);

if(date1.precedes(date2))
System.out.println(date1 + " comes before "+ date2);
else
	System.out.println(date2 + " comes before or is equal to "+ date1);

		
		
	}

}
