package basic;

import java.util.Scanner;

public class RecursiveFibonacciSeries {

	public static void printFibonacciSeries(int number, int a, int b){
		b=(a+b);
		a=(b-a);
		System.out.print(b+ " ");
		if(number!=1){
			number-=1;
			printFibonacciSeries(number, a, b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for fibonacci :");
		int num = sc.nextInt();
		printFibonacciSeries(num, 1, 0);
		sc.close();
	}

}
