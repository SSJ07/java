package string;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Reverse String
 *
 */
public class ReverseString {

	/**
	 * 
	 * Reverse String using char[]
	 * 
	 * @param string
	 * @return
	 */
	public static String reverseString(String string){
		char [] array = new char[string.length()];
		int index=0;
		for(int i=string.length()-1; i>=0; i--){
			array[index++] = string.charAt(i);
		}
		return String.valueOf(array);
	}
	
	/**
	 * 
	 * solution 1 : Reverse String using StringBuffer class 
	 */
	
	public static String reverseStringUsingStringBuffer(String string){
		StringBuffer sb = new StringBuffer(string.length());
		for(int i=string.length()-1; i>=0; i--){
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}
	
	/**
	 * solution 2 : Reverse String using StringBuffer class
	 */
	public static String reverseStringUsingStringBuffer1(String string){
		StringBuffer sb = new StringBuffer(string);
		sb.reverse();
		return sb.toString();
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = sc.nextLine();
		System.out.println("Reverse string is :" + reverseString(string));
		System.out.println("Reverse string is :" + reverseStringUsingStringBuffer(string));
		System.out.println("Reverse string is :" + reverseStringUsingStringBuffer1(string));
		sc.close();
	}

}
