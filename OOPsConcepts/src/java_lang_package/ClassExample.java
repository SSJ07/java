package java_lang_package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @author Shri
 * 
 * We can use getClass() to get runtime class definition of an object.
 * 
 * public final Class getClass()
 * 
 * By using this Class class object,we can access class level information like class name, constructors, methods.
 * After loading every class by classloader. JVM will create Class class object for all .class files in heap.
 *
 */

class ClassDemo{
	
	private int id;
	private String name;
	
	public ClassDemo(){
		
	}
	public ClassDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void show(){
		System.out.println("This is show method");
	}
	
}
public class ClassExample {

	public static void main(String[] args) {

		ClassDemo cd = new ClassDemo();
		Class c = cd.getClass();
		
		System.out.println("Class name is :" + c.getName());
		System.out.println("\n*******all constructos of class ClassDemo*******");
		for(Constructor ct: c.getConstructors()){
			System.out.println(ct);
		}
		System.out.println("\n*******all declared methods of class ClassDemo*******");
		for(Method ct: c.getDeclaredMethods()){
			System.out.println(ct);
		}
		System.out.println("\n*******all delcared fields of class ClassDemo*******");
		for(Field ct: c.getDeclaredFields()){
			System.out.println(ct);
		}
	}

}
