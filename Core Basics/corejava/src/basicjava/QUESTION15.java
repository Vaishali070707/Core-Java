package basicjava;

public class QUESTION15 {
	public static void main(String[] args) {
		                 // 0  1  2  3  4   5
		int a[]=new int[] {10,20,30,40,50,500};
		int max=a[0];             // assumed that a[0] is the largest i.e. 10
		for(int i=1;i<a.length;i++) // it will run 5 times for 1,2,3,4,5
		{
			if (a[i]>max) // if true
		
		{max=a[i];       // it will replace the value of max if the larger number is found.
		                 // replacement  will occur here
		
		}
			
		}
		System.out.println(max);
	}
	}

		
	
