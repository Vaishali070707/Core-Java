
package object.oriented.programming;

public class Rectangle extends Shape {
	private int length;
	private int width;
	int area;
	public void area() {
		area = length*width;
		System.out.println("Area of rectangle="+ area);
		
	}
	public void setLength(int length) {
		this.length=length;
		
	}
	public int getLength() { 
	
		return length;
	}
	
	
	
	public void setWidth(int width) {
		this.width = width;
		
	}
	public int getWidth() { 
	
		return width;
	}
	
	

}
