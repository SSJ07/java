package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		/**
		 * Important points :
		 * 
		 * Underlying data structure is LinkedList and Hashtable.
		 * Unsorted.
		 * Insertion order is preserved.
		 * duplicates are not allowed.
		 * Only one null value is allowed
		 * Child of HashSet Class.
		 */
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add("Hello");
		lhs.add(null);
		System.out.println("Inserting duplicate value :" + lhs.add(null));		
		System.out.println(lhs);
		
		LinkedHashSet<String> coursesName = new LinkedHashSet<String>();
		coursesName.add("Java");
		coursesName.add("Python");
		
		lhs.addAll(coursesName);
		
		System.out.println(lhs);
		
	}

}
