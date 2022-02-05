 package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveAll {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(12);
	l.add(3.6);
	l.add('v');
	l.add("java");
	System.out.println(l.removeAll(l));
	System.out.println(l);
	
	
	List l1 = new ArrayList();
	l1.add(5);
	l1.add(3.7);
	l1.add("rays");
	l1.add('d');
	System.out.println(l1.removeAll(l1));
	System.out.println(l1);
}
}
