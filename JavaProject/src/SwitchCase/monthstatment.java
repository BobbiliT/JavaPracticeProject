package SwitchCase;

import java.util.Scanner;

public class monthstatment {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	String monthString="";
	switch(num) {
	case 1:
		monthString="1-junuary";
	break;
	case 2:
		monthString="2-february";
	break;
	case 3:
		monthString="3-march";
	break;
	case 4:
		monthString="4-april";
	break;
	case 5:
		monthString="5-may";
	break;
	case 6:
		monthString="6-june";
	break;
	case 7:
		monthString="7-july";
	break;
	case 8:
		monthString="8-augest";
	break;
	case 9:
		monthString="9-october";
	break;
	case 10: 
		monthString="10=september";
	break;
	case 11:
		monthString="11-november";
	break;
	case 12:
		monthString="12-december";
	break;
	default:
		System.out.println("month is not matched");
	}
	System.out.println(monthString);
}
}
