package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author Shri
 * 
 * Sort Map by using value
 *
 */
public class SortMapByValue {

	public static List<Entry<String, Integer>> sortByValue(Map<String, Integer> map){
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				if(arg0.getValue()==arg1.getValue())
					return 0;
				return arg0.getValue() > arg1.getValue()?1:-1;
			}
			
		});
		return list;
	}
	public static void main(String[] args) {

		 Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 80);
        map.put("python", 50);
        map.put("spring", 90);
        map.put("hibernate", 40);
        map.put("ajax", 45);
        
        System.out.println("********* sorted map by using value is *********");
        for(Entry<String, Integer> entry : sortByValue(map)){
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }

	}

}
