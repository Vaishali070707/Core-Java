package collection.framework;

import java.util.Stack;

public class Assignment_Question_Eight {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		
		
		for (char i = 'a'; i <='z'; i++) {
			s.push(i);
			
			
		}
		System.out.println("Stack 1st : "+s);
		
	
	Stack s1= new Stack();
	char value;
	
	for (char i = 'a'; i <='z'; i++) {
		value = (char) s.peek();
		s1.push(value);
		s.pop();
		
	}
		
		System.out.println("Stack 2nd : "+s1);
		
		Stack s2= new Stack();
	
		
		for (char i = 'a'; i <='z'; i++) {
			value = (char) s1.peek();
			s2.push(value);
			s1.pop();
			
		}
			
			System.out.println("Stack 3rd : "+s2);
		
	
}
	

}
