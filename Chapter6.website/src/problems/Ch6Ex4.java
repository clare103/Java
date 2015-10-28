package problems;

public class Ch6Ex4 {

	private char a[];
	private int max_number_elements;
	private int size;
	
	public Ch6Ex4()
	{
		max_number_elements =10;
		a = new char[max_number_elements];
		size =0;
	}
	
	public Ch6Ex4(int array_size)
	{
		if(array_size <= 0)
		{
			System.out.println("Error array size zero or negative.");
			System.exit(0);
		}
		max_number_elements = array_size;
		a = new char[max_number_elements];
		size =0;
	}
	Ch6Ex4(Ch6Ex4 original)
	{
		if(original == null)
		{
			System.out.println("Fatal Error: aborting");
			System.exit(0);
		}
		max_number_elements = original.max_number_elements;
		size = original.size;
		a = new char[max_number_elements];
		for(int i=0; i<size;i++)
			a[i]= original.a[i];
	}
	public void delete(int index)
	{
		if(index <0 || index >= size)
		{
			System.out.println("Error. exiting prog.");
			System.exit(0);
		}
		for(int i =index; i < size; i++)
		{
			a[i] = a[i+1];
		}
		size--;
	}
	public static int deleteRepeats(char[] a, int size)
	{
		for(int i =0; i < size; i++)
		{
			for(int g=i+1; g<size; g++)
			{
				if(a[i] == a[g])
				{
					for(int k = g; k < size -1; k++)
					{
						a[k] = a[k+1];
					}
					g--;
					size--;
				}
				
			}
			
		}
		return size;
	}
	public void display()
	{
		char a[] = new char[10];
		a[0] = 'a';
		a[1] = 'b';
		a[2] = 'a';
		a[3] = 'c';
		int size =4;
		size =deleteRepeats(a, size);
		System.out.println(size);
		for(int i =0; i< size;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex4 b = new Ch6Ex4();
b.display();
	}

}
