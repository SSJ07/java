package synchronization;


class Display1{
	public synchronized void displayNumber(){
		for(byte i=0; i<=5; i++){
			System.out.println("Number :" + i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
	public synchronized void displayChar(){
		for(byte i=65; i<=70; i++){
			System.out.println("char :" + (char)i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
}

class DisplayNumberThread extends Thread{
	Display1 display;
	DisplayNumberThread(Display1 display){
		this.display = display;
	}
	public void run(){
		display.displayNumber();
	}
}

class DisplayCharThread extends Thread{
	Display1 display;
	DisplayCharThread(Display1 display){
		this.display = display;
	}
	public void run(){
		display.displayChar();
	}
}
public class SynchronizationDemo1 {

	public static void main(String[] args) {

			Display1 display = new Display1();
			
			DisplayNumberThread dnt = new DisplayNumberThread(display);
			DisplayCharThread dct  = new DisplayCharThread(display);
			
			dnt.start();
			dct.start();
	}

}
