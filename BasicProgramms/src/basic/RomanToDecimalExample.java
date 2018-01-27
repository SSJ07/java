package basic;

import java.util.Scanner;

/**
 * 
 * @author Shri
 * 
 * Program to convert roman number into deciaml number
 *
 */
public class RomanToDecimalExample {

	public static int getDigit(char c){
		int value;
		switch(c){
		 case 'I': value = 1; break;
         case 'V': value = 5; break;
         case 'X': value = 10; break;
         case 'L': value = 50; break;
         case 'C': value = 100; break;
         case 'D': value = 500; break;
         case 'M': value = 1000; break;
         case '\0': value = 0; break;
         default: value = -1; 
		}
		return value;
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter roman number :");
		String roman = scanner.next();
		int sum=0;
		if(roman.length()==1){
			sum = getDigit(roman.charAt(0));
		}else{
			for(int i=0; i<roman.length()-1; i++){
				if(roman.charAt(i)>=roman.charAt(i+1)){
					sum+=getDigit(roman.charAt(i));
				}else{
					sum = sum + (getDigit(roman.charAt(i+1))-getDigit(roman.charAt(i)));
				}
			}
		}
		System.out.println("Decimal value is :" + sum);
		scanner.close();
	}

}
