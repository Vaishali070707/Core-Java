package collection.framework;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceMethods_LastindexOf {
	public static void main(String[] args) {
		List m = new LinkedList();
		m.add(12);           
		m.add(3.6);         
		m.add("Vaishali");          
		m.add("true"); 
		m.add(20);           
		m.add(5.5);         
		m.add("java");          
		m.add("rays");   
		
		System.out.println(m.lastIndexOf(3.6));
		
		
	}

}
