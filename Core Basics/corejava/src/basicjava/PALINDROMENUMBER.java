package basicjava;

public class PALINDROMENUMBER {
	public static void main(String[] args) {
		int num=1231;
		int i=num;
		int j=0;
		int c;
		while(i!=0) {
			c=i%10;
			j=(j*10)+c;
			i=i/10;
			
		}
		if(num==j)
		{
			System.out.println(num+"is palindrome no");
		}
		else
		{
			System.out.println(num+"is not palindrome no");
		}
	}
	}

	



