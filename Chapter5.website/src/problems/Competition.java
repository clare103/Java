package problems;


public class Competition {
	
	String comp_name, winners, runner_up;
	int year;

	public Competition()
	{
		comp_name = "no name yet";
		winners = "no name yet";
		runner_up = "no name yet";
		year =0;
	}

	public Competition(Competition competition)
	{
		comp_name = get_comp_name();
		winners = get_winners();
		runner_up = get_runner_up();
		year = get_year();
	}
	public Competition(String comp_name, String winners, String runner_up, int year)
	{
		set_comp_name(comp_name);
		set_winners(winners);
		set_runner_up(runner_up);
		set_year(year);
	}
	
	public void set_comp_name(String comp_name)
	{
		this.comp_name = comp_name; 
	}
	public void set_winners(String winners)
	{
		this.winners = winners;
	}
	public void set_runner_up(String runner_up)
	{
		this.runner_up = runner_up;
	}
	public void set_year(int year)
	{
		this.year = year;
	}
	public String get_comp_name()
	{
		return comp_name;
	}
	public String get_winners()
	{
		return winners;
	}
	public String get_runner_up()
	{
		return runner_up;
	}
	public int get_year()
	{
		return year;
	}
	public String toString()
	{
		return "Competition name: "+get_comp_name()+" Winners: "+get_winners()+" Runners-up: "+ get_runner_up()+" Year: "+get_year();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
