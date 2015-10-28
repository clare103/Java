package problem2;

public class Demo {
	
	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if(docObject.toString().indexOf(keyword, 0)>= 0)
			return true;
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
File a = new File("love.txt");
System.out.println(ContainsKeyword(a, "blank"));



	}

}
