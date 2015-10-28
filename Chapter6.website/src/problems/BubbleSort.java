package problems;

public class BubbleSort {
	
	double[] b = {7.7,5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};
	int min;
	public BubbleSort()
	{
		double min = b[0];
		
		for(int g =0; g < b.length-1; g++)
		{
			for(int k=1; k <b.length-1; k++ )
			{
				if(b[k]<min)
				{
					min = b[k]; 
				}
			}
		}
		
		while(b[0] != min)
		{
			for(int i =0; i < b.length-1; i++)
				{
					if(b[i] > b[i+1])
						interchange(i, (i+1), b);
				}
		}
		for(int n =0; n < b.length; n++)
		System.out.print(b[n]+", ");
	}
	private static void interchange(int i, int j, double[] b)
	{
		double temp;
		temp = b[i];
		b[i] = b[j];
		b[j] = temp;
	}
	public void display()
	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BubbleSort a = new BubbleSort();
a.display();
	}

}
