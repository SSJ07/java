package oops;


/**
 * 
 * @author Shri
 * 
 * Instance control flow.
 * Instance flow executed every time when we create object of class.
 * Static flow execution always first before instance flow.
 * Instance flow execution is :
 * 	1. Identification of instance variable and instance block from top to bottom.
 *  2. Execution of instance assignments and instance block from top to bottom.
 *  3. Execution of constructor
 *
 */
public class InstanceFlow {

	int i=10;
	/**
	 * This is instance block. 
	 * It will not execute unless and until we create object of this class.
	 */
	{
		method1();
		System.out.println("First instance block");
	}
	/**
	 * Constructor always executed while creating object/instance.
	 */
	InstanceFlow(){
		System.out.println("Constructor");
	}
	
	/**
	 * 
	 * main method is static block. executed always time of class loading.
	 * So execution of program always start from here.
	 */
	public static void main(String[] args) {
		/**
		 * Here we creating instance of InstanceFlow class.
		 * So instance flow will be execute from top to bottom
		 */
		InstanceFlow instanceFlow = new InstanceFlow();
		System.out.println("main method");
		InstanceFlow instanceFlow1 = new InstanceFlow();
	}
	public void method1(){
		System.out.println("j="+ j);
	}
	{
		System.out.println("second instace flow");
	}
	int j=20;

}

/**
 * 	output will be this program :
 * 
 * 	j=0
 *	First instance block
 *	second instace flow
 *	Constructor
 *	main method
**/