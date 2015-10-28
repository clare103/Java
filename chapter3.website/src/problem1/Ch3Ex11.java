package problem1;

public class Ch3Ex11 {
private int j,n,count=1;
private boolean used= true;
private int []list =new int[3];
public Ch3Ex11()
{
	
}
public void print()
{
	n=(int) (Math.random() * 30) +1;
	list[0]=n;
	for(count=1;count<3;count++)
	  {
		do
	    {
			used=false;
	     n=(int) (Math.random() * 30) +1;
	      for(j=0;j<count;j++)
	         if(n==list[j])
	              used=true;
	        }
		while(used);
	     list[count]=n;         
	    }
	System.out.print("The finalists are: ");
	for(j=0;j<3;j++)
	    System.out.print(list[j]+" ");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Ch3Ex11 c = new Ch3Ex11();
	c.print();
	}

}
