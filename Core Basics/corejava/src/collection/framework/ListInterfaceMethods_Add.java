package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods_Add {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(12);           // add integer
		l.add(3.6);         // add double
		l.add("Vaishali");          // add string
		l.add("true");            // boolean
		
		l.add(1,35);
		System.out.println(l);
		
		 
	}

}
