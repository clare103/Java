import java.util.Scanner;
public class problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the first name of the person: ");
String first = keyboard.next();
System.out.println("Enter the last name of the person: ");
String last = keyboard.next();
String a = first.substring(1, 2);
String b = last.substring(1,2);
int length1 = first.length();
int length2 = last.length();
System.out.println(a +" "+ b);
System.out.println(length1 + " " + length2);
String c = first.substring(2, length1);
String d = last.substring(2, length2);
String e = first.substring(0,1);
String f = last.substring(0,1);
a = a.toUpperCase();
b = b.toUpperCase();
String fullname = a + c + e +"ay " + b + d + f +"ay";
System.out.println(fullname);
	}

}
