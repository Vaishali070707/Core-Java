package object.oriented.programming;

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccountType("Saving Account");
		a.setBalance(2100.50);
		a.setNumber("123456789012");
		a.deposit(1000);
		a.withdrawl();
		a.fundTransfer();
		a.payBill();
		
		System.out.println("AccountType"+a.getAccountType());
		System.out.println("Balance"+a.getBalance());
		System.out.println("Number"+a.getNumber());
		
		}

}
