package classesII;

public class Team {
private String teamName;
private String[] MemName;
private Competition[] competitions;

public Team()
{
	this.teamName = "";
	this.MemName = new String[4];
	this.competitions = new Competition[2];
}
public Team(Team team)
{
	this.teamName = team.teamName;
	this.MemName = team.MemName;
	this.competitions = team.competitions;
	
}
public void set_Name(String name)
{
	this.teamName = name;
}
public void set_MemName(String name1, String name2, String name3, String name4)
{
	this.MemName[0] = name1;
	this.MemName[1] = name2;
	this.MemName[2] = name3;
	this.MemName[3] = name4;
}
public void set_Competitions(Competition competition1, Competition competition2)
{
	this.competitions[0] = competition1;
	this.competitions[1] = competition2;
}
public String get_Name()
{
	return this.teamName;
}
public String[] get_AllNames()
{
	return this.MemName;
}
public String get_MemNames(int index)//at specified index
{
	if(index >=0 && index <= 3)
		return this.MemName[index];
	else
		return "none";
}
public Competition[] get_CompetitionNames(int index)
{
	if(index >=0 && index <= 1)
		return this.competitions;
	else
		return null;
}
public void showNames()
{
	System.out.printf("The team members names are:%s,%s,%s,%s\n",
			this.MemName[0],
			this.MemName[1],
			this.MemName[2],
			this.MemName[3]);
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
		this.competitions[0].get_compName(),
		this.competitions[0].get_year(),
		this.competitions[0].get_winners(),
		this.competitions[0].get_runnerup(),
		this.competitions[1].get_compName(),
		this.competitions[1].get_year(),
		this.competitions[1].get_winners(),
		this.competitions[1].get_runnerup());
}
}


	