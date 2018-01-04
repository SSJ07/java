package org.shri.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Java", 90);
		hm.put("Python", 95);
		hm.put("Spring", 89);
		
		for(Entry entry : hm.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
