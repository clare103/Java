package problem1;

import java.util.*;

public class Stack {
	
	private class Node
	{
		private String item;
		private Node link;
		
		public Node()
		{
			item = null;
			link = null;
		}
		public Node(String newItem, Node linkValue)
		{
			item = newItem;
			link = linkValue;
		}
	}//End of Node inner class
	
	private Node head;
	
	public Stack()
	{
		head = null;
	}
	
	/**
	 * This method replaces addToStart
	 * @param itemName
	 */
	
	public void push(String itemName)
	{
		head = new Node(itemName, head);
	}
	/**
	 * This method replaces deleteHeadNode and
	 * also returns the value popper from the list
	 */
	
	public String pop()
	{
		if(head == null)
		{
			throw new IllegalStateException();
		}
		else
		{
			String returnItem = head.item;
			head = head.link;
			return returnItem;
		}
	}
	public boolean isEmpty()
	{
		return (head == null);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push("Billy Rubin");
		stack.push("Lou Pole");
		stack.push("Polly Ester");
		
		while(!stack.isEmpty())
		{
			String s = stack.pop();
			System.out.println(s);
		}
		
	}

}
