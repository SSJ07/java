package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaStreamExample {

	public static int sumOfEvenNumber(List<Integer> list){
		return list.stream().filter(p -> p%2==0).mapToInt(i->i).sum();
	}
	public static int sumOfOddNumber(List<Integer> list){
		return list.stream().filter(p -> p%2!=0).mapToInt(i->i).sum();
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10}));
		int sum = sumOfEvenNumber(list);
		System.out.println("sum of even number from 1 to 10 :="+ sum);
		int oddSum = sumOfOddNumber(list);
		System.out.println("sum of odd  number from 1 to 10 :="+ oddSum);
		
	}

}
