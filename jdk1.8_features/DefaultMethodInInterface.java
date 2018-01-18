package java8features;

/**
 * 
 * @author shri
 * 
 * In jdk1.8, we can define method with default implementation in interface.
 *
 */
interface DefaultMethodExample{
	
	/**
	 * Here we can write default implementation code in interface method.
	 */
	default void log(){
		System.out.println("Default implementation of method in interface.");
	}
	/**
	 * Here we can't define Object class methods as default.
	 * Cause Object is super class for all java classes. So, it's method accessible to all java classes.
	 * That's why no need to redefine Object class method here.
	 */
	
//	 default String toString(){
//		 
//	 }
	// If we uncomment above code 
	//then compiler will give :A default method cannot override a method from java.lang.Object 
}

/**
 *
 * Second interface with same default method.
 *
 */
interface DefaultMethodExample1{
	
	default void log(){
		System.out.println("Default implementation of method in interface.");
	}
	
}

public class DefaultMethodInInterface implements DefaultMethodExample, DefaultMethodExample1{
	
	public static void main(String[] args) {
		
		new DefaultMethodInInterface().log();

	}

	@Override
	public void log() {
		System.out.println("overriding log method..");
		DefaultMethodExample.super.log();
	}

}
