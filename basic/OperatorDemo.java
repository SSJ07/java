/* Operator is Very import in any language. Java Provide following Operators :
	1 : Arithmetic Op [ /, *, +, - ,%]
	2 : Comparitive Op[==, !=, >,<, >=, <=]
	3 : logical Op[&&, ||]
	4 : Bitwise Op [ &, | , ^, ~, !, >>, <<, >>>]
	5 : Conditional Op [ ? :]
	6 : Increment/Decrement Op [ ++, -- ]
*/
public class OperatorDemo{
	public static void main(String args[]){
		short a = 100, b = 200;
		System.out.println("================Arithmetic Operator ======================");
		System.out.println("a-b :" + (a-b));
		System.out.println("b/a :" + (b/a));
		System.out.println("a*b :" + (a*b));
		System.out.println("b%a :" + (b%a));
		System.out.println("a+b :" + (a+b));
	
		System.out.println("================Comparative Operator ======================");
		System.out.println("a==b: "+ (a==b));
		System.out.println("a!=b: "+ (a!=b));
		System.out.println("a<b: "+ (a<b));
		System.out.println("a>b: "+ (a>b));
		System.out.println("a<=b: "+ (a<=b));
		System.out.println("a>=b: "+ (a>=b));

		System.out.println("=================Logical Operator ========================");
		/* Rules :
			1: In Logical And(&&) Operator condition Check Both Condition.
			   If First condition flase It will never check other Condition.
			2: || operator condition It checks first condition if it is true, 
			   Then it never check other condition.
			   else it check second condition.
		*/
		
		short x = 10, y=20;
		System.out.println("x==y && x++==y++ :" + ((x==y) && (x++ == y++)));
		/* output will be False and values x and y remain 10 and 20 */
		
		x = y = 10;
		System.out.println("x==y && x++==y++ :" + ((x==y) && (x++ == y++))+ "x= " + x + "y=" + y);
		/* output will be true and x and y will be 11 and 11 */

		System.out.println("x==y || x++ == y++ :" + ((x==y)||(x++ == y++)) + " x= :"+ x+ " y ="+ y);
	}
}
