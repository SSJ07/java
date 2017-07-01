package org.shri.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee{
	int empId;
	String empName;
	String deptName;
	public Employee(){
		
	}
	public Employee(int empId, String empName, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
}

/** sorting employee list by employee id **/
class CompareEmployeeById implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()==o2.getEmpId())
			return 0;
		return o1.getEmpId() < o2.getEmpId() ? -1: 1;
	}
}
/** sorting employee list by employee name **/
class CompareEmployeeByName implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

/** sorting employee list by employee dept **/
class CompareEmployeeByDept implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.getDeptName().compareTo(o2.getDeptName());
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001, "shrikant", "IT");
		Employee emp2 = new Employee(1002, "ganesh", "Marketing");
		Employee emp3 = new Employee(1003, "ramesh", "Sales");
		Employee emp4 = new Employee(1004, "shrikant", "IT");
		
		//TreeSet tr = new TreeSet(new CompareEmployeeById());
		//TreeSet tr = new TreeSet(new CompareEmployeeByName());
		TreeSet tr = new TreeSet(new CompareEmployeeByDept());
		
		tr.add(emp1);
		tr.add(emp2);
		tr.add(emp3);
		tr.add(emp4);
		System.out.println(tr);
		
	}

}
