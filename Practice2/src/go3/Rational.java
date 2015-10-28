package go3;
import java.util.*;
public class Rational {

private int num;
private int denom;

	public Rational(int num, int denom)
	{
		this.num = num;
		this.denom = denom;
	}
	public Rational()
	{
		num = 0;
		denom=1;
	}
	public Rational(int wholeNumber)
	{
		num = wholeNumber;
		denom =1;
	}
	public boolean equals(Rational r2)
	{
		boolean flag = false;
		if(this == r2)
		{
			flag = true;
		}
		else if( r2 instanceof Rational)
		{
			if(this.num == r2.num && this.denom == r2.denom)
			{
				flag = true;
			}
		}
		else
		{
			flag = false;		
		}
		return flag;
	}
	public void set_Num(int num)
	{
		this.num = num;
	}
	public int get_Num()
	{
		return num;
	}
	public void set_Denom(int denom)
	{
		this.denom = denom;
	}
	public int get_Denom()
	{
		return denom;
	}
	public static Rational set_add(Rational r1, Rational r2)
	{
		if(r1.equals(r2))
		{
			Rational r3 = new Rational((r1.get_Num())*2, r1.get_Denom());
			return r3;
		}
		else
		{
			Rational r3 = new Rational();
			r3.num = ((r1.get_Num()*r2.get_Denom())+ (r2.get_Num() + r1.get_Denom()));
			r3.denom = (r1.get_Denom()*r2.get_Denom());
			return r3;
		}
	}
	
	public static Rational subtract(Rational r1, Rational r2)
	{
		if(r1.equals(r2))
		{
			Rational r3 = new Rational();
			return r3;
		}
		else
		{
			Rational r3 = new Rational();
			r3.num = ((r1.get_Num()*r2.get_Denom())-(r2.get_Num()+r1.get_Denom()));
			r3.denom = (r1.get_Denom()*r2.get_Denom());
			return r3;
		}
	}
	public static Rational multiply(Rational r1, Rational r2)
	{
		Rational r3 = new Rational();
		r3.num = (r1.get_Num()* r2.get_Num());
		r3.denom = (r1.get_Denom()* r2.get_Denom());
		return r3;
	}
	public static Rational divide(Rational r1, Rational r2)
	{
		Rational r3 = new Rational();
		r3.num = (r1.get_Num()* r2.get_Denom());
		r3.denom = (r1.get_Denom() * r2.get_Num());
		return r3;
	}
	
	public static Rational normalizeSign(Rational r1)
	{
		if(r1.num > 0 && r1.denom <0)
		{
			r1.num = -(r1.get_Num());
			r1.denom = Math.abs(r1.get_Denom());
		}
		else if(r1.num <0 && r1.denom<0)
		{
			r1.num = Math.abs(r1.get_Num());
			r1.denom = Math.abs(r1.get_Denom());
		}
		return r1;
	}
	public String toString()
	{
		return (num + "/"+ denom);
	}
//	public void reduce()
//	{
//		int a,i;
//		a = this.num<this.denom?this.num:this.denom;
//		for(i = a; i>1; i--)
//		{
//			if(this.num%i==0 && this.denom%i==0)
//			{
//				this.num = this.num/i;
//				this.denom = this.denom/i;
//			}
//		}
//	}
//	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num, denom, wholeNumber;
Scanner scan = new Scanner(System.in);
//------------------------------
// Two argument constructor test
//------------------------------
System.out.print("Enter numerator: ");
num = scan.nextInt();

System.out.print("Enter denominator: ");
denom = scan.nextInt();

Rational r1 = new Rational(num, denom);

//--------------------------------------------------
// getNumerator() and getDenominator() method tests
//--------------------------------------------------
System.out.println("The numerator you entered was: " + r1.get_Num());
System.out.println("The denominator you entered was: " + r1.get_Denom());
System.out.println();

//--------------------------------------------------
// setNumerator() and setDenominator() method tests
//--------------------------------------------------
System.out.print("Enter a new numerator: ");
num = scan.nextInt();

System.out.print("Enter a new denominator: ");
denom = scan.nextInt();

r1.set_Num(num);
r1.set_Denom(denom);

System.out.println("The new numerator you entered was: " + r1.get_Num());
System.out.println("The new denominator you entered was: " + r1.get_Denom());
System.out.println();

//------------------------------
// One argument constructor test
//------------------------------
System.out.print("Enter a whole number: ");
wholeNumber = scan.nextInt();
Rational r2 = new Rational(wholeNumber);

//------------------------------
// No argument constructor test
//------------------------------
Rational r3 = new Rational();

//-----------------------------
// normalizeSign() method test
//-----------------------------

Rational.normalizeSign(r1);

//------------------------------
// .equals() method test
//------------------------------
if(r1.equals(r2))
{
    System.out.println(r1 + " equals " + r2);
}
else
{
    System.out.println(r1 + " does not equal " + r2);
}

System.out.println();

//------------------------------
// .add() method test
//------------------------------
System.out.println("Time to do some math...");
System.out.print("Enter the first numerator: ");
num = scan.nextInt();
System.out.print("Enter the first denominator: ");
denom = scan.nextInt();
r1.set_Num(num);
r1.set_Denom(denom);
Rational.normalizeSign(r1);

System.out.print("Enter the second numerator: ");
num = scan.nextInt();
System.out.print("Enter the second denominator: ");
denom = scan.nextInt();
r2.set_Num(num);
r2.set_Denom(denom);
Rational.normalizeSign(r2);

r3 = Rational.set_add(r1, r2);
System.out.println(r1 + " plus " + r2 + " equals " + r3);

//------------------------------
// .subtract() method test
//------------------------------
r3 = Rational.subtract(r1, r2);
System.out.println(r1 + " minus " + r2 + " equals " + r3);
//------------------------------
// .multiply() method test
//------------------------------
r3 = Rational.multiply(r1, r2);
System.out.println(r1 + " times " + r2 + " equals " + r3);
//------------------------------
// .divide() method test
//------------------------------
r3 = Rational.divide(r1, r2);
System.out.println(r1 + " divided by " + r2 + " equals " + r3);
}
}
	
