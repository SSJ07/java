package interthread;

/**
 * 
 * @author Shri
 * 
 * Following methods are used to intercommunication of threads.
 * wait()
 * notify()
 * notifyAll()
 * 
 * These methods are only methods which releases lock on object.
 * These methods always calls inside synchronized area.Otherwise will give IllegalMoniterException.
 * These methods are in Object class not in thread class.
 * When we call wait(), then it releases lock immediately.
 * When we call notify(), then it may not release lock immediately.
 *
 */

class InterThread extends Thread{
	int total;
	public void run(){
		/**
		 * notify() always call from synchronized area
		 */
		synchronized(this){
			for(byte i=0; i<=100; i++){
				total+=i;
			}
			System.out.println("child thread is trying to notify main thread");
			this.notify();
		}
	}
}
public class InterThreadCommExample {

	public static void main(String[] args) throws InterruptedException {
		
		InterThread it = new InterThread();
		it.start();
		
		/**
		 * wait always call from synchronized area
		 */
		synchronized(it){
			System.out.println("Main thread is trying to enter wait state:");
			it.wait();
			System.out.println("Main thread got notification ");
			System.out.println("Total="+ it.total);
		}
		
	}

}
