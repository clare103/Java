package go4;

public class Book {

	protected String title;
	protected int number_of_pages;
public Book()
{
	
}
public Book(String title, int number_of_pages)
{
this.title = title;
this.number_of_pages = number_of_pages;
}

public void set_title(String title)
{
	this.title = title;
}
public void set_numberOfPages(int number_of_pages)
{
	this.number_of_pages = number_of_pages;
}
public String get_Title()
{
	return title;
}
public int get_numberOfPages()
{
	return number_of_pages;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
