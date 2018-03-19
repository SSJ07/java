package enhancement;


class NewThread extends Thread{
	NewThread(ThreadGroup tg, String name){
		super(tg, name);
	}
	public void run(){
		System.out.println("Child Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadGroupMethodsExample {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tg = new ThreadGroup("ThreadGroup");
		ThreadGroup cg = new ThreadGroup(tg, "ChildThread");
		NewThread tA = new NewThread(tg, "Thread-A");
		NewThread tB = new NewThread(tg, "Thread-B");
		tg.setMaxPriority(3);
		NewThread tC = new NewThread(tg, "Thread-C");
		
		/**
		 */
		System.out.println("******************** Thread priorities are ********************");
		System.out.println("Priority of Thread-A: " + tA.getPriority());
		System.out.println("Priroity of Thread-B: " + tB.getPriority());
		System.out.println("Priority of Thread-C:" + tC.getPriority());
		
		System.out.println("***************List of all active thread and thread group in threadgroup *****************");
		tA.start();
		tB.start();
		tC.start();
		tg.list();
		
		System.out.println("Active thread group count :" + tg.activeGroupCount()); //1
		System.out.println("Active thread count :" + tg.activeCount()); // 3= tA,tB,tC
		
		
		System.out.println("*****************Read all thread names in particular thread group************************");
		Thread [] tArray = new Thread[tg.activeCount()];
		tg.enumerate(tArray);
		for(Thread t : tArray){
			System.out.println(t.getName());
		}
		
		
		Thread.sleep(10000);
		cg.destroy();
		System.out.println("Active thread group count :" + tg.activeGroupCount()); //1
		System.out.println("Active thread count :" + tg.activeCount()); // 0
		
		
		
		
	}

}
