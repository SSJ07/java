package interthread;

import java.util.LinkedList;

class ProducerConsumer{
	
	LinkedList<Integer> list;
	int value =0;
	ProducerConsumer(){
		list = new LinkedList<Integer>();
	}
	public void produce(){
		for(byte i=0; i<=5; i++){
			synchronized (this) {
				if(list.size() == 1){
					try{
						this.wait();
					}catch(InterruptedException ie){}
				}
				
				list.add(value++);
				System.out.println("producer producing value="+ value);
				this.notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void consume(){
		for(byte i=0; i<=5; i++){
			synchronized(this){
				if(list.size() == 0){
					try{
						this.wait();
					}catch(InterruptedException ie){}
				}
				
				list.removeFirst();
				System.out.println("Consumer consuming value="+ value);
				this.notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
class ProduceThread extends Thread{
	ProducerConsumer pc;
	ProduceThread(ProducerConsumer pc){
		this.pc = pc;
	}
	public void run(){
		pc.produce();
	}
}

class ConsumeThread extends Thread{
	ProducerConsumer pc;
	ConsumeThread(ProducerConsumer pc){
		this.pc = pc;
	}
	public void run(){
		pc.consume();
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		ProducerConsumer pc = new ProducerConsumer();
		
		ProduceThread pt = new ProduceThread(pc);
		ConsumeThread ct = new ConsumeThread(pc);
		pt.start();
		ct.start();
	}

}
