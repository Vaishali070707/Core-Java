package object.oriented.programming;

public class TestConstant {
	public static void main(String[] args) {
		Constant c = new Constant ();
		c.setcolor("blue");
		
		c.setborderWidth(5);
		
		System.out.println("Color="+c.getcolor());
		System.out.println("BorderWidth="+c.getborderWidth());
		System.out.println(c.PI );
	}

}
