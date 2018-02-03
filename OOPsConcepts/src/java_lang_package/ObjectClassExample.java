package java_lang_package;

/**
 * 
 * @author Shri
 * 
 * Object class is top most class in class hierarchy in java
 * Every java class inherits all methods of Object class.
 * It means all java objects have common properties of Object class.
 * Object can be:
 * 		compared
 * 		cloned
 * 		notified
 * 
 * Object class methods(All methods are public except clone() and finalize()):
 * 		1: Class<?> getClass() : returns Class class object
 * 		2: int hashCode() : returns hashcode number 
 * 		3: String toString() : return object into human readable format
 * 		4: boolean equals(Object o) : compare current object with given object.
 * 									  default use == operator to comparison
 * 		5: protected Object clone()throws ClassNotSupportedException:
 * 		6: protected void finalize()throws Throwable
 * 		7: final void wait() throws IntrupptedException
 * 		8: final void wait(long ms) throws IntrupptedException
 * 		9: final void wait(long ms, int ns) throws IntrupptedException
 * 		10: final void notify(long ms)
 * 		11: final void notifyAll(long ms)
 * 
 * 		Note : Object class contains 12 methods. 12th method is 
 * 			   private static native registerNatives();
 * 			   it used internally.
 * 
 * 		
 *
 */

public class ObjectClassExample {

	public static void main(String[] args) throws InterruptedException {

		ObjectClassExample oc = new ObjectClassExample();
		System.out.println("oc=" + oc); //internally calles toString()
		System.out.println("toString="+oc.toString()); //same as above
		System.out.println("hashCode="+ oc.hashCode());
		System.out.println("class="+ oc.getClass());
		synchronized(oc){
			oc.wait(100); 
			oc.notify();
		}
		
	}

}
