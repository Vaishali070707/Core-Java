package collection.framework;

import java.util.ArrayList;

public class Arraylist_Read_all_Elements {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		v.add("one");
		v.add("one");
		v.add("one");
		v.add("one");
		
		int size = v.size();
		for (int j=0; j<size; j++) {
			System.out.println(j+":"+v.get(j));
		}
		
		
		
	}

}
