package practice;

public class InvocationCounter {

	private static int numberOfInvocations = 0;
	
	public void demoMethod()
	{
		numberOfInvocations++;
	}
	public void outPutCount()
	{
		numberOfInvocations++;
		System.out.println("Number of invocations so far = "+ numberOfInvocations);
	}
	public static int numberSoFar()
	{
		numberOfInvocations++;
		return numberOfInvocations;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		InvocationCounter object1 = new InvocationCounter();
		for(i = 1; i<=5; i++)
			object1.demoMethod();
		object1.outPutCount();
		
		InvocationCounter object2 = new InvocationCounter();
		for(i =1; i<= 5; i++)
		{
			object2.demoMethod();
			object2.outPutCount();
		}
		System.out.println("Totalnumber of invocations  = "+ numberSoFar());
		
	}

}
