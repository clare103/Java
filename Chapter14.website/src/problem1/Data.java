package problem1;

public class Data {

	String data;
	int priority;
	
	public Data(String data, int priority)
	{
		set_data(data);
		set_priority(priority);
	}
	public void set_data(String data)
	{
		this.data = data;
	}
	public void set_priority(int priority)
	{
		this.priority = priority;
	}
	public String get_data()
	{
		return data;
	}
	public int get_priority()
	{
		return priority;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
