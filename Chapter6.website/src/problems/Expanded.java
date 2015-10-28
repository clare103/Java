package problems;

public class Expanded {
	

		private int maxNumberElements;
		private double[] a;
		private int numberUsed;
		Expanded1 expanded;
		
		Expanded()
		{
			maxNumberElements =10;
			a = new double[maxNumberElements];
			numberUsed =0;
			expanded.a = new double[maxNumberElements];
		}
		
		Expanded(int arraySize)
		{
			if(arraySize <= 0)
			{
				System.out.println("Error Array size zero or negative. ");
				System.exit(0);
			}
			maxNumberElements = arraySize;
			a = new double[maxNumberElements];
			numberUsed =0;
		}
		Expanded(Expanded original)
		{
			if(original == null)
			{
				System.out.println("Fatal Error: aborting program.");
				System.exit(0);
			}
			maxNumberElements = original.maxNumberElements;
			numberUsed = original.numberUsed;
			a = new double[maxNumberElements];
			for(int i =0; i<numberUsed; i++)
				a[i] = original.a[i];
		}
		public void add(double newElement)
		{
			if(numberUsed >= maxNumberElements)
			{
				set_maxNumberElements(this.maxNumberElements + expanded.get_maxNumberElements());
				a = new double[getMaxCapacity()];
				for(int i =0; i <numberUsed; i++)
				{
					a[i] = expanded.a[i];
					a[numberUsed] = newElement;
					numberUsed++;
				}				

			}
			else
			{
				a[numberUsed]= newElement;
				numberUsed++;
			}
		}
		public double getElement(int index)
		{
			if(index <0 || index >= numberUsed)
			{
				System.out.println("Error: Illegal or unused index.");
				System.exit(0);
			}
			return a[index];
		}
		public void resetElement(int index, double newValue)
		{
			if(index < 0 || index >= maxNumberElements)
			{
				System.out.println("Error: Illegal index.");
				System.exit(0);
			}
			else if(index > numberUsed)
			{
				System.out.println("Error: Changing an index that is too large. ");
				System.exit(0);
			}
			else
				a[index] = newValue;
		}
		
		public void deleteLast()
		{
			if(empty())
			{
				System.out.println("Error: Deleting from an empty array.");
				System.exit(0);
			}
			else
				numberUsed--;
		}
		public void delete(int index)
		{
			if(index < 0 || index >= numberUsed)
			{
				System.out.println("Error: Illegal or unused index.");
				System.exit(0);
			}
			for(int i = index; i< numberUsed; i++)
				a[i] = a[i+1];
			numberUsed--;
		}
		public boolean empty()
		{
			return (numberUsed ==0);
		}
		public boolean full()
		{
			return (numberUsed == maxNumberElements);
		}
		public int getMaxCapacity()
		{
			return maxNumberElements;
		}
		public int getNumberOfElements()
		{
			return numberUsed;
		}
		public void set_numberUsed(int numberUsed)
		{
			this.numberUsed = numberUsed;
		}
		public void set_expanded(Expanded1 expanded)
		{
			this.expanded = expanded;
		}
		public Expanded1 get_expanded()
		{
			return expanded;
		}
		public void set_maxNumberElements(int maxNumberElements)
		{
			this.maxNumberElements = maxNumberElements;
		}
		public void display()
		{
			
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
