package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 * Static block execution flow :
 *  	
 *  	1. Identification of static variable member from top to bottom
 *  	2. Execution of static variable assignments and static blocks from  top to bottom
 *  	3. execution of main method
 *
 */
public class StaticExample {

	static int i = 10; // execution first
	static{  // execute seconds
		method1(); 
		System.out.println("static block 1"); 
	}
	
	public static void main(String[] args) { // execute last/finally
			method1();
			System.out.println("main method");
	}
	public static void method1(){
		System.out.println("method1 :"+j);
	}
	static{ // execute third
		System.out.println("static block 2");
	}
	static int j=20; // execute fourth

}
