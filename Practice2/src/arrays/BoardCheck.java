package arrays;

import java.util.Random;

public class BoardCheck {
	{	
		Random rgen = new Random(); // Random Object
		int[][] cards = new int[4][4]; // Enter the numbers. Not sure if that's right.


		for (int i=0; i<cards.length; i++) {
		for (int j=0; j<cards[i].length; j++) {
		int randomPosition = rgen.nextInt(cards.length);
		int randomPositionTwo = rgen.nextInt(cards.length);
		int temp = cards[i][j];
		cards[i][j] = cards[randomPosition][randomPositionTwo];
		cards[randomPosition][randomPositionTwo] = temp;
			}
		}
	}
	        
	       
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean cs[][]= new boolean[4][4];
		
		System.out.println("   | 1 2 3 4 ");
        System.out.println("---+---------");
        for(int i=0;i<4;++i)
        {
            System.out.print(" " +(i+1) +" | ");
            for(int j=0;j<4;++j)
            {
                System.out.print("* ");
                cs[i][j]=false;
            }
            System.out.println();
        }
        System.out.println();
	}
	}
