package synchronization;

/***
 * 
 * @author Shri
 * 
 * We can use synchronized block three ways:
 * 
 * 	1. To lock current object :
 * 		synchronized(this){
 * 		}
 * 
 * 	2. To lock particular object :
 * 		synchronized(object_name){
 * 		}
 * 	
 * 	3. To lock class level :
 * 		synchronized(ClassName.class){
 * 		}
 *
 */

class DisplayBlock{
	public void wish(String name){
		System.out.println("wish before line 1");
		System.out.println("wish before line 2");
		System.out.println("wish before line 3");
		/**
		 * Synchronize this for loop only for current object
		 */
		synchronized(this){
			for(byte i=0; i<=5; i++){
				System.out.println("Good Morning :" + name);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException ie){}
			}
		}
		System.out.println("wish after line 1");
		System.out.println("wish after line 2");
		System.out.println("wish after line 3");
	}
}
class SynchronizedBlockThread extends Thread{
	DisplayBlock display;
	String name;
	SynchronizedBlockThread(DisplayBlock display, String name){
		this.display = display;
		this.name = name;
	}
	public void run(){
		display.wish(name);
	}
}
public class SynchronizationBlockExample {

	public static void main(String[] args) {
		DisplayBlock db = new DisplayBlock();
		
		SynchronizedBlockThread sbt = new SynchronizedBlockThread(db, "Dhoni");
		SynchronizedBlockThread sbt1 = new SynchronizedBlockThread(db, "Yuvraj");
		
		sbt.start();
		sbt1.start();
	}

}
