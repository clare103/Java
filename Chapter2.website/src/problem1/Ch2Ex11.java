package problem1;
import java.util.*;
import java.text.*;
public class Ch2Ex11 {

	public Ch2Ex11()
	{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

DecimalFormat pattern1 = new DecimalFormat("##.##%");		
		String empty = "";
Scanner keyboard= new Scanner(System.in);
System.out.println("Name of exercise 1: ");
String exercise1 = keyboard.nextLine();
System.out.println("Score received for exercise 1:");
int score1 = keyboard.nextInt();
System.out.println("Total possible points for exercise 1:");
int p_points1 = keyboard.nextInt();

Scanner keyboard1 = new Scanner(System.in);
System.out.println("Name of exercise 2:");
String exercise2  = keyboard1.nextLine();
System.out.println("Score received for exercise 2: ");
int score2 = keyboard1.nextInt();
System.out.println("Total possible points for exercise 2:");
int p_points2 = keyboard1.nextInt();

Scanner keyboard2 = new Scanner(System.in);
System.out.println("Name of exercise 3: ");
String exercise3 = keyboard2.nextLine();
System.out.println("Score receieved for exercise 3:");
int score3 = keyboard2.nextInt();
System.out.println("Total possible points for exercise 3:");
int p_points3 = keyboard.nextInt();

double totalscore = score1+score2+score3;
double totalpossible = p_points1+p_points2+p_points3;
double finalscore = (totalscore/totalpossible);

System.out.printf("Exercise%10sScore%10sTotal Possible %n",empty, empty);
System.out.printf(exercise1 + "%5s"+score1+"%13s"+p_points1+ "%n", empty, empty);
System.out.printf(exercise2 + "%10s"+score2+"%14s"+p_points2+ "%n", empty, empty);
System.out.printf(exercise3 + "%6s"+score3+"%14s"+p_points3+ "%n",empty,empty);
System.out.printf("Total%13s"+totalscore+"%13s"+totalpossible+"%n", empty,empty);
System.out.println("Your total is "+totalscore+" out of "+totalpossible+", or "+pattern1.format(finalscore)+".");

	}

}
