package chapter11;
import java.io.*;
import java.util.*;
public class RedirectionDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream errStream = null;
		try
		{
			errStream = new PrintStream(new FileOutputStream("errormessages1.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening file with FileOutputStream.");
			System.exit(0);
		}
		System.setErr(errStream);
		
		System.err.println("Blah.");
		System.out.println("Hello from System.out.");
		System.err.println("Hello again1 from System.err.");
		//errStream.close();
		File noob = new File(System.getProperty("user.home"));
		File[] noob1 = noob.listFiles();
		System.err.println(noob1);
		
		
		
	}


}
