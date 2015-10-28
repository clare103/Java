package problems;

import java.util.*;

public class Elimination {
	
	
	private class Node<T>
	{
		//private int count;
		private Node link;
		private int item;
		
		public Node()
		{
			item =0;
			link = null;
			//count = 0;
		}
		public Node(int newItem, Node linkValue)
		{
			setData(newItem);
			link = linkValue;
		}
		public void setData(int newItem)
		{
			item = newItem;
			//count = newCount;
		}
		public void setLink(Node newLink)
		{
			link = newLink;
		}
		public int getItem()
		{
			return item;
		}
		public Node getLink()
		{
			return link;
		}
	}//End of Node<T> inner class
	
	private Node head;
	
	public Elimination()
	{
		head = null;
	}
	public void addToStart(int newItem)
	{
		head = new Node(newItem, head);
	}
	public boolean deleteHeadNode()
	{
		if(head!= null)
		{
			head = head.link;
			return true;
		}
		else
			return false;
	}
	public int size()
	{
		int count =0;
		Node position = head;
		while(position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}
	public boolean contains(int num)
	{
		return (find(num) != null);
	}
	private Node find(int target)
	{
		Node position = head;
		int itemAtPosition;
		while(position!=null)
		{
			itemAtPosition = position.item;
			if(itemAtPosition == target)
				return position;
			position = position.link;
		}
		return null;
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
		return (head == null);
	}
	public void clear()
	{
		head = null;
	}
	public int selectsuitor(int n)
	{
		Node current = head;
		Node previous = null;
		while(n != 1)
		{
			for(int i =1; i < 3; i++)
			{
				previous = current;
				System.out.print(""+current.item);
				current = current.link;
				if(current == null)
					current = head;
			}
			System.out.println();
			previous.link = current.link;
			current = current.link;
			if(current==null)
				current=head;
			
			n--;
		}
		return current.item;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int numsuitors;
		Elimination e = new Elimination();
		System.out.println("Enter number of suitors:");
		numsuitors = keyboard.nextInt();
		for(int i = numsuitors; i > 0; i--)
		{
			e.addToStart(i);
		}
		int x = e.selectsuitor(numsuitors);
		System.out.println("\n\n"+ x);
		
		
	}

}
