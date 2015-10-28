package chapter11;

import java.util.*;
import java.io.*;

public class FilesAndSubdirectories {

	public static void listFolders(String directoryName)
	{
		File directory = new File(directoryName);
		
		File[] fList = directory.listFiles();
		
		for(File file : fList)
		{
			if(file.isDirectory())
			{
				System.out.println(file.getName());
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
listFolders("/Users/rossclare/");
	}

}
