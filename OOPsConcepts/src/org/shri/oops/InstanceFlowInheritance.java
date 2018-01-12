package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 * Instance block execution in inheritance will be from parent to child.
 * First parent instance flow execute from top to bottom.
 * After that child instance block will execute from top to bottom
 *
 */
public class InstanceFlowInheritance extends InstanceFlow{

	/**
	 * Instance variable
	 */
	int x=20;
	/**
	 * child instance block 1
	 */
	{
		method2();
		System.out.println("child instance block");
	}
	/**
	 * constructor
	 */
	InstanceFlowInheritance(){
		System.out.println("Child class constructor");
	}
	/**
	 * main method
	 * 
	 */
	public static void main(String[] args) {
		InstanceFlowInheritance ifInheritance = new InstanceFlowInheritance();
		System.out.println("child class main method");
	}
	/**
	 * instance method
	 */
	public void method2(){
		System.out.println("child class method2. y:"+y);
	}
	/**
	 * instance block 2
	 */
	{
		System.out.println("child class instance block 2");
	}
	/**
	 * instance variable
	 */
	int y=200;

}

/**
 * 
 * output will be :
 * 
 * 	j=0
	First instance block
	second instace flow
	Constructor
	child class method2. y:0
	child instance block
	child class instance block 2
	Child class constructor
	child class main method
 * 
 * 
 */