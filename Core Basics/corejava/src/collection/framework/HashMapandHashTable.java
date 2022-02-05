package collection.framework;

import java.util.HashMap;

public class HashMapandHashTable {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		h.put("RN1001",890);
		h.put("RN1002",900);
		h.put("RN1003",780);
		
		
		Integer i =  (Integer)h.get("RN1002");
		h.keySet();
		h.values();
		System.out.println(i);
		
		
	}

}
