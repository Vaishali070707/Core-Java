package collection.framework;

import java.util.ArrayList;

public class Arraylist_implements_list {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("one");
		v.add("two");
		v.add("three");
		
		Integer i = new Integer(4);
		v.add(i);
		Integer value = (Integer) v.get(3);
		System.out.println(+value);

	}

}
