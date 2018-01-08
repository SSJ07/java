package org.shri.oops;

/**
 * 
 * @author Shri
 * In java variables mainly divided into two types:
 * 		1. primitive data types : int, long double, float
 * 		2. reference variable : 
 * 	
 * 		These both types of variable scope is like :
 * 
 * 			1. instance variable : It creates each for per object
 * 			2. static variable  : It creates each for per class
 * 			3. method variable  : Method level.
 *
 */
class A{
	
}
public class TypesOfVariable {
	
	int x; // primitive instance variable
	A a; // reference instance variable

	static int y=10; // primitive static variable 
	static final String name="MySQL"; // reference static variable
	
	public static void main(String[] args) {
		
		int x=10; // here this local variable with same name instance variable
		System.out.println("local variable x:" +x);
		
		TypesOfVariable tp = new TypesOfVariable();
		tp.x = 20;
		System.out.println("instance variabel x:" +tp.x);
			

	}

}
