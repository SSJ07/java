package org.shri.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		/**
		 * Some points in linked list:
		 * 1. Best choice to use linked list when insertion and deletion operations frequently
		 * 2. Worst choice frequently retrieval operation
		 * 3. Insertion order preserved
		 * 4. Implements Serializable, Clonable and Dqueue interfaces
		 * 5. Underlying data structure used is Doubly LinkedList
		 */
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Sachin");
		lList.add("Yuvraj");
		lList.add("Dhoni");
		
		
		System.out.println(lList);
		System.out.println("Get First Element :" + lList.getFirst());
		System.out.println("Get Last Element  :" + lList.getLast());
		System.out.println("Offer element to lList :" + lList.offer("Pandya"));
	}

}
