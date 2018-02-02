package recursive;
import java.util.Scanner;
/**
 * 
 * @author shrikant
 * 
 * Find factorial number using recursive function
 *
 */
public class RecursiveFactorial {

	public static int factorial(int x, int fact){
		if(x==0 || x==1)
			return fact;
		else
			fact*=x;
			return factorial(x-=1, fact);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int x = sc.nextInt();
		sc.close();
		System.out.println("factorial of given number is : " + factorial(x, 1));
		
	}

}
