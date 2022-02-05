package object.oriented.programming;

public class Circle extends Shape {
	
	private int radius;
	public static final double PI = 3.14;
	double area;
	public  void area() {
		area = PI*radius*radius;
		System.out.println("Area of Circle ="+area);
		
		
		}
	public void setRadius(int radius) {
   	 this.radius=radius;
    }
	
	public int getRadius() {
		return radius;
		
	}
	     
	
		}
