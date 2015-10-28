package practice;

public class ToyClass {

	String name;
	int number;
	
	public ToyClass(String initialName, int initialNumber)
	{
		name = initialName;
		number = initialNumber;
	}
	
	public ToyClass()
	{
		name = "No name yet.";
		number =0;
	}
	
	public String toString()
	{
		return(name+ " "+ number);
	}
	
	public static void changer(ToyClass aParameter)
	{
		aParameter.name = "Hot Shot";
		aParameter.number = 42;
	}
	
	public boolean equals(ToyClass otherObject)
	{
		return((name.equals(otherObject.name)) && (number == otherObject.number) );
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToyClass anObject = new ToyClass("Mr.Cellophane", 0);
		System.out.println(anObject);
		System.out.println("Now we call changer with anObject as argument. ");
		ToyClass.changer(anObject);
		System.out.println(anObject);
		
		
	}

}
