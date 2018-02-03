package java_lang_package;

/**
 * 
 * @author Shri
 * 
 * We can use equals() method to check equality of two object.
 * example : obj.equals(obj2)
 * If our class doesn't contain equals() then Object class equals() method 
 * 	will execute.
 * Default equals() method in Object class for reference comparison not content 
 * 	comparison.
 * 
 * If we want to content comparison then we can override equals() method in our 
 * 	class.
 * 
 * To make our custom equals() method more efficient check first references of both object.
 * 
 * String class override equals() method to content comparison.
 * StringBuffer equals() method override to reference comparison
 *
 */


class Student{
	
	private int studId;
	private String studName;
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	
}
class Student1{
	private int studId;
	private String studName;
	
	public Student1(int studId, String studName) {
		this.studId = studId;
		this.studName = studName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(obj == this)
			return true;
		Student1 other = (Student1) obj;
		if (studId != other.studId)
			return false;
		if (studName == null) {
			if (other.studName != null)
				return false;
		} else if (!studName.equals(other.studName))
			return false;
		return true;
	}

	
	
}
public class EqualsMethodExample {

	public static void main(String[] args) {

		/**
		 * Default equals() method will check reference. Not a content
		 */
		Student stud = new Student(1001, "Ganesh");
		Student stud1 = new Student(1002, "Ajay");
		Student stud2 = new Student(1001, "Ganesh");
		Student stud3 = stud1;
		System.out.println("stud.equals(stud1)? :" + stud.equals(stud1)); //return false
		System.out.println("stud.equals(stud2)? :" + stud.equals(stud2)); //return false
		System.out.println("stud1.equals(stud3)? :" + stud1.equals(stud3)); //return true
		
		
		/**
		 * After overriding equals() method. It will check content not reference
		 */
		Student1 s1 = new Student1(1001, "Ganesh");
		Student1 s2 = new Student1(1002, "Ajay");
		Student1 s3 = new Student1(1001, "Ganesh");
		Student1 s4 = s1;
		System.out.println("s1.equals(s2)? :" + s1.equals(s2)); // return false
		System.out.println("s1.equals(s3)? :" + s1.equals(s3));// return true
		System.out.println("s4.equals(s1)? :" + s1.equals(s4));// return true
		 
		
		/**
		 * String object comparison
		 */
		
		String ganesh = new String("Ganesh");
		String ganesh1 = new String("Ganesh");
		System.out.println("ganesh==ganesh1? :" +(ganesh==ganesh1));// return false
		System.out.println("ganesh.equals(ganesh1)? :" +(ganesh.equals(ganesh1))); // return true
		
		/**
		 * StringBuffer object comparison
		 */
		
		StringBuffer sb = new StringBuffer("Ganesh");
		StringBuffer sb1 = new StringBuffer("Ganesh");
		StringBuffer sb2 = sb;
		System.out.println("sb==sb1? :" +(sb==sb1));// return false
		System.out.println("sb.equals(sb1)? :" +(sb.equals(sb1))); // return false
		System.out.println("sb2.equals(sb)? :" +(sb.equals(sb2))); // return true
		
		
	}

}
