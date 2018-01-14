package org.shri.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Java");
		arrList.add("Python");
		arrList.add(null);
		arrList.add("");
		arrList.add("Python"); // allow duplicates
		System.out.println(arrList);
		
		ArrayList<String> frameworkList = new ArrayList<String>();
		frameworkList.add("spring");
		frameworkList.add("hibernate");
		
		arrList.addAll(frameworkList); //add other collection type
		
		System.out.println(arrList);
		
		/**
		 * Common methods of Collection interfaces
		 */
		System.out.println("Size of arrList is :" + arrList.size());
		System.out.println("isEmpty arrList :" + arrList.isEmpty());
		System.out.println("contains spring :" +arrList.contains("spring"));
		System.out.println("contains all " + arrList.containsAll(frameworkList));
		System.out.println("get element : "+ arrList.get(2));
		
		/** 
		 * Iterate list using following ways.
		 * 1. foreach 
		 * 2. Iterator interface
		 * 3. ListIterator Interface
		 */
		
		System.out.println("****Iterating list using foreach method****");
		for(String s : arrList){
			System.out.print(s + " ");
		}
		System.out.println("\n****Iterating list using Iterator interface****");
		Iterator<String> iter = arrList.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println("\n **** Iterating list using ListIterator interface: ***");
		ListIterator<String> listIter = arrList.listIterator();
		while(listIter.hasNext()){
			System.out.print(listIter.next()+" ");
		}
		System.out.println("\n****List Iterator backward direction:****");
		while(listIter.hasPrevious()){
			String item = listIter.previous();
			System.out.print(item + " ");
			if(item!=null && item.equals("spring")){
				listIter.remove();
				listIter.add("Spring");
				System.out.println("Removing spring framework from list");
			}
		}
		
	}

}
