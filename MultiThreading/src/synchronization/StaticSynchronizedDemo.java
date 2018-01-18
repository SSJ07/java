package synchronization;

/**
 * 
 * @author Shri
 * 
 * In this case, we create wish() method static and synchronized.
 * So it will acquire class level lock, hence output will be regular 
 * as synchronized even multiple thread operate on multiple object.
 *
 */
class Display{
	public static synchronized void wish(String name){
		for(byte i=0; i<5; i++){
			System.out.println("Good Morning :" + name);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				
			}
		}
	}
}
class DisplayThread extends Thread{
	Display display;
	String name;
	DisplayThread(Display display, String name){
		this.display = display;
		this.name = name;
	}
	public void run(){
		display.wish(name);
	}
}
public class StaticSynchronizedDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		
		DisplayThread dt = new DisplayThread(d1, "Dhoni");
		DisplayThread dt1 = new DisplayThread(d2, "Yuvraj");
		
		dt.start();
		dt1.start();
	}

}
