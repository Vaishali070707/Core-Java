package exception.handling;

public class ExceptionTwo {
	public static void main(String[] args) {
		try {
			String s = "Java";
			System.out.println(s.length());
			System.out.println(s.charAt(5));
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am done ");
		}
	}

}
