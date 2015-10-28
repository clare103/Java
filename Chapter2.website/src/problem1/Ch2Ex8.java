package problem1;
import java.util.*;
public class Ch2Ex8 {
String sentence;
	public Ch2Ex8()
	{
		
	}
	public void set_sentence(String sentence)
	{
		this.sentence = sentence;
	}
	
	public String get_lowercase()
	{
		return sentence.toLowerCase();
	}
	public String get_uppercase()
	{
		return sentence.toUpperCase();
	}
	public void print()
	{
		System.out.println("The lower case version of the sentence is: "+get_lowercase());
		System.out.println("The upper case version of the sentence is: "+get_uppercase());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch2Ex8 c = new Ch2Ex8();
c.set_sentence("THIS IS computer PROGRAMMING.");
c.print();
	}

}
