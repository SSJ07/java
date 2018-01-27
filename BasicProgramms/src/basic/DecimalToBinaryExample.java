package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Write program, which accept decimal value as input and return binary number as o/p
 *
 */
public class DecimalToBinaryExample {

	public static int decimalToBinary(int decimalNum){
		StringBuffer sb = new StringBuffer();
		while(decimalNum  > 0){
			sb.append(decimalNum%2);
			decimalNum/=2;
		}
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Decimal value :");
		int decimalValue = sc.nextInt();
		int binaryValue = decimalToBinary(decimalValue);
		System.out.println("Binary value is :" + binaryValue);
	}

}
