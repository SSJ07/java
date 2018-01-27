package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Write program which accept binary number as input and return Decimal value as o/p
 *
 */
public class BinaryToDecimalExample {

	public static int binaryToDecimal(int binaryNum){
		int base = 1;
		int decimalValue =0;
		while(binaryNum > 0){
			decimalValue+=((binaryNum%10)*base);
			base*=2;
			binaryNum/=10;
		}
		return decimalValue;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		int binaryNum = sc.nextInt();
		int decimalValue = binaryToDecimal(binaryNum);
		System.out.println("Decimal value is :" + decimalValue);
	}

}
