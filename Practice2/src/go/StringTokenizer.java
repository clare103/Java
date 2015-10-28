package go;
import java.util.Scanner;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//import javax.swing.JFileChooser;
//import javax.swing.filechooser.FileNameExtensionFilter;
public class StringTokenizer {
int A;
int B;
int C;
int D;
int E;
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String line;
String ratings[];
StringTokenizer sT[] = new StringTokenizer[50];
String fileName;
Scanner input = new Scanner(System.in);

try
{
	System.out.println("Enter the text file name:(ie. record.txt)");
	fileName = input.nextLine();
	String desktop = System.getProperty("user.home") + "/Desktop/"+ fileName;	
	FileReader file=new FileReader(desktop);
	BufferedReader f = new BufferedReader(file);
	int i=0;
	while((line =f.readLine())!=null)
	{	
		if(line.trim().indexOf('A')==0)
			continue;
		line = line.trim();
		ratings = line.split(",");
		sT[i]=new StringTokenizer();
		sT[i].A=Integer.parseInt(ratings[0]);
		sT[i].B=Integer.parseInt(ratings[1]);
		sT[i].C=Integer.parseInt(ratings[2]);
		sT[i].D=Integer.parseInt(ratings[3]);
		sT[i].E=Integer.parseInt(ratings[4]);
		i++;
	}
	float avgA=0;
	float avgB=0;
	float avgC=0;
	float avgD=0;
	float avgE=0;
	System.out.println("customer rating records:--");
	System.out.println("A\tB\tC\tD\tE");
	
	for(int j=0;j<i;j++)
	{
		System.out.println(sT[j].A+"\t"+sT[j].B+"\t"+sT[j].C+"\t"+sT[j].D+"\t"+sT[j].E+"\t");
		avgA=avgA+sT[j].A;
		avgB=avgB+sT[j].B;
		avgC=avgC+sT[j].C;
		avgD=avgD+sT[j].D;
		avgE=avgE+sT[j].E;
	}
	System.out.println("average rating of A= " +avgA/i);
	System.out.println("average rating of B= " +avgB/i);
	System.out.println("average rating of C= " +avgC/i);
	System.out.println("average rating of D= " +avgD/i);
	System.out.println("average rating of E= " +avgE/i);

}catch(FileNotFoundException ex)
{
	
}
catch(IOException ex)
{
	
}

	}
}




