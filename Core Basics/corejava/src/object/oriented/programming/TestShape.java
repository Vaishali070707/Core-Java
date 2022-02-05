package object.oriented.programming;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s=new Shape();
		
		s.setColor("Blue");
		
		s.setWidth(9);
		
		System.out.println("Width"+" "+s.getWidth());
		
		System.out.println("Color"+" "+s.getColor());
	}

}
