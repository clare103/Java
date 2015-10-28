package problems;
import java.util.*;
public class StringProcessingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What did you eat for dinner?");
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.nextLine();
		sentence = Utility2.censor(sentence, "candy","french fries","salt", "beer");
		sentence = Utility2.censor(sentence, " ,");
		System.out.println("You would be healthier if you could answer: ");
		System.out.println(sentence);
		
	}

}
