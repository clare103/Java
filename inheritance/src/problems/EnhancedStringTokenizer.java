package problems;

import java.util.*;

public class EnhancedStringTokenizer extends StringTokenizer{

	private String[] a;
	private int count;
	
	public EnhancedStringTokenizer(String theString)
	{
		super(theString);
		a = new String[countTokens()];
		count = 0;
	}
	
	public EnhancedStringTokenizer(String theString, String delimiters)
	{
		super(theString, delimiters);
		a = new String[countTokens()];
		count =0;
	}
	
	public String nextToken()
	{
		String token = super.nextToken();
		 a[count] = token;
		 count++;
		 return token;
	}
	
	public String nextToken(String delimiters)
	{
		String token = super.nextToken(delimiters);
		a[count] = token;
		count++;
		return token;
	}
	public String[] tokensSoFar()
	{
		String[] arrayToReturn = new String[count];
		for(int i =0; i< count; i++)
			arrayToReturn[i] = a[i];
		return arrayToReturn;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = keyboard.nextLine();
		
		EnhancedStringTokenizer wordFactory = new EnhancedStringTokenizer(sentence);
		System.out.println("Your sentence with extra blanks deleted:" );
		while(wordFactory.hasMoreTokens())
			System.out.print(wordFactory.nextToken()+ " ");
		System.out.println();
		
		System.out.println("Sentence with each word on a separate line: ");
		String[] token = wordFactory.tokensSoFar();
		for(int i =0; i <token.length; i++)
			System.out.println(token[i]);
		
		
	}

}
