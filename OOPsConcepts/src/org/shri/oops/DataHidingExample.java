package org.shri.oops;


/**
 * @author Shri
 * 
 * Data hiding is one of the main feature of java language.
 * Data hiding is nothing but preventing data from unauthorized access.
 * We can achieve this by using private modifier
 * Main advantage of data hiding is security.
 *
 */
public class DataHidingExample {

	public static void main(String[] args) {
		
		/**
		Here we can't access rollNo variable of Student directly like stud.x = 10;
		Because access modifier of rollNo is private
		**/
		Student stud = new Student();
		System.out.println(stud);
		
		/**
		 * But we can access empId directly cause it's access modifier is default
		 */
		Employee emp = new Employee();
		emp.empId = 1001; 
		System.out.println(emp);

	}

}

class Student {
	private int rollNo;

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
	
}

class Employee{
	int empId;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
}