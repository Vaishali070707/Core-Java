package object.oriented.programming;

public class Triangle {
	private int base;
	private int height;
	int c;
	public void area() {
		c=(base*height)/2;
		System.out.println("The area of circle="+c);
	}
	
	public void setBase(int base) {
			this.base = base;
	}
	public int getBase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height = height;
}
public int getHeight() {
	return height;
}
}
