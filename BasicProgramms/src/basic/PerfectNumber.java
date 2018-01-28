package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Check given number is perfect or not
 * 
 * Perfect Number is number which all it's divisor sum is equal to number
 * 
 *
 */
public class PerfectNumber {

	public static boolean isPerfectNumber(int number){
		int sum=0;
		for(int i=1; i<number; i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(number==sum)
			return true;
		return false;
	}
	
	public static void printFirstFivePerfectNumber(){
		byte count = 0;
		System.out.println("First five perfect numbers are :");
		for(int i=1; i<10000; i++){
			if(count<=5 && isPerfectNumber(i)){
				System.out.print(i+ " ");
				count++;
			}
		}
			
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check pefect :");
		int num = sc.nextInt();
		System.out.println("Is "+ num + " perfect ? : "+ isPerfectNumber(num));
		sc.close();
		
		printFirstFivePerfectNumber();
	}

}
