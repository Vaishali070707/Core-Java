
package basicjava;

public class PrimeNumber {
	public static void main(String[] args) {
		int no = 9;
		

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
	
				System.out.println("Number is not prime number");
				
		}else
			
		System.out.println("Number is prime number");
			break;

	}
}
}
