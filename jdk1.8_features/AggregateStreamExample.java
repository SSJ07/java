package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String name;
	String department;
	public Employee(int empId, String name, String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	 
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
public class AggregateStreamExample {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1001, "Aajay", "IT");
		Employee emp1 = new Employee(1002, "Ganesh", "Sales");
		Employee emp2 = new Employee(1003, "Bunny", "Finance");
		Employee emp3 = new Employee(1004, "Sandhya", "IT");
		Employee emp4 = new Employee(1001, "Aajay", "IT");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		
		Map<String, List<Employee>> deprtEmpList = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(deprtEmpList);
		
	}

}
