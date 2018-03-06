package string;

import java.util.Scanner;

/**
 * 
 * @author Shri
 *
 */
public class WordCountInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = scan.nextLine();
		string = string.trim();
		System.out.println("Total words in strings are : "+ string.split(" ").length);
		scan.close();
	}

}
