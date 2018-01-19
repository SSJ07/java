package interthread;

class A{
	
	public synchronized void d1(B b){
		System.out.println("Thread1 starting execution of d1 method of class A");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		
		System.out.println("Thread1 calling b.last()");
		b.last();
		
	}
	public synchronized void last(){
		System.out.println("executing last method of class A");
	}
}
class B{
	
	public synchronized void d2(A a){
		System.out.println("Thread1 starting execution of d2 method of class B");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		
		System.out.println("Thread1 calling a.last()");
		a.last();
		
	}
	public synchronized void last(){
		System.out.println("executing last method of class B");
	}
}
public class DeadlockExample extends Thread {
	
	A a = new A();
	B b = new B();
	
	public void method(){
		this.start();
		a.d1(b);
	}
	public void run(){
		b.d2(a);
	}
	public static void main(String[] args) {

		DeadlockExample dl = new DeadlockExample();
		dl.method();
	}

}
