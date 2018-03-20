package enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	public static void main(String[] args) {

		ReentrantLock rl = new ReentrantLock();
		rl.lock();
		rl.lock();
		System.out.println("is Locked :" + rl.isLocked());
		System.out.println("is Held by Current thread :" + rl.isHeldByCurrentThread());
		System.out.println("Hold count :" + rl.getHoldCount());
		System.out.println("get queued length :" + rl.getQueueLength());
		rl.unlock();
		System.out.println("Hold count after unlock :" + rl.getHoldCount());
		System.out.println("is Locked :" + rl.isLocked());
		rl.unlock();
		System.out.println("Hold count after unlock :" + rl.getHoldCount());
		System.out.println("is Locked :" + rl.isLocked());
		System.out.println("is Fair :" + rl.isFair());
	}

}
