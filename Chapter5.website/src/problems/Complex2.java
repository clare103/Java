package problems;

public class Complex2 {
	public double real;
	public double imaginary;
	
	public Complex2(Complex2 complex)
	{
		this.real = complex.real;
		this.imaginary = complex.imaginary;
	}
	
	public Complex2(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex2(double realPart)
	{
		this.real=realPart;
		this.imaginary=0;
	}
	public Complex2()
	{
		this.real=0;
		this.imaginary=0;
	}
	public boolean equals(Complex otherComplex)
	{
		return(this.real==otherComplex.real && this.imaginary==otherComplex.imaginary);
	}
	public String toString()
	{
		return real+" + "+imaginary+"i";
	}
	public double getReal() 
	{
	return real;
	}

	public void setReal(double real) 
	{
	this.real = real;
	}

	public double getImaginary() 
	{
	return imaginary;
	}

	public void setImaginary(double imaginary) 
	{
	this.imaginary = imaginary;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
