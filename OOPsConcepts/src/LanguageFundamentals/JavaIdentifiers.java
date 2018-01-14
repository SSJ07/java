package LanguageFundamentals;

/**
 * 
 * @author Shri
 * Names in java program is called called identifiers.
 * It's used for identification purpose.
 * It can be java class name, method name, variable name or label name.
 * Rules for java identifiers:
 * 	1. The only allowed characters as identifiers are : a-z,A-Z,0-9,$,_
 *  2. Identifiers can't start with digit
 *  3. Identifiers are case sensitive
 *  4. Their is no length limit for java identifiers.
 *  5. We can't use reserved words as identifiers.
 *  6. All predefined java class names and interface names we can use as identifiers. 
 *     But not recommended, cause it's worst programming.
 * 
 *
 */
public class JavaIdentifiers {

	public static void main(String[] args) {
		
		/**
		 * In this class, java identifiers are:
		 *  1. JavaIdentifiers
		 *  2. main
		 *  3. String - It's predefined java class. not primitive data type
		 *  4. args
		 */

		/*
		 * Rule 1 : Only allowed characters are :
		 * a-z,A-Z,0-9,$,_
		 */
		int x = 10; //valid
//		int x# = 20 ; //invalid. compiler will give error
		int $x = 10; // valid
		
		/**
		 * Rule 2: Identifiers can't start with digit
		 */
//		int 1x = 10;// invalid;
		int x1 = 10; //valid
		
		/*
		 * Rule 3 : Identifiers are case sensitive 
		 */
		
		int y = 10;
		int Y = 10; // both are different
		
		
		/*
		 * Rule 4 : No lenght limit to identifiers. But not recommended
		 */
		int xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy=10;
		
		/*
		 * Rule 5: We can't use reserved word as identifiers
		 */
		
//		int float = 10; // invalid
//		int class = 20; //invalid
		
		/*
		 * Rule 6 : Predefined java classes and interfaces can be use as identifiers 
		 */
		
		int String = 10; // valid. But not recommended
		int Runnable = 20; // valid. But not recommended
		int Runtime = 20; // valid. But not recommended
		
	}

}
