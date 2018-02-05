package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericExample {

	public static void main(String[] args) {

		// This is non-generic code
		List list = new ArrayList();
		list.add(10);
		list.add("java");
		
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		
		Set s = new TreeSet();
		s.add(10);
		s.add("hello");
		System.out.println(s);
	}

}
