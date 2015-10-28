package problem1;
import java.util.*;
public class Ch2Ex5 {
double depreciation;
double purchase;
double salvage;
int years;
	public Ch2Ex5()
	{
		
	}
	public void set_depreciation(double purchase, double salvage, int years)
	{
		this.depreciation = (purchase-salvage)/years; 
	}
	public double get_depreciation()
	{
		return depreciation;
	}
	public void print()
	{
		System.out.println("The yearly depreciation of the item is: "+get_depreciation());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch2Ex5 c = new Ch2Ex5();
c.set_depreciation(3.50, 3, 2);
c.print();

	}

}
