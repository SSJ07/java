public class DataTypeDemo{

	byte bt;short sh;int it;
	long lg;float ft;double dl;
	boolean bl; char ch;
	String st;
	public static void main(String args[]){
		/* in java there are 8 data types
		SN:Type 	Default Value	Size(in Byte)		Range
		1 : byte	0		1 			-128 To 127
		2 : short	0		2			-32768 To 32767
		3 : int 	0		4			-2,147,483,648 To 2,147,483,647
		4 : long	0		8			-2^63 To 2^63-1
		5 : float	0.0		8			
		6 : double	0.0		16
		7 : boolean	false		1 bit(0 or 1)		1 Bit 
		8 : char			4			0 to 65535
		*/

		DataTypeDemo dtd = new DataTypeDemo();
		System.out.println("Default Value of byte   : "+ dtd.bt);
		System.out.println("Default Value of short  : "+ dtd.sh);
		System.out.println("Default Value of int    : "+ dtd.it);
		System.out.println("Default Value of long   : "+ dtd.lg);
		System.out.println("Default Value of float  : "+ dtd.ft);
		System.out.println("Default Value of double : "+ dtd.dl);
		System.out.println("Default Value of boolean: "+ dtd.bl);
		System.out.println("Default Value of Char : "+ dtd.ch);

		/* Java Contain String Class */
		System.out.println("Default Value of String : "+ dtd.st); 
		
		/* We can assign small data type to big data type. But assigning large to small require type casting */
		byte a = 10; short b =20; int c = 30; long d= 40;
		
		a =(byte) b;// type casting required 
		c =(int) d; // type casting required
		
		System.out.println(" a = : " + a);
		System.out.println(" b = : " + b);
		System.out.println(" c = : " + c);
		System.out.println(" d = : " + d);
		
		b=a;/* here type casting not required it implicitly does */
		c=b; 
		System.out.println(" a = : " + a);
		System.out.println(" b = : " + b);
		System.out.println(" c = : " + c);
		System.out.println(" d = : " + d);

		/* comparing the values */
		a = 10;b = 20;c=20; d= 10l;
		System.out.println("Is a==b : " + (a==b));
		System.out.println("Is a==c : " + (a==c));
		System.out.println("Is a==d : " + (a==d));
		System.out.println("Is b==c : " + (b==c));
		System.out.println("Is b==d : " + (b==d));
		System.out.println("Is c==d : " + (c==d));

		/* Wrapper classes of primitive data types:
			byte  -> Byte
			short -> Short
			int   -> Integer
			long  -> Long
			float -> Float
			double-> Double
			char  -> Char
			boolean-> Boolean
		*/
		
		/* comparing float with double */
		float f = 10;double dd = 10;
		System.out.println("Is Float(f)==Double(dd) : " + (f==dd) + " " + f + " " + dd);
		System.out.println("f==(float)dd  : " + (f==(float)dd));

		/* Comparing Wrapper Classes values:
			We can't compare Wrapper classes.It gives Incompitable Type compile time error message.
		 */
		
		Byte b1 = 10;
		Byte b2 = b1;
		Byte b3 = 20;
		
		System.out.println("b1 == b2 :" + (b1 == b2));
		System.out.println("b1 == b3: "+ (b1==b3));
		System.out.println("b2 == b3: "+ (b2==b3));
		
	}
}
