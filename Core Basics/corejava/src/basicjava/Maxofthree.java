package basicjava;

public class Maxofthree {
	public static void main(String[] args) {
		int a=5,b=10,c=15;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a");
			}
			else
			{
				System.out.println("c");
			}
			
		}
		else 
		{
			if(b>c)
			{
				System.out.println("b");
			}
			else
			{
				System.out.println("c");
			}
		}
	}

}
