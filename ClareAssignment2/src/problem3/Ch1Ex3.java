package problem3;

public class Ch1Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String first = "ross";
 String last = "clare";
 System.out.println(first +" " + last);
 String a = first.substring(1,2);
 String b = last.substring(1,2);
 String c = first.substring(2,4);
 String d = last.substring(2,5);
 a = a.toUpperCase();
 b = b.toUpperCase();
 String fullname = a + c + "ray " + b + d + "cay";
 System.out.println(fullname);
 
 
 

	}

}
