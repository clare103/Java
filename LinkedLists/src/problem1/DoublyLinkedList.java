package problem1;


public class DoublyLinkedList {

	private class TwoWayNode
	{
		private String item;
		private TwoWayNode previous;
		private TwoWayNode next;
		
		public TwoWayNode()
		{
			item = null;
			next =null;
			previous = null;
		}
		public TwoWayNode(String newItem, TwoWayNode previousNode,
				TwoWayNode nextNode)
		{
			item = newItem;
			next = nextNode;
			previous = previousNode;
		}
	}//ENd of TwoWayNode inner class
	
	public class DoublyLinkedIterator
	{
		//We do not need a previous node when using a doubly linked
		// list
		private TwoWayNode position = null;
		
		public DoublyLinkedIterator()
		{
			position = head;
		}
		public void restart()
		{
			position = head;
		}
		public String next()
		{
			if(!hasNext())
				throw new IllegalStateException();
			String toReturn = position.item;
			position = position.next;
			return toReturn;
		}
		
		public void insertHere(String newData)
		{
			if(position == null && head != null)
			{
				// add to end. First move a temp
				// pointer to the end of the list
				TwoWayNode temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = new TwoWayNode(newData, temp, null);
			}
			else if(head == null || position.previous == null)
				//at head of list
				DoublyLinkedList.this.addToStart(newData);
			else
			{
				//Insert before the current position
				TwoWayNode temp = new TwoWayNode(newData, position.previous, position);
				position.previous.next = temp;
				position.previous = temp;
			}
		}
		public void delete()
		{
			if(position == null)
				throw new IllegalStateException();
			else if (position.previous == null)
			{
				//deleting first node
				head = head.next;
				position = head;
			}
			else
			{
				position.previous.next = position.next;
				position.next.previous = position.previous;
				position = position.next;
			}
		}
		public boolean hasNext()
		{
			return(position != null);
		}
		public String peek()
		{
			if(!hasNext())
				throw new IllegalStateException();
			return position.item;
		}
	}// doublylinkediterator
	
	private TwoWayNode head;
	
	public DoublyLinkedIterator iterator()
	{
		return new DoublyLinkedIterator();
	}
	public DoublyLinkedList()
	{
		head = null;
	}
	/**
	 * The added node will be the first node in the list.
	 */
	public void addToStart(String itemName)
	{
		TwoWayNode newHead = new TwoWayNode(itemName, null, head);
		if(head != null)
		{
			head.previous = newHead;
		}
		head = newHead;
	}
	/*The methods hasNext, peek, clear, and isEmpty are identical
	 * to those in Display 15.17. Other methods would also normally
	 * be defined here, such as deleteHeadNode, size, outputList,
	 * equals, clone, find, or contains. They have been left off to
	 * simplify the example.
	 * Doubly Linked List
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedList.DoublyLinkedIterator i = list.iterator();
		
		list.addToStart("shoes");
		list.addToStart("orange juice");
		list.addToStart("coat");
		System.out.println("List contains:");
		i.restart();
		
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		i.restart();
		i.next();
		i.next();
		System.out.println("Inserting socks before "+ i.peek());
		i.insertHere("socks");
		
		i.restart();
		System.out.println("List not contains:");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		
	}

}
