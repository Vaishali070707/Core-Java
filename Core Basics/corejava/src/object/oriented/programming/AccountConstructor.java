package object.oriented.programming;

public class AccountConstructor {
	private String number = "";
	private String AccountType = "";
	private  double balance;
	
	
	
	public AccountConstructor() {
		System.out.println("This is three parameterized constructor");
			
	}
	public AccountConstructor(String at, String n, double b) {
		number = n;
		AccountType = at;
		balance = b;
		
		
		System.out.println("Name"+n);
		System.out.println("AccountType"+at);
		System.out.println("double"+b);
		
	}
	

}
