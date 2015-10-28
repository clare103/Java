package go2;
import java.io.*;
import java.util.Scanner;
public class ReadingTextFiles {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
int count = 0;
Scanner input = new Scanner(new File("numbers.txt"));
System.out.println();

while(input.hasNextInt())
{
	System.out.println(input.nextInt() + "\t");
	count++;
//	if(count % 4 == 0)
//		System.out.println();
}
	System.out.println();
	System.out.println();
	System.out.println(count + "Total ints found.");
}
	}


