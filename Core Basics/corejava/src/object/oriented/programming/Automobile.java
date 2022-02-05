package object.oriented.programming;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}
	public void setMake (String m) {
		make = m;
	}
	public String getMake() {
		return make;
	}
	public void breakk() {
		System.out.println("Break");
	}
	public void changeGear() {
		System.out.println("Gear");
	}
	public void accelerator() {
		System.out.println("Accelerator");
	}
	

}
