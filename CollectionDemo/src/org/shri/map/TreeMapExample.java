package org.shri.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		/**
		 * Sorted in natural order
		 * Best choice when want sorted map
		 * 
		 */
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Samsung", 15000);
		treeMap.put("Motrola", 12000);
		treeMap.put("Redmi", 15500);
		treeMap.put("iPhone x", 89000);
		
		System.out.println(treeMap);
		
	}

}
