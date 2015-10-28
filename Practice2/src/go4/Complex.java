package go4;

public class Complex {

	public double real;
	public double imaginary;
	
	public Complex(double r, double i)
	{
		this.real = r;
		this.imaginary = i;
		
	}
	public Complex(double realPart)
	{
		this.real = realPart;
		this.imaginary = 0;
		
	}
	public Complex()
	{
		this.imaginary = 0;
		this.real = 0;
	}
	public boolean equals(Complex e)
	{
		if(this.real == e.real && this.imaginary == e.imaginary)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return this.real + "+" + this.imaginary +"i";
	}
	public static Complex add(Complex c1, Complex c2)
	{
		double real = c1.real + c2.real;
		double img = c1.imaginary + c2.imaginary;
		return new Complex(real, img);
	}
	public static Complex subtract(Complex c1, Complex c2)
	{
		double real = c1.real - c2.real;
		double img = c1.imaginary - c2.imaginary;
		return new Complex(real, img);
	}
	public static Complex multiply(Complex c1, Complex c2)
	{
		double r1 = c1.real;
		double r2 = c2.real;
		double i1 = c1.imaginary;
		double i2 = c2.imaginary;
		double r= r1 * r2 - i1 * i2;
		double i = i1*r2 + i2 * r1;
		return new Complex(r, i);
		
	}
	public Complex add(Complex c)
	{
		double real = this.real + c.real;
		double img = this.imaginary + c.imaginary;
		return new Complex(real, img);
	}
	public Complex subtract(Complex c)
	{
		double real = this.real - c.real;
		double img = this.imaginary - c.imaginary;
		return new Complex(real, img);
	}
	public Complex multiply(Complex c)
	{
		double r1 = this.real;
		double r2 = c.real;
		double i1 = this.imaginary;
		double i2 = c.imaginary;
		double r = r1*r2 - i1*i2;
		double i = r1*i2 + r2*i1;
		return new Complex(r, i);
	}
	public double get_Real()
	{
		return real;
	}
	public void set_Real(double real)
	{
		this.real = real;
	}
	public double get_Imaginary()
	{
		return imaginary;
	}
	public void set_Imaginary(double imaginary)
	{
		this.imaginary = imaginary;
	}
}