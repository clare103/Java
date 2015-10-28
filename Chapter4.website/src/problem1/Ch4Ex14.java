package problem1;
import java.util.*;
import java.io.*;
public class Ch4Ex14 {
String filename = System.getProperty("user.home")+"/Desktop/"+"ratings.txt";
String delimiters = ", ";
String input,line1,line2,line3,line4;
int rating1, rating2, rating3, rating4, rating5;
double average1=0, average2=0, average3=0;
	public Ch4Ex14()
	{
		
	}
	
	public void read_file()
	{
		try
		{
			Scanner in = new Scanner(new FileInputStream(filename));
			line1 = in.next();
			in.nextLine();
			line2 = in.next();
			in.nextLine();
			line3 = in.next();
			in.nextLine();
			line4 = in.next();
			set_line(line1, line2, line3, line4);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
	}
	public void set_stringtoken1()
	{
		StringTokenizer info1 = new StringTokenizer(line2, delimiters);
		rating1 = Integer.parseInt(info1.nextToken());
		rating2 = Integer.parseInt(info1.nextToken());
		rating3 = Integer.parseInt(info1.nextToken());
		rating4 = Integer.parseInt(info1.nextToken());
		rating5 = Integer.parseInt(info1.nextToken());
		set_ratings(rating1, rating2, rating3, rating4, rating5);
	}
	public void set_stringtoken2()
	{
		StringTokenizer info2 = new StringTokenizer(line3, delimiters);
		rating1 = Integer.parseInt(info2.nextToken());
		rating2 = Integer.parseInt(info2.nextToken());
		rating3 = Integer.parseInt(info2.nextToken());
		rating4 = Integer.parseInt(info2.nextToken());
		rating5 = Integer.parseInt(info2.nextToken());
		set_ratings(rating1, rating2, rating3, rating4, rating5);
	}
	public void set_stringtoken3()
	{
		StringTokenizer info3 = new StringTokenizer(line4, delimiters);
		rating1 = Integer.parseInt(info3.nextToken());
		rating2 = Integer.parseInt(info3.nextToken());
		rating3 = Integer.parseInt(info3.nextToken());
		rating4 = Integer.parseInt(info3.nextToken());
		rating5 = Integer.parseInt(info3.nextToken());
		set_ratings(rating1, rating2, rating3, rating4, rating5);
	}
	public void set_line(String line1,String line2,String line3, String line4)
	{
		this.line1 =line1;
		this.line2 =line2;
		this.line3 =line3;
		this.line4 =line4;
		
	}
	public void set_average(double average)
	{
		this.average1 = (get_rating1()+get_rating3()+get_rating4()+get_rating5())/4.0;
		this.average2 = (get_rating1()+get_rating2()+get_rating3()+get_rating4()+get_rating5())/5.0;
		this.average3 = (get_rating3()+get_rating4()+get_rating5())/3.0;
	}
	public double get_average1()
	{
		return average1;
	}
	public double get_average2()
	{
		return average2;
	}
	public double get_average3()
	{
		return average3;
	}
	public String get_line1()
	{
		return line1;
	}
	public String get_line2()
	{
		return line2;
	}
	public String get_line3()
	{
		return line3;
	}
	public String get_line4()
	{
		return line4;
	}
	public void set_ratings(int rating1,int rating2, int rating3, int rating4, int rating5)
	{
		this.rating1 = rating1;
		this.rating2 = rating2;
		this.rating3 = rating3;
		this.rating4 = rating4;
		this.rating5 = rating5;
	}
	public int get_rating1()
	{
		return rating1;
	}
	public int get_rating2()
	{
		return rating2;
	}
	public int get_rating3()
	{
		return rating3;
	}
	public int get_rating4()
	{
		return rating4;
	}
	public int get_rating5()
	{
		return rating5;
	}
	public void final_print()
	{
		read_file();
		set_stringtoken1();
		set_average(average1);
		System.out.println("The average for line 1 is: ");
		System.out.println(get_average1());
		set_stringtoken2();
		set_average(average2);
		System.out.println("The average for line 2 is: ");
		System.out.println(get_average2());
		set_stringtoken3();
		set_average(average3);
		System.out.println("The average for line 3 is: ");
		System.out.println(get_average3());
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex14 c = new Ch4Ex14();
c.final_print();
	}

}
