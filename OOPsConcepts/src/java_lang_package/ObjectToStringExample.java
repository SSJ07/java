package java_lang_package;

class ToStringExample{
	
	private String name;

	public ToStringExample(String name) {
		super();
		this.name = name;
	}

	/**
	 * Override toString() method of an object class.
	 * To get custom string representation of an object used this method
	 */
	@Override
	public String toString() {
		return "ToStringExample [name=" + name + "]";
	}
	
}
class ToString{
	private String name;

	public ToString(String name) {
		super();
		this.name = name;
	}
	/*
	 * Default implementation of toString() in Object class is 
	 */
	public String toString(){
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
}

public class ObjectToStringExample {

	public static void main(String[] args) {
	
		/*
		 * ToString class has not override toString() method
		 * It follows default implementation of toString() of an Object class
		 */
		ToString toString = new ToString("Default ToString");
		System.out.println("Default toString():" + toString);
		
		/*
		 * Overrided toString() method example
		 */
		
		ToStringExample ts = new ToStringExample("Overriden toString");
		System.out.println("Overriden toString() :" + ts);
		
		/*
		 * Every wrapper and collection classes has overrided toString() 
		 */
		String s= new String("Hello");
		System.out.println(s);
		System.out.println("s==s.toString()?:"+(s==s.toString()));
		
		StringBuffer sb = new StringBuffer("StringBuffer");
		System.out.println("Default toString() of Stringbuffer is :" + sb);

	}

}
