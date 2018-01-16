package map;

import java.util.HashMap;
import java.util.Map;

class Customer{
	int id;
	String name;
	Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	Customer(Customer customer){
		this.id = customer.id;
		this.name = customer.name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class MapCollisionDemo {

	public static void main(String[] args) {

		String a = "a";
		String b = "b";
		
		Customer c1 = new Customer(1, "ram");
		Customer c2 = new Customer(2, "jay");
		Customer c3 = new Customer(1, "ram");
		Customer c4 = new Customer(c2);
		
		Map<Customer, String> map = new HashMap<>();
		map.put(c1, "Java");
		map.put(c2, "Python");
		
		a = map.get(c3);
		b = map.get(c4);
		System.out.println(a + " and "+ b);
		/**
		 * output will be:: Java and Python
		 */
	}

}
