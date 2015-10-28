package problem1;

import java.util.*;

public class LinkedList2 
{
	
	public class Entry
	{
		private String item;
		private int count;
		
		public Entry()
		{
			item = null;
			count =0;
		}
		public Entry(String itemData, int countData)
		{
			item = itemData;
			count = countData;
		}
		public void setItem(String itemData)
		{
			item = itemData;
		}
		public void setCount(int countData)
		{
			count = countData;
		}
		public String getItem()
		{
			return item;
		}
		public int getCount()
		{
			return count;
		}
	}
	
	private class Node
	{
		private Entry item;
		private Node link;
		
		public Node()
		{
			item = null;
			link = null;
		}
		public Node(Entry newItem, Node linkValue)
		{
			item = newItem;
			link = linkValue;
		}
	}// End of Node inner class
	
	public class List2Iterator
	{
		private Node position;
		private Node previous;//previous value of position
		public List2Iterator()
		{
			position = head; // Instance variable head of outer class.
			previous = null;
		}
		
		public void restart()
		{
			position = head; // Instance variable head of outer class.
			previous = null;
		}
		public Entry next()
		{
			if(!hasNext())
				throw new NoSuchElementException();
			
			Entry toReturn = position.item;
			previous = position;
			position = position.link;
			return toReturn;
		}
		public boolean hasNext()
		{
			return(position != null);
		}
		/**
		 * Returns the next value to be returned by next().
		 * Throws an IllegalStateException if hasNext() is false.
		 */
		public Entry peek()
		{
			if(!hasNext())
				throw new IllegalStateException();
			return position.item;
		}
		/**
		 * Adds a node before the node at location position.
		 * previous is placed at the new node. If hasNext() is false,
		 * then the node is added to the end of the list.
		 * If the list is empty, inserts node as the only node.
		 */
		
		public void addHere(Entry newData)
		{
			if(position == null && previous != null)
				//at end of the list, add to end
				previous.link = new Node(newData, null);
			else if(position == null || previous == null)
				//list if empty or position is head node
				LinkedList2.this.addToStart(newData);
			else
			{//previous and position are consecutive nodes
				Node temp = new Node(newData, position);
				previous.link = temp;
				previous = temp;
			}
		}
		/**
		 * Changes the String in the node at location position
		 * Throws an IllegalStateException if position is not at a node,
		 */
		public void changeHere(Entry newData)
		{
			if(position == null)
				throw new IllegalStateException();
			else
				position.item = newData;
		}
		/**
		 * Deletes the node at location position and
		 * moves position to the "next" node.
		 * Throws an IllegalStateException if the list is empty.
		 */
		public void delete()
		{
			if(position == null)
				throw new IllegalStateException();
			else if(previous == null)
			{// remove node at head
				head= head.link;
				position = head;
			}
			else // previous and position are consecutive nodes
			{
				previous.link = position.link;
				position = position.link;
			}
		}
		
	}
	
	private Node head;
	
	public List2Iterator iterator()
	{
		return new List2Iterator();
	}
	
	public LinkedList2()
	{
		head = null;
	}
	/**
	 * Adds a node at the start of the list with the specified data.
	 * The added node will be the first node in the list.
	 */
	public void addToStart(Entry itemName)
	{
		head = new Node(itemName, head);
	}
	/**
	 * Removes the head node and returns true if the list contains at
	 * least one node. Returns false if the list is empty.
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
	 * returns the number of nodes in the list.
	 */
	
	public int size()
	{
		int count = 0;
		Node position = head;
		while(position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}
	
	public boolean contains(String item)
	{
		return(find(item) != null);
	}
	/**
	 * Finds the first node containing the target item, and returns a
	 * reference to that node. If target is not in the list, null is
	 * returned.
	 */
	
	private Node find(String target)
	{
		Node position = head;
		Entry itemAtPosition;
		while(position != null)
		{
			itemAtPosition = position.item;
			if(itemAtPosition.equals(target))
				return position;
			position = position.link;
		}
		return null; // target was not found
	}
	
	public void outputList()
	{
		Node position = head;
		while(position != null)
		{
			System.out.println(position.item);
			position = position.link;
		}
	}
	public boolean isEmpty()
	{
		return(head == null);
	}
	public void clear()
	{
		head = null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList2 list = new LinkedList2();
		LinkedList2.List2Iterator i = list.iterator();
		
		
		
		list.addToStart(list.new Entry("shoes",1));
		list.addToStart(list.new Entry("orange juice",2));
		list.addToStart(list.new Entry("coat",3));
		
		System.out.println("List contains:");
		i.restart();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		i.restart();
		i.next();
		System.out.println("Will delete the node for " + i.peek());
		i.delete();
		
		System.out.println("List now contains:");
		i.restart();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		i.restart();
		i.next();
		System.out.println("Will add one node before "+ i.peek());
		i.addHere(list.new Entry("socks",4));
		System.out.println("List now contains: ");
		i.restart();
		while(i.hasNext())
			System.out.println();
		System.out.println("Changing all items to credit card.");
		i.restart();
		while(i.hasNext())
		{
			i.changeHere(list.new Entry("credit card",5));
			i.next();
		}
		System.out.println();
		System.out.println("List now contains: ");
		i.restart();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();		
	}
}
