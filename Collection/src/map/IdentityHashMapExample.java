package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {

		/**
		 * IdentityHashMap is same is HashMap.
		 * The difference is IdentityHashMap uses == (reference) operator to check duplicate key
		 * And HashMap uses .equals(content comparison)  method
		 */
		
		/**
		 * It will compare .equals(content) of key while inserting key and value in map
		 */
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
        hs.put(new Integer(10), "ajay");
        hs.put(new Integer(10), "vijay");
        System.out.println(hs); //output will be {10:"vijay")

        /** 
         * It will compare reference(==) of key every time while inserting key and value in map
         */
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<Integer, String>();
        identityHashMap.put(new Integer(10), "ajay");
        identityHashMap.put(new Integer(10), "vijay");
        System.out.println(identityHashMap); //output will be {10: "ajay", 10: "vijay"}

		
	}

}
