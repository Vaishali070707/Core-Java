package practice.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();           // Create a Collection
		
		c.add("Rays");
		c.add("Java");
		c.add("President Tower");
		//System.out.println("Length of Collection:"+c.size()); 
		
		//for(Object O: c) {
			//System.out.println(O);   // Print all elements of collection
		//}
		
		// convert collection into array
		
		Object [] oArray = c.toArray();
		System.out.println(oArray);
		
		
		// print all elements of array
		
		for(Object  O: oArray) {
			String s = (String) O;     
			System.out.println(s);
		}
		
	}

}
