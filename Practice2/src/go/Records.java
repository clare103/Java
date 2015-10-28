package go;

public class Records {
	private String name;
	private double population;
	private double growth;
	public boolean endangered;
	
	public Records(String name, double population, double growth)
	{
		this.name = name;
		this.population = population;
		this.growth = growth;
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	public void set_population(double population)
	{
		this.population = population;
	}
	public void set_growth(double growth)
	{
		this.growth = growth;
	}
	public String get_name()
	{
		return name;
	}
	public double get_population()
	{
		return population;
	}
	public double get_growth()
	{
		return growth*100;
	}
	public boolean endangered()
	{
		if(get_growth() < 0)
			return true;
		else
			return false;	
	}
	public void display()
	{
		System.out.println("Species name: "+ get_name()+"\nPopulation size: "+get_population()+"\nGrowth rate: "+ get_growth()+"%");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Records r = new Records("Ross",1,50);
r.set_growth(.5);
r.display();
System.out.println("Endangered or not?(True for endangered, False for not.)= "+ r.endangered());
	}

}
