package basic;
/**
 * 
 * @author Shri
 * 
 * yield method causes to pause current executing thread to give the chance for 
 * 	waiting thread of same priority. 
 * If multiple thread waiting with same priority then which thread will get chance we can't expect it depend on thread scheduler.
     The thread which is yielded it will get chance it's depend on thread scheduler.
      
     public static native void yield();
     
     some platform want' provide for support for yield method.

 *
 */

class YieldThread extends Thread{
	public void run(){
		for(byte i=0; i<=10; i++){
			System.out.println("YieldThread :" + i);
			yield();
		}
	}
}
public class ThreadYieldExample {

	public static void main(String[] args) {

		System.out.println("main thread");
		YieldThread yt = new YieldThread();
		yt.start();
		
		for(byte i=0; i<=10; i++){
			System.out.println("main thread :" + i);
		}
	}

}
