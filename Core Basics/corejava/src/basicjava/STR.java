package basicjava;

public class STR {
	public static void main(String[] args) {
		String s="VIJAY DINANATH CHOUHAN";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("DINA"));
		System.out.println(s.indexOf("I"));
		System.out.println(s.replace("A","B"));
		System.out.println(s.lastIndexOf("I"));
		System.out.println(s.replaceAll("A","B" ));
		System.out.println(s.startsWith("VIJAY"));
		System.out.println(s.endsWith("CHOUHAN"));
		System.out.println(s.substring(6));
		System.out.println(s.split(""));
	}

}
