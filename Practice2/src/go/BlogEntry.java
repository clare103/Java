package go;
import java.util.Scanner;
 
class BlogEntry {
private String username;
private String entry;
private Date EntryDate;


public BlogEntry()
{
	username="";
	entry="";
	EntryDate = new Date(3,28,2013);
}
public BlogEntry(String username, String entry, Date EntryDate)
{
	set_UserName(username);
	set_EntryText(entry);
	set_EntryDate(EntryDate);
}

public String getUserName()
{
	return username;
}
public String getEntryText()
{
	return entry;
}
public Date getEntryDate()
{
	return EntryDate;
}
public void set_UserName(String username)
{
	this.username=username;
}
public void set_EntryText(String entry)
{
	this.entry = entry;
}
public void set_EntryDate(Date EntryDate)
{
	this.EntryDate=EntryDate;
}
public void DisplayEntry()
{
	System.out.printf("poster: \t%s\nEntry:\t%s\nDate:\t%s\n",username,entry,EntryDate.toString());
	return;
}
public String getSummary()
{
	String[] words = entry.split(" ");
	String str="";
	for(int i=0; i<words.length && i<10;i++){
		str+=words[i]+" ";
	}
	return str;
}
	/**
	 * @param args
	 */

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Date date;
int month,day,year;
String name,text;
BlogEntry blogEntry;
System.out.println("Enter poster name: ");
name = input.nextLine();
System.out.println("Enter entry text: ");
text = input.nextLine();
System.out.println("Enter date(m d yyyy): ");
month = input.nextInt();
day = input.nextInt();
year = input.nextInt();
date = new Date(month,day,year);
blogEntry = new BlogEntry(name,text,date);
System.out.println("Summary of text:\n "+blogEntry.getSummary());
blogEntry.DisplayEntry();
input.close();
	}

}
