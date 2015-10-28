package problems;

public class DifferentEquals {
	
	public static boolean equalArrays(int[] a, int[] b)
	{
		if(a.length != b.length)
			return false;
		else
		{
			int i = 0;
			while( i < a.length)
			{
				if(a[i] != b[i])
					return false;
				i++;
			}
		}
		return true;
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] c = new int[10];
		int[] d = new int[10];
		
		int i;
		for(i = 0; i < c.length; i++)
			c[i]=i;
		for(i =0; i<d.length;i++)
			d[i]=i;
		if(c == d)
			System.out.println("c and d are equals by ==.");
		else
			System.out.println("c and d are not equal by ==.");
		
		System.out.println("== only tests memory addresses.");
		
		if(equalArrays(c,d))
			System.out.println("c and d are equals by the equalArrays method.");	
		else
			System.out.println("c and d are not equal by the equalArrays method.");
		
		System.out.println("An equalArrays method is usually a more useful test");
		

	}	
}
