package go;

public class BeerSong {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]=new String[8];
		String s2[] = new String[10];
		String s0[]= new String[10];
		String s3[]= new String[8];
		String s4[]= new String[10];
		s0[0]="Ten";
		s0[1]="Eleven";
		s0[2]="Twelve";
		s0[3]="Thirteen";
		s0[4]="Fourteen";
		s0[5]="Fifteen";
		s0[6]="Sixteen";
		s0[7]="Seventeen";
		s0[8]="Eighteen";
		s0[9]="Nineteen";
		
		s1[0]="Twenty-";
		s1[1]="Thirty-";
		s1[2]="Fourty-";
		s1[3]="Fifty-";
		s1[4]="Sixty-";
		s1[5]="Seventy-";
		s1[6]="Eighty-";
		s1[7]="Ninety-";
		
		s2[0]="";
		s2[1]="one";
		s2[2]="two";
		s2[3]="three";
		s2[4]="four";
		s2[5]="five";
		s2[6]="six";
		s2[7]="seven";
		s2[8]="eight";
		s2[9]="nine";
		
		s3[0]="Twenty";
		s3[1]="Thirty";
		s3[2]="Fourty";
		s3[3]="Fifty";
		s3[4]="Sixty";
		s3[5]="Seventy";
		s3[6]="Eighty";
		s3[7]="Ninety";
		
		s4[0]="";
		s4[1]="One";
		s4[2]="Two";
		s4[3]="Three";
		s4[4]="Four";
		s4[5]="Five";
		s4[6]="Six";
		s4[7]="Seven";
		s4[8]="Eight";
		s4[9]="Nine";

		

	for(int c=0; c<s1.length;c++)
	{
		for(int k=0; k<s2.length;k++)		
		{	
			if(k!=9)
			{
			System.out.println(s1[s1.length-1-c]+""+s2[s2.length-1-k]+" bottles of beer on the wall,");
			System.out.println(s1[s1.length-1-c]+""+s2[s2.length-1-k]+" bottles of beer,");
			System.out.println("Take one down, pass it around,");
				if(k!=8)
				{
					System.out.println(s1[s1.length-1-c]+""+ s2[s2.length-2-k]+" bottles of beer on the wall.");
					System.out.println("-----------");
				}
				else
				{
					System.out.println(s3[s3.length-1-c]+" bottles of beer on the wall.");
					System.out.println("-----------");		
				}
			}
			else
			{
				if(c!=7)
				{
				System.out.println(s3[s3.length-1-c]+" bottles of beer on the wall,");
				System.out.println(s3[s3.length-1-c]+" bottles of beer,");
				System.out.println("Take one down, pass it around,");
					if(k!=9)
				System.out.println(s1[s1.length-1-c]+s2[s2.length-2-k]+" bottles of beer on the wall.");
					else
				System.out.println(s1[s1.length-2-c]+s2[s2.length+8-k]+" bottles of beer.");
				}
				else
				{
					System.out.println(s3[s3.length-1-c]+" bottles of beer on the wall,");
					System.out.println(s3[s3.length-1-c]+" bottles of beer,");
					System.out.println("Take one down, pass it around,");
					System.out.println(s0[9]+" bottles of beer on the wall.");
				}
			}
				
			
		}

System.out.println("------------");
	}

for(int c=0; c<s0.length;c++)
{
	if(c!=9)
	{
System.out.println(s0[s0.length-1-c]+" bottles of beer on the wall,");
System.out.println(s0[s0.length-1-c]+" bottles of beer,");
System.out.println("Take one down, pass it around,");
System.out.println(s0[s0.length-2-c]+" bottles of beer on the wall.");
System.out.println("------------");
	}
	else
	{
System.out.println(s0[s0.length-1-c]+" bottles of beer on the wall,");
System.out.println(s0[s0.length-1-c]+" bottles of beer,");
System.out.println("Take one down, pass it around,");
System.out.println("Nine bottles of beer on the wall.");
System.out.println("------------");
	}
}
for(int c=0; c<s4.length-2;c++)
{	
		System.out.println(s4[s4.length-1-c]+" bottles of beer on the wall,");
		System.out.println(s4[s4.length-1-c]+" bottles of beer,");
		System.out.println("Take one down, pass it around");
		System.out.println(s4[s4.length-2-c]+" bottles of beer on the wall.");
		System.out.println("-------------");
}
		System.out.println("One bottle of beer on the wall,\nOne bottle of beer,\nTake one down, pass it around,\nZero bottles of beer on the wall.\n-----------");
		System.out.println("Zero bottles of beer are left.\n You're drunk, have someone drive you home.\n");

}	

	}


