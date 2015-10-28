package problem1;

public class Ch4Ex5 {
private int count;
	public Ch4Ex5()
	{
		
	}
	public Ch4Ex5(int count)
	{
		set_count(count);
	}
	public void set_count(int count)
	{
		this.count = count;
	}
	public void reset()
	{
		count = 0;
	}
	public void increase()
	{
		count++;
	}
	public int get_count()
	{
		return count;
	}
	public void displayCount_as_Int()
	{
		System.out.println("The current count is: "+get_count());
	}
	public void displayCount_String()
	{
		System.out.println("The current count is "+equals(get_count()));
	}
	public void decrease()
	{
		if(count >0)
		count--;
		else
			System.out.println("Can't set count below zero.");
	}
	public String toString()
	{
		return "The current count is: "+ equals(get_count());
	}
	public String equals(int count)
	{
		switch(count)
		{
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3: 
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
			default:
			{
				System.out.println("Cant return a value less than zero or greater than 10");
				System.exit(0);
				return "error";
			}
		}
	}
	public void final_print()
	{
		set_count(5);
		decrease();
		displayCount_as_Int();
		displayCount_String();
		increase();
		increase();
		increase();
		toString();
		reset();
		toString();
		displayCount_as_Int();
		displayCount_String();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch4Ex5 c = new Ch4Ex5();
		c.final_print();
		
	}

}
