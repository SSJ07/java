package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {

		/**
		 * Collections is utility class
		 */
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(1);
		list.add(15);
		
		System.out.println("Max number in list is :" + Collections.max(list));
		System.out.println("Min number in list is :" + Collections.min(list));
		/**
		 * Sort list using Collections class
		 */
		Collections.sort(list);
		
		System.out.println("Sorted list is :" + list);
		
		/**
		 * Binary search on sorted list
		 */
		System.out.println("Binary search for value 4 index is :" + Collections.binarySearch(list, 4));
		
		/**
		 * Check frequency of number in list
		 */
		
		System.out.println("Frequency of number 4 is :" + Collections.frequency(list, 4));
		
		/**
		 * reverse order of list
		 */
		Collections.reverse(list);
		System.out.println("After reversing list :" + list);

		/**
		 * Shuffle list items
		 */
		Collections.shuffle(list);
		System.out.println("Shuffled list is : " + list);
		
	}

}
