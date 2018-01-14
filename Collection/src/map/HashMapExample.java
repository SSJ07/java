package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		/** Bullet points 
		 * 
		 * Underlying Data structure is array of linked list
		 * Based on hashcode of key
		 * Unsorted
		 * Unordered
		 * Not thread safe
		 */
		
		/** Add key and value pair in hashmap **/
		
		hm.put("Java", 90);
		hm.put("Python", 95);
		hm.put("Spring", 89);
		hm.put(null, 0);
		hm.put(null, 01); // It replace previous value.
			
		/** Get all Keys **/
		System.out.println(hm.keySet());
		
		/** Get all values as list **/
		System.out.println(hm.values());
		
		/** Get particular value using key **/
		System.out.println(hm.get("Java"));
		
		/** Check particular key is available in hashmap or not **/
		System.out.println("isContains Java key :" + hm.containsKey("Java"));
		
		/** Check particular value is available in hashmap or not **/
		System.out.println("isContains 90 value :" + hm.containsValue(90));
		
		/** remove key from hashmap **/
		int val = hm.remove("Java"); // It returns value of key
		System.out.println("After removed java :" + val);
		
		/** Iterate over hashmap **/
		
		for(Entry<String, Integer> entry : hm.entrySet()){
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		/** get Size of hashMap **/
		System.out.println("Size of hash map is :" + hm.size());
		
		/** Check hashmap is empty or not **/
		System.out.println("Is empty hash map :" + hm.isEmpty());
	}

}
