package map;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableExample {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Hashtable is synchronized.
		 * Thread safe.
		 * legacy class.
		 * same as HashMap
		 * 
		 */
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Ganesh", 10000);
		ht.put("Shri", 20000);
		ht.put("Ajay", 11000);
		ht.put("Krishna", 15000);
		ht.put("Ram", 25000);
		
		for(Entry<String, Integer> entry : ht.entrySet()){
			System.out.println("key="+ entry.getKey() + " value="+ entry.getValue());
		}
		
		System.out.println("Contains key :" + ht.containsKey("Ajay"));
		System.out.println("Contains value :" + ht.containsKey(25000));
		System.out.println("isEmtpy hash table :" + ht.isEmpty());
		System.out.println("Get Ram salary :" + ht.get("Ram"));
		System.out.println("Size of hash table :" + ht.size());

	}

}

