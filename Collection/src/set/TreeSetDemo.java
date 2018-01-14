package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		

//		1. Duplicate not alllow
//		2. Underlaying data structure is balanced tree
//		3. Insertion order not preserved
//		4. Heterogeneous object not allowed. Otherwise we will get runtime exception class exception
//		5. Allow null only one(till jdk1.7.0). jdk1.7.0_51 is not allowed null
//		6. All object will inserted based on some sorting order. It may be default natural sorting order or customized sorting order
//		7. Implemented Serializable and Clonable interfece
//		8. Constructors :
//			1. Treeset ts = new TreeSet(); #deault natural sorting order
//			2. TreeSet ts = new TreeSet(Comparator c); #Customized sorting order
//			3. TreeSet ts = new TreeSet(Collection c);
//			4. TreeSet ts = new TreeSet(SortedSet sc);
//
//		9. Null Acceptance :
//			1. In non-empty treeset if we trying insert null then it will give null pointer exception.
//			2. As first element we can insert null element but after trying to insert another element it will give NullPointer exception.
//			3. But in jdk1.7.0_51 version treeset is not allowed null



			TreeSet tr = new TreeSet();
			tr.add("A");
			//tr.add(10); //only homogeneous elements are allowed in treeset. 
			tr.add("B");
			tr.add("a"); // used Default natural sorting order
			System.out.println(tr); // o/p = ['A', 'B', 'a']
			
			
			TreeSet t = new TreeSet();
			
			/*t.add(new StringBuffer("A")); 
			t.add(new StringBuffer("B"));
			t.add(new StringBuffer("C"));*/
			
			// will throw :  java.lang.ClassCastException: 
			// java.lang.StringBuffer cannot be cast to java.lang.Comparable
			//System.out.println(t); 
			
			//Comparable interface has only one method public int comapreTo(Object obj)
			// compareTo return possible three values
			// returns -1 if obj1 has come before obj2
			// returns 1 if obj1 has come after obj2
			// returns 0 if obj1 & obj2 are equals
			System.out.println("A".compareTo("B")); // -1
			System.out.println("B".compareTo("A")); // 1
			System.out.println("A".compareTo("A")); // 0
			
			// Whiling adding element compareTo method invokes.
			// obj1.compareTo(obj2) in this obj1 is inserting element and obj2 is existing element in treeset
			
			
			TreeSet ct = new TreeSet(new MyComparator());
			ct.add(10);
			ct.add(20); 
			ct.add(0);
			ct.add(15);
			ct.add(4);
			System.out.println(ct);
	}

}
class MyComparator implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		//return o1.compareTo(o2); //return ascending order
		//return -o1.compareTo(o2); // return descending order
		//return o2.compareTo(o1); //return descending order
		//return -o2.compareTo(o1); //return ascending order
		//return +1; // return insertion order set
		//return -1; //reverse of insertion order
		return 0; //only first element  will be inserted and rest all element considered as duplicate
		
	}
	
}

