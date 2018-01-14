package LanguageFundamentals;

/**
 * 
 * @author Shri
 * 
 * Primitive data types:
 * 		1. Numeric Data Type:
 * 				1. Integral Data types:
 * 						a) byte - 1 byte(8 bit) , range(-128 to 127)
 * 						b) short- 2 byte(16 bit), range(-32768 to 32767)
 * 						c) int - 4 byte(32 bit), range(-2147483648 to 2147483647)
 * 						d) long -8 byte(64 bit), range(-2(63) to 2(63)-1)
 * 				2. floating-point data types:
 * 						a) float - 4 byte
 * 						b) double - 8 byte
 * 		2. Non-Numeric Data type:
 * 				1. char - 2 byte(16 bit)
 * 				2. boolean
 *
 */
public class JavaDataTypes {

	public static void main(String[] args) {
	
			byte x = 10;
			System.out.println("byte x="+x);
			
//			byte y = 128; // will give compile time error can't convert int to byte
			short y = 10;
			System.out.println("short y="+ y);
			
			int ab = 20;
			System.out.println("int ab="+ ab);
			
			long ac = 20l;
			System.out.println("long value ac = "+ ac);

	}

}
