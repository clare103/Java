package problem1;

public class Ch1Ex7 {
int total;
	public Ch1Ex7()
	{
		
	}
	public void set_total(int hours, int minutes, int seconds)
	{
		this.total = (hours * 3600)+(minutes * 60)+seconds;
	}
	public int get_total()
	{
		return total;
	}
	public void print()
	{
		System.out.println(get_total());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch1Ex7 c = new Ch1Ex7();
c.set_total(3, 50, 30);
c.print();
c.set_total(4,21,25);
c.print();
	}

}
