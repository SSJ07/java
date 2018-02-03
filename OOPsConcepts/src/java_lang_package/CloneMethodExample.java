package java_lang_package;

/**
 * 
 * @author Shri
 * 
 * The process of creating exact duplicate object is called cloning.
 * To maintain backup copy & preserve state of original object is main purpose of clone()
 * We can perform cloning by using clone()
 * Need to implement interface Cloneable
 * Need to override clone() method in custom class.
 * 
 * There are 2 type of cloning :
 * 			1. Shallow copy/cloning : 
 * 				-> It is create partially copy of object.
 * 				-> The process of creating bitwise copy of an object is called shallow cloning.
 * 				-> If main object contain primitive variables then exactly duplicate copies will be created in cloned object
 * 				-> If main object contain any reference variable then corrosponding won't be created. Just duplicate
 * 					reference will be created pointing to old object
 * 				-> Object class clone() method means for shallow cloning
 * 				-> Shallow cloning is not recommended
 * 				
 * 			2. Deep copy/cloning:
 * 				-> The process of creating exactly duplicate independent copy including contained object
 * 						is called deep called.
 * 				-> If main contain any primitive variable then cloned object duplicate copies will be created.
 * 				-> If main object contains any reference variable then corresponding contained object will created
 * 					in cloned copy.
 * 				-> By default object class clone method meant for shallow cloning
 * 				-> But we can implement deep cloning explicity by overriding clone method in our class.
 * 
 */

class Message{
	String msg;
	Message(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}
}
class CloneDemo implements Cloneable{
	
	public int id;
	public Message msg;
	
	public CloneDemo(int id, Message msg) {
		super();
		this.id = id;
		this.msg = msg;
	}
	protected Object clone()throws CloneNotSupportedException{
		return super.clone(); // it is shallow cloning
		
		/**
		 * If you want deep cloning then uncomment below code
		 */
//		Message message = new Message(msg.msg);
//		return new CloneDemo(id, message);
	}
	@Override
	public String toString() {
		return "CloneDemo [id=" + id + ", msg=" + msg + "]";
	}
	
}
public class CloneMethodExample{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Message message = new Message("Good Morning");
		CloneDemo cm = new CloneDemo(1001,message);
		CloneDemo cp = (CloneDemo)cm.clone();
		System.out.println("cloned object before changes :" + cp);
		cp.id = 1003;
		cp.msg.msg="changed";
		System.out.println("cloned object after changes :" + cp);
		System.out.println("original object after cloned object changes :" + cm);
		
	}

}
