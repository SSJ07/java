package basic;

/**
 * 
 * @author Shri
 * 
 *
 */
class ThreadJoin extends Thread{
	public void run(){
		for(byte i=0; i<=10; i++){
			System.out.println("ThreadJoin="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * join method is used to other thread until complete joined thread.
		 * Every join method throws interrupted exception which is checked exception.
		 * 
		 */
		ThreadJoin tj = new ThreadJoin();
		tj.start();
//		tj.join();
		tj.join(10000);
//		tj.join(2000L, 3042);
		
		for(byte i=0; i<=10; i++){
			System.out.println("main thread="+i);
		}
		
	}

}
