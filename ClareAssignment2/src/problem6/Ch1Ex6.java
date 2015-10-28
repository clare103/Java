package problem6;

public class Ch1Ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	inches = 100;
	int cadence = 90;
	
double speed = inches * 3.14 * (.083) * (.00018939) * cadence * (60);
System.out.println("The speed of the bike in mph = " + speed);

	}

}
