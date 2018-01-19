package interthread;


/**
 * 
 * @author Shri
 * 
 * Daemon thread is thread which execute in background to provide support for non-daemon thread.
 * 
 *
 */

class DaemonThread extends Thread{
	public void run(){
		System.out.println("executing daemon thread");
	}
}
public class DaemonThreadExample {

	public static void main(String[] args) {

		System.out.println("Is main thread daemon thread? :" + Thread.currentThread().isDaemon());
		/**
		 * This below line will give runtime exception as :
		 * 	java.lang.IllegalThreadStateException
		 * Cause main thread already started by JVM.
		 * Once thread is started we can't change daemon nature of thread.
		 */
//		Thread.currentThread().setDaemon(true);
		
		DaemonThread dt = new DaemonThread();
		System.out.println("is this daemon thread :" + dt.isDaemon());
		
		dt.setDaemon(true);
		
		System.out.println("is this daemon thread :" + dt.isDaemon());
	}

}
