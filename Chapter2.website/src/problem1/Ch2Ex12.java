package problem1;
import java.util.*;
import java.io.*;
public class Ch2Ex12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner fileIn = null;
	try
	{
fileIn = new Scanner(new FileInputStream(System.getProperty("user.home")+"/desktop/"+"love.txt"));
				
	}
	catch(FileNotFoundException e)
	{
		System.out.println("File not found.");
		System.exit(0);
	}
	
	String sentence;
	System.out.println("Text left to read? " + fileIn.hasNextLine());
	sentence = fileIn.nextLine();
	int position = sentence.indexOf("hate");
	String ending = sentence.substring(position + "hate".length());
	System.out.println("The line of text to be changed is:");
	System.out.println(sentence);
	sentence = sentence.substring(0,position)+"love"+ending;
	System.out.println("I have rephrased that line to read:");
	System.out.println(sentence);

}
}