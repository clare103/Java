package go3;

public class Team {
private String teamName;
private String[] teamMemNames;
private Competition[] competitions;


public Team()
{
	this.teamName="";
	this.teamMemNames = new String[4];
	this.competitions = new Competition[2];
}
public Team(Team team)
{
	this.teamName = team.teamName;
	this.teamMemNames = team.teamMemNames;
	this.competitions = team.competitions;
}
public void setName(String name)
{
	this.teamName = name;
}
public void setTeamMemNames(String name1, String name2, String name3, String name4)
{
	this.teamMemNames[0] = name1;
	this.teamMemNames[1] = name2;
	this.teamMemNames[2] = name3;
	this.teamMemNames[3] = name4;
}
public void setCompetitions(Competition competition1, Competition competition2)
{
	this.competitions[0] = competition1;
	this.competitions[1] = competition2;
}
public String getName()
{
	return this.teamName;
}
public String[] getAllNames()
{
	return this.teamMemNames;
}
public String getTeamMemName(int index)
{
	if(index >=0 && index <=3)
		return this.teamMemNames[index];
	
	return "none";
}
public Competition getCompetition(int index)
{
	if(index >=0 && index<=1)
		return this.competitions[index];
	
	return null;
}
public void showTeamers()
{
	System.out.printf("Names of members of this team: %s,%s,%s,%s\n",
			this.teamMemNames[0],
			this.teamMemNames[1],
			this.teamMemNames[2],
			this.teamMemNames[3]);
}
public void infoCompetitions()
{
	System.out.printf("Informations of last two competitions this team has joined: \n" 
+"The name of the competition 1: %s\n"
+"The year of the competition 1: %d\n"
+"THe name of the winning team of competition 1: %s\n"
+"The name of the runned-up team of competition 1: %s\n"
+"The name of the competition 2: %s\n"
+"The year of the competition 2: %d\n"
+"THe name of the winning team of competition 2: %s\n"
+"The name of the runned-up team of competition 2: %s\n",
		this.competitions[0].getName(),
		this.competitions[0].getYear(),
		this.competitions[0].getTeam1(),
		this.competitions[0].getTeam2(),
		this.competitions[1].getName(),
		this.competitions[1].getYear(),
		this.competitions[1].getTeam1(),
		this.competitions[1].getTeam2());
}

}
