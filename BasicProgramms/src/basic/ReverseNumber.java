package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 *
 * Write program, accept integer number print it as reverse
 */
public class ReverseNumber {

	public static int reverseNumber(int number){
		int num=0;
		while(number > 0){
			num = (num*10) + (number%10);
			number/=10;
		}
		return num;
	}
	public static int reverseNumberUsingStringBuffer(int number){
		StringBuffer sb = new StringBuffer();
		while(number > 0){
			sb.append(number%10);
			number/=10;
		}
		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :" );
		int number = sc.nextInt();
		System.out.println("Reveres Number is :" + reverseNumber(number));
		System.out.println("Reverse Number is :" + reverseNumberUsingStringBuffer(number));
		sc.close();
	}

}
