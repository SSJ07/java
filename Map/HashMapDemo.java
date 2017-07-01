package org.shri.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
			/**
			 *	Important points are :
			 *
				1. Underlayding data structure is Hashtable
				2. Based on hashcode of  key
				3. Insertion order is not preserved
				4. Unsorted
				5. Unordered
				6. duplicate key is not allowed but values are allowed
				7. Null is allows for key  only one but many to values
				8. Implemented Serializable and Clonable interface
				9. Best choice when frequent operation is search
				10. Heterogeneous values both key and values allowed
				11. Unsynchronized 
				12. Not thread safe
			 * 
			 */
		
			/**  Constructors of HashMap **
			 * 
			 * HashMap dc = new HashMap(); #default initial capacity is 16
			 * HashMap uc = new HashMap(10); #user defined capacity 10
			 * HashMap fr = new HashMap(10,2); #user defined capacity is 10 and fill ratio is 2
			 * HashMap  cm = new HashMap(Map m); # create new Hashmap with existing map
			 * 
			 */
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			hs.put("Sachin", 100);
			hs.put("Yuvi", 80);
			hs.put("Dhoni", 90);
			hs.put("Dhavan", 99);
			
			System.out.println(hs);
			
			/** Iteration over hashmap **/
			Set<Entry<String, Integer>> entry = hs.entrySet();
			for(Entry<String, Integer> kv : entry){
				System.out.println("Key = " + kv.getKey() + " value=" + kv.getValue());
			}
			
	}

}
