package arrays;
import java.util.*;
public class IntArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
int[] myArray = new int[50];
int num1 = 0;
System.out.println("This program sorts and counts numbers in an array.");
do
	{
	System.out.println("Please enter integer:" );
	if(keyboard.hasNextInt())
		myArray[num1++] = keyboard.nextInt();
	else
		break;
	}
while(num1 < 50);
	System.out.println();
	
	int[] data = new int[num1];
	for(int i =0; i <num1; i++)
		data[i] = myArray[i];
	
	Arrays.sort(data);
	System.out.println("N"+"\tCount");
	
	inner: for(int i = num1-1; i >= 0; i--)
	{
		for(int j = num1 - 1; j>i; j--)
			if(data[j] == data[i])
			continue inner;
		
		int count =0;
		for(int j=0; j<num1; j++)
			if(data[j] == data[i])
				count++;
		
//		System.out.println("N"+"\tCount");
		System.out.println(data[i]+"\t"+count);
	
		
	}
	}
}