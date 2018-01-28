package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Check given number is palindrome number or not
 *
 */
public class PalindromeNumber {

	public static boolean isPalindromeNumber(int number){
		int num = number;
		int sum =0;
		while(number > 0){
			sum = (sum*10) + (number%10);
			number/=10;
		}
		if(sum==num)
			return true;
		return false;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check palindrome :");
		int num = sc.nextInt();
		System.out.println("Is "+ num + " palindrom ? : "+ isPalindromeNumber(num));
		sc.close();
	}

}
