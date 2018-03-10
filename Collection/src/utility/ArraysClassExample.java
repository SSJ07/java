package utility;

import java.util.Arrays;

public class ArraysClassExample {

	public static void main(String[] args) {

		/**
		 * Arrays is utility class provided by java to perform operation on array.
		 */
		
		int array[] = {1,4,3,5,6,2,0};
		System.out.println("Array into string :" + Arrays.toString(array));
		/*
		 * Sort array using Arrays.sort(int[] array)
		 */
		Arrays.sort(array);
		System.out.println("After sorting array :" + Arrays.toString(array));
	}

}
