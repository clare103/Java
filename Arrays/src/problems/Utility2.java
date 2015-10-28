package problems;

public class Utility2 {

	public static String censor(String sentence, String... unwanted)
	{
		for(int i = 0; i <unwanted.length; i++)
			sentence = deleteOne(sentence, unwanted[i]);
		return sentence;
	}
	private static String deleteOne(String sentence, String oneUnwanted)
	{
		String ending;
		int position = sentence.indexOf(oneUnwanted);
		while(position >= 0)
		{
			ending = sentence.substring(position + oneUnwanted.length());
			sentence = sentence.substring(0, position)+ ending;
			position = sentence.indexOf(oneUnwanted);
		}
		return sentence;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
