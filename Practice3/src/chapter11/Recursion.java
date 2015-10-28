package chapter11;

import java.io.*;
import java.util.*;

public class Recursion {
	

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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File rootFolder = new File(System.getProperty("user.home"));//this is the path for macs, for pc it is C:\\
		String result = searchForFile(rootFolder, "errormessages.txt");// the output on my program is "/Users/rossClare/Desktop/Eclipse:Java Stuff/numbers.txt
		if(!result.equals(""))
			System.out.println(result);
		else
			System.out.println("File not found");
		
		
	}

}
