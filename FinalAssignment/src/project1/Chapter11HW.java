package project1;
import java.util.*;
import java.io.*;
public class Chapter11HW {
	
	public int dumpresults;
	
	public static boolean tryagain = true;
	public String ext1;
	public String dumpthis;
	public Chapter11HW()
	{
		
	}
	public void set_dumpthis(String dumpthis)// for getting textfile to dump results in
	{
		this.dumpthis = dumpthis;
	}
	public String get_dumpthis()
	{
		return dumpthis;
	}
	public void set_dumpresults(int dumpresults)//to decide whether to dump this or not
	{
		this.dumpresults = dumpresults;
	}
	public int get_dumpresults()
	{
		return dumpresults;
	}
	
	public void set_fileExt(String ext1)//setting the file extension for file filter
	{
		this.ext1 = ext1;
	}
	public String get_fileExt()
	{
		return ext1;
	}
	public void error()
	{
		System.out.println("No such file with given extension exsists");
	}
	public static void choice1(String directory1)
	{
		try
		{
			File dir = new File(directory1);
			File[] dir1 = dir.listFiles();
			for(int index=0; index < dir1.length; index ++)
			{
				System.out.println(dir1[index].toString());
				
			}
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void choice2(String directoryName)
	{
		File directory = new File(directoryName);
		
		File[] fList = directory.listFiles();
		
		for(File file : fList)
		{
			if(file.isDirectory())
			{
				System.out.println(file.getName());
			}
			else
				System.out.println("This file is not a sub-directory.");
		}
	}
	public static void choice3(String file1)
	{
		File rootFolder = new File(System.getProperty("user.home"));//this is the path for macs, for pc it is C:\\
		String result = searchForFile(rootFolder, file1);// the output on my program is "/Users/rossClare/Desktop/Eclipse:Java Stuff/numbers.txt
		if(!result.equals(""))
			System.out.println(result);
		else
			System.out.println("File not found");
	}
	
	public static void choice5(String userfile1, String userfile2, String userfile3)
	{
		PrintStream errStream1 = null;

		try 
		{
			errStream1 = new PrintStream(new FileOutputStream(userfile3,true));
		} catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		}
		try
		{
			FileInputStream fstream = new FileInputStream(userfile1);
			FileInputStream fstream1 = new FileInputStream(userfile2);
			DataInputStream in = new DataInputStream(fstream);
			DataInputStream in1 = new DataInputStream(fstream1);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
			String strLine;
			String strLine1;
			System.setErr(errStream1);
			while((strLine = br.readLine()) != null)
			{		
				System.err.println(strLine);		
			}
			while((strLine1 = br1.readLine()) != null)
			{		
				System.err.println(strLine1);	
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			errStream1.close();			
		}
	}
	public static void choice7(String userfile4)
	{
		try
		{
			FileInputStream fstream = new FileInputStream(userfile4);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			while((strLine = br.readLine()) != null)
			{		
				System.out.println(strLine);		
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void listFiles(String dir)//lists the files in a directory
	{
		File directory = new File(dir);
		
		if(!directory.isDirectory())
		{
			System.out.println("no directory provided");
			return;
		}
		
		FilenameFilter filefilter = new FilenameFilter()
		{
			
			public boolean accept(File dir, String name)
			{						
				return name.toLowerCase().endsWith(get_fileExt());
			}		
		};
		
		String[] filenames = directory.list(filefilter);
		
		for(String name : filenames)
		{
			if(!(name==""))
			{
				System.out.println(name);
				
			}
			else
			System.out.println("No such file with given extension exsists.");
		}
	}
	public static String searchForFile(File dir, String target)
	{
		String result = "";
		if(!dir.isDirectory())
			return "Path is not a directory.";
		for(File folderItem : dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				result = searchForFile(folderItem, target);
				if(!result.equals(""))
					return result;
						
			}
			else
			{
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		return "";
	}

	public static void choice4(String dir3)
	{
	 Chapter11HW fileutil = new Chapter11HW();
	fileutil.listFiles(dir3);
	}
	public void choice1_d(String directory1)
	{
		PrintStream errStream2 = null;

		try 
		{
			errStream2 = new PrintStream(new FileOutputStream(get_dumpthis(),true));
		} catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		}
		try
		{
			File dir = new File(directory1);
			File[] dir1 = dir.listFiles();
			for(int index=0; index < dir1.length; index ++)
			{
				System.setErr(errStream2);// setting stream for dumping info
				System.out.println(dir1[index].toString());
				System.err.println(dir1[index].toString());
			}
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		errStream2.close();
		
	}
	public void choice2_d(String directoryName)
	{
		PrintStream errStream2 = null;

		try 
		{
			errStream2 = new PrintStream(new FileOutputStream(get_dumpthis(),true));
		} catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		}
		File directory = new File(directoryName);
		
		File[] fList = directory.listFiles();
		
		for(File file : fList)
		{
			if(file.isDirectory())
			{
				System.setErr(errStream2);
				System.err.println(file.getName());
				System.out.println(file.getName());
			}
			else
				System.out.println("This file is not a sub-directory.");
		}
		errStream2.close();
	}
	public void choice3_d(String file1)
	{
		PrintStream errStream2 = null;

	try 
	{
		errStream2 = new PrintStream(new FileOutputStream(get_dumpthis(),true));
	} catch (FileNotFoundException e1) 
	{
		
		e1.printStackTrace();
	}
		File rootFolder = new File(System.getProperty("user.home"));//this is the path for macs, for pc it is C:\\
		String result = searchForFile_d(rootFolder, file1);// the output on my program is "/Users/rossClare/Desktop/Eclipse:Java Stuff/numbers.txt
		System.setErr(errStream2);
		if(!result.equals(""))
		{
			System.out.println(result);
			System.err.println(result);
		}
		else
		{
			System.out.println("File not found");
			System.err.println("File not found");
		}
		errStream2.close();
	}
		
	public void listFiles_d(String dir)
	{
		PrintStream errStream2 = null;

		try 
		{
			errStream2 = new PrintStream(new FileOutputStream(get_dumpthis(),true));
		} catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		}
		System.setErr(errStream2);
		File directory = new File(dir);
		
		if(!directory.isDirectory())
		{
			System.out.println("no directory provided");
			System.err.println("No directory provided");
			return;
		}
		
		FilenameFilter filefilter = new FilenameFilter()
		{
			
			public boolean accept(File dir, String name)
			{						
				return name.toLowerCase().endsWith(get_fileExt());
			}		
		};
		
		String[] filenames = directory.list(filefilter);
		
		for(String name : filenames)
		{
			if(!(name==""))
			{
				System.out.println(name);
				System.err.println(name);
				
			}
			else
			{
			System.out.println("No such file with given extension exsists.");
			System.err.println("No such file with given extension exsists.");
			}
		}
		errStream2.close();
	}
	public String searchForFile_d(File dir, String target)
	{
		PrintStream errStream2 = null;

		try 
		{
			errStream2 = new PrintStream(new FileOutputStream(get_dumpthis(),true));
		} catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		}
		System.setErr(errStream2);
		String result = "";
		if(!dir.isDirectory())
			return "Path is not a directory.";
		for(File folderItem : dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				result = searchForFile_d(folderItem, target);
				if(!result.equals(""))
					return result;
						
			}
			else
			{
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		errStream2.close();
		return "";
	}
	/**
	 * This program asks if the user would like to dump results into
	 * a text file as well as output the results on the screen.
	 * The user then has the choice to do one of the following:
	 * 1)List the contents of a directory provided by the user.
	 * 2)List the contents of a directory provided by the user as well as all of it sub directories.
	 * 3)Locate a file with a given name.
	 * 4)Locate files with a given file extension.
	 * 5)Concatenate the contents of two files, whose names are provided by the user and out the results
	 * to a third file(a name also provided by the user).
	 * 6)Exit the program
	 * 7)Print the contents on the screen of a file provided by the user.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
Chapter11HW w= new Chapter11HW();
System.out.println("Would you like to:");
System.out.println("1) Dump results in to a text file and output the results on the screen?");
System.out.println("2) Only output the results to the screen?");
System.out.println("Please enter '1' or '2'");
w.set_dumpresults(keyboard.nextInt());
if(w.get_dumpresults() == 2)
{
while(tryagain)
{
System.out.println("Please select one of the 6 options.");
System.out.println("1)List the contents of a directory provided by the user.");
System.out.println("2)List the contents of a directory provided by the user as well as all of it sub directories.");
System.out.println("3)Locate a file with a given name.");
System.out.println("4)Locate files with a given file extension.");
System.out.println("5)Concatenate the contents of two files, whose names are provided by the user and out the results.");
System.out.println("6)Exit the program.");
System.out.println("7)Print the contents on the screen of a file provided by the user.");
System.out.println("Please enter a number from the given menu.(1-7)");
int choice = keyboard.nextInt();

if(choice == 1)
{
System.out.println("Please enter the directory you would like to view.");
String directory1 = keyboard.next();
choice1(System.getProperty(directory1));
}

else if(choice == 2)
{
System.out.println("Please enter the directory you would like to view and its subdirectories.(IE: 'user.home' )");
String dir2 = keyboard.next();
choice2(System.getProperty(dir2));

}
else if(choice == 3)
{
	System.out.println("Please enter the file name you would like to locate: (IE: 'numbers.txt')");
	String file1 = keyboard.next();
	choice3(file1);
	
}
else if(choice == 4)
{
	System.out.println("Please enter the directory you would like to explore for this file:");
	String dir3 = keyboard.next();
	System.out.println("Please enter the file extension you are looking for: ");
	System.out.println("If no files are returned it is because they do not exsist");
	String ext1 = keyboard.next();
	w.set_fileExt(ext1);
	w.listFiles(dir3);
}
else if(choice == 5)
{
System.out.println("Please enter the first file you would like to concatenate.(IE 'numbers.txt.')");
String userfile1 = keyboard.next();
System.out.println("Please enter the second file you would like to concatenate.");
String userfile2 = keyboard.next();
System.out.println("Please enter the desired destination of the concatenated files.");
String userfile3 = keyboard.next();
choice5(userfile1, userfile2, userfile3);
}

else if(choice == 6)
{
	System.exit(0);
}
else if(choice == 7)
{
	System.out.println("Please enter the file you like to view the contents of: ");
	String userfile4 = keyboard.next();
	System.out.println("The contents of the chosen file are:");
	System.out.println("____________________________________");
	choice7(userfile4);
}
else
{
	System.out.println("Invalid error program exiting.");
	System.exit(0);
}
System.out.println("Would you like to chose a different option?(y/n)");
String char1 = keyboard.next().toLowerCase();;
if(char1.equals("n"))
{
	tryagain = false;
}
else if(char1.equals("y"))
	tryagain = true;
else
{
	System.out.println("Invalid input, breaking out of program");
	tryagain = false;
}
}
}
else if(w.get_dumpresults() == 1)//I changed this one to stop from repeating to keep from dumping endlesses amounts of info into file
{
	System.out.println("Please enter the desired filed you wish to send information to:");
	String dumpthis = keyboard.next();
	w.set_dumpthis(dumpthis);
	w.get_dumpthis();
	{
		
		System.out.println("Please select one of the 6 options.");
		System.out.println("1)List the contents of a directory provided by the user.");
		System.out.println("2)List the contents of a directory provided by the user as well as all of it sub directories.");
		System.out.println("3)Locate a file with a given name.");
		System.out.println("4)Locate files with a given file extension.");
		//System.out.println("5)Concatenate the contents of two files, whose names are provided by the user and out the results.");
		System.out.println("6)Exit the program.");
		System.out.println("Please enter a number from the given menu.(1-6)");
		int choice = keyboard.nextInt();

		if(choice == 1)
		{
		System.out.println("Please enter the directory you would like to view.");
		String directory1 = keyboard.next();
		w.choice1_d(System.getProperty(directory1));
		}

		else if(choice == 2)
		{
		System.out.println("Please enter the directory you would like to view and its subdirectories.(IE: 'user.home' )");
		String dir2 = keyboard.next();
		w.choice2_d(System.getProperty(dir2));

		}
		else if(choice == 3)
		{
			System.out.println("Please enter the file name you would like to locate: (IE: 'numbers.txt')");
			String file1 = keyboard.next();
			w.choice3_d(file1);
			
		}
		else if(choice == 4)
		{
			System.out.println("Please enter the directory you would like to explore for this file:");
			String dir3 = keyboard.next();
			System.out.println("Please enter the file extension you are looking for: ");
			System.out.println("If no files are returned it is because they do not exsist");
			String ext1 = keyboard.next();
			w.set_fileExt(ext1);
			w.listFiles_d(dir3);
		}

		else if(choice == 6)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid error program exiting.");
			System.exit(0);
		}
		}
}
}

}
	
