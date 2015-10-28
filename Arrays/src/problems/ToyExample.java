package problems;

import java.sql.Date;

public class ToyExample {

	
	private Date[] a;
	
	public ToyExample(int arraySize)
	{
		a = new Date[arraySize];
		for(int i =0; i< arraySize; i++)
			a[i] = new Date();
	}
	
	public ToyExample(ToyExample object)
	{
		int lengthOfArrays = object.a.length;
		this.a = new Date[lengthOfArrays];
		for(int i =0; i<lengthOfArrays; i++)
			this.a[i] = new Date(object.a[i]);
	}
	public Date[] getDateArray()
	{
		Date[] temp = new Date[a.length];
		for(int i =0; i < a.length; i++)
			temp[i]= new Date(a[i]);
		return temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
