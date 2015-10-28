package problems;

public class Duelist {

	private String name;
	private double accuracy;
	public boolean alive;
	private static int count=0;
	private int arronwins =0;
	private int bobwins=0;
	private int charliewins =0;
	
	public Duelist()
	{
		name = "no name yet";
		accuracy = 0;
		alive = true;
	}
	public Duelist(String name, double accuracy,boolean alive)
	{
		set_name(name);
		set_accuracy(accuracy);
		set_alive(alive);
	}
	public void set_alive(boolean alive)
	{
		this.alive = alive;
	}
	public boolean get_alive()
	{
		return alive;
	}
	public void set_name(String name)
	{
		this.name = name;
	}
	public void set_accuracy(double accuracy)
	{
		this.accuracy = accuracy;
	}
	public String get_name()
	{
		return name;
	}
	public double get_accuracy()
	{
		return accuracy;
	}
	public String toString()
	{
		return "Name: "+name+" Accuracy: "+ accuracy+" Alive?: "+alive;
	}
	public void set_count()
	{
		count = 0;
	}
	public void ShootAtTarget(Duelist target)
	{
		if((get_accuracy() == (1.0/3))&& get_alive() == true)
		{
			int chance = (int)(Math.random()*3)+1;
			if(chance == 1)
			{
				target.set_alive(false);
				//System.out.println("Target hit");
				count++;
			}
			
		}
		else if((get_accuracy() == (1.0/2))&& get_alive() == true)
		{
			int chance = (int)(Math.random()*2)+1;
			if(chance == 1)
			{
				target.set_alive(false);
				//System.out.println("Target hit");
				count++;
			}
			
		}
		else if(get_accuracy() == 1 && get_alive() == true)
		{
			target.set_alive(false);
			//System.out.println("Target hit");
			count++;
		}
		
			//System.out.println("Missed Target or Dead");
	}
	
	public void display()
	{
		System.out.println("Name: "+name+" Alive?: "+ alive);
	}
	public void final_print()
	{
		for(int i =0; i< 10000;i++)
		{
			set_count();
		Duelist a = new Duelist("Aaron",(1.0/3),true);
		Duelist b = new Duelist("Bob",(1.0/2),true);
		Duelist c = new Duelist("Charlie",1,true);
		while(count < 2)
		{
//			if(c.get_alive()==true)     Part1 Strat switch with part 2 for alternate percentages
//				a.ShootAtTarget(c);
//			else if(c.get_alive() == false)
//				a.ShootAtTarget(b);
//			else
//				continue;
			if(c.get_alive()==true)
				b.ShootAtTarget(c);
			else if(c.get_alive() == false)
				b.ShootAtTarget(a);
			else
				continue;		
			if(b.get_alive()== true)
				c.ShootAtTarget(b);
			else if(a.get_alive() == true)
				c.ShootAtTarget(a);
			else
				continue;
			if(c.get_alive()==true) // part 2 strat
				a.ShootAtTarget(c);
			else if(c.get_alive() == false)
				a.ShootAtTarget(b);
			else
				continue;
				
		}
		if(a.get_alive()== true)
			arronwins++;
		else if(b.get_alive() == true)
			bobwins++;
		else
			charliewins++;

		
	}
		System.out.println("Arron total wins = "+arronwins+"/10000" + " or "+(arronwins/10000.00)*100+"%");
		System.out.println("Bob total wins = "+bobwins+"/10000"+" or "+ (bobwins/10000.00)*100+"%");
		System.out.println("Charlie total wins = "+charliewins+"/10000"+" or "+ (charliewins/10000.00)*100+"%");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duelist d= new Duelist();
		d.final_print();
	}

}
