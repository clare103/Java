package problems;
import java.util.*;
public class Ch6Ex3 {

	private String[] months_String = {"January","February","March","April","May","June","July",
			"August", "September", "October","Novemeber","December"};
	private String city;
	private int[] months_Int ={1,2,3,4,5,6,7,8,9,10,11,12};
	private int[] actual_rainfall = new int[12];
	private double[] average_rainfall = new double[12];
	private int current_month;
	private int current_year;
	private int previous_year = current_year-1;
	private boolean check = true;
	
	public Ch6Ex3()
	{
		while(check)
		{
		select_choices();
		output();
		}
	}
	public void select_choices()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the current month number and year:(1-12)(xxxx)");
		current_month = keyboard.nextInt();
		current_year = keyboard.nextInt();
		System.out.println("Please enter the city you wish to input the rainfall for: ");
		city = keyboard.nextLine();
		System.out.println("Please enter the previous 12 months actual rainfall in inches as a number.");
		System.out.println("Starting with the first month of the year.");
		for(int i =0; i< 12;i++)
		{
			System.out.println((i+1)+": ");
			actual_rainfall[i] = keyboard.nextInt();		
		}
		System.out.println("Please enter the average rainfall for the year of "+previous_year);
		for(int g= 0; g<12;g++)
		{
			System.out.println("Please enter for "+months_String[g]+" of "+previous_year+": ");
			average_rainfall[g]= keyboard.nextDouble();			
		}
	}
	
	public void output()
	{
		Scanner keyboard = new Scanner(System.in);
		for(int i =0; i<12;i++)
		{
			System.out.println("The rainfall for "+months_String[i]+" of "+city+" of "+ previous_year+" is");	
			System.out.println("The average rainfall is "+ average_rainfall[i]);
			System.out.println("The actual rainfall is: "+actual_rainfall[i]);
			System.out.println("The difference between the two is: "+ (average_rainfall[i]-actual_rainfall[i]));
		}
		System.out.println("Would you like to calculate for a different set of months?(yes/no)");
		String answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			check= true;
		}
		else if(answer.equalsIgnoreCase("no"))
		{
			System.out.println("Thank you, now exiting");
			check = false;
		}
		else
		{
			System.out.println("Error. Exiting");
			System.exit(0);
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
