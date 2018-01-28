package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Print fibonacci series upto given number
 *
 */
public class FibonacciSeries {

	public static void printFibonacciSeries(int number){
		int a=1;
		int b=0;
		for(int i=1; i<=number; i++){
			b=(a+b);
			System.out.print(b+ " ");
			a=(b-a);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for fibonacci :");
		int num = sc.nextInt();
		printFibonacciSeries(num);
		sc.close();
	}

}
