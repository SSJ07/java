import java.util.Hashtable;

class Tempp{
	
	int i;
	Tempp(int i){
		this.i = i;
	}
	public int hashCode(){
		return i;
	}
	public String toString(){
		return ""+i;
	}
}
public class HashtableDemo {

	public static void main(String[] args) {
			Hashtable ht = new Hashtable();
			ht.put(new Tempp(5), "A");
			ht.put(new Tempp(2), "B");
			ht.put(new Tempp(6), "C");
			ht.put(new Tempp(15), "D");
			ht.put(new Tempp(23), "E");
			ht.put(new Tempp(16), "F");
			//ht.put(new Tempp(11), null); // NullPointer exception will occure
			System.out.println(ht);
			// o/p will be : {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
	}

}
