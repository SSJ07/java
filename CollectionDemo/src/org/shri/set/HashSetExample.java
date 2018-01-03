package org.shri.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		/**
		 * Some important points :
		 * Underlying data structure is Hashtable.
		 * Insertion order is not preserved.
		 * Unsorted.
		 * Duplicate is not allowed.
		 * only one null value allowed.
		 * Best choice when frequent operations are searching
		 * 
		 */
		HashSet hashSet = new HashSet();
		hashSet.add(10);
		hashSet.add("hashSet");
		hashSet.add("hashSet"); // return false. not throwing any exception
		System.out.println(hashSet);
		
	}

}
