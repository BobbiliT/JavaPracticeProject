package INTERVIEWPROGRAM03reversename;

import java.util.Scanner;

public class reversename {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name = s.nextLine();
	String rev="";
	for(int i=name.length()-1; i>=0; i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println("reverse name is :"+rev);
}
}
