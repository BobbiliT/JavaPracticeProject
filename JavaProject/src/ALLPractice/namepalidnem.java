package ALLPractice;

import java.util.Scanner;

public class namepalidnem {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s= new Scanner(System.in);
	String name=s.nextLine();
	String org_name=name;
	String rev="";
	for(int i=name.length()-1; i>=0; i--) {
		rev=rev+name.charAt(i);
	}
	if(org_name.equals(rev)) {
		System.out.println("name is palindrome.");
	}
	else {
		System.out.println("name is not palidrome.");
	}
}
}
