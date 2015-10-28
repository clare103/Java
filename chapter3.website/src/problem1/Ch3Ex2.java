package problem1;

import java.lang.*;
public class Ch3Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int win = 0;
		int loss = 0;
		boolean check = true;
		for (int i = 0; i < 10000; i++) 
		{
			int point = 0;
			check = true;
			while (check)
			{
				int die1 = (int)(Math.random()*6);
				int die2 =(int)(Math.random()*6);
				int die3 = die1 + die2;
					if (point == 0)
				{
					if (die3 == 2 || die3 == 3 || die3 == 12) 
					{
						check = false;
						loss++;
					}
					else if (die3 == 7 || die3 == 11) 
					{
						check = false;
						win++;
					}
					else 
					{
						point = die3;
					}
				}
			
					else
					{
						if(die3 == point) 
						{
						win++;
						check = false;
						}

						  if (die3 == 7) 
						{
						check = false;
						loss++;
						}
					}
			}
		}


		System.out.println("The total wins are " + win);
		System.out.println("The total losses are " + loss);
		System.out.println("Total games played: "+(win + loss));
		System.out.println("The probability of winning "+ (((double)win/(win +loss))*100)+" %");
	}
}


