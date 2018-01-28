package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Program check given number is armstrong number or not
 *
 */
public class ArmstrongNumber {

	public static boolean isArmStrongNumber(int number){
		int num = number;
		int sum = 0;
		while(number > 0){
			int rem = number%10;
			sum = sum + (rem * rem * rem);
			number/=10;
		}
		if(sum==num)
			return true;
		return false;
		
	}
	public static void printArmstrongNumberInRange(int start, int end){
		for(int i=start; i<=end; i++){
			if(isArmStrongNumber(i)){
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = sc.nextInt();
		System.out.println("is "+ number + " armstrong number? :" + isArmStrongNumber(number));
		
		System.out.print("Enter start index :");
		int start = sc.nextInt();
		System.out.print("Enter end index :");
		int end = sc.nextInt();
		printArmstrongNumberInRange(start, end);
		
	}

}
