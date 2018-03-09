package utility;

import java.util.Arrays;

public class ArrayComparisonExample {

	public static void main(String[] args) {

		/**
		 * How to compare two array?
		 * Java provided Arrays class which can compare two arrays.
		 */
		
		int [] arrA = {1,2,3};
		int [] arrB = {1,2,3};
		if(arrA == arrB){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same"); // here else part will execute
		}

		if(Arrays.equals(arrA, arrB))
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
		
		/**
		 * But what will happen if contain array inside array 
		 */
		
		Object [] arrC = {1,2,3,arrB};
		Object [] arrD = {1,2,3};
		Object [] arrE = {1,2,3,arrB};
		
		System.out.println(Arrays.equals(arrA, arrB));
		System.out.println("Are both same ? :" + Arrays.deepEquals(arrD, arrC));
		System.out.println("Are both same ? :" +Arrays.deepEquals(arrC, arrE));
	}

}
