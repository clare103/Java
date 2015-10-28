package problems;


public class Complex {

	public double real;
	public double imaginary;
	public Complex2 complex;
		
	public Complex(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex(double realPart)
	{
		this.real=realPart;
		this.imaginary=0;
	}
	public Complex()
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
	public static Complex add(Complex c1,Complex c2)
	{
		double real=c1.real+c2.real;
		double img=c1.imaginary+c2.imaginary;
		return new Complex(real, img);
	}
	public static Complex subtract(Complex c1,Complex c2)
	{
		double real=c1.real-c2.real;
		double img=c1.imaginary-c2.imaginary;
		return new Complex(real, img);
	}
	public static Complex multiply(Complex c1,Complex c2)
	{
		
		double real=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
		double img=(c1.real*c2.imaginary)+(c2.real*c1.imaginary);
		return new Complex(real, img);
	}
		public Complex add(Complex c)
		{
		double real=this.real+c.real;
		double img=this.imaginary+c.imaginary;
		return new Complex(real, img);
		}
		public Complex subtract(Complex c)
		{
		double real=this.real-c.real;
		double img=this.imaginary-c.imaginary;
		return new Complex(real, img);
		}
		public Complex multiply(Complex c)
		{
		double r1=this.real;
		double r2=c.real;
		double i1=this.imaginary;
		double i2=c.imaginary;
		double real=r1*r2-i1*i2;
		double img=r1*i2+r2*i1;
		return new Complex(real, img);
		}
		
		public void add(Complex2 complex)
		{
			double real=this.real+complex.real;
			double img=this.imaginary+complex.imaginary;
			set_real(real);
			set_imaginary(img);
		}
		public void minus(Complex2 complex)
		{
			double real=this.real-complex.real;
			double img=this.imaginary-complex.imaginary;
			set_real(real);
			set_imaginary(img);
		}
		public void multiply(Complex2 complex)
		{
			double r1=this.real;
			double r2=complex.real;
			double i1=this.imaginary;
			double i2=complex.imaginary;
			double real=r1*r2-i1*i2;
			double img=r1*i2+r2*i1;
			set_real(real);
			set_imaginary(img);
		}
		
		public double get_real() 
		{
		return real;
		}

		public void set_real(double real) 
		{
		this.real = real;
		}

		public double get_imaginary() 
		{
		return imaginary;
		}

		public void set_imaginary(double imaginary) 
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
