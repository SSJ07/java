package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 *
 */
public class StaticExample {

	static int i = 10;
	static{
		method1();
		System.out.println("static block 1");
	}
	
	public static void main(String[] args) {
	
			method1();
			System.out.println("main method");

	}
	public static void method1(){
		System.out.println("method1 :"+j);
	}
	static{
		System.out.println("static block 2");
	}
	static int j=20;

}
