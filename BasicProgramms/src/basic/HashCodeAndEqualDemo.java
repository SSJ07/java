package basic;

import java.util.HashMap;

public class HashCodeAndEqualDemo {

	public static void main(String[] args) {

		
		HashMap<Object, String> hm = new HashMap();
		Student s = new Student(1001);
		Student s1 = new Student(1002);
		hm.put(s, "A");
		hm.put(s1, "B");
		
		System.out.println(hm);
		System.out.println(hm.get(s));
	}

}

class Student{
	private int rollNo;

	Student(){}
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
	
}
