package object.oriented.programming;

import java.text.SimpleDateFormat;
import java.util.*;

public class Person {
	private String name;
	private Date dob;
	private String address;
	public static final int AVG_AGE =20 ;
	
		
	
	public void setname (String n) {
		name=n;
	}
	public String getname() {
		return name;
		
	}
	public void setDob(Date d) {
		dob=d;
		
	}
	public Date getDob() {
		return dob;
	}
	public void setaddress(String a) {
		address =a;
	}
	public String getaddress() {
		return address;
	}

}
