package go4;

import go4.Complex;;

public class Complex2 {

public double real;
public double imaginary;
public Complex2(double r,double i)
{
this.real=r;
this.imaginary=i;
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
public boolean equals(Complex2 e)
{
if(this.real==e.real && this.imaginary==e.imaginary)
{
return true;
}
else
{
return false;
}
}
public String toString()
{
return this.real+" + "+this.imaginary+"i";
}
public static Complex2 add(Complex2 c1,Complex2 c2)
{
double real=c1.real+c2.real;
double img=c1.imaginary+c2.imaginary;
return new Complex2(real, img);
}
public static Complex2 subtract(Complex2 c1,Complex2 c2)
{
double real=c1.real-c2.real;
double img=c1.imaginary-c2.imaginary;
return new Complex2(real, img);
}
public static Complex2 multiply(Complex2 c1,Complex2 c2)
{
double r1=c1.real;
double r2=c2.real;
double i1=c1.imaginary;
double i2=c2.imaginary;
double r=r1*r2-i1*i2;
double i=r1*i2+r2*i1;
return new Complex2(r, i);
}
public void add(Complex2 c)
{
double real=this.real+c.real;
double img=this.imaginary+c.imaginary;
c = new Complex2(real, img);
}
public void subtract(Complex2 c)
{
double real=this.real-c.real;
double img=this.imaginary-c.imaginary;
c = new Complex2(real, img);
}
public void multiply(Complex2 c)
{
double r1=this.real;
double r2=c.real;
double i1=this.imaginary;
double i2=c.imaginary;
double r=r1*r2-i1*i2;
double i=r1*i2+r2*i1;
c = new Complex2(r, i);
}

public double getReal() {
return real;
}

public void setReal(double real) {
this.real = real;
}

public double getImaginary() {
return imaginary;
}

public void setImaginary(double imaginary) {
this.imaginary = imaginary;
}

public static void main(String[] a)
{
Complex c1=new Complex(5,4);
Complex c2=new Complex(6,10);
System.out.println("Complex Nos :");
System.out.println(c1);
System.out.println(c2);
System.out.println("Addition using static " +Complex.add(c1, c2));
System.out.println("Subtraction using static " +Complex.subtract(c1, c2));
System.out.println("Multiplication using static"  +Complex.multiply(c1, c2));
System.out.println("Addition using object1.method(object2)"+c1.add(c2));
System.out.println("Subtraction using object1.method(object2)"+c1.subtract(c2));
System.out.println("Multiplication using object1.method(object2)"+c1.multiply(c2));
Complex2 c3=new Complex2(1,4);
Complex2 c4=new Complex2(9,10);
System.out.println("Complex Nos :");
System.out.println(c3);
System.out.println(c4);
c3.add(c4);
System.out.println("Addition using object1.method(object2)"+c3);
Complex2 c5=new Complex2(8,4);
Complex2 c6=new Complex2(9,1);
System.out.println("Complex Nos :");
System.out.println(c5);
System.out.println(c6);
c5.subtract(c6);
System.out.println("Subtraction using object1.method(object2)"+c5);
Complex2 c7=new Complex2(8,4);
Complex2 c8=new Complex2(9,1);
System.out.println("Complex Nos :");
System.out.println(c7);
System.out.println(c8);
c7.subtract(c8);
System.out.println("Multiplication using object1.method(object2)"+c7);
}
}