package go;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
	public String readPlease()
	{
		String str ="";
		try{
			FileReader file = new FileReader("numbers.txt");
			BufferedReader buff = new BufferedReader(file);
			str = buff.readLine();
			buff.close();
			return str;
		}catch (IOException e){
			return e.toString();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
