package object.oriented.programming;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	public void setNumber (String n) {
		number = n;
		
	}
	public String getNumber() {
		return number;
	}
	public void setAccountType(String a) {
		accountType = a;
	}
	public String getAccountType() {
		return accountType; 
		
	}
	public void setBalance(double b) {
		balance = b;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int d){
		
		System.out.println("deposited="+d);
	}
	
	public void withdrawl() {
		System.out.println("Withdrawled");
	}
	public void fundTransfer() {
		System.out.println("Fund Transfered is");
	}
	public void payBill() {
		System.out.println("Bill Paid");
	}
	
	
		
		
		
		
	}


