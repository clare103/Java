package problem1;

import java.util.*;

public class Ch14Ex3 {

	public ArrayList<GPS> waypoint = new ArrayList<GPS>();
	public double distance_x, distance_y,miles;
	public int seconds;
	
	public Ch14Ex3()
	{
		add();
		compute();
		convert();
		
	}
	public void add()
	{
		waypoint.add(new GPS(1,1,0));
		waypoint.add(new GPS(2,1,3600));
	}
	public void compute()
	{
		distance_x = (waypoint.get(1).get_x())-(waypoint.get(0).get_x());
		distance_y = (waypoint.get(1).get_y())-(waypoint.get(0).get_y());
		seconds = (waypoint.get(1).get_t())-(waypoint.get(0).get_t());
		set_distances(distance_x, distance_y);
		set_seconds(seconds);
	}
	public void set_distances(double distance_x, double distance_y)
	{
		this.distance_x = distance_x;
		this.distance_y = distance_y;
	}
	public void set_seconds(int seconds)
	{
		this.seconds = seconds;
	}
	public void convert()
	{
		distance_x = distance_x/10;
		distance_y = distance_y/10;
		miles = distance_x + distance_y;
	}
	public void set_miles(double miles)
	{
		this.miles = miles;
	}
	public double get_miles()
	{
		return miles;
	}
	public void display()
	{
		System.out.println("The hiker has traveled a distance of: "+miles+" miles in "+seconds+" seconds.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch14Ex3 a = new Ch14Ex3();
		a.display();
	}

}
