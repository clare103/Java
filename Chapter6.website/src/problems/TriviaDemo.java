package problems;

public class TriviaDemo {
	
	Trivia[] trivia;
	public int all_points;
	
	public TriviaDemo()
	{
		trivia = new Trivia[5];

		trivia[0] = new Trivia("Where would you like to work?","Buzzmob",1);
		trivia[1] = new Trivia("What makes this place of work, the place you want to work?","Programming",2);
		trivia[2] = new Trivia("How can you improve yourself as a programmer?","Do programming on your own time",3);
		trivia[3] = new Trivia("What is your favorite programming language?","Java",4);		
		trivia[4] = new Trivia("Do you think you did enough to get the job?","Yes",5);
		for(int i =0; i < trivia.length; i++)
		{
			trivia[i].display();
			trivia[i].select();
		}
		all_points = trivia[0].total + trivia[1].total + trivia[2].total + trivia[3].total + trivia[4].total;
		System.out.println("The total point gained is: "+ all_points);
	}
		
	public void display()
	{
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TriviaDemo a= new TriviaDemo();	
	a.display();

	}

}
