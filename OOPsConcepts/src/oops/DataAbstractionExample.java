package oops;

/**
 * 
 * @author Shri
 * 
 * Data Abstraction is one of the main feature of java
 * Hiding implementation detail from end user and highlighting only services we are offering.
 * Here we achieve data abstraction by using methods.
 * Example : When you dial cell number from your mobile we just provide ui to enter mobile number
 * and click on dial icon and hiding implementation detail here.
 *
 */
public class DataAbstractionExample {

	public static void main(String[] args) {
		
		Employee1 employee = new Employee1();
		/** Here we offer method calculatePackage as service
		 *  And hiding calculation detail from end user.
		 */
		float packge = employee.calculatePackage(12000);
		System.out.println(packge);
		

	}

}


class Employee1{
	
	public float calculatePackage(float salary){
		/** Data abstaction**/
		return salary * 12;
	}
}