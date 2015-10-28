package problem1;

import java.util.Scanner;

public class Pet {

	private String name;
	private int age;
	private double weight;
	private char scale;
	
	
	
	public String toString()
	{
		return("Name: "+ name +" Age:"+age+" years"+ "\nWeight: "+ weight + " pounds"+", Type of pet: "+scale);
	}
	public Pet(String initialName, int initialAge, double initialWeight, char initialScale)
	{
		name = initialName;
		if((initialAge < 0)||(initialWeight<0) || ((initialScale != 'C')&& (initialScale != 'D')))
		{
			System.out.println("Error: Negative age, weight, or invalid letter input");
			System.exit(0);
		}
		else
		{
			age = initialAge;
			weight = initialWeight;
			scale = initialScale;
		}
	}
	public void set(String newName, int newAge, double newWeight,char newScale)
	{
		name = newName;
		if((newAge<0)||(newWeight <0)||((newScale != 'C') && (newScale != 'D')))
		{
			System.out.println("Erro: Negative age, weight, or invalid character.");
			System.exit(0);
		}
		else
		{
			age = newAge;
			weight = newWeight;
			scale = newScale;
		}
	}
	public Pet(String initialName)
	{
		name = initialName;
		age =0;
		weight =0;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setScale(char newScale)
	{
		if(scale != 'C' && scale != 'D')
		{
			System.out.println("error: invalid scale");
			System.exit(0);
		}
		else
			scale = newScale;
	}
	public Pet(int initialAge)
	{
		name = "No name yet.";
		weight = 0;
		scale = 'C';
		if(initialAge< 0)
		{
			System.out.println("error: negative age");
			System.exit(0);
		}
		else
			age = initialAge;
	}
	public void setAge(int newAge)
	{
		if(newAge < 0)
		{
			System.out.println("Error: negative age");
			System.exit(0);
		}
		else
			age= newAge;
	}
	public Pet(double initialWeight)
	{
		name = "No name yet";
		age = 0;
		if(initialWeight < 0)
		{
			System.out.println("error negative weight");
			System.exit(0);
		}
		else
			weight = initialWeight;
	}
	public void setWeight(double newWeight)
	{
		if(newWeight <0)
		{
			System.out.println("Error: negative weight");
			System.exit(0);
		}
		else
			weight = newWeight;
	}
	public Pet()
	{
		name = "No name yet";
		age = 0;
		weight =0;
		scale = 'C';
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getWeight()
	{
		return weight;
	}
	public char getScale()
	{
		return scale;
	}
	
	public double acepromazine()
	{
		if(getScale() == 'C')
		return(getWeight()/2.2)*(.002/10);
		else
			return(getWeight()/2.2)*(.03/10);
	}
	
	public double carprofen()
	{
		if(getScale() == 'C')
		return(getWeight()/2.2)*(.25/12);
		else
			return(getWeight()/2.2)*(.5/12);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pet usersPet = new Pet("Jane doe");
System.out.println("My record on your pet are incomplete.");
System.out.println("Here is what they currently say: ");
System.out.println(usersPet);

Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter the pet's name: ");
String name = keyboard.nextLine();
System.out.println("Please enter the pet's age");
int age = keyboard.nextInt();
System.out.println("Please enter the pet's weight");
double weight = keyboard.nextDouble();
System.out.println("Please enter the type of animal as uppercase: 'D'/'C'");
String initialscale = keyboard.next();
char scale = initialscale.charAt(0);
usersPet.set(name, age, weight, scale);
System.out.println("My records now say: ");
System.out.println(usersPet);
System.out.println("The appropriate dosage for acepromazine for this" +usersPet.getScale()+" is: ");
System.out.println(usersPet.acepromazine());
System.out.println("The appropriate dosage of carprofen is: ");
System.out.println(usersPet.carprofen());

	}

}