package basicjava;

public class TestMethod2 {
	public int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		TestMethod2 t=new TestMethod2();
		int c=t.add(40, 40);
				System.out.println(c);
	}

}
