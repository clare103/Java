package chapter8;
import java.util.*;
public class Ch8Ex9{
	static int count =0;//added the count to make sure its working
	static int count1 =0;//counting loop
	public static void printDiceRolls(Random randGenerator)
	{
		for(int i =0; i<100; i++)
		{
			int a = randGenerator.nextInt(6)+1;
			System.out.println(a);
			count1++;
			if(a == 6)
				count++;
		
		}
	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoadedDice myDice = new LoadedDice();
		printDiceRolls(myDice);
		System.out.println("The total count is: "+count);
		System.out.println("The total loop: "+ count1);
	}

}
