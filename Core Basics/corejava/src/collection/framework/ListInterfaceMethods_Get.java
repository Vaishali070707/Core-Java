package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods_Get {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(12);           
		l.add(3.6);         
		l.add("Vaishali");          
		l.add("true");   
		
		System.out.println(l.get(1));
		
	}

}
