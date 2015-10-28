package problem1;

public class DeepDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<StockItem> originalList = new LinkedList<StockItem>();
		originalList.addToStart(new StockItem(" red dress", 1));
		originalList.addToStart(new StockItem("black dress", 2));
		
		LinkedList<StockItem> copyList = originalList.clone();
		if(originalList.equals(copyList))
			System.out.println("OK, Lists are equal.");
		
		System.out.println("Now we change copyList.");
		StockItem dataEntry = copyList.findData(new StockItem("red dress",1));
		dataEntry.setName("orange pants");
		
		System.out.println("originalList:");
		originalList.outputList();
		System.out.println("copyList:");
		copyList.outputList();
		
		System.out.println("Only one list is changed.");
		
	}

}
