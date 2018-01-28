package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Print factorial number of given number
 *
 */
public class FactorialNumber {
	
	public static int factorialNumber(int number){
		int fact=1;
		while(number > 0){
			fact*=number;
			number--;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		System.out.println("Factorial of "+ num + " is :" + factorialNumber(num));
		sc.close();
	}

}
