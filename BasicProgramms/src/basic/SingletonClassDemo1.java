package basic;

class SingletonClass{
	private static SingletonClass singletonClass;
	private SingletonClass(){
		singletonClass = null;
	}
	public static SingletonClass getInstance(){
		if(singletonClass == null){
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}
}
public class SingletonClassDemo1 {

	public static void main(String[] args) {

		SingletonClass sc = SingletonClass.getInstance();
		SingletonClass sc1 = SingletonClass.getInstance();
		
		System.out.println("Hashcode of sc = "+sc.hashCode());
		System.out.println("Hashcode of sc1 = "+sc1.hashCode());
		
	}

}
