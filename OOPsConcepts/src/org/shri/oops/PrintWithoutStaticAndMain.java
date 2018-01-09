package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 * This is only applicable upto jdk 1.6.
 *
 */
public class PrintWithoutStaticAndMain {

	public static int x = method1();
	
	public static int method1(){
		System.out.println("Hello print some without static block or main");
		System.exit(0);
		return 10;
	}

}
