package problems;

public class Ch6Ex5 {

	private double a[];
	private int max_number_elements;
	private int size;
	private static double average;
	
	
	public Ch6Ex5()
	{
	max_number_elements = 10;
	a = new double[max_number_elements];
	size =0;
	}
	public static double calc_average(double[] a, int n)
	{
		double total=0;
		for(int i =0; i< a.length;i++)
		{
			total+= a[i];
		}
		average = total/(a.length + 1);
		return average;
	}
	public void set_average(double average)
	{
		this.average = average;
	}
	public double get_average()
	{
		return average;
	}
	public double standard_deviation(double[] a, int size)
	{
		average = calc_average(a, size);
		double total =0;
		double total2 = 0;
		for(int i =0; i< size;i++)
		{
			double all = Math.pow(a[i]-average,2);
			total += all;
			total2 = total/size;
			//double all2 = Math.sqrt(total2);
		}
		double all2 = Math.sqrt(total2);
		return all2;
	}
	
	public void display()
	{
		double[] a = new double[10];
		a[0] = 7.7;
		a[1] = 8.1;
		a[2] = 10.2;
		a[3] = 5.3;
		a[4] = 6.4;
		int size = 5;
		double standard_deviation = standard_deviation(a, size);
		System.out.println(standard_deviation);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch6Ex4 d = new Ch6Ex4();
d.display();
	}

}
