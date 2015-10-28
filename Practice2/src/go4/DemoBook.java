package go4;

public class DemoBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TextBook t1 = new TextBook("Math for dummies",300);
t1.set_course_name("Math 111");
t1.set_grade_level("Junior");

System.out.println("The course name is: "+t1.get_course_name()+
		"\nThe grade level is: "+t1.get_grade_level()+
		"\nThe Textbooks name is: "+ t1.get_Title()+
		"\nThe number of pages in the books are: "+ t1.get_numberOfPages());
	}

}
