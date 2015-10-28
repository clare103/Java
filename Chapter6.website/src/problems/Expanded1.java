package problems;

public class Expanded1 {

	private int maxNumberElements;
	public double[] a;
	private int numberUsed;
	
	public Expanded1(int maxNumberElements, double[] a, int numberUsed)
	{
		set_maxNumberElements(maxNumberElements);
		set_numberUsed(numberUsed);
		a = new double[maxNumberElements];
	}
	public void set_maxNumberElements(int maxNumberElements)
	{
		this.maxNumberElements= maxNumberElements;
	}
	public void set_numberUsed(int numberUsed)
	{
		this.numberUsed = numberUsed;
	}
	public int get_maxNumberElements()
	{
		return maxNumberElements;
	}
	public int get_numberUsed()
	{
		return numberUsed;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
