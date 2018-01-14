package LanguageFundamentals;

public class ModifiersDemo{
	final static int x=10;
	public static void main(String args[]){
		/* in java 12 modifier are available :
		SNo	Modifiers	variable 	method 		class
		------------------------------------------------------------------
		1	default		yes		yes		yes	
		2	private		yes		yes		no(Inner classes allow)
		3	public 		yes		yes		yes
		4	protected	yes		yes		no(Inner classes may be)
		5	transient	yes		no		no
		6	volatile	yes		no		no
		7	sychronized	no		yes		no
		8	static		yes		yes		no(Inner classes)	
		9	strictfp	no		yes		yes
	       10	final		yes		yes		yes
	       11	abstract	no		yes		yes
	       12	native		no		yes		no
	       */


		/* illegar modifiers combinations:
		   public private = wrong
		   public protected = wrong
		   private protected = wrong
		   abstract final  = wrong
		*/
		ModifiersDemo md = new ModifiersDemo();
		System.out.println("x = :" + md.x);
	}
}
