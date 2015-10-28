package problems;

import java.util.*;

public class Ch6Ex6 {

	private int[] a = new int [50];
	private int[] set1 = {-12,3,-12,4,1,1,-12,1,-1,1,2,3,4,2,3,-12};
	int size = 16;
	int max=0;
	private int count1, count2;
	private int input;
	private boolean check = true;
	public Ch6Ex6()
	{
//		Scanner keyboard = new Scanner(System.in);
//		reset1();
//		while(check)
//		{
//			System.out.println("Would you like to continue adding to the array?");
//			String answer = keyboard.next();
//			System.out.println();
//		if(answer.equalsIgnoreCase("yes"))
//		{
//			count1++;
//		}
//		else if(answer.equalsIgnoreCase("no"))
//		{
//			check = false;
//			System.out.println("The total elements in the array are: "+ (count1));
//			break;
//		}
//		else
//		{
//			System.out.println("Error with input. Please enter yes/no. Aborting.");
//			System.exit(0);
//		}
//		System.out.println("Please enter the next number of the array: ");
//		a[count1] = keyboard.nextInt();
//		}
		sort(set1, set1.length);
		output(set1);
	}
	
	public void output(int []a)
	{
		System.out.println("N   Count");
		
		for(int i =0; i< size; i++)
		{
			for(int g = i+1; g< size; g++)
			{
				if(a[i] == a[g])
				{
					count2++;
					if(count2 > max)
					{
						
					
					for(int k = g; k< size-1; k++)
					{
						a[k] = a[k+1];
											
					}
					}
					g--;
					size--;
					
				}
				
			}
			System.out.println(a[i] +"   "+ count2);
			reset2();
		}
	}
	
	public void sort(int[] a, int count1)
	{
		int index, indexOfNextLargest;
		for(index =0; index < count1 - 1; index++)
		{
			indexOfNextLargest = indexOfLargest(index, a, count1);
			interchange(index, indexOfNextLargest, a);
		}
	}
	
	public int indexOfLargest(int startIndex, int[] a, int count1)
	{
		int max = a[startIndex];
		int indexOfMax = startIndex;
		int index;
		for(index = startIndex +1; index< count1; index++)
		{
			if(a[index]> max)
			{
				max = a[index];
				indexOfMax = index;
			}
		}
		return indexOfMax;
	}
	
	public void interchange(int i, int j, int[] a)
	{
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void reset1()
	{
		count1 = 0;
	}
	public void add_count1()
	{
		count1++;
	}
	public int get_count1()
	{
		return count1;
	}
	public void reset2()
	{
		count2 =1;
	}
	public void add_count2()
	{
		count2++;
	}
	public int get_count2()
	{
		return count2;
	}
	
	public void display()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex6 d = new Ch6Ex6();
d.display();
	}

}
