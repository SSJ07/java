package string;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Count Character occurrences without using any loop
 *
 */
public class CharacterOccurrencesCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = scan.nextLine();
		System.out.print("Enter char : ");
		char c = scan.next().charAt(0);
		int count = string.length() - string.replaceAll(String.valueOf(c), "").length();
		System.out.println(" Occurrences of "+ c + " are : "+ count);
		scan.close();
	}

}
