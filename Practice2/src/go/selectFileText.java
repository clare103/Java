package go;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class selectFileText {
	/**
	 * @param args
	 */
	public static Scanner selectTextFile() {
		// TODO Auto-generated method stub
		do{
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text/Java files","txt", "java");
			chooser.setFileFilter(filter);
			int returnVal = chooser.showOpenDialog(null);
		try{
			if(returnVal == JFileChooser.APPROVE_OPTION){
				return new Scanner(chooser.getSelectedFile());
				}
			else
				{
				return null;
				}
		}
		catch (FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Invalid file!", "error", JOptionPane.ERROR_MESSAGE);
		}
	}while(true);
}
}	
