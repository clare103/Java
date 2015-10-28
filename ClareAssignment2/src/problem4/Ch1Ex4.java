package problem4;
import java.util.Scanner;
public class Ch1Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter weight of mouse in pounds: ");
	double mouseweight = keyboard.nextInt();
	double mousedie = .02;
	System.out.println("Enter weight of human in pounds: ");
	double humanweight = keyboard.nextInt();
	System.out.println("Enter desired weight of human in pounds: ");
	double desiredweight = keyboard.nextInt();
	double sweetnerConcentration = .001;
	
	double killmouse = (mousedie / mouseweight);
	double ratio2human = (killmouse * desiredweight);
	double humandie = (ratio2human / sweetnerConcentration);
	System.out.println(sweetnerConcentration + " is the concentration of sweetner in diet soda.");
	System.out.println(killmouse + " units of sweetner will kill a mouse that weighs " + mouseweight + " pounds.");
	System.out.println(humandie + " units of sweetner will kill a human dieting to " + desiredweight + " pounds.");
	
	}

}
