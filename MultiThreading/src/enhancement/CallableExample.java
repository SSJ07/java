package enhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Object>{
	int num;
	MyCallable(int num){
		this.num  = num;
	}
	public Object call(){
		int sum = 0;
		System.out.println(Thread.currentThread().getName() + " is resonsible to find sum of :" + num + " numbers");
		for(int i=1; i<=num; i++){
			sum+=i;
		}
		return sum;
	}
}


public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable [] calls = {
								new MyCallable(10),
								new MyCallable(20),
								new MyCallable(30),
								new MyCallable(40),
								new MyCallable(50),
								new MyCallable(60)};
			ExecutorService service = Executors.newFixedThreadPool(3);
			for(MyCallable call : calls){
				Future<?> f = service.submit(call);
				System.out.println(f.get());
		}

	}

}
