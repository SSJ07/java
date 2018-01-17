package basic;

/**
 * 
 * @author Shri
 * 
 * Java allowed to overload thread run method.
 * But it will treat as normal method.
 * 
 *
 */

class ThreadExample extends Thread{
	/**
	 * When we call te.start(). This run method will execute as default.
	 * If we not override this method then jvm will call default run method of Thread 
	 * 	class which has empty implementation. So no any output.
	 * If you don't won't override run method then don't use multithreading
	 */
	public void run(){
		System.out.println("child thread with default run");
	}
	/**
	 * 
	 * This method is overloaded method. 
	 * This method treated as normal method.
	 * It will not execute after te.start()
	 * We need explicitly call this method.
	 */
	public void run(int i){
		System.out.println("child thread with argument");
	}
	
}
public class OverloadingRunMethodExample {

	public static void main(String[] args) {

		ThreadExample te = new ThreadExample();
		te.start();
//		te.run(10);
	}

}
