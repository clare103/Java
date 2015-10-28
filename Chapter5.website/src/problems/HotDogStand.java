package problems;

public class HotDogStand {

	private int sold_hotdogs;
	private int id;
	private static int total =0;
	
	public HotDogStand()
	{
		sold_hotdogs =0;
		id = 0;
	}
	public HotDogStand(int id, int sold_hotdogs)
	{
		set_sold_hotdogs(sold_hotdogs);
		set_id(id);
		total += sold_hotdogs;
	}
	public void set_sold_hotdogs(int sold_hotdogs)
	{
		this.sold_hotdogs = sold_hotdogs;
	}
	public void set_id(int id)
	{
		this.id = id;
	}
	public void justSold()
	{
		total++;
	}
	public void display()
	{
		System.out.println(total);
	}
	
	public String toString()
	{
		return "ID number: "+id+" initial hot dogs sold: "+sold_hotdogs;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HotDogStand a = new HotDogStand(1,10);
a.justSold();
HotDogStand b = new HotDogStand(2,20);
HotDogStand c = new HotDogStand(3,30);
a.display();
System.out.println(a);
	}

}
