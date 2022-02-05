package basicjava;

public class STRB {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Vijay");
		sb.append("Dinanath Chouhan");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(1));
		System.out.println(sb.indexOf("Dinanath"));
		System.out.println(sb.replace(0, 2, "A"));
		System.out.println(sb.reverse());
	}

}
