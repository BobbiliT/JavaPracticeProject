package ifconditionpratices;

import java.util.Scanner;

public class weaks {
public static void main(String[] args) {
	System.out.println("enter your weak name.");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	if(name.equals("monday")) {
		System.out.println("huff! this is weakday....");
	}
	else if(name.equals("tuesady")){
		System.out.println("huff! this is weakday....");
	}
	else if(name.equals("wedenesday")) {
		System.out.println("huff! this is weakday....");
	}
	else if(name.equals("thuresday")) {
		System.out.println("huff! this is weakday....");
	}
	else if(name.equals("friday")) {
		System.out.println("huff! this is weakday....");
	}
	else if(name.equals("saturday")){
		System.out.println("yahh! this is weakend....");
	}
	else if(name.equals("sunday")) {
		System.out.println("yahh! this is weakend....");
	}
	else {
		System.out.println("enter valid day name....");
	}
}
}
