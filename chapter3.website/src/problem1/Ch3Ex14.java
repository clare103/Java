package problem1;
import java.util.*;
import java.io.*;
public class Ch3Ex14 {
	String filename,longestw="",word="";
	int i=0,j=0,count=0,max=0;
	
	public Ch3Ex14()
	{
		
	}
	public void set_filename(String filename)
	{
		this.filename = filename;
	}
	public String get_filename()
	{
		return filename;
	}
	public void final_print()
	{
		try
		{
			Scanner in = new Scanner(new FileInputStream(System.getProperty("user.home")+"/desktop/"+get_filename()));
			while(in.hasNext())
			   {
				word=in.next();
			    for(i=0;i<word.length()-2;i++)
			        {
			    	if(isVowel(word.charAt(i)))
			             {
			    		count=1;
			               for(j=i+1;j<word.length();j++)
			                    if(isVowel(word.charAt(j)))
			                          count++;
			                     else
			                         j=word.length();
			                }
			            if(count>max)
			                {
			            	max=count;
			                 longestw=word;
			                 }
			    }  
			   }
			 System.out.println("Word with most consecutive vowels: "+longestw);
			   in.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			e.getMessage();
		}
	}
	public boolean isVowel(char c)
	{
		c=Character.toUpperCase(c);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		      return true;
		    else
		       return false;
	}

	/**
	 * @param args
	 */	

		public static void main(String[] args)
		{
			Ch3Ex14 d = new Ch3Ex14();
			d.set_filename("love.txt");
			d.final_print();
		}

		}