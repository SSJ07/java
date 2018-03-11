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
		
		/**
		 * Normally Arrays.toString(int [] arr) print outer array elements.
		 * But deepToString() method prints all array(array inside array) into string format.
		 * Below line output will be : array deep toString :[1, 2, 3, [0, 1, 2, 3, 4, 5, 6]]
		 */
		Object [] arr = {1,2,3,array};
		System.out.println("array deep toString :" + Arrays.deepToString(arr));
		
		/**
		 * Compare two array object.
		 * Arrays.equals(int [], int[]) This required both sorted array as input
		 */
		
		int a[] = {1,2,3,0};
		int b[] = {1,2,3,0};
		System.out.println("Is array object equals? : " + Arrays.equals(a,b));
		
		/**
		 * make copy of array
		 */
	
		int [] c = Arrays.copyOf(a, a.length);
		if( c==a){
			System.out.println("Array a==c refering same reference");
		}
		if(Arrays.equals(a, c)){
			System.out.println("Array a and c are same");
		}
	}
	
	

}
