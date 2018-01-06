package org.shri.oops;
/**
 * 
 * @author Shri
 * 
 * 	Whatever methods are in parent class by default available to child through inheritance.
 *  If child class is not satisfied with parent method, then child is allowed to 
 *  redefine parent method is called overriding.
 *  Parent method is called overridden and child method is called overriding method.
 *  
 *
 */

class Parent1{
	public void show(){
		System.out.println("Showing parent class method");
	}
}
class Child1 extends Parent1{
	public void show(){
		System.out.println("Showing child class method");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		
		/**
		 * Parent reference with parent class object will call parent method.
		 */
		Parent1 parent = new Parent1();
		parent.show();
		
		/**
		 * Child class reference with child class object will call child method.
		 */
		Child1 child = new Child1();
		child.show();
		
		/**
		 * Parent class reference with child class object will call runtime child class method.
		 * It's called runtime polymorphism. Cause it call runtime method of child class.
		 */
		Parent1 pc = new Child1();
		pc.show();
	}

}
