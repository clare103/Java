package problem1;

public class Queue {

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
	
	private Node front;
	private Node back;
	
	public Queue()
	{
		front = null;
		back = null;
	}
	/**
	 * Adds a string to the back of the queue
	 */
	
	public void addToBack(String itemName)
	{
		Node newEntry = new Node(itemName, null);
		if(front == null)//empty queue
		{
			back = newEntry;
			front = back;
		}
		else
		{
			back.link = newEntry;
			back = back.link;
		}
	}
	public boolean isEmpty()
	{
		return (front == null);
	}
	public void clear()
	{
		front = null;
		back = null;
	}
	/**
	 * Returns the String in the front of the queue.
	 * Returns null if queue is empty.
	 */
	
	public String whoIsNext()
	{
		if(front == null)
			return null;
		else
			return front.item;
	}
	
	/**
	 * Returns the String in the front of the queue.
	 * Returns false if the list is empty.
	 */
	public boolean removeFront()
	{
		if(front != null)
		{
			front = front.link;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.addToBack("Tom");
		q.addToBack("Dick");
		q.addToBack("Harriet");
		
		while(!q.isEmpty())
		{
			System.out.println(q.whoIsNext());
			q.removeFront();
		}
		System.out.println("The queue is empty.");
		
		
	}

}
