package object.oriented.programming;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a=new Automobile();
		a.setColor("Red");
		a.setSpeed(60);
		a.setMake("TATA");
		a.accelerator();
		a.changeGear();
		a.breakk();
		
		System.out.println("Color:"+a.getColor());
		System.out.println("Speed:"+a.getSpeed());
		System.out.println("Make:"+a.getMake());
		System.out.println(a.NO_OF_GEARS);
		
	}

}
