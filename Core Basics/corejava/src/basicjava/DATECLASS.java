package basicjava;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DATECLASS {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);    // IST (INDIAN STANDARD TIME)
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
				String dd= sdf.format(d);
		System.out.println(dd);
		
		String s= "16/01/2022"; // to convert string into date  
		Date d1=sdf.parse(s);
		System.out.println(d1);
		
	}

}
