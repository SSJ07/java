import java.util.WeakHashMap;

class Temp{
		public String toString(){
			return "temp";
		}
		public void finalize(){
			System.out.println("finalize method");
		}
		
}
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		//HashMap hs = new HashMap();
		WeakHashMap hs = new WeakHashMap();
		Temp temp = new Temp();
		hs.put(temp, "Shri");
		System.out.println(hs);
		temp = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hs);
		
	}

}
