package problems;

import java.util.Scanner;

public class EnumSwitchDemo {

	enum Flavor{VANILLA, CHOCOLATE, STRAWBERRY};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flavor favorite = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your favorite flavor?");
		String answer = keyboard.next();
		answer = answer.toUpperCase();
		favorite = Flavor.valueOf(answer);
		
		switch(favorite)
		{
		case VANILLA:
			System.out.println("Classic");
			break;
		case CHOCOLATE:
			System.out.println("Rich");
			break;
		default:
			System.out.println("I bet your said STRAWBERRY.");
			break;
		}
		
	}

}
