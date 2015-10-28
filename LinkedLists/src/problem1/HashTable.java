package problem1;

import java.util.*;

public class HashTable {

	private AlternateList2[] hashArray;
	private static final int SIZE = 10;
	
	public HashTable()
	{
		hashArray = new AlternateList2[SIZE];
		for(int i =0; i < SIZE; i++)
			hashArray[i] = new AlternateList2();
	}
	
	private int computeHash(String s)
	{
		int hash = 0;
		for(int i =0; i < s.length(); i++)
		{
			hash += s.charAt(i);
		}
		return hash % SIZE;
	}
	
	/**
	 * Returns true if the target is in the hash table,
	 * false if it is not.
	 */
	
	public boolean containsString(String target)
	{
		int hash = computeHash(target);
		AlternateList2 list = hashArray[hash];
		if(list.contains(target))
			return true;
		return false;
	}
	/**
	 * Stores or puts string s into the hash table
	 */
	public void put(String s)
	{
		int hash = computeHash(s);
		AlternateList2 list = hashArray[hash];
		if(!list.contains(s))
		{
			//only add the tart if its not already
			//on the list.
			hashArray[hash].addToStart(s);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable h = new HashTable();
		System.out.println("Adding dog, cat, turtle, bird");
		h.put("dog");
		h.put("cat");
		h.put("turtle");
		h.put("bird");
		
		System.out.println("Contains dog? "+ h.containsString("dog"));
		System.out.println("Contains cat? "+ h.containsString("cat"));
		System.out.println("Contains turtle? "+ h.containsString("turtle"));
		System.out.println("Contains bird? "+ h.containsString("bird"));
		
		
		System.out.println("Contains fish? "+ h.containsString("fish"));
		System.out.println("Contains cow? "+ h.containsString("cow"));
		
		
	}

}
