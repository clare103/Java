package problem1;

public class Midterm1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {3,2,1,4};
for(int value: sum(array)){
	System.out.println(value);
}
	}
public static int[] sum(int[] array){
	int[] newArray = new int[array.length];

	for (int i = 0; i< array.length; i++){
		if( i == 0){
			newArray[i] = array[0]; 
		}
		else
			for(int j = 0; j<i; j++)
				newArray[i] = (array[i] + array[j]);
	}
	return newArray;
}
	}


