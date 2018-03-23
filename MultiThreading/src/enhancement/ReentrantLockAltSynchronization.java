package enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockAltSynchronization {

	public static void main(String[] args) {

		Display display = new Display();
		DisplayThread dt = new DisplayThread(display, "Dhoni");
		DisplayThread dt1 = new DisplayThread(display, "Yuvraj");
		dt.start();
		dt1.start();
	}

}

class Display{
	
	ReentrantLock rl = new ReentrantLock(); // create object of reentrant lock here
	
	public void show(String name){
		rl.lock(); // acquire lock here
		for(int i=0; i<10; i++){
			System.out.println("Good Morning :" + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		rl.unlock(); // release lock here
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
		display.show(name);
	}
}