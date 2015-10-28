package problem1;

import java.util.*;

public class PriorityQueue<T> {

	public int priority;
	public String input;
	public ArrayList<String> data = new ArrayList();
	public ArrayList<Integer> integer = new ArrayList();
	
	
	PriorityQueue()
	{
		
	}
	
	public void set_priority(int priority)
	{
		this.priority = priority;
	}
	public int get_priority()
	{
		return priority;
	}
	public void set_input(String input)
	{
		this.input = input;
	}
	public String get_input()
	{
		return input;
	}
	
	public void add(String input, int priority)
	{
		data.add(input);
		integer.add(priority);
	}
	public void sort()
	{
		for(int i =0; i<integer.size(); i++)
		{
			for(int g =1; g <integer.size(); g++)
			{
				if(integer.get(i) > integer.get(g))
				{
				String temp;
				temp = data.get(i);
				data.set(i, data.get(g));
				data.set(g, temp);
				
				int temp1;
				temp1 = integer.get(i);
				integer.set(i, integer.get(g));
				integer.set(g, temp1);				
				}
			}
		}
	}
	public void remove()
	{
		sort();
		System.out.println(data.get(0));
		data.remove(0);
		integer.remove(0);
	}
	
	public void display()
	{
		add("x", 10);
		add("y", 9);
		add("z", 3);
		add("w", 11);
		
		remove();
		remove();
		remove();
		remove();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue b = new PriorityQueue();
		b.display();
	}

}
