package recursive;
import java.util.Scanner;

/**
 * 
 * @author shrikant
 * 
 * Find sum of each digit in given number using recursion
 *
 */
public class SumOfDigit {

	public static int sumOfDigit(int num, int sum){
		if(num==0)
			return sum;
		else
			sum+=num%10;
			return sumOfDigit(num/=10, sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int x = sc.nextInt();
		sc.close();
		System.out.println("sum of digit in given number is : " + sumOfDigit(x,0));
	}

}
