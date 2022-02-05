package exception.handling;

public class ExceptionOne {
	public static void main(String[] args) {
		try {               
		String s ="java";  
		System.out.println(s.length());
		
		
		System.out.println(s.charAt(4));
		}
		
		catch(NullPointerException n){
			System.out.println("String is null");
			
		}
		catch(StringIndexOutOfBoundsException o){
			System.out.println("Length is only 3");
			}
		}
	
		
			
		
		
	}


