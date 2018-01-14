package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Shri
 *  
 * Employee class
 *
 */
class Employee1{

	private int empId;
	private String empName;
	private String empCompany;
	
	public Employee1(int empId, String empName, String empCompany) {
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
}	

/**
 * 
 * @author Shri
 * Define your own class to compare Employee1 class objects by implementing Comparator Interface
 */

class EmpIdComparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 emp, Employee1 emp1) {
		/** Here is logic to compare employee objects **/
		if(emp.getEmpId() == emp1.getEmpId())
			return 0;
		return emp.getEmpId() < emp1.getEmpId()?-1:1;
	}
	
}


public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Employee1> empList = new ArrayList<Employee1>();
		Employee1 emp = new Employee1(1001, "Ganesh", "ABC Ltd");
		Employee1 emp1 = new Employee1(1002, "Vinay", "PQR Ltd");
		Employee1 emp2 = new Employee1(1003, "Ajay", "XYZ Ltd");
		Employee1 emp3 = new Employee1(1004, "Shri", "LMN Ltd");
		Employee1 emp4 = new Employee1(1005, "Ram", "ABC Ltd");

		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
		/** Before sorting employee list **/
		System.out.println("** Before sorting employee list **");
		for(Employee1 empObj : empList){
				System.out.println(empObj);
		}
		
		Collections.sort(empList, new EmpIdComparator());
		
		/** After sorting employee list **/
		System.out.println("** After sorting employee list **");
		for(Employee1 empObj : empList){
				System.out.println(empObj);
		}

	}

}
