package enhancement;

public class ThreadGroupExample {

	public static void main(String[] args) {

		/**
		 * Every thread group in java belongs to system group either directly or indirectly.
		 * ThreadGoup is child class of Object class.
		 * It's resides in java.lang package.
		 * main method belongs main thread group.
		 */
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}

}
