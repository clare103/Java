package problem1;

import java.util.*;

public class BLAH {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String main = keyboard.next();
		System.out.println("Please enter the substring:");
		String sub = keyboard.next();
		
		char[] main_char = main.toCharArray();
		char[] sub_char = sub.toCharArray();
		
		int count =0;
		
		outerloop:
		if(sub.length() != 1)
		{
			for(int i =0; i < main.length(); i++)
			{
				for(int g =0; g < sub.length(); g++)
				{
					if(sub_char[g]==main_char[i] && sub_char[g+1]==main_char[i+1])
					{					
						count = i;
						break outerloop;
					}
				}
			}		
		}
		else
		{
			for(int i =0; i < main.length(); i++)
			{
				for(int g =0; g < sub.length(); g++)
				{
					if(main_char[i] == sub_char[g])
					{
						count = i;
					}
				}
			}
		}
		
		
		System.out.println("The count is:" + count);
	}
}

