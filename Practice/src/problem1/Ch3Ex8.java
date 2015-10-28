package problem1;
import java.util.Scanner;
public class Ch3Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dice;
Scanner keyboard = new Scanner(System.in);
int playertotal=0;
int computertotal=0;
int count=0;
int round=0;
String answer;
boolean tryagain = true;
boolean check = true;
while(playertotal <100 && computertotal <100)
{
	while(check)//player turn
	{
		dice = (int)(Math.random()*6)+1;
		System.out.println("Human rolled a "+ dice);
		if(dice>1)
		{
			System.out.println("Reroll or hold? roll/hold" );
			answer = keyboard.next();
			playertotal = playertotal + dice;
				if(answer.equals("roll"))
				{
					playertotal = dice + playertotal;
					check = true;
				}
				else if(answer.equals("hold"))
				{
					playertotal = dice + playertotal;
					check = false;
					break;				
				}
				else
				{
					System.out.println();
					System.out.println("Invalid answer.");
					check = false;
					
				}
			
		}
		else
		{
			System.out.println();
			System.out.println("You rolled a 1. Its the computer's turn.");
			break;
		}
	}
	count =0;
while(tryagain)
{
	dice = (int)(Math.random()*6)+1;
	System.out.println("Computer rolls a " + dice);
	if(dice>1)
	{
		if(count <=20)
		{
			System.out.println("Computer rolls again.");
			System.out.println();
			count = count + dice;
		}
		else
		{
			System.out.println("Computer holds.");
			System.out.println();
			computertotal = dice + computertotal;
			tryagain = false;
			check = true;
			break;
			
		}
	}
	else
	{
		System.out.println("Computer rolled a 1. Your turn.");
		System.out.println();
		tryagain = false;
		check = true;
		break;
		
	}
}

}

System.out.println();
System.out.println("Current points, Player: "+ playertotal);
System.out.println("Computer: "+ computertotal);
if(playertotal > computertotal)
	System.out.println("You win!");
else
	System.out.println("You lose.");
}


}
