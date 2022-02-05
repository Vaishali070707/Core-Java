package object.oriented.programming;

public class CircleConstructor extends Shape {
	private int radius;
	public static final double PI=3.14;
	double area;
	public CircleConstructor(int c) {
		System.out.println("This is default constructor");
	}
	
	public CircleConstructor(double area) {
		this.area = area;
		System.out.println("The area of circle="+ area);
		
	}
	
		
	

}
