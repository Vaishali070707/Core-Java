package object.oriented.programming;

public class PersonConstructor {
	private String name="";
	private String address="";
	
	public PersonConstructor(String s) {
		System.out.println("This is two parameterized constructor");
		
		
	}
	public PersonConstructor(String a, String b) {
           
		name = a;
		address = b;
		System.out.println("Name"+a);
		System.out.println("Address"+b);
		
	}

}
