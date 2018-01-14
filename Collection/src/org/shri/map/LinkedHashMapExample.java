package org.shri.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		/**
		 * Underlying data Structure is Linked List
		 * Insertion order preserved 
		 */
		
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("Google", "lary page");
		linkedHashMap.put("Facebook", "Mark zukerberg");
		linkedHashMap.put("iPhone", "Stev Job");
		linkedHashMap.put("Microsoft", "Bill Gates");
		
		System.out.println(linkedHashMap);
	}

}
