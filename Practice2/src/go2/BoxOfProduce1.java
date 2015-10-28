package go2;
import java.io.*;
import java.util.*;
public class BoxOfProduce1 {

String BoFoV1;
String BoFoV2;
String BoFoV3;

public BoxOfProduce1()
{

}
public BoxOfProduce1(String BoFoV1,String BoFoV2,String BoFoV3)
{
	this.BoFoV1 = BoFoV1;
	this.BoFoV2 = BoFoV2;
	this.BoFoV3 = BoFoV3;
}

public void set_BoFoV1(String BoFoV)
{
	BoFoV1 = BoFoV;
}
public void set_BoFoV2(String BoFoV)
{
	BoFoV2 = BoFoV;
}
public void set_BoFoV3(String BoFoV)
{
	BoFoV3 = BoFoV;
}
public String get_BoFoV1()
{
	return BoFoV1;
}
public String get_BoFoV2()
{
	return BoFoV2;
}
public String get_BoFoV3()
{
	return BoFoV3;
}
public String toString()
{
	return BoFoV1+","+BoFoV2+","+BoFoV3+",";
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String line;
	String BoFoV[] = new String[5];
	int i=0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the text file from which the vegetable or fruit will be selected(IE. record.txt)");
	String files = input.nextLine();
	String desk = System.getProperty("user.home") + "/Desktop/"+ files;
	//FileReader file1 = new FileReader(desk);	
	//BufferedReader f = new BufferedReader(file1);
	try
	{
		BufferedReader f = new BufferedReader(new FileReader(desk));
		while((line = f.readLine())!=null)
		{
			line = line.trim();
			BoFoV[i]=line;
			i++;
		}
		f.close();
	}catch(FileNotFoundException ex)
	{
		System.out.println("text file not found or can't be opened.");
	}
	catch(IOException wx)
	{
		System.out.println("Each input field should be in one line otherwise the program won't work.");
	}
	Random rand = new Random();
	BoxOfProduce1 obj = new
			BoxOfProduce1(BoFoV[rand.nextInt(i)],BoFoV[rand.nextInt(i)],BoFoV[rand.nextInt(i)]);
	System.out.println("contents of the box are...");
	System.out.println(obj);
	Scanner in = new Scanner(System.in);
	Scanner inS = new Scanner(System.in);
	int choice;
	System.out.println("do you want to substitute any of this ");
	System.out.println("1 = yes");
	System.out.println("2 = no");
	choice = in.nextInt();
	if(choice == 1)
	{
		System.out.println("please select");
		System.out.println("1. replace vegetables or fruit no 1");
		System.out.println("2. replace vegetables or fruit no 2");
		System.out.println("3. replace vegetables or fruit no 3");
		System.out.println("4.Skip");
		choice = in.nextInt();
		System.out.println("Please enter one of these to replace the fruit or vegetable no" +choice);
		for(int j = 0; j<i;j++)
			System.out.println(BoFoV[j]);
		String s = inS.nextLine();
		if(choice ==1)
			obj.set_BoFoV1(s);
		else if(choice == 2)
			obj.set_BoFoV2(s);
		else if(choice == 3)
			obj.set_BoFoV3(s);
		
		System.out.println("Final contents: ");
		System.out.println(obj);
		
	}
}catch(Exception ex)
{
	System.out.println("Error: program exiting");
}


	}

}
