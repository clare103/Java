package clocks;
public class Child4 extends MasterClock{
	private String shape;
	public Child4(String time) {
		super(time);
				
	}
	public void set_shape(String shape)
	{
		this.shape = shape;
	}
	public String get_shape()
	{
		return shape;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	}


