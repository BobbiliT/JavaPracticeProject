package INTERVIEWPROGRAM25convertlowertoupperwihtspace;

import java.util.Scanner;

public class lowertoupper {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);   // scanner class use inputs taken by user 
	String name=s.nextLine();     // creat one string varible 
	char ch[]=name.toCharArray();   // convert the string to array 
	int size=ch.length;    // fing the length of array 
 	int i=0;    // inisilize the one empty varible 
	while(i!=size) {    // write one while loop
		ch[i]=(char)(ch[i]-32);
		i++;
	}
	System.out.println(name);
	System.out.println(ch);
}
}
