package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistReadAllElementsThroughIterator {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("Vaishali");
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}

}
