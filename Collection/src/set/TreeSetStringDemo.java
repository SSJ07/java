package set;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String>{

	public int compare(String o1, String o2) {
		//return o1.compareTo(o2); // return ascending order [Ajay, Ganesh, Pooja, Pravin, Rahul, Sandya, Shrikant, Vijay]
		//return -o1.compareTo(o2); // return descending order [Vijay, Shrikant, Sandya, Rahul, Pravin, Pooja, Ganesh, Ajay]
		return o2.compareTo(o1); // return descending order [Vijay, Shrikant, Sandya, Rahul, Pravin, Pooja, Ganesh, Ajay] 
		//return -o2.compareTo(o1); //return ascending order [Ajay, Ganesh, Pooja, Pravin, Rahul, Sandya, Shrikant, Vijay]
	}
	
}
class StringLengthComparator implements Comparator<String>
{

	public int compare(String o1, String o2) {
		if(o1.length()==o2.length())
					return 0;
		return o1.length() < o2.length()?-1:1;
	}
	
}
public class TreeSetStringDemo {

	public static void main(String[] args) {
		TreeSet tr = new TreeSet(new StringComparator());
		tr.add("Ganesh");
		tr.add("Vijay");
		tr.add("Pooja");
		tr.add("Sandya");
		tr.add("Ajay");
		tr.add("Rahul");
		tr.add("Pravin");
		tr.add("Shrikant");
		System.out.println(tr);
		
		TreeSet ts = new TreeSet(new StringLengthComparator());
		ts.add("A");
		ts.add("AB");
		ts.add("ABCD");
		ts.add("ABC"); // here same length of value replaced 
		System.out.println(ts);
	}

}
