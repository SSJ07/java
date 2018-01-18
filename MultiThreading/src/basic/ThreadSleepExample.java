package basic;

/**
 * 
 * @author Shri
 * 
 * If particular thread don't want' perform for particular time then we should go for sleep()
 * 
 *
 */
public class ThreadSleepExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Printing some statement");
		for(byte i=0; i<=10; i++){
			System.out.println("main thread value="+ i);
			Thread.sleep(2000);
		}
	}

}
