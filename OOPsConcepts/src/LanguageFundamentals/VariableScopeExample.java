package LanguageFundamentals;
/**
 * 
 * @author Shri
 * 
 * In Java, Variable has mainly three different types of scopes:
 * 	1. Instance variable
 *  2. Static variable
 *  3. Local variable
 *
 */
public class VariableScopeExample {
	
	private static String staticVariable = "staticVariable";
	private String intanceVariable;

	public void show(){
		/**
		 * Here x has local scope
		 */
		int x  = 10;
		System.out.println("local variable x = :"  + x);
	}
	public static void main(String[] args) {

		VariableScopeExample vs = new VariableScopeExample();
		vs.intanceVariable = "vs";
		vs.staticVariable = "staticVs";
		VariableScopeExample vs1 = new VariableScopeExample();
		vs1.intanceVariable = "vs1";
		vs1.staticVariable = "staticVs1";
		
		System.out.println("vs instance variable value is :" + vs.intanceVariable);
		System.out.println("vs1 instance variable value is :" + vs1.intanceVariable);
		
		System.out.println("vs instance variable value is :" + vs.staticVariable);
		System.out.println("vs1 instance variable value is :" + vs1.staticVariable);
	}

}
