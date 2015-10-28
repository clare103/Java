package chapter11;

public class stars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int n = -5; n < 2; n++)
	System.out.println("3 to the power "+ n
			+ " is "+ power(3, n));

	}

	public static void stars(int n)
	{
		System.out.println('*');
		if(n>1)
			stars(n-1);
	}
	public static void backward(int n)
	{
		if(n < 10)
		{
			System.out.print(n);
		}
		else
		{
			System.out.print(n%10);
			backward(n/10);
		}
	}
	public static void writeUp(int n)
	{
		if(n >= 1)
		{
			writeUp(n-1);
			System.out.print(n + " ");
		}
	}
	public static void writeDown(int n)
	{
		if(n >= 1)
		{
			System.out.print(n+" ");
			writeDown(n-1);
		}
	}
	public static void cheers(int n)
	{
		while(n > 1)
		{
			System.out.print("Hip ");
			n--;
		}
		System.out.println("hurray");
	}
	public static void stars1(int n)
	{
		while(n>0)
		{
			System.out.print('*');
			n--;
		}		
	}
	public static void backwards(int n)
	{
		while(n >= 10)
		{
			System.out.println(n%10);
			n = n/10;
		}
		System.out.print(n);
	}
	
	public static double power(int x, int n)
	{
		if(n < 0 && x == 0)
		{
			System.out.println("Illegal argument to power.");
			System.exit(0);
		}
		if( n< 0)
			return (1/power(x, -n));
		else if (n > 0)
			return( power(x, n-1)*x);
		else
			return(1.0);
	}
	public static int squares(int n)
	{
		if(n < 1)
			return 1;
		else
			return(squares(n-1)+ n*n);
	}
}

