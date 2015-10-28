package practice;

import java.util.Scanner;

public class Pet {

	private String name;
	private int age;
	private double weight;
	
	public String toString()
	{
		return("Name: "+ name +" Age:"+age+" years"+ "\nWeight: "+ weight + " pounds");
	}
	public Pet(String initialName, int initialAge, double initialWeight)
	{
		name = initialName;
		if((initialAge < 0)||(initialWeight<0))
		{
			System.out.println("Error: Negative age or weight");
			System.exit(0);
		}
		else
		{
			age = initialAge;
			weight = initialWeight;
		}
	}
	public void set(String newName, int newAge, double newWeight)
	{
		name = newName;
		if((newAge<0)||(newWeight <0))
		{
			System.out.println("Erro: Negative age or weight.");
			System.exit(0);
		}
		else
		{
			age = newAge;
			weight = newWeight;
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
	public Pet(int initialAge)
	{
		name = "No name yet.";
		weight = 0;
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
usersPet.set(name, age, weight);
System.out.println("My records now say: ");
System.out.println(usersPet);
	}

}