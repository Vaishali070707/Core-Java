package exception.handling;

public class TryCatch {
	public static void main(String[] args) {
		 try {
			double div = 15/0;/// Exception part
			System.out.println(div);
		 }
		 catch(ArithmeticException e) {           /// Handle part
			 System.out.println("Code is empty");
		 }
		
	
		
}
}
