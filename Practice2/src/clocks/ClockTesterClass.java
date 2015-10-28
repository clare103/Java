package clocks;

public class ClockTesterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MasterClock Child1 = new Child1("4:00");//if the time is equal to the same time as the alarm, the alarm goes off
MasterClock Child2 = new Child2("5:00");
MasterClock Child3 = new Child3("6:00");
MasterClock Child4 = new Child4("7:00");
MasterClock Child5 = new Child5("11:00");
Child4 GrandChild = new GrandChild("11:30");
Child1.set_Alarm("4:40");
Child2.set_Alarm("5:00");
Child3.set_Alarm("6:30");
Child4.set_Alarm("7:00");
Child5.set_Alarm("11:00");
GrandChild.set_Alarm("11:30");
Child1.displayAlarm();
Child2.displayAlarm();
Child3.displayAlarm();
Child4.displayAlarm();
Child5.displayAlarm();
GrandChild.displayAlarm();
GrandChild.set_shape("square");
System.out.println("The grand child clock shape is: "+ GrandChild.get_shape());

//System.out.println("The masterclock time: "+ Child1.Alarm("5:00"));

	}

}
