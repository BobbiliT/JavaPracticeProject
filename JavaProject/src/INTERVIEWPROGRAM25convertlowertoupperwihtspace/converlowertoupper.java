package INTERVIEWPROGRAM25convertlowertoupperwihtspace;

import java.util.Scanner;

public class converlowertoupper {
public static void main(String[] args) {
	System.out.println("enter your lower alphabet :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	char x[]=name.toCharArray();
	int size=name.length();
	int i=0;
	while(i!=size) {
		x[i]=(char)(x[i]-32);
		i++;
	}
	System.out.println(name);
	System.out.println(x);
}
}
