package string;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Program to swap character in given string.
 * If character is upper case letter then convert it into lower case and vice versa
 *
 */
public class SwapCharacter {

	public static String swapCharcter(String string){
		char [] arry = new char[string.length()];
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i)>=65 && string.charAt(i)<=92){
				arry[i]= (char) (string.charAt(i)+32);
			}else{
				arry[i]= (char) (string.charAt(i)-32);
			}
		}
		return String.valueOf(arry);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String string = sc.nextLine();
		System.out.println("Swap string is : " + swapCharcter(string));
		sc.close();
	}

}
