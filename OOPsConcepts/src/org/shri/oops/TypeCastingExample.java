package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 * Through type casting, we are not creating any new object.
 * For the existing object we are providing another type of reference variable 
 * 	i.e we are performing type casting but not object casting.
 * 
 * String s = new String("hello");
 * Object obj = (Object) s; // pointing to "hello" object. Not creating new object
 *
 */
public class TypeCastingExample {

	public static void main(String[] args) {
		
		/**
		 * Here object "hello" will create only one time.
		 * And we creating new reference of object class to pointing it.
		 */
		String s = new String("hello");
		Object obj = (Object) s;
		System.out.println("s==obj ?: " + (s==obj));
		/**
		 * 
		 * Here object 10 will create only.
		 * But reference variable will create: integer, number and object
		 * 
		 */
		Integer integer = new Integer(10);
		Number number = (Number)integer;
		Object object = (Object)number;
		
		System.out.println("integer==number?" + (integer == number));
		System.out.println("object==number?" + (object == number));

	}

}
