package DateFormate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {
public static void main(String[] args) {
	String pattern="MM/dd/yyyy";
	SimpleDateFormat formate = new SimpleDateFormat(pattern); 
	String date=formate.format(new Date());
	System.out.println(date);
}
}