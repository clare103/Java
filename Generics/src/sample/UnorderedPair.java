package sample;

public class UnorderedPair<T> extends Pair<T>{
	
	public UnorderedPair()
	{
		setFirst(null);
		setSecond(null);
	}
	public UnorderedPair(T firstItem, T secondItem)
	{
		setFirst(firstItem);
		setSecond(secondItem);
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			UnorderedPair<T> otherPair = (UnorderedPair<T>)otherObject;
			return (getFirst().equals(otherPair.getFirst())
					&& getSecond().equals(otherPair.getSecond()))||
					(getFirst().equals(otherPair.getSecond())
							&& getSecond().equals(otherPair.getFirst()));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UnorderedPair<String> p1 = new UnorderedPair<String>("peanuts", "beer");
UnorderedPair<String> p2 = new UnorderedPair<String>("beer","peanuts");
if(p1.equals(p2))
{
	System.out.println(p1.getFirst() + " and "+ p1.getSecond() + " is the same as");
	System.out.println(p2.getFirst()+ " and " +p2.getSecond());
}
	}

}
