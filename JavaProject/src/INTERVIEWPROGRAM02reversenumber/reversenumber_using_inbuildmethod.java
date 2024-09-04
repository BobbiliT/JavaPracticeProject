package INTERVIEWPROGRAM02reversenumber;

import java.util.Scanner;

public class reversenumber_using_inbuildmethod {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	StringBuffer sb = new StringBuffer();
	sb.append(num);
	sb.reverse();
	System.out.println("reverse number is :"+sb);
}
}
//can we make constroucter has static ?
//can we make constructor has final?