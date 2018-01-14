package org.shri.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/**
		 * Some important points :
		 * Underlying data structure is balanced tree.
		 * Sorted by natural sorting order.
		 * Duplicate is not allowed.
		 * Best choice when frequent operations are searching
		 * null is not allowed from jdk.1.7.0_51 onward.
		 * If null added then It will give NullPointerException
		 */ 
		
		TreeSet treeSet = new TreeSet();
		
		treeSet.add("Java");
		treeSet.add("Ajax");
		treeSet.add("Python");
		treeSet.add("Spring");
//		treeSet.add(null); It will throw NullPointerException
		System.out.println(treeSet);

	}

}
