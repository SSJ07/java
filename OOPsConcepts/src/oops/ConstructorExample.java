package oops;

/**
 * 
 * @author Shri
 * 
 * Constructor is used to initialize object not to create an object.
 * Constructor does not support inheritance concept.
 * You can call parent constructor in child using super keyword.
 * Constructor can be overloaded.
 * In every java class has constructor.
 * Runtime argument promotion is also applicable in constructor overloading.
 * char -> int -> long -> float -> double
 *
 */
public class ConstructorExample {

	/** 
	 * default constructor
	 * If we not create any constructor jvm provide default constructor.
	 */
	ConstructorExample(){
		System.out.println("Default constructor ");
	}
	/**
	 * Constructor overloading.
	 * We can create constructor with different argument.
	 */
	ConstructorExample(int a){
		System.out.println("parameterized constructor " + a);
	}
	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
		ConstructorExample ce1 = new ConstructorExample(10);
	}

}
