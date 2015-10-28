package problem1;
import java.lang.Math;
public class Ch3Ex2aagain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dice1;
int dice2;
int dice3;
int win=0;
int loss=0;
int point;
boolean check =false;
for (int i=0; i<10000; i++)
{
	check = false;
	point = 0;
	while(!check)
	{
		dice1 = (int)(Math.random()*6+1);
		dice2 = (int)(Math.random()*6+1);
		dice3 = (dice1 + dice2);
		if (point == 0)
		{
			if(dice3 == 2 || dice3 == 3 || dice3 ==12)
			{
				check = true;
				loss++;
			}
			else if(dice3 == 7 || dice3 == 11)
			{
				check = true;
				win++;
			}
			else 
			{
				point = dice3;
			}
		}
		else
		{
			if(dice3 == point)
			{
				win++;
				check = true;
			}
			else if(dice3 == 7)
			{
				loss++;
				check = true;
			}
		}
	}
}
	System.out.println("Total wins = "+win);
	System.out.println("Total loss = "+loss);
	System.out.println("The probability of winning = "+((double)win/(win+loss))*100);
	System.out.println("The total wins and losses are: "+(win+loss));
	}
}
