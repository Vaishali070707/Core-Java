package basicjava;

public class HARMONICSERIES {
public static void main(String[] args) {
	int n=5;
	int a=1;
	int b=1;
	double result;
	for(int i=0;i<=n;i++) {
		result=((double)1/(a*i+b));
		System.out.println(result);
	}
	
}
}
