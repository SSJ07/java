package basic;

/**
 * 
 * @author Shri
 * In java we create new thread by two ways:
 * 		1. extends Thread class
 * 		2. implements Runnable interface : recommended 
 *
 *	Runnable interface present in java.lang package.
 *  It contains only one method that is run()
 */

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(byte i=0; i<=10; i++){
			System.out.println("child thread="+i);
		}
	}
	
}
public class RunnableInterfaceExample {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable(); // Create runnable object
		Thread thread = new Thread(myRunnable); // Initialize new thread with runnable object
		thread.start();
		
		for(byte i=0; i<=10; i++){
			System.out.println("main thread="+i);
		}
	}

}
