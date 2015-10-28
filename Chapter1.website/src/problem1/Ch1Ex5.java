package problem1;

public class Ch1Ex5 {

	public Ch1Ex5()
	{
		
	}

	
	public void print()
	{
		String sentence = "I hate you.";
		int position = sentence.indexOf("hate");
		String ending = sentence.substring(position + "hate".length());		
		System.out.println("The line of text to be changed is:");
		System.out.println(sentence);
		sentence = sentence.substring(0,position)+"love"+ending;
		System.out.println("I have rephrased that line to read:");
		System.out.println(sentence);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch1Ex5 c = new Ch1Ex5();
c.print();
	}

}
