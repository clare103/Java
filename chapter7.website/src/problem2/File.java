package problem2;

import java.io.*;

public class File extends Document{
	
	public String name, path;	
	
	public File(String name)
	{	
		set_name(name);
		set_path(System.getProperty("user.home")+"/Desktop/"+get_name());
		readFile();
		System.out.println(text);
	}
	public void set_name(String name)
	{
		this.name= name;
	}
	public String get_name()
	{
		return name;
	}
	public void set_path(String path)	
	{
		this.path = path;
	}
	public String get_path()
	{
		return path;
	}
	public String readFile()
	{
		try
		{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		
		while((line = reader.readLine()) != null)
		{
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		text=stringBuilder.toString();
		set_text(text);
		return text;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	public void display()
	{
		
	}
	
	public String toString()
	{
		return text+"\n"+path;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
