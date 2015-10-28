package go;

public class HotDogStand {
int standId;//instance variable for hot dog stand's ID
int noHDS;//instance var for the number of hot dogs sold that day
static int totalNO;//static variable that tracks the total number of hotdogs sold by all hotdog stands

public HotDogStand(int standId,int noHDS)//constructor that initializes both instance variables
{
	super();//super constructor
	this.standId = standId;//refers to this stand id
	this.noHDS = noHDS;// refers to this stands number of hot dogs sold
}
public int getNoHDS()//accessing(accessor method) the constructor for number of hot dogs sold
{
	return noHDS;
}
public static int totalNumberSold()//(accessor)method that returns the total number of hot dogs sold
{
	return totalNO + 60;
}
public void setNoHDS(int noHDS)//(mutator) method 
{
	this.noHDS = noHDS;
}
public void justSold()//(mutator)method invoked everytime the stand sells a hotdog
{
	totalNO++;
	this.noHDS++;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HotDogStand h1= new HotDogStand(1,10);//instantiating the values for hot dog stand 1 with 10 hot dogs
HotDogStand h2= new HotDogStand(2,20);//same for stand 2
HotDogStand h3= new HotDogStand(3,30);// same for stand 3
h1.justSold();//calling the "justSold" mutator method to mutate or change the value of the amount of hot dogs sold by stand 1
h2.justSold();
h3.justSold();
System.out.println("Hot dogs sold by stand.1: "+ h1.getNoHDS());
System.out.println("Hot dogs sold by stand.2: "+ h2.getNoHDS());
System.out.println("Hot dogs sold by stand.3: "+ h3.getNoHDS());
System.out.println("Total hot dogs sold by all stands: "+ totalNumberSold());
	}

}
