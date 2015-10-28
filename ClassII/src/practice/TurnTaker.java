package practice;

public class TurnTaker {
	
	private static int turn = 0;
	
	private int my_turn;
	private String name;
	
	public TurnTaker(String theName, int theTurn)
	{
		name = theName;
		if(theTurn >=0)
			my_turn = theTurn;
		else
		{
			System.out.println("Fatal error.");
			System.exit(0);
		}
	}
	public TurnTaker()
	{
		name = "no name yet.";
		my_turn=0;
	}
	
	public String get_name()
	{
		return name;
	}
	public static int get_turn()
	{
		turn++;
		return turn;
	}
	public boolean is_my_turn()
	{
		return (turn == my_turn);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TurnTaker lover1 = new TurnTaker("Romeo", 1);
		TurnTaker lover2 = new TurnTaker("Juliet", 3);
		for(int i =1; i<5; i++)
		{
			System.out.println("Turn = "+ TurnTaker.get_turn());
			if(lover1.is_my_turn())
				System.out.println("Love from "+ lover1.get_name());
			if(lover2.is_my_turn())
				System.out.println("Love from "+ lover2.get_name());
		}
		
		
		
	}

}
