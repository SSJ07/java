package enhancement;

public class ThreadGroupHierarchy {

	public static void main(String[] args) {

		/**
		 * Every thread group in java belongs to system group directly or indirectly.
		 * 
		 */
		
		ThreadGroup tg = new ThreadGroup("TG1");
		ThreadGroup tg1 = new ThreadGroup(tg, "TG2");
		
		/**
		 * Here TG1 threadgoup is child group of main thread
		 * And TG2 is child of TG1 thread group
		 */
		
		System.out.println("Current threadgroup is :" + Thread.currentThread().getThreadGroup().getName());
		System.out.println("Parent group of TG1 :" + tg.getParent().getName());
		System.out.println("Parent group of TG2 :" + tg1.getParent().getName());
		
		/**
		 * So hierarchy of thread group is :
		 * 
		 * System TG -> main TG -> TG1 -> TG2
		 */
	}

}
