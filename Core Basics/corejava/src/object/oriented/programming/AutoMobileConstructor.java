package object.oriented.programming;

public class AutoMobileConstructor {
	private String color;
	private  int speed;
	private String make;
	
	public AutoMobileConstructor() {
		System.out.println("This is default constructor");
		
		}
	public AutoMobileConstructor(String c, String m, int s) {
		color = c;
		speed = s;
		make = m;
		
		System.out.println("Color="+c);
		System.out.println("Speed="+s);
		System.out.println("Make="+m);
		
	}
	

}
