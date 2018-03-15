package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {

		/**
		 * Generic has important advantages like :
		 * 	1. Code reuse
		 * 	2. Type safety
		 * 	3. Type casting not required
		 */
		/**
		 * This is non-generic code
		 * It will accept all type of data.
		 * But while fetching you don't know type of that object.
		 * It will create a problem.
		 */
		List list = new ArrayList();
		list.add(10);
		list.add("java");
		
		/**
		 * Here we have created List of integer
		 * So this list can accept only integer values even you try to insert char, byte, short values 
		 * Here it will not do auto boxing
		 */
		byte a = 10;
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
//		ls.add('A'); //compile time error
//		ls.add(a);  
		
		/**
		 * While retrieving values no need to type casting
		 */
		for(int val: ls){
			System.out.println(val);
		}
	}

}
