package basicjava;

// Armstrong number in java
//153=1*1*1+5*5*5+3*3*3
		// 1+125+27
		// 153  (the sum is equal to actual no so it is armstrong no)
		

public class QUESTION10__ARMSTRONG {
	public static void main(String[] args) {
		int n=153;
		int temp=n;//(Assigning it on temp so that original value doesnt change )
		int r;  // (R is for reminder)
		int sum=0; 
		
		while(n>0)
		{
		
		r=n%10;
		n=n/10;  //(It will give value 15 )
		
		sum=sum+r*r*r;
		
		
		}
		if(temp==sum) {
			System.out.println(temp+"it is  an armstrong number");
		}
		else {
			System.out.println(temp+"it is not an armstrong number");
			}
		}
			

}
