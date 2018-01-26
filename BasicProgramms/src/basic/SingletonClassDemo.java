package basic;

class Singleton{
	
	private static Singleton singleton = new Singleton();
	/**
	 * make private constructor
	 */
	private Singleton(){
		System.out.println("constructor");
	}
	/**
	 * make static method which return instance of this class
	 * @return Singleton
	 */
	public static Singleton getInstance(){
		return singleton;
	}
}


public class SingletonClassDemo {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("hashcode of s :" +s.hashCode());
		System.out.println("hashcode of s1 :" +s1.hashCode());
		System.out.println("hashcode of s2 :" +s2.hashCode());
	}

}
