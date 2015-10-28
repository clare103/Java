package chapter11;
import java.util.*;
public class Ch11Ex10 {

	
	String [][] data = {
			{"A","B"},
			{"1","2"},
			{"XX","YY","ZZ"}
	};;
	
	String[][] arr2 = Arrays.copyOfRange(data, 0, data.length);
	
	public void comb(String [][] data, String []arr2)
	{
		if(data.length == 0 )
		{
			for(int i = 0; i<arr2.length; i++)
			{
				if(arr2[i] != null)
				{
					System.out.print(arr2[i]);
				}
			}
			System.out.println();
		}
		else
		{
			String[][] temp = Arrays.copyOfRange(data, 1, data.length);
			int index = 0;
			for(int i =0; i<arr2.length; i++)
			{
				if (arr2[i] == null)
				{
					index = i;
					break;
				}
			}
				for (int i =0; i< data[0].length;i++)
				{
					arr2[index] = data[0][i];
				}
			comb(temp, arr2);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
