package string;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Reverse words in given sentence without using any built in library
 *
 */
public class ReverseWordInSentence {

	/**
	 * Using String [] 
	 * @param string
	 */
	public static void reverseSentence(String string){
		String [] array = string.split(" ");
		for(int i=array.length-1; i>=0; i--){
			System.out.print(array[i] + " ");
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = sc.nextLine();
		reverseSentence(string);
		sc.close();
	}

}
