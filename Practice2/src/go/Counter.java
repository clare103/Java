package go;

public class Counter {
int num1;


public void reset()
{
	num1 = 0;
}
public void set_increase()
{
	  num1+=1;
}
public void set_decrease()
{
	if(num1 >0)
	num1 -=1;
}
public int get_count()
{
	return num1;
}
public void display()
{
	System.out.println("Count is: "+ num1);
}
public String toString()
{
return "Count is: " + num1;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter c = new Counter();
c.reset();
c.set_increase();
c.set_increase();
c.set_increase();
System.out.println("Current count: "+ c.get_count());
c.set_decrease();
c.display();
System.out.println(c);
c.toString();
	}

}
