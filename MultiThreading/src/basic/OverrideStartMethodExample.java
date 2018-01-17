package basic;

/**
 * 
 * @author Shri
 * 
 * We can override start() method of Thread class.
 * But it will treat as normal method.
 * It will not create new thread and overrided method will execute by main thread only.
 *
 */
class ThreadStart extends Thread{
	/**
	 * override start() method of Thread class.
	 */
	public void start(){
//		super.start(); // here it will create new thread and will execute run() method.
		System.out.println("Overridding start method of Thread class");
	}
	public void run(){
		System.out.println("child thread");
	}
}
public class OverrideStartMethodExample {

	public static void main(String[] args) {

		/**
		 * Initialize new thread
		 */
		ThreadStart ts = new ThreadStart();
		ts.start();
		/**
		 * output will be : Overridding start method of Thread class
		 * Here new thread will not create and it treat start() method as normal method.
		 * so run() method will not execute after ts.start() call
		 * 
		 * But if we uncomment line no : 17 super.start() then it will create new thread 
		 * and execute run method. Possible output is :
		 * 
		 * o/p : Overridding start method of Thread class
		 * 		 child thread
		 * 
		 */
	}

}
