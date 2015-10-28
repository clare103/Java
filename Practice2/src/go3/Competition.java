package go3;

public class Competition {
private String name;
private String team1;
private String team2;
private int year;

public Competition()
{
	this.name = "";
	this.team1 ="";
	this.team2 = "";
	this.year = 0;
}

public Competition(String name, String team1, String team2, int year)
{
	this.name = name;
	this.team1 = team1;
	this.team2 = team2;
	this.year = year;
}
public void setName(String name)
{
	this.name = name;
}
public void setTeam1(String name)
{
	this.team1 = name;
}
public void setTeam2(String name)
{
	this.team2 = name;
}
public String getName()
{
	return this.name;
}
public String getTeam1()
{
	return this.team1;
}
public String getTeam2()
{
	return this.team2;
}
public int getYear()
{
	return this.year;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team t1 = new Team();
Competition c1 = new Competition("C1", "Team1", "Team2", 96);
Competition c2 = new Competition("C2", "Team3", "Team4", 96);

t1.setName("Team NWA");
t1.setTeamMemNames("ODB", "Dre", "ICE", "Snoop");
t1.setCompetitions(c1, c2);

t1.showTeamers();
System.out.println();
t1.infoCompetitions();
	}

}
