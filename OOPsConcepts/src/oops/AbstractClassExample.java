package oops;

public class AbstractClassExample {

	public static void main(String[] args) {
		Artist a = new Artist();
		
	}

}

abstract class Person{
	Person(){
		System.out.println("Default person constructor");
	}
	private String name;
	abstract void showName();
}

class Artist extends Person{

	Artist(){
		System.out.println("Default Artist constructor");
	}
	@Override
	void showName() {

		System.out.println();
	}
	
}