package basic;

/**
 * 
 * @author Shri
 * 
 * We can interrupt sleeping thread or waiting thread by using interrupt() method 
 * of Thread class.
 *
 */

class InterruptThread extends Thread{
	public void run(){
		try{
			for(byte i=0; i<=10; i++){
				System.out.println("child thread val="+i);
				
					Thread.sleep(2000);
			}
		}catch(InterruptedException ie){
				System.out.println("Child thread interrupted.");
			}
	}
}
public class ThreadInterruptedExample {

	public static void main(String[] args) {

		InterruptThread it = new InterruptThread();
		it.start();
		
		it.interrupt();
		System.out.println("End of main thread");
		
		/**
		 * output will be:
		 * 
		 * 	End of main thread
			child thread val=0
			Child thread interrupted.
		 */
	}

}
