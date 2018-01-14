package oops;

/**
 * @author Shri
 * String : String is immutable/can't change
 * StringBuffer : Immutable and synchronized. Thread safe
 * StringBuilder: Immutable. Not Synchronized. Not Thread safe.
 *
 */
public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		/**
		 * Conclusion:
		 * 1. If content is fixed and don't want to change then should go for String.
		 * 2. If context is not fixed and keep on changing but thread safety is required
		 * 	  then we should go for StringBuffer.
		 * 3. If context is not fixed and keep on changing but thread safety is not required
		 * 	  then we should go for StringBuilder
		 */

		/**
		 * create object into heap. ex: id=19
		 */
		String heapString =  new String("Hello");
		/**
		 * Create object in string constant pool. ex: id=23
		 */
		String constantPoolString = "Hello";
		/**
		 * Here it will not create new object. 
		 * It will point previous object. ex: id=23
		 */
		String constPoolString = "Hello"; 
		
		/** 
		 * It will create new object "Hello Java". ex: id=24
		 * It will not update existing s object.
		 */
		String change_heapString = heapString.concat(" Java");  
		System.out.println("heapString :" + heapString);
		System.out.println("change_heapString :" + change_heapString);
		
		/**
		 * It will not create new object. It just modify existing object
		 * At time one thread can access it.
		 * Thread safe
		 */
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append(" StringBuffer");
		
		/**
		 * It will not create new object. It just modify existing object
		 * Multiple thread can access it.
		 * Not Thread safe. 
		 */
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append(" StringBuilder");
		
		System.out.println("stringBuffer :" + stringBuffer);
		System.out.println("stringBuilder :" + stringBuilder);
	}

}
