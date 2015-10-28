package go3;



	import java.util.Scanner;
	class rationalNumbers
	{
	    private int numerator;
	    private int denominator;
	    rationalNumbers()
	    {
	        numerator=0;
	        denominator=1;
	    }
	    rationalNumbers(int a,int b)
	    {
	        numerator=a;
	        if(b==0)
	        {
	            System.out.println("Div by 0 not possible, exiting...");
	            System.exit(1);
	        }
	        denominator=b;
	        this.normalization();
	    }
	    rationalNumbers(int a)
	    {
	        numerator=a;
	        denominator=1;
	    }
	    void normalization()
	    {
	        if(denominator<0)
	        {
	            numerator=-1*numerator;
	            denominator=-1*denominator;
	        }
	    }
	    public void setNumerator(int a)
	    {
	        numerator=a;
	        this.normalization();
	    }
	    public void setDenominator(int b)
	    {
	        denominator=b;
	        this.normalization();
	    }
	    public int getNumerator()
	    {
	        return numerator;
	    }
	    public int getDenominator()
	    {
	        return denominator;
	    }
	    public int equals(rationalNumbers a,rationalNumbers b)
	    {
	        if((a.numerator*b.denominator)==(a.denominator*b.numerator))return 0;
	        else if((a.numerator*b.denominator)<(a.denominator*b.numerator))return 1;
	        else return -1;
	    }
	    int lcm(int a,int b)
	    {
	        int i,g;
	        g=a>b?a:b;
	        for(i=g;i<=(a*b);i++)
	        {
	            if(i%a==0 && i%b==0)return i;
	        }
	        return (a*b);
	    }
	    public rationalNumbers add(rationalNumbers a,rationalNumbers b)
	    {
	        int t;
	        rationalNumbers s=new rationalNumbers();
	        t=lcm(a.denominator,b.denominator);
	        s.numerator=((t/a.denominator)*a.numerator)+((t/b.denominator)*b.numerator);
	        s.denominator=t;
	        return s;
	    }
	    public rationalNumbers sub(rationalNumbers a,rationalNumbers b)
	    {
	        int t;
	        rationalNumbers s=new rationalNumbers();
	        t=lcm(a.denominator,b.denominator);
	        s.numerator=((t/a.denominator)*a.numerator)-((t/b.denominator)*b.numerator);
	        s.denominator=t;
	        return s;
	    }
	    public rationalNumbers mul(rationalNumbers a,rationalNumbers b)
	    {
	        rationalNumbers s=new rationalNumbers();
	        s.numerator=a.numerator*b.numerator;
	        s.denominator=a.denominator*b.denominator;
	        return s;
	    }
	    public rationalNumbers div(rationalNumbers a,rationalNumbers b)
	    {
	        rationalNumbers s=new rationalNumbers();
	        s.numerator=a.numerator*b.denominator;
	        s.denominator=a.denominator*b.numerator;
	        return s;
	    }
	    public void reduce()
	    {
	        int a,i;
	        a=this.numerator<this.denominator?this.numerator:this.denominator;
	        for(i=a;i>=1;i--)
	        {
	            if(this.numerator%i==0 && this.denominator%i==0)
	            {
	                this.numerator=this.numerator/i;
	                this.denominator=this.denominator/i;
	            }
	        }
	    }
	    @Override
	    public String toString()
	    {
	        return "[ "+this.getNumerator()+"/"+this.getDenominator()+" ]";
	    }
	}

	class TestRationalNumbers
	{
	    public static void main(String args[])
	    {
	        Scanner s=new Scanner(System.in);
	        int a,b,c,d,t;
	        System.out.println("Enter the numerator of first number: ");
	        a=s.nextInt();
	        System.out.println("Enter the denominator of first number: ");
	        b=s.nextInt();
	        System.out.println("Enter the numerator of second number: ");
	        c=s.nextInt();
	        System.out.println("Enter the denominator of second number: ");
	        d=s.nextInt();
	        rationalNumbers r1=new rationalNumbers(a,b);
	        rationalNumbers r2=new rationalNumbers(c,d);
	        rationalNumbers r3=new rationalNumbers();
	        t=r3.equals(r1,r2);
	        if(t==0)System.out.println("Numbers are equal");
	        else System.out.println("Numbers are not equal");
	        r3=r3.add(r1,r2);
	        r3.reduce();
	        System.out.println(r1.toString()+" + "+r2.toString()+" = "+r3.toString());
	        r3=r3.sub(r1,r2);
	        r3.reduce();
	        System.out.println(r1.toString()+" - "+r2.toString()+" = "+r3.toString());
	        r3=r3.mul(r1,r2);
	        r3.reduce();
	        System.out.println(r1.toString()+" * "+r2.toString()+" = "+r3.toString());
	        r3=r3.div(r1,r2);
	        r3.reduce();
	        System.out.println(r1.toString()+" / "+r2.toString()+" = "+r3.toString());
	    }
	}
