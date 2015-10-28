package chapter11;
import java.io.*;
public class FileDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
File noob = new File("/Users/rossclare/Documents/Java/");
File[] noob1 = noob.listFiles();

for(int index=0; index < noob1.length; index ++)
{
System.out.println(noob1[index].toString());


}
}

}
