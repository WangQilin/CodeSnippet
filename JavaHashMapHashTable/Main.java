package JavaHashMapHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put("alice", 18);
		hm.put("bob", 19);
		hm.put("cindy", 20);
		hm.put("dave", 21);
		
		printHashMap(hm);
	}
	
	private static void printHashMap(HashMap hm) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
	}
}
