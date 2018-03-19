package enhancement;

public class ActiveTheadNameExample {

	public static void main(String[] args) {

		/**
		 * Print all active thread names of system thread group
		 */
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread []t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread ta : t){
			System.out.println(ta.getName() + " :" + ta.isDaemon());
		}
	}

}
