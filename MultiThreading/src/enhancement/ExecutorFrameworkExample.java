package enhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	String name;
	PrintJob(String name){
		this.name = name;
	}
	public void run(){
		System.out.println("Job started by :" + Thread.currentThread().getName() + " :" + name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Job ended by   :" + Thread.currentThread().getName() + " :" + name);
	}
}


public class ExecutorFrameworkExample {

	public static void main(String[] args) {

		PrintJob [] jobs = { new PrintJob("Dhoni"),
							 new PrintJob("Yuvraj"),
							 new PrintJob("Shikhar"),
							 new PrintJob("Sehwag"),
							 new PrintJob("Sachin"),
							 new PrintJob("Pandya")};
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		for(PrintJob job : jobs){
			service.submit(job);
		}
		service.shutdown();
	}		

}
