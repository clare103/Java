package problems;

import java.util.*;

public class VariableParameterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter scores for Tom, Dick, and Harriet: ");
		Scanner keyboard = new Scanner(System.in);
		int tomsScore = keyboard.nextInt();
		int dicksScore = keyboard.nextInt();
		int harrietsScore = keyboard.nextInt();
		
		int highestScore = UtilityClass.max(tomsScore, dicksScore, harrietsScore);
		
		System.out.println("Highest score = "+ highestScore);
		
	}

}
