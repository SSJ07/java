package enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {

	public static void main(String[] args) {

		MyThread mt = new MyThread("Thread1");
		MyThread mt1 = new MyThread("Thread2");
		mt.start();
		mt1.start();
	}

}

class MyThread extends Thread{
	static ReentrantLock rl = new ReentrantLock();
	MyThread(String name){
		super(name);
	}
	public void run(){
		if(rl.tryLock()){
			System.out.println(Thread.currentThread().getName() + " Got lock performing safe operation");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rl.unlock();
		}else{
			System.out.println(Thread.currentThread().getName() + " not acquired lock. performing unsafe operation");
		}
	}
}