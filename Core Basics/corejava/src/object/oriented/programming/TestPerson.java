package object.oriented.programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson  {
	public static void main(String[] args) throws ParseException {
		Person p=new Person();
		p.setname("Vaishali");
		 
		String d="10/12/2019";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		p.setDob(sdf.parse(d));
		
		p.setaddress("President Tower");
		
		System.out.println("Name:"+p.getname());
		
		System.out.println("Date:"+p.getDob());
		
		System.out.println("Address:"+p.getaddress());
		
		System.out.println(p.AVG_AGE );
	}
	

}
