package collection.framework;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceMethods_Clear {
	public static void main(String[] args) {

 Map m = new HashMap();
 m.put(1, "Sagar");
 m.put(2,"Prateek" );
 m.put(3, "Vaishali");
 //m.clear();
 //System.out.println(m);
 
 
 //System.out.println(m.containsKey(4));
 
 
// System.out.println(m.containsValue("Prateek"));
 
// System.out.println(m.entrySet());
 
 //System.out.println(m.get(3));
 
 //System.out.println(m.isEmpty());
 
// System.out.println(m.keySet());
 
 //m.put(4, "Vishal");
 //System.out.println(m);
 
 
 m.remove(3);
 System.out.println(m);
 
 System.out.println(m.remove(2));
 
 System.out.println(m.size());
 
 System.out.println(m.values());
 
 
	}

}
