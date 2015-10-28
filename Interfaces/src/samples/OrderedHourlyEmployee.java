package samples;

public class OrderedHourlyEmployee
	extends HourlyEmployee implements Ordered {

	public boolean precedes(Object other){
		if(other ==null)
			return false;
		else if(! (other instanceof OrderedHourlyEmployee))
			return false;
		else
		{
			OrderedHourlyEmployee otherOrderedHourlyEmployee =
					( OrderedHourlyEmployee)other;
			return (getPay() < otherOrderedHourlyEmployee.getPay());
		}
	}
	public boolean follows(Object other)
	{
		if(other == null)
			return false;
		else if(!(other instanceof OrderedHourlyEmployee))
			return false;
		else
		{
			OrderedHourlyEmployee otherOrderedHourlyEmployee = 
					(OrderedHourlyEmployee)other;
			return (otherOrderedHourlyEmployee.precedes(this));
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
