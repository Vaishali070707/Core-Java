package object.oriented.programming;

public class Person1 {
	private String name = "";
	private int mobileNumber = 0;
	
	public Person1() {
		System.out.println("This is two parameterized constructor");
		
	}
	public Person1(String n,int m ) {
		
		name = n;
		mobileNumber = m;
		
		System.out.println("Name="+n);
		System.out.println("MobileNumber="+m);
	}
	

}
