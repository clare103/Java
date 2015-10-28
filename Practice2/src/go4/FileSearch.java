package go4;
import java.io.*;
import java.util.*;
import java.lang.*;
public class FileSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String line;
	String numbers;
	Scanner input = new Scanner(System.in);
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	System.out.println("Enter text file to retrieve numbers from:(numbers.txt)");
	String fileName = input.nextLine();
	String desktop = System.getProperty("user.home") + "/Desktop/"+ fileName;
	FileReader file = new FileReader(desktop);
	BufferedReader f = new BufferedReader(file);
	max = Integer.parseInt(f.readLine());
	min = max;
	int i =0;
	//BufferedReader f = new BufferedReader(new FileReader(filename));
	while((line = f.readLine()) != null)
	{
		
		int temp = Integer.parseInt(f.readLine());
		line = line.trim();
		//numbers = line.split(",");
		if(max<temp)
			max = temp;
		if(min>temp)
		min = temp;
	}
	System.out.println("Minimum value: "+ min);
	System.out.println("Maximum value: "+ max);
	}
catch(Exception e){
e.printStackTrace();
}
	}

}
