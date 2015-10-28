package problem1;

public class Set<T> {

	private class Node<T>
	{
		private T data;
		private Node<T> link;
		public Node()
		{
			data = null;
			link = null;
		}
		public Node(T newData, Node<T> linkValue)
		{
			data = newData;
			link = linkValue;
		}
	}//end of Node<T> inner class
	
	private Node<T> head;
	
	public Set()
	{
		head = null;
	}
	/**
	 * Add a new item to the set. If the item is already in the set,
	 * false is returned; otherwise, true is returned
	 */
	
	public boolean add(T newItem)
	{
		if(!contains(newItem))
		{
			head= new Node<T>(newItem, head);
			return true;
		}
		return false;
	}
	
	public boolean contains(T item)
	{
		Node<T> position = head;
		T itemAtPosition;
		while(position != null)
		{
			itemAtPosition = position.data;
			if(itemAtPosition.equals(item))
			{
				return true;
			}
			position = position.link;
		}
		return false;
	}
	
	public void output()
	{
		Node position = head;
		while(position != null)
		{
			System.out.println(position.data.toString() + " ");
			position = position.link;
		}
		System.out.println();
	}
	/**
	 * Returns a new set that is the union
	 * of this set and the input set.
	 */
	
	public Set<T> union(Set<T> otherSet)
	{
		Set<T> unionSet = new Set<T>();
		//Copy this set to unionSet.
		Node<T> position = head;
		while(position != null)
		{
			unionSet.add(position.data);
			position = position.link;
		}
		//Copy otherSet items to unionSet.
		//The add method eliminates any duplicates.
		position = otherSet.head;
		while(position != null)
		{
			unionSet.add(position.data);
			position = position.link;
		}
		return unionSet;
	}
	
	/**
	 * Returns a new set that is the intersection
	 * of this set and the input set.
	 */
	
	public Set<T> intersection(Set<T> otherSet)
	{
		Set<T> interSet = new Set<T>();
		//Copy only items in both sets.
		Node<T> position = head;
		while(position != null)
		{
			if(otherSet.contains(position.data))
				interSet.add(position.data);
			position = position.link;
		}
		return interSet;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Round things
		Set round = new Set<String>();
		//Green things
		Set green = new Set<String>();
		
		//add some data to both sets
		round.add("peas");
		round.add("ball");
		round.add("pie");
		round.add("grapes");
		
		green.add("peas");
		green.add("grapes");
		green.add("garden hose");
		green.add("grass");
		
		System.out.println("Contents of set round: ");
		round.output();
		System.out.println("Contents of set green: ");
		green.output();
		System.out.println();
		
		System.out.println("Ball in set round: "+ round.contains("ball"));
		System.out.println("ball in set green: "+ green.contains("ball"));
		System.out.println("ball and peas in the same set? "+ 
		((round.contains("ball")&&
				(round.contains("peas")))||
				(green.contains("ball")&&
						(green.contains("peas")))));
		
		System.out.println("pie and grass in same set? "+
		((round.contains("pie")&&
				(round.contains("grass")))||
				(green.contains("pie")&&
						(green.contains("grass")))));
		
		System.out.print("Union of green and round: ");
		round.union(green).output();
		
		System.out.println("Intersection of green and round: ");
		round.intersection(green).output();
		
	}

}
