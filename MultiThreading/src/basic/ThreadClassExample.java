package basic;

/**
 * 
 * @author Shri
 * 
 * Creating java thread by extending Thread class.
 *
 */

class ThreadDemo extends Thread{
	/**
	 * This method executed after we start thread.
	 */
	public void run(){
		for(byte i=0; i<10; i++){
			System.out.println("child thread="+i);
		}
	}
}
public class ThreadClassExample {

	public static void main(String[] args) {

			/**
			 * Here we created one thread
			 * td.start() : this line is responsible to create new thread and 
			 * 				execute run method.
			 * td.run(): if directly call this method then. It won't create new thread and call run()
			 * 			method as normal method and it will execute by main thread.
			 */
			ThreadDemo td = new ThreadDemo(); //thread initialization
			td.start(); //activating thread
//			td.run();
			
			/**
			 * This is main thread.
			 * Here two thread are:
			 * 		1. main thread
			 * 		2. ThreadDemo thread created & executed by main thread
			 */
			for(byte i=0; i<=10; i++){
				System.out.println("main thread="+i);
			}
	}

}
