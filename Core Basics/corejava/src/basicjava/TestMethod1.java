package basicjava;

public class TestMethod1 {
	public int add() {
		return 5+88; 
	}
	public static void main(String[] args) {
		TestMethod1 t= new TestMethod1();
		int c=t.add();
		System.out.println(c);
	}

}
