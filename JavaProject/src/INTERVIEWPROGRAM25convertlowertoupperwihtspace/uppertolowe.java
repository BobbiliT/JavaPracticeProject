package INTERVIEWPROGRAM25convertlowertoupperwihtspace;

import java.util.Scanner;

public class uppertolowe {
public static void main(String[] args) {
	System.out.println("enter your name.");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	char ch[]=name.toCharArray();
	int size=ch.length;
	int i=0;
	while(i!=size) {
		ch[i]=(char)(ch[i]+32);
		i++;
	}
	System.out.println(name);
	System.out.println(ch);
}
}
