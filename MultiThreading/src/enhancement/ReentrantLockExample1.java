package enhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class InfiniteThread extends Thread{
	static ReentrantLock rl = new ReentrantLock();
	InfiniteThread(String name){
		super(name);
	}
	public void run(){
		do{
			try {
				if(rl.tryLock(3000, TimeUnit.MILLISECONDS)){
					System.out.println(Thread.currentThread().getName() +  " Got Lock");
					Thread.sleep(10000);
					rl.unlock();
					System.out.println("Released lock by thread :" + Thread.currentThread().getName());
					break;
				}else{
					System.out.println("Unable to acquire Lock by :" + Thread.currentThread().getName());
					System.out.println("Trying acquire to lock by :" + Thread.currentThread().getName());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}while(true);
	}
}


public class ReentrantLockExample1 {

	public static void main(String[] args) {

			InfiniteThread it = new InfiniteThread("Thread-A");
			InfiniteThread it1 = new InfiniteThread("Thread-B");
			it.start();
			it1.start();
	}

}

