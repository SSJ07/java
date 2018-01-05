package org.shri.oops;

/**
 * 
 * @author Shri
 * 
 * Object is real entity.
 * It's physically exist.
 * It has state and behavior.
 * state means instance variable
 * behavior means methods of object
 *
 */
public class ObjectExample {
	
	int x, y; // These variables are state of object 
	
	// This is behavior of object
	public void show(){
		System.out.println("x="+ this.x + " y="+this.y);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException{

		/** 
		 * We can create object of class by four ways
		 * 1. Using new operator
		 * 2. Class.forName("ClassName").newInstance()
		 * 3. <object>.clone()
		 * 4. Deserialization  
		 */
		ObjectExample object = new ObjectExample();
		object.x = 10;
		object.y = 20;
		object.show();
		
	}

}