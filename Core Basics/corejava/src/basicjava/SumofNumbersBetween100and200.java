package basicjava;

public class SumofNumbersBetween100and200 {
	public static void main(String[] args) {
		int sum=0,count=0;
		for(int i=101;i<200;i++)
		{
			if(i % 7==0)
			{
				sum=sum+i;
				count++;
			}
		}
		System.out.println("sum of numbers between 100 to 200 which are divisible by 7 "+sum);
		System.out.println("sum of numbers between 100 to 200 which are divisible by 7 "+count);
		}
	}
		
		
