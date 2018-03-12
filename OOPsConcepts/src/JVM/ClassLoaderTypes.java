package JVM;

import sun.text.resources.ar.CollationData_ar;

public class ClassLoaderTypes {

	public static void main(String[] args) {

		/**
		 * Bootstrap class loader : loads classes from jdk/jre/lib
		 * Extension class loader : loads classes from jdk/jre/lib/ext
		 * Application class loader: loads classes from environment class path
		 */
		
		System.out.println(String.class.getClassLoader()); // Bootstrap class loader
		System.out.println(CollationData_ar.class.getClassLoader()); // Extension class loader
		System.out.println(ClassLoaderTypes.class.getClassLoader()); // Application class loader
		
		/**
		 * output will be :
		 * 
		 * 	null (Because Bootstrap class is not implemented in java. It's not java object )
			sun.misc.Launcher$ExtClassLoader@1f96302
			sun.misc.Launcher$AppClassLoader@139a55
		 * 
		 */
	}

}
