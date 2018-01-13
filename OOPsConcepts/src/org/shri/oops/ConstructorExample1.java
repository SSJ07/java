package org.shri.oops;

import java.io.IOException;

class ParentClass{
	ParentClass()throws IOException{
		System.out.println("Parent class constructor.");
	}
}
class ChildClass extends ParentClass{
	/**
	 * 
	 * If we comment this constructor then compiler will give error
	 * @throws IOException
	 */
	ChildClass()throws IOException{
		
	}
}
public class ConstructorExample1 {

	public static void main(String[] args) {
	
		/*
		 * In inheritance If default constructor throws exception of parent class 
		 * then child class must define overloaded constructor of define default constructor
		 * in child with throws parent exception
		 */

	}

}
