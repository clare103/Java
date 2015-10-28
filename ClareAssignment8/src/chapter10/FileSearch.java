package chapter10;
import java.util.*;
import java.io.*;
public class FileSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String file = System.getProperty("user.home") + "/Desktop/" + "numbers.txt";
int max = 0;
int min = 0;
try{
	BufferedReader input = new BufferedReader(new FileReader(new File(file)));
	String line;
	int i =0;
	while((line = input.readLine())!= null)
	{
		int int_Line = Integer.parseInt(line.trim());
		if(max< int_Line)
		{
			max = int_Line;
		}
		if(i == 0)
		{
			min = int_Line;
		}
		if(min > int_Line)
		{
			min = int_Line;
		}
		i++;
	}
	input.close();
}catch(FileNotFoundException e)
{
	e.printStackTrace();
	System.out.println(e);
}catch(IOException e)
{
	e.printStackTrace();
	System.out.println(e);
}

System.out.println("Max value in file: "+ max);
System.out.println("Min value in file: "+ min);
}
}