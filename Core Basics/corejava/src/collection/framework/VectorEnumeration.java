package collection.framework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("java");
		v.add(1);
		v.add("rays");
		v.add(4);
		
	//	Enumeration e = v.elements();
		//while(e.hasMoreElements()) {
			//System.out.println(e.nextElement());
		for (Object o: v) {
			System.out.println(o);
		}
		}
		
	}
	


