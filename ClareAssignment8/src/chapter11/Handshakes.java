package chapter11;
import java.util.*;
public class Handshakes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int people=0;
int N_handshakes=0;

Scanner keyboard = new Scanner(System.in);
System.out.println("This program computes the number of handshakes done by people in a room.");
System.out.println("Enter number of people in the room: ");
people = keyboard.nextInt();
N_handshakes = handshakes(people);

System.out.println("The number of people in the room = "+ people+
		"\nThe total number of handshakes = "+ N_handshakes);
	}
	public static int handshakes(int n)
	{
		
		if(n < 2)
			return 0;
		
			return handshakes(n-1) + n-1;
	}

}
