package oops;

/**
 * 
 * @author Shri
 * 
 * The degree of depenency of component is called coupling.
 * If dependency is more then it is called tightly coupling.
 * If dependency is less then it is called loosly coupling.
 * 
 * Cohesion : 
 * 			Every component clear well defined functionality.
 * 			Spring is high cohesion example.
 * 			Because every component is defined for particular operations.
 *
 */
interface P{
	
}
class A1{
	B b = new B(); // this is called tightly coupling.
	P p;
	A1(P p){
		this.p = p; // this is called loosly coupling.
	}
}
class B implements P{
	
}
class C implements P {
	
}
public class CouplingExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
