package problems;

import java.util.*;

public class EnumValuesDemo {

	enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkDay[] day = WorkDay.values();
		
		Scanner keyboard = new Scanner(System.in);
		double hours = 0, sum =0;
		
		for(int i =0; i < day.length; i++)
		{
			System.out.println("Enter hours worked for "+ day[i]);
			hours = keyboard.nextDouble();
			sum = sum + hours;
		}
		System.out.println("Total hours work = "+ sum);
	}

}
