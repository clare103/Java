package problems;

import java.util.ArrayList;

public class StringSelectionSort {
	
	public StringSelectionSort()
	{
		
	}
	public void display()
	{
		
	}

	public static String[] selectionSort(String[] b)
	{
		for(int i =1; i < b.length; i++)
		{
			int s = i-1;
			for(int j=i; j < b.length; j++)
			{
				if(b[j].compareTo(b[s])< 0)
				{
					s=j;
				}
			}
			String temp = b[i-1];
			b[i-1] = b[s];
			b[s] = temp;
		}	
		return b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array = {"ddd","abc","acb","111","aaa","aa"};

selectionSort(array);

for(int i =0; i < array.length; i++)
{
	System.out.print("\""+array[i]+"\"");
}
		
		
	}

}
