package problem1;

import java.lang.*;
import java.util.*;

public class MyMathClass<T extends Number> {
		
	public double average;

	public void set_average(double average)
	{
		this.average = average;
	}
	public double get_average()
	{
		return average;
	}
	
	public double calc_average(ArrayList<T> a)
	{
		double total = 0;
		for(T item : a)
		{
			total += item.doubleValue();
		}
		average = total/a.size();
		return average;
	}
	public double standard_deviation(ArrayList<T> a)
	{
	average = calc_average(a);
	double total =0;
	double total2 = 0;
	for(T item : a)
	{
		double all = Math.pow(item.doubleValue()-average, 2);
		total += all;
		total2 = total/a.size();
	}
	double all2 = Math.sqrt(total2);
	return all2;
	}
	
	public void display()
	{
		ArrayList doubles = new ArrayList();
		doubles.add(7.0);
		doubles.add(8.0);
		doubles.add(9.6);
		doubles.add(11.0);
		doubles.add(12.0);
		
		MyMathClass obj = new MyMathClass();
		System.out.println(obj.standard_deviation(doubles));
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

MyMathClass d = new MyMathClass();
d.display();
		
	}

}

