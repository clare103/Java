package problem1;

public class LinkedList3<T> {
	
	private class Node<T>
	{
		private T data;
		private Node<T> link;
		public Node()
		{
			data = null;
			link = null;
		}
		
		public Node (T newData, Node<T> linkValue)
		{
			data = newData;
			link = linkValue;
		}
	}// end of inner class
	
	private Node<T> head;
	
	public LinkedList3()
	{
		head = null;
	}
	
	/**
	 * Adds a node at the start of the list with the specified data.
	 * The added node will be the first node in the list.
	 */
	public void addToStart(T itemData)
	{
		head = new Node<T> (itemData, head);
	}
	
	/**
	 * Removes the head node and returns true if the list contains
	 * at least one node. Returns false if the list is empty.
	 */
	
	public boolean deleteHeadNode()
	{
		if(head != null)
		{
			head = head.link;
			return true;
		}
		else
			return false;
	}
	/**
	 * Returns the number of nodes in the list.
	 */
	
	public int size()
	{
		int count = 0;
		Node<T> position = head;
		while(position != null)
		{
			count++;
			position = position.link;
		}
		return count; // target was not found
	}
	
	public boolean contains(T item)
	{
		return (find(item)!= null);
	}
	
	/**
	 * Finds the first node containing the target and returns a reference
	 * to the data in that node. If target is not in the list, null is
	 * returned.
	 */
	
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
	/**
	 * Finds the first node containing the target and returns a reference
	 * to the data in that node. If target is not in the list, null is 
	 * returned.
	 */

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
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	public void clear()
	{
		head = null;
	}
	
	/*
	 * For two lists to be equals they must contain the same data items in
	 * the same order. The equals method of T is used to compare data items.
	 */
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else
		{
			LinkedList3<T> otherList = (LinkedList3<T>)otherObject;
			if(size() != otherList.size())
			{
				return false;
			}
			Node<T> position = head;
			Node<T> otherPosition = otherList.head;
			while(position != null)
			{
				if(!(position.data.equals(otherPosition.data)))
					return false;
				position = position.link;
				otherPosition = otherPosition.link;
			}
			return true;
		}		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

LinkedList3<Entry> list = new LinkedList3<Entry>();
		
		Entry entry1 = new Entry("Apples", 1);
		list.addToStart(entry1);
		Entry entry2 = new Entry("Bananas", 2);
		list.addToStart(entry2);
		Entry entry3 = new Entry("Cantaloupe", 3);
		list.addToStart(entry3);
		System.out.println("List has "+ list.size()+ " nodes");
		list.outputList();
		System.out.println("End of list.");
		
		
	}

}
