package problem1;
import java.lang.Math;

public class Ch3ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int die1;
		int die2;
		int die3;
		int point;
		int win = 0;
		int loss = 0;
		boolean check = false;
		for (int i = 0; i < 10000; i++) {
			point = 0;
			check = false;
			while (!check) {
				die1 = (int) (Math.random() * 6);
				die2 = (int) (Math.random() * 6);
				die3 = (die1 + die2);
				
					if (point == 0)
				{
					if (die3 == 2 || die3 == 3 || die3 == 12) {
						check = true;
						loss++;
					} else if (die3 == 7 || die3 == 11) {
						check = true;
						win++;
					} else {
						point = die3;
					}
				}
			
					else
						{
						if(die3 == point) 
						{
						win++;
						check = true;

					}  if (die3 == 7) {
						check = true;
						loss++;
						}
				}
		}
}


		System.out.println("The total wins are " + win);
		System.out.println("The total losses are " + loss);
		System.out.println(win + loss);
		System.out.println("The probability of winning "+ (((double)win/(win +loss))*100)+" %");
	}
}
	


