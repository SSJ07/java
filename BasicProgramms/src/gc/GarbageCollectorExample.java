
public class GarbageCollectorExample {

	public static void main(String[] args) {

		/**
		 * Garbage collector executed by jvm.
		 * It destroy all object those don't have any reference
		 */
		
		GarbageCollectorExample gc = new GarbageCollectorExample();
		GarbageCollectorExample gc1 = new GarbageCollectorExample();
		
		System.out.println("Object one :" + gc);
		System.out.println("Object second :" + gc1);
		
		/**
		 * Nullify both objects
		 */
		gc = null; // no more reference 
		
		
		/**
		 * call explicitly garbage collector
		 */
		System.gc();
		
		gc1 = null; // no more reference
		
		/**
		 * Call Runtime.getRuntime().gc()
		 */
		Runtime.getRuntime().gc();
	}
	
	/**
	 *  finalize() method is available in Object class.
	 *  It is used to clean up activity before object get destroy.
	 *  This method called by garbage collector not JVM.
	 *  You can customize this method as per yours requirements
	 */
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Calling garbage collector");
		System.out.println("Destroying object :" + this);
	}

}
