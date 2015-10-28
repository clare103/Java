package classesII;

public class Competition {
public String compName;
public String winners;
public String runnerup;
public int year;


public Competition(String compName, String winners, String runnerup, int year)
{
	set_compName(compName);
	set_winners(winners);
	set_runnerup(runnerup);
	set_year(year);
}
public void set_compName(String compName)
{
	this.compName = compName;
}
public void set_winners(String winners)
{
	this.winners = winners;
}
public void set_runnerup(String runnerup)
{
	this.runnerup = runnerup;
}
public void set_year(int year)
{
	this.year = year;
}
public String get_compName()
{
	return compName;
}
public String get_winners()
{
	return winners;
}
public String get_runnerup()
{
	return runnerup;
}
public int get_year()
{
	return year;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Team t1 = new Team();
Competition c1 = new Competition("Competition 1","Winner","Runnerup", 1989);
Competition c2 = new Competition("Competition 2","Winner","Runnerup", 1990);
t1.set_Name("Ballers");
t1.set_MemName("Jerry","Ross","Heraldo","Jimmy");
t1.set_Competitions(c1, c2);
t1.showNames();
System.out.println();
t1.infoCompetitions();

	}

}
