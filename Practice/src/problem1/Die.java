package problem1;
import java.util.Random;
public class Die 
{

	private final int MIN_FACES =4;
	private static Random generator = new Random();
	private int numFaces;
	private int faceValue;
	
	public Die()
	{
		numFaces = 6;
		faceValue=1;
	}
	
	public int roll()
	{
		faceValue = generator.nextInt(numFaces) + 1;
		return faceValue;
	}
	public int getFaceValue()
	{
		return faceValue;
	}

}
