package problems;

public class Team {
	
	String teamName;
	String name1, name2, name3, name4;
	Competition competition1, competition2;
	
	public Team()
	{
		teamName= "none yet";
		name1 = "none yet";
		name2 = "none yet";
		name3 = "none yet";
		name4 = "none yet";
		competition1 = null;
		competition2 = null;
	}
	public Team(Team team)
	{
		if(team !=null)
		{
		this.teamName = team.teamName;
		this.name1 = team.name1;
		this.name2 = team.name2;
		this.name3 = team.name3;
		this.name4 = team.name4;
		this.competition1 = new Competition(team.competition1);
		this.competition2 = new Competition(team.competition2);
		}
		else
		{
			System.out.println("error");
			System.exit(0);
		}	
	}
	public Team(String teamName, String name1, String name2, String name3, String name4,Competition competition1, Competition competition2)
	{
		set_teamName(teamName);
		set_name1(name1);
		set_name2(name2);
		set_name3(name3);
		set_name4(name4);
		set_competition(competition1,competition2);
	}
	public void set_teamName(String teamName)
	{
		this.teamName = teamName;
	}
	public void set_name1(String name1)
	{
		this.name1 = name1;
	}
	public void set_name2(String name2)
	{
		this.name2 = name2;
	}
	public void set_name3(String name3)
	{
		this.name3 = name3;
	}
	public void set_name4(String name4)
	{
		this.name4 = name4;
	}
	public String get_teamName()
	{
		return teamName;
	}
	public String get_name1()
	{
		return name1;
	}
	public String get_name2()
	{
		return name2;
	}
	public String get_name3()
	{
		return name3;
	}
	public String get_name4()
	{
		return name4;
	}
	public void set_competition(Competition competition1,Competition competition2)	
	{
		if (competition1 == null || competition2 == null)
		{
			System.out.println("Null values inserted.Error");
			System.exit(0);
		}
		else
		{
		this.competition1 = competition1;
		this.competition2 = competition2;
		}
	}
	
	
	public Competition get_competition1()
	{
		return competition1;
	}
	public Competition get_competition2()
	{
		return competition2;
	}
	public String toString()
	{
		return "Team name: "+teamName+ "\nName 1: "+name1+"\nName 2: "+name2+ "\nName 3: "+name3+"\nName 4: "+name4+ 
				"\n\nCompetition 1: "+get_competition1()+
				"\n\nCompetition 2: "+get_competition2();
	}
	
	public void final_print()
	{
		Team b = new Team("The Legends","Ross","Scott","Viktor","Josh",
				new Competition("Best Djs Awards: ","The ballers" ,"The legends",1989),
				new Competition("Best soccer players awards: ", "The legends","the ballers",1990));
		Team f = new Team(b);
		//f.set_competition(competition1, competition2);
		f.set_name1("Ross");
		f.set_name2("blah");
		f.set_teamName("ballerist");
		f.set_name3("blah");
		f.set_name4("blah");
		b.competition1.set_comp_name("hehe");
		b.competition1.set_runner_up("");
		b.competition1.set_winners("yay");
		b.competition1.set_year(1000);
		b.competition2.set_comp_name("blah");
		b.competition2.set_runner_up("blah");
		b.competition2.set_winners("yay");
		b.competition2.set_year(2000);
		
		f.competition1.set_comp_name("blah");
		f.competition1.set_runner_up("blah");
		f.competition1.set_winners("yay");
		f.competition1.set_year(2000);
		f.competition2.set_comp_name("blah");
		f.competition2.set_runner_up("blah");
		f.competition2.set_winners("yay");
		f.competition2.set_year(2000);
		
		System.out.println(b);
		System.out.println(f);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team c = new Team();
c.final_print();
	}

}
