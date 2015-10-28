package clocks;

public abstract class MasterClock {
	private String time;
	private String Alarm;
	
public MasterClock(String time)
{
	this.time = time;
}
 public String get_Time()
 {
	 return time;
 }
 public void set_Time(String time)
 {
	 this.time = time;
 }
 public void set_Alarm(String Alarm)
 {
	 this.Alarm = Alarm;
 }
 public String get_Alarm()
 {
	 return Alarm;
 }
 
 public void displayAlarm()
 {
	 if(time == Alarm)
	 {
		 System.out.println("Alarm goes off. wake up!");
	 }
	 else
		 System.out.println("Not time to wake up yet.");
 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
