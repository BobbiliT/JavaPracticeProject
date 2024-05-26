package INTERVIEWPROGRAM20alphabateupperandlower;

import java.util.Scanner;

public class countuppercaseandlowercase {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	name=name.replace(" " ,"");
	int upper=0;
	int lower=0;
	for(int i=0; i<name.length(); i++) {
		char ch=name.charAt(i);
		if(ch>=65&&ch<=95) {
			upper++;
		}
		else {
			lower++;
		}
	}
	System.out.println("upper letters :"+upper);
	System.out.println("lower letters :"+lower);
}
}
