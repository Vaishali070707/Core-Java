package basicjava;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class QUESTION3_AGE_OF_AN_EMPLOYEE {
	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		
		System.out.println(l);
		
		LocalDate b = LocalDate.of(1998, 07, 07);
		
		System.out.println(b);
		 
		Period p =Period.between(l, b);
		System.out.println("Employee age is"+p.getYears());
		System.out.println("Employee month is"+p.getMonths());
		System.out.println("Employee days are"+p.getDays());
		
		
		

		
		
	}

}
