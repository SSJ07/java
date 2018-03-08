import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		
		/**
		 * ConcurrentHashMap is not fail-fast.
		 * It allows to modification while iterating over it.
		 */
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("1", "1");
		chm.put("2", "1");
		chm.put("3", "1");
		chm.put("4", "4");
		
		System.out.println("ConcurrentHashMap before iterator: "+chm);
		Iterator<String> it = chm.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) chm.put(key+" new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+chm);
		
		
		
		/**
		 * HashMap is fail-fast iterator. 
		 * It don't allow concurrent modification(two operation at same time on single object)
		 * Internally it use modCount variable to check modification count of map when it calls it.next() method.
		 * So what if we are trying to put entry after last iteration?
		 * It will not throw any exception. It simply add that entry in map.
		 * 
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "1");
		hm.put("2", "1");
		hm.put("3", "1");
//		hm.put("4", "1");// If we remove comment of this line then it will not throw ConcurrentModificationException
		
		System.out.println("ConcurrentHashMap before iterator: "+hm);
		Iterator<String> it1 = hm.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("3")) hm.put(key+" new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+hm);
		
	}

}
