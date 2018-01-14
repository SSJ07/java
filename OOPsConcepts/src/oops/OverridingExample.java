package oops;
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
	
	public Object display(){
		System.out.println("parent class display method :");
		return null;
	}
}
class Child1 extends Parent1{
	public void show(){
		System.out.println("Showing child class method");
	}
	public String display(){
		System.out.println("child class display method :");
		return null;
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		
		/**
		 * Parent reference with parent class object will call parent method.
		 */
		Parent1 parent = new Parent1();
		parent.show();
		parent.display();
		
		/**
		 * Child class reference with child class object will call child method.
		 */
		Child1 child = new Child1();
		child.show();
		child.display();
		
		/**
		 * Parent class reference with child class object will call runtime child class method.
		 * It's called runtime polymorphism. Cause it call runtime method of child class.
		 * Compiler checks parent has show method or not compile time.
		 * But at run time jvm check show method overrided by child or not.
		 */
		Parent1 pc = new Child1();
		pc.show();
		pc.display();
		
		
	}

}
