package oops;

/**
 * @author Shri
 * 
 * Java support method overloading.
 * Overloading means multiple methods with same name but different arguments.
 * It's called compile time polymorphism.
 * Automatic promotions support java in overloading
 * char -> int -> long -> float -> double 
 */
public class OverloadingExample {

	public void show(){
		System.out.println("Show method");
	}
	public void show(int i){
		System.out.println("show value :" + i);
	}
	public void show(int... x){
		System.out.println("show value="+ x);
	}
	public void show(float f){
		System.out.println("show value:" + f);
	}
	public void show(String s){
		System.out.println("show string value:"+ s);
	}
	public void show(StringBuffer sb){
		System.out.println("show string buffer value:"+ sb);
	}
	public void show(Object o){
		System.out.println("show object value:" + o);
	}
	
	
	public void show(int i, float f){
		System.out.println("i="+ i + " f="+f);
	}
	public void show(float f, int i){
		System.out.println("i="+ i + " f="+f);
	}
	public void show(Animal animal){
		System.out.println("show animal" + animal);
	}
	public void show(Tiger tiger){
		System.out.println("show tiger " +tiger);
	}
	public static void main(String[] args) {
		
		OverloadingExample oexample = new OverloadingExample();
		oexample.show();
		oexample.show(10.30f);
		oexample.show(10); // show old version not var-args method
		oexample.show("Overloading");
		oexample.show('a'); // promotes this char type to int
		oexample.show(100001l); // It promotes long to float value
		//oexample.show(null); //The method show(String) is ambiguous for the type OverloadingExample
		//oexample.show(10, 20);//The method show(int, float) is ambiguous for the type OverloadingExample
		oexample.show(10, 20.0f);
		oexample.show(20.0f, 30);
		
		Tiger tiger = new Tiger();
		oexample.show(tiger);
		
		Animal animal = new Animal();
		oexample.show(animal);
		
		Animal animal1 = new Tiger();
		oexample.show(animal1);

	}

}
class Animal{

	@Override
	public String toString() {
		return "Animal [toString()=" + super.toString() + "]";
	}
	
}
class Tiger extends Animal{

	@Override
	public String toString() {
		return "Tiger []";
	}

	
}
