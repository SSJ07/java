package java_lang_package;

/**
 * 
 * @author Shri
 * 
 * hashCode() method of an object class called in toString() method of an object.
 *
 */

class DefaultClass{
	private int i;
	DefaultClass(int i){
		this.i=i;
	}
}

class OverrideHashCode{
	private int i;
	OverrideHashCode(int i){
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
//		return 100; // this is not proper way to generate hashCode
		// Because it will store all object into same bucket
	}
}

class OverrideHashCodeAndToString{
	private int i;
	OverrideHashCodeAndToString(int i){
		this.i=i;
	}
	public String toString(){
		return i + "";
	}
	@Override
	public int hashCode() {
		return i;
	}
}

public class HashCodeExample {

	public static void main(String[] args) {

		/**
		 * Default implementation of toString() and hashCode() method of an object 
		 */
		System.out.println("\n**** Default implementation of hashCode() and toString()******");
		DefaultClass dc = new DefaultClass(10);
		DefaultClass dc1 = new DefaultClass(100);
		System.out.println("dc=" + dc);
		System.out.println("dc1=" + dc1);
		
		/**
		 * Override hashCode() method example
		 */
		System.out.println("\n**** override hashCode()*****");
		OverrideHashCode hc = new OverrideHashCode(10);
		OverrideHashCode hc1 = new OverrideHashCode(100);
		System.out.println("hc=" + hc);
		System.out.println("hc1=" + hc1);
		
		/**
		 * Override hashCode()  and toString() method example
		 */
		System.out.println("\n**** override hashCode() and toString()******");
		OverrideHashCodeAndToString a = new OverrideHashCodeAndToString(10);
		OverrideHashCodeAndToString b = new OverrideHashCodeAndToString(100);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
