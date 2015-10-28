package problem1;
import javax.swing.JOptionPane;
import java.util.*;
public class Pig 
{

String Play;
boolean playerTurn = true;
final int WIN = 100;
final int COMPMAX = 20;
int play;
int playerScore = 0;
int compScore =0;
int compEnd;
int points;
int roundScore;
int die1Roll;
int die2Roll;

Die die1 = new Die();
Die die2 = new Die();

public static void main (String[] args)
{
	JOptionPane.showMessageDialog(null, "Welcome to Pig game.");
	Pig pig = new Pig();
	pig.play();
}

public void play()
{
	while(playerTurn)
	{
		Play= JOptionPane.showInputDialog("Please enter 1 to roll the die.");
	play = Integer.parseInt(Play);
	if (play == 1)
	{
		playerTurn = true;
	}
	else
	{
		playerTurn = false;
		
	}
	if (playerTurn == false)
	{
		computerRoll();
	}
	else
	{
		playerRoll();
	}
}
	
	
		
	}

public void computerRoll()
{
	while(playerTurn == false)
	{
		die1Roll = die1.roll();
		die2Roll = die2.roll();
		
		JOptionPane.showMessageDialog(null, "Computer rolled: "+ die1Roll + " + "+ die2Roll);
		compScore = points(die1Roll, die2Roll, compScore);
		if(die1Roll == 1 || die2Roll ==1)
		{
			playerTurn =true;
		}
		
		JOptionPane.showMessageDialog(null, "Player score: "+playerScore + " "+ "Computer Score: " + compScore);
		if(compEnd >= COMPMAX)
		{
			playerTurn = true;
			compEnd = 0;
		}
	}
	if (compScore >=WIN)
	{
		win();
	}
	
}
public void playerRoll()
{
	die1Roll = die1.roll();
	die2Roll = die2.roll();
	
	JOptionPane.showMessageDialog(null, "You rolled: "+die1Roll+ " + "+die2Roll);
	playerScore = points(die1Roll, die2Roll, playerScore);
	JOptionPane.showMessageDialog(null, "Player Score: "+playerScore+ " "+ "Computer Score: " + compScore);
	
	if(die1Roll ==1 || die2Roll==1)
	{
		playerTurn = false;
		
	}
	if (playerScore >=WIN)
	{
		win();
	}
}

public int points(int die1Roll, int die2Roll, int points)
{
	if(roundCont(die1Roll, die2Roll));
	{
		roundScore += die1Roll + die2Roll;
	}
	if (die1Roll == 1 && die2Roll == 1)
	{
		JOptionPane.showMessageDialog(null, "Lost all points!");
	points =0;
	compEnd =0;
	roundScore=0;
	return points;
	}
else if(die1Roll ==1 || die2Roll ==1)
{
	JOptionPane.showMessageDialog(null, "Recieved no points!");
	roundScore =0;
	return points;
}
else
{
	compEnd += die1Roll + die2Roll;
	points = roundScore;
	return points;
}
}
public boolean roundCont(int die1Roll, int die2Roll)
{
	if (die1Roll ==1 && die2Roll ==1)
	{
		return false;
	}
	else if(die1Roll == 1|| die2Roll ==1)
	{
		return false;
		
	}
	else
	{
		return true;
	}
}
public void win()
{
	if (playerScore >= 100)
	{
		JOptionPane.showMessageDialog(null, "Congrats, you win!");
		System.exit(0);
	}
	if (compScore >= 100)
	{
		JOptionPane.showMessageDialog(null, "You lose!");
		System.exit(0);
	}
}
}