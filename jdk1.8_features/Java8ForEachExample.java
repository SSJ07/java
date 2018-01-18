package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
/**
 * 
 * @author shri
 * 
 * forEach() method introduced in jdk1.8.
 * Introduces in java.lang.Iterable interface.
 * forEach() method takes java.util.function.Consumer object as argument.
 * 
 *
 */
public class Java8ForEachExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i<10; i++)intList.add(i);
		/**
		 * Iterating list using Iterator interface
		 */
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator item :"+ i);
		}
		
		/**
		 * Iterating list using forEach() method
		 */
		intList.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer val) {
				System.out.println("forEach() = "+ val);
				
			}});
		
		/**
		 * Creating separate class for Business logic over iteration. 
		 */
		 
		 intList.forEach(new MyConsumer());
	}

}

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("forEach = "+ t);
	}
	
}
