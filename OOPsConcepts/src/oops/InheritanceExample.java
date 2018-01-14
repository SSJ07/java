package oops;

/**
 * 
 * @author Shri
 * 
 * Inheritance is one of the main feature of java
 * It's called IS-A relationship
 * Inheritance means inheriting some properties from parant and reuse it.
 * Achieves using keywords extends
 * 
 *
 * Conclusions:
 * 			1. Whatever parent methods has by default available to child class.
 * 			2. Child class can access both parent + child class methods.
 * 			3. Parent class has only access of it's own methods not child class methods.
 * 			4. Parent reference can be used to hold child reference. But using that
 * 				reference we can't call methods of child class but can call parent methods.
 * 			5. Child reference can't hold parent class reference.
 * 			6. Java doesn't support multiple inheritance for class but support interface.
 * 				Why?:
 * 				  ParentA -> method1             
 * 				  ParentB -> method1
 * 				  Child extends ParentA,ParentB # it will create ambiguity
 * 			7. Cyclic inheritance is not support in java
 *  
 */

class Parent{
	int x;
	public void showParent(){
		System.out.println("parent method :" + this.x);
	}
}
class Child extends Parent{
	int y;
	public void showChild(){
		System.out.println("child method :" + this.y);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		/**
		 * Parent class have only access of it's own methods.
		 * It can't access child class method.
		 */
		Parent p = new Parent();
		p.showParent();
//		p.showChild(); // It will give compile time error. Cause parent doesn't have child methods.
		
		/**
		 * Child class inherit all methods of parent class.
		 * So child class have both methods showParent() and showChild()
		 * 
		 */
		Child c = new Child();
		c.showChild();
		c.showParent(); 
		
		/**
		 * Parent class reference variable can hold child object.
		 * But can't access child methods.
		 * Because parent class reference variable can only access parent methods
		 */
		Parent pc = new Child();
		pc.showParent();
//		pc.showChild() // Compile time error symbol not found showChild()
		
		/**
		 * Child class reference can't hold parent reference
		 * Will give compile time error TypeMismatch: can't convert parent to child
		 */
//		Class cp = new Parent(); 
	}	

}
