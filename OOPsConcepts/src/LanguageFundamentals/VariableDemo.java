package LanguageFundamentals;

public class VariableDemo{
	int x; // these is class variable
	static int z; // these is static variable

	public static void main(String args[]){
		/* declare int type variable */
		int a, b,c ;
		/* initialization can be done at declaring time or after declaring variable;
		*/
		a = b = c = 10; // these are local variable
		System.out.println("a=b=c :" + a + b + c);

		/* There are three types of variable.
		 1 : local variable 
		 2 : class variable/instance variable
		 3 : static variable
		*/
		
		/* local variable must be initialize before use. because it doesn't have default value.
		   otherwise it will give compile time error.
		   scope : end of method 
		   modifiers : local variable only final modifier allows.
		 */
		
		/* Class Variable created for each object of class and initialize with default value.
		   when object is destroyed variable also destroy.
		   scope : within class
		   life  : still object is exist
		   modifiers : private ,protected , final, static, transient, volatile, default
		*/
		/* Static  variable :
		   creation :only one copy for each class.
		   scope    : whole class
		   life     : still class exist
		   modifiers: final static, private static, public static, protected static
		*/
		
	}
}
