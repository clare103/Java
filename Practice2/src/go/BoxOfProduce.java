package go;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BoxOfProduce {


	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		List<String> my_words = new LinkedList<String>();
		my_words.add("broccoli");
		my_words.add("Tomato");
		my_words.add("Kiwi");
		my_words.add("Kale");
		my_words.add("Tomatillo");
		
	Random rand = new Random();
	while(true){
		int choice = rand.nextInt(my_words.size());
		System.out.println("Choice =" +my_words.get(choice));
		Thread.sleep(1000);
		int replaceTo = rand.nextInt(my_words.size());
		System.out.println("Replace to = "+my_words.get(replaceTo));
		my_words.set(choice, my_words.get(replaceTo));

		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String lineFromInput = in.readLine();
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
			out.println(lineFromInput);
			out.close();
		}
		catch(IOException e1){
			System.out.println("Error during reading/writing");
		}
	
	}
		
		
	}

}
