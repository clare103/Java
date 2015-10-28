package problems;

public class EnumDemo {

	enum WorkDay{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkDay startDay = WorkDay.MONDAY;
		WorkDay endDay = WorkDay.FRIDAY;
		
		System.out.println("Work starts on "+ startDay);
		System.out.println("Work ends on "+ endDay);
		
	}

}
