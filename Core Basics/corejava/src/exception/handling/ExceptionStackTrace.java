package exception.handling;

public class ExceptionStackTrace {
	public static void main(String[] args) {
		try {
			String s = "Vijay";
			System.out.println(s.length());
			System.out.println(s.charAt(5));
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
