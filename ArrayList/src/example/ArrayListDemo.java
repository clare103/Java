package example;

import java.util.*;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> toDoList = new ArrayList<String>(20);
System.out.println("Enter list entries, when prompted.");
boolean done = false;
String next = null;
String answer;
Scanner keyboard = new Scanner(System.in);

while(!done)
{
	System.out.println("Input an entry:");
	next = keyboard.nextLine();
	toDoList.add(next);
	System.out.print("More items for the list? ");
	answer = keyboard.nextLine();
	if(!(answer.equalsIgnoreCase("yes")))
		done = true;
}

System.out.println("The list contains: ");
for(String entry : toDoList)
	System.out.println(entry);
		
	}

}
