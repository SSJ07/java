package java_lang_package;

/**
 * 
 * @author Shri
 *
 */
public class StringInternExample {

	public static void main(String[] args) {
		/*
		 * Will create object in heap and String constant pool for future reference
		 */
		String s = new String("java");
		
		/*
		 * intern() method give the reference in string constant pool object
		 */
		String s1 = s.intern();
		
		System.out.println("s==s1? :" +(s==s1)); // return false
		
		String s2 = "java";
		
		System.out.println("s1==s2? :" +(s1==s2)); // return true
		
	}

}
