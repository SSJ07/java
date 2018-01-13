package org.shri.oops;


/**
 * 
 * @author Shri
 * 
 * For any java class we allow only one object such type of class is called singleton class.
 * Example: Runtime, ServiceLocator, BusinessDelegate are singleton classes.
 * 
 * If several people have same requirement then it is not recommended to create separate object.
 * We have to create only one object and we can reuse same object for requirement.
 * Performance and memory utilization will improve
 *
 * Runtime r1 = Runtime.getRunTime();
 */
public class SingletonClass {

	private static SingletonClass sc;
	/**
	 * create private constructor
	 */
	private SingletonClass(){
		System.out.println("default constructor");
	}
	/**
	 * This method will create object of SingletonClass for first request only.
	 * After it will return same object for every request.
	 * 
	 * @return object of SingletonClass class
	 */
	public static SingletonClass getSingletonClass(){
		if(sc==null)
			sc = new SingletonClass();
		return sc;
	}
	
	public static void main(String[] args) {
		
	}

}
