package object.oriented.programming;

public class Shape1 {
	private String color = null;
	private int borderWidth = 0;
	
	public Shape1() {
		System.out.println("This is default Constructor");
	}
	public Shape1(String c, int i) {
		System.out.println("This is Two param Constructor");
		color = c;
		borderWidth = i;
		System.out.println("BorderWidth ="+i);
		System.out.println("Color ="+c);
		
	}
	
	

}
