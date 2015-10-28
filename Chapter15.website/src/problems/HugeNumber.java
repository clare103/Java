package problems;


public class HugeNumber implements Cloneable {
	
	private class TwoNode
	{
		private int number;
		private TwoNode previous;
		private TwoNode next;
		private TwoNode link;
		
		
		public TwoNode()
		{
			number = 0;
			next = null;
			previous = null;
		}
		public TwoNode(int newNumber, TwoNode previousNode, TwoNode nextNode)
		{
			number = newNumber;
			previous = previousNode;
			next = nextNode;
		}
		public TwoNode(int number,TwoNode link)
		{
			this.number = number;
			this.link = link;
		}
		
	}
	public HugeNumber(HugeNumber otherList)
	{
		if(otherList == null)
			throw new NullPointerException();
		if(otherList.head == null)
			head = null;
		else
			head = copyOf(otherList.head);
	}
	public HugeNumber clone()
	{
		try
		{
			HugeNumber copy = (HugeNumber)super.clone();
			if(head == null)
				copy.head = null;
			else
				copy.head = copyOf(head);
			return copy;
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	private TwoNode copyOf(TwoNode otherHead)
	{
		TwoNode position = otherHead;
		TwoNode newHead;
		TwoNode end = null;
		
		newHead = new TwoNode((position.number), null);
		end = newHead;
		position = position.link;
		
		while(position != null)
		{
			end.link = new TwoNode(position.number, null);
			end = end.link;
			position = position.link;
		}
		return newHead;
	}
	public class DoublyLinkedIterator
	{
		private TwoNode position = null;
		
		DoublyLinkedIterator()
		{ 
			position = head;
		}
		public void restart()
		{
			position = head;		
		}
		public String convert()
		{
			restart();
			String hugenumber="";
			while(hasNext())
			{
				hugenumber += next();
			}
			return hugenumber;
		}
		public int next()
		{
			if(!hasNext())
				throw new IllegalStateException();
			int toReturn = position.number;
			position = position.next;
			return toReturn;
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
			else if(position.next == null)
			{
				//delete last node
				position.previous.next = null;
				position = null;
			}
			else
			{
				position.previous.next = position.next;
				position.next.previous = position.previous;
				position = position.next;
			}
		}
		public void insertHere(int newData)
		{
			if(position == null && head != null)
			{
				//add to end. First move a temp
				//pointer to the end of the list
				TwoNode temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = new TwoNode(newData, temp, null);
			}
			else if(head == null || position.previous == null)
				//at head of list
				HugeNumber.this.addToStart(newData);
			else
			{
				//Insert before the current position
				TwoNode temp = new TwoNode(newData, position.previous, position);
				position.previous.next = temp;
				position.previous = temp;
			}
		}
		
		public boolean hasNext()
		{
			return(position != null);
		}
		public int peek()
		{
			if(!hasNext())
				throw new IllegalStateException();
			return position.number;
		}
		
	}
	
	private TwoNode head;
	
	public DoublyLinkedIterator iterator()
	{
		return new DoublyLinkedIterator();
	}

	public HugeNumber()
	{
		head = null;
	}
	
	public void addToStart(int number)
	{
		TwoNode newHead = new TwoNode(number, null, head);
		if(head != null)
			head.previous = newHead;
		head = newHead;
	}
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			HugeNumber otherList = (HugeNumber)otherObject;
			return true;
		}
	}

	public void display()
	{
		HugeNumber list = new HugeNumber();
		HugeNumber.DoublyLinkedIterator i = list.iterator();
		
		i.insertHere(1);
		i.insertHere(2);
		i.insertHere(3);
		i.insertHere(4);
		i.insertHere(5);
		i.insertHere(6);
		System.out.println(i.convert());
//		i.restart();
//		i.delete();
//		System.out.println(i.convert());
		
		HugeNumber copyList = new HugeNumber();
		copyList = list.clone();
		
		HugeNumber.DoublyLinkedIterator g = copyList.iterator();
		
		if(list.equals(copyList))
			System.out.println("Ok. Lists are equal.");
		g.restart();
		g.next();
		System.out.println("blah: "+g.next());
		System.out.println(g.convert());
		
		
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HugeNumber a = new HugeNumber();
		a.display();
		
	}

}
