package arrays;
import java.util.*;

public class IntArray {

	/**
	 * @variable hash: holds the non duplicate numbers as KEY and its count of
	 * duplicates as VALUE.
	 * 
	 * @variable final_array: holds the sorted nun duplicate numbers to be
	 * printed
	 * 
	 */
	Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
	int [] final_array;
	public static void main(String[] args) {
		System.out.println("How many numbers do you want to enter?: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]a = new int[n];
		IntArray obj = new IntArray();
		System.out.println("Enter " + n + " numbers: " );
		Scanner scan = new Scanner(System.in);
		for(int i =0; i < a.length; i++)
		{
			int num = scan.nextInt();//get each of the integer given as input and insert into an array
			a[i] = num;
		}
		obj.countDuplicates(a);
		obj.construtFinalArray();
		obj.sort(obj.final_array);
	}
	/** Prints the sorted array(given) and its duplicate count. **/
	public void print(int[]arr)
	{
		System.out.println("\n Sorted numbers and its no of occurances are: ");
		System.out.println("\n Number Count");
		System.out.println("-----------");
		for(int i =0; i <arr.length; i++)
		{
			System.out.println(arr[i]+""+hash.get(arr[i]));
		}
	}
	/** Sorts the given array into Descending order. **/
	public int[] sort(int[]a)
	{
		int temp =0;
		for(int i =0; i < a.length; i++){
		for(int j = 0; j<a.length; j++){
			if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		}
		return a;
	}
	/** Counts the duplicate numbers present in the given values and places in an
	 * HashTables where number would as the KEY and the count of its duplicates
	 * as the VALUE 
	 **/
	public void countDuplicates(int []a)
	{
		for(int i = 0; i <a.length; i++)
		{
			int temp =1;
			if(!(hash.containsKey(a[i])))//If has doesnt contain the number insert it as the key.
			hash.put(a[i], temp);
			else
			{
				temp = Integer.parseInt(hash.get(a[i]).toString());
				hash.put(a[i], temp + 1);
			}
		}
	}
	/**
	 * constructs 'final_array' i.e. sorted array without duplicates used to
	 * print 
	 **/
	public int[] construtFinalArray()
	{
		final_array = new int[hash.size()];//Set the final_array size equal to HashTable has as it has non duplicated numbers
		Enumeration<Integer> e = hash.keys();
		int temp = 0; 
		int i =0;
		while(e.hasMoreElements())
		{
			String tempString = e.nextElement().toString();//Take the key of hash because it contains the non duplicated numbers.
			temp = Integer.parseInt(tempString);//As key is of type Object and the value to be inserted in final_array to
			//be an int value, change key to string and the convert to int by using Interger.parseInt().
			final_array[i++] = temp;
		}
		return final_array;
	}
}
