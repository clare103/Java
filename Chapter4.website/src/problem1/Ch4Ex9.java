package problem1;
import java.util.*;
public class Ch4Ex9 {

	private String name;
	private int pop;
	private double growth;
	
	public Ch4Ex9()
	{
		
	}
	public Ch4Ex9(String name, int pop, double growth)
	{
		set_name(name);
		set_pop(pop);
		set_growth(growth);
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	public void set_pop(int pop)
	{
		this.pop = pop;
	}
	public void set_growth(double growth)
	{
		this.growth = growth;
	}
	public String get_name()
	{
		return name;
	}
	public int get_pop()
	{
		return pop;
	}
	public double get_growth()
	{
		return growth;
	}
	public String toString()
	{
		return "Taxonomy: " + name +" "+ pop+" " + growth;
	}
	public boolean endangered()
	{
		return(this.get_growth()< 0);
	}
	public boolean equals(Ch4Ex9 another)
	{
		return((this.get_name() == another.get_name()) && (this.get_growth()== another.get_growth()) && (this.get_pop()== another.get_pop()));
	}
	public void final_print()
	{
		Ch4Ex9 c=  new Ch4Ex9("blah", 100, -1.5);
		System.out.println("Is this species endangered: " +c.endangered());
		System.out.println("Species name: "+ c.get_name());
		System.out.println("Species population: "+ c.get_pop());
		System.out.println("Species growth: "+ c.get_growth());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch4Ex9 d = new Ch4Ex9();
		d.final_print();
		
	}

}
