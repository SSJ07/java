package JVM;

class LoadingDemo{
	int x;
	public void show(){
		System.out.println("x = " + x);
	}
}
public class ClassLoadingExample {

	public static void main(String[] args) {

		/**
		 * JVM contains class loader subsystem.
		 * It's responsible to load .class files into various memory areas of JVM
		 * But loading of each file is happens only one time.
		 */
		
		
		/**
		 * Here .class of LoadingDemo class information is loaded into method area 
		 * and Class class object created into heap area for only ones
		 */
		
		LoadingDemo ld = new LoadingDemo(); 
		/**
		 * Here it will not load and create new object of Class class. It will point same object of CLass class in heap.
		 */
		LoadingDemo ld2 = new LoadingDemo();
		
		Class c = ld.getClass();
		Class c2 = ld.getClass();
		
		System.out.println("Class c object hashcode :" + c.hashCode());
		System.out.println("Class c2 object hashcode :" + c2.hashCode());
		System.out.println("c==c2 ? :" + (c==c2));
	}

}
