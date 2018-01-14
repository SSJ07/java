package list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		/**
		 * Vector is legacy class. Added in jdk1.0
		 * Vector is same as ArrayList But only difference is all methods of vectors
		 * are synchronized.
		 * So vector is thread safe.
		 */
		
		Vector vector = new Vector();
		vector.add("spring");
		vector.add(100);
		System.out.println(vector);
		System.out.println("size of vector is :" + vector.size());
		System.out.println("is Empty : " + vector.isEmpty());
		System.out.println("contains :" + vector.contains("spring"));
		System.out.println("lastElement:" + vector.lastElement());
		
	}

}
