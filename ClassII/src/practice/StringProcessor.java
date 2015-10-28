package practice;
import java.util.*;
public class StringProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a one line sentence: ");
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.nextLine();
		
		sentence = sentence.toLowerCase();
		char firstCharacter = sentence.charAt(0);
		sentence = Character.toUpperCase(firstCharacter)+sentence.substring(1);
		
		System.out.println("The revised sentence is: ");
		System.out.println(sentence);		
		
	}

}
