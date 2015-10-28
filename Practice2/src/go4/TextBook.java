package go4;

public class TextBook extends Book {
private String grade_level;
private String course_name;


public TextBook()
{
	
}
public TextBook(String title, int number_of_pages)
{
	super(title, number_of_pages);
	this.title = title;
	this.number_of_pages = number_of_pages;
}
public TextBook(String grade_level, String course_name)
{
	this.grade_level = grade_level;
	this.course_name = course_name;
}
public void set_grade_level(String grade_level)
{
	this.grade_level = grade_level;
}
public void set_course_name(String course_name)
{
	this.course_name = course_name;
}
public String get_grade_level()
{
	return grade_level;
}
public String get_course_name()
{
	return course_name;
}
	/**

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
