package arrays;

import java.util.Arrays;

/**
 * 
 * @author Shri
 * 
 * Find missing number in array from 1 to 100
 *
 */
public class MissingElement {

	public static int getMissingNumber(int []array){
		int sum = Arrays.stream(array).sum();
		int totalSum = (array.length*(array.length+1))/2;
		return totalSum-sum;
	}
	public static void main(String[] args) {
		int [] array = new int[100];
		for(int i=0; i<100; i++){
			array[i]=i+1;
		}
		array[50]=0;
		System.out.println("Missing number in array is :" + getMissingNumber(array));
	}

}
