package org.shri.utility;

import java.util.ArrayList;
import java.util.Collections;


/**
 * @author Shri
 *  
 * Employee class must implement Comparable Interface
 *
 */
class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private String empCompany;
	
	public Employee(int empId, String empName, String empCompany) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCompany = empCompany;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCompany=" + empCompany + "]";
	}

	@Override
	public int compareTo(Employee o) {
		/** Here is logic to compare employee objects **/
		if(this.empId == o.empId)
			return 0;
		return this.empId < o.empId?-1:1;
	}
	
}


public class ComparableExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1001, "Ganesh", "ABC Ltd");
		Employee emp1 = new Employee(1002, "Vinay", "PQR Ltd");
		Employee emp2 = new Employee(1003, "Ajay", "XYZ Ltd");
		Employee emp3 = new Employee(1004, "Shri", "LMN Ltd");
		Employee emp4 = new Employee(1005, "Ram", "ABC Ltd");

		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
		/** Before sorting employee list **/
		System.out.println("** Before sorting employee list **");
		for(Employee empObj : empList){
				System.out.println(empObj);
		}
		
		Collections.sort(empList);
		/** After sorting employee list **/
		System.out.println("** After sorting employee list **");
		for(Employee empObj : empList){
				System.out.println(empObj);
		}
	}

}

