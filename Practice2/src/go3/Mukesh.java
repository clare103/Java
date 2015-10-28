package go3;
import java.util.*;
public class Mukesh {
	
	
	public static void Input()
	{
	System.out.println("This game requests a number from the player.");
	System.out.println("The game then throws the die that number of times.");
	System.out.println("The game then displays the percentage difference between the number for each die value and the average.");
	System.out.println("Please enter the number of times that you would like the computer to throw the die.");
	}
	
	public static void Process()
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(true)
	{
	if(n>=1)
	{
	break;
	}
	System.out.println("Please enter the value greater than zero");
	n=s.nextInt();
	}
	float average=n/6;
	Random rand=new Random();
	int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;
	for(int i=0;i<n;i++)
	{
	int randomNumber=rand.nextInt(6)+1;
	if(randomNumber==1)
	{
		
		a1=a1+1;
	}
	else if(randomNumber==2)
	{
	a2=a2+1;
	}
	else if (randomNumber==3)
	{
	a3=a3+1;
	}
	else if (randomNumber==4)
	{
	a4=a4+1;
	}
	else if(randomNumber==5)
	{
		
	a5=a5+1;
	}
	else if (randomNumber==6)
	{
	
	a6=a6+1;
	}
	}
	Output(a1,a2,a3,a4,a5,a6,average);
	}
	public static void ComputeAndOutput(int a1,float average, int g)
	{	
		
	if(a1>average)	
	{
		
		
		System.out.println("Die number " +g+" landed "+a1+" times and is "+((a1-average)*100/average)+"% above the average.");
		
		
	}
	else if(a1 < average)
	{
		
	System.out.println("Die number " +g+" landed "+a1+" times and is "+((a1-average)*100/average)*(-1)+"% below the average.");
	
	
	}
	else
	{ 
		
	System.out.println("Die number "+g+" landed "+a1+" times and is equal to average");
		
	}
	
	
	}
	
		
	
	public static void Output(int a1,int a2,int a3,int a4,int a5,int a6,float average )
	{
	ComputeAndOutput(a1,average,1);
	ComputeAndOutput(a2,average,2);
	ComputeAndOutput(a3,average,3);
	ComputeAndOutput(a4,average,4);
	ComputeAndOutput(a5,average,5);
	ComputeAndOutput(a6,average,6);
	}
	public static void Play()
	{
	Input();
	Process();
	}
	public static void main(String[] args)
	{
	
	Play();
	}

	}
	