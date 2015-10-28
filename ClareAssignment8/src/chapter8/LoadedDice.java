package chapter8;
import java.util.*;
public class LoadedDice extends Random {

	public int nextInt(int num){
	Random random = new Random();
	int result1 = random.nextInt(2)+1;
	int f_Result= 0;
	if(result1 == 1)
	{
		f_Result = random.nextInt(num-1);
	}
	else
	{
		f_Result = num-1;
	}
	return f_Result;
		
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
