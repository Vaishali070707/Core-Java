package practice.collectionframework;

import java.util.ArrayList;

public class TestArraylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("size"+ a.size());
		
		System.out.println(a.get(0));
		System.out.println(a.get(2));
		System.out.println(a.get(1));
		System.out.println(a.remove(1));
		System.out.println(a.remove(0));
		System.out.println(a.contains(4));
		System.out.println(a.contains(2));
       System.out.println(a.indexOf(1));
		System.out.println(a.indexOf(5));
		
		
		
		
		
		
	}

}
