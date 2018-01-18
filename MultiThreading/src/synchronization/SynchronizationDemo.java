package synchronization;

class WishMessage{
	/**
	 * 
	 * This method is synchronized.This will not allowed multiple thread to access same
	 * time. It is accessible one thread at time.
	 * That's why It's called thread safe.
	 * 
	 * If we are not declaring wish method as synchronized then all thread will
	 * executed simultaneously. result will be mixed 
	 * @param name
	 */
	public synchronized void wish(String name){
		for(byte i=0; i<=5; i++){
			System.out.print("Good Morning :");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				
			}
			System.out.println(name);
		}
	}
}

class MessageThread extends Thread{
	WishMessage message;
	String name;
	MessageThread(WishMessage message, String name){
		this.message = message;
		this.name = name;
	}
	public void run(){
		message.wish(name);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		WishMessage message = new WishMessage();
//		WishMessage message1 = new WishMessage();
		MessageThread mt = new MessageThread(message, "sachin");
		MessageThread mt1 = new MessageThread(message, "sehwag");
//		MessageThread mt2 = new MessageThread(message1, "dhoni");
//		MessageThread mt3 = new MessageThread(message1, "yuvraj");
		
		mt.start();
		mt1.start();
//		mt2.start();
//		mt3.start();
		
		/**
		 * If we uncomment above code. then will get irregular output.
		 * Because synchronized is used when multiple thread operating on single java
		 * object.
		 * But multiple thread operating on multiple java object then 
		 * synchronization is not required.
		 */
	}

}
