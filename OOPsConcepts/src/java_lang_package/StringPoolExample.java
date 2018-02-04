package java_lang_package;

/**
 * 
 * @author Shri
 * 
 *
 */
public class StringPoolExample {

	public static void main(String[] args) {

			String s1 = new String("you can't change me!");
			String s2 = new String("you can't change me!");
			
			System.out.println("s1==s2? :" +(s1==s2)); //return false
			
			String s3 = "you can't change me!";
			
			System.out.println("s1==s3? :" +(s1==s3)); // return false;
			
			String s4 = "you can't change me!";
			
			System.out.println("s3==s4? :" +(s3==s4)); // return true;
			
			/**
			 * This operation will perform compile time only
			 * Because both are compile time constants
			 */
			String s5 = "you can't " + "change me!"; 
			
			System.out.println("s3==s5? :" +(s3==s5)); // return true;
			
			/**
			 * This operation will perform at run time only
			 * Because one variable is normal and create object in heap
			 *
			 */
			String s6 = "you can't ";
			String s7 = s6 + "change me!"; 
			System.out.println("s3==s7? :" +(s3==s7)); // return false
			
			/**
			 * Here s8 is final string means constant so 
			 * addition/concate operation will only compile time
			 */
			final String s8 = "you can't ";
			String s9 = s8 + "change me!";
			System.out.println("s3==s9? :" +(s3==s9)); // return true
			System.out.println("s6==s8?: "+ (s6==s8)); // return true
			
	}

}
