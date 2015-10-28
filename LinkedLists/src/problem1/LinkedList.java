package problem1;


public class LinkedList<T extends PubliclyCloneable> 
implements PubliclyCloneable 
{
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
		}// End of Node<T> inner class
	}
	private Node<T> head;
	
	public LinkedList()
	{
		head =null;
	}
	/**
	 * Produces a new linked list, but it is not a true deep copy.
	 * Throws a NullPointerException if other is null.
	 */
public LinkedList(LinkedList<T> otherList)
{
	if(otherList == null)
		throw new NullPointerException();
	if(otherList.head == null)
		head = null;
	else
		head = copyOf(otherList.head);
}
public LinkedList<T> clone()
{
	try
	{
		LinkedList<T> copy = (LinkedList<T>)super.clone();
		if(head == null)
			copy.head = null;
		else
			copy.head = copyOf(head);
		return copy;
	}
	catch(CloneNotSupportedException e)
	{//this should not happen.
		return null;//to keep compiler happy.
	}
}
/*
 * Preconditions: otherHead != null
 * Returns a reference to the head of a copy of the list
 * headed by otherHead. Returns a true deep copy.
 */
private Node<T> copyOf(Node<T> otherHead)
{
	Node<T> position = otherHead;//moves down other's list.
	Node<T> newHead; // will point to head of the copy list.
	Node<T> end = null; // positioned at end of new growing list.
	
	//create first node:
	newHead = new Node<T>((T)(position.data).clone(), null);
	end = newHead;
	position = position.link;
	while(position != null)
	{//copy node at position to end of new list.
		end.link = new Node((T)(position.data).clone(), null);
		end = end.link;
		position = position.link;		
	}
	return newHead;
}
public boolean equals(Object otherObject)
{
	if(otherObject == null)
		return false;
	else if(getClass() != otherObject.getClass())
		return false;
	else
	{
		LinkedList<T> otherList = (LinkedList<T>)otherObject;
		return true;
	}
}
public void addToStart(T itemData)
{
	head = new Node<T>(itemData, head);
}
private Node find(T target)
{
	Node<T> position = head;
	T itemAtPosition;
	while(position != null)
	{
		itemAtPosition = position.data;
		if(itemAtPosition.equals(target))
			return position;
		position = position.link;
	}
	return null;
}
public T findData(T target)
{
	Node<T> result = find(target);
	if(result == null)
	{
		return null;
	}
	else
		return result.data;
}
public void outputList()
{
	Node<T> position = head;
	while(position != null)
	{
		System.out.println(position.data);
		position = position.link;
	}
}
public String toString()
{
	Node<T> position = head;
	String theString ="";
	while(position != null)
	{
		theString = theString + position.data + "\n";
		position = position.link;
	}
	return theString;
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
