package INTERVIEWPROGRAM01swapnumber;

import java.util.Scanner;

public class swapping_two_string {
	public static void main(String[] args) {
		System.out.println("enter your names ");
		Scanner s = new Scanner(System.in);
		String st1=s.nextLine();
		String st2=s.nextLine();
		System.out.println("before swapping the strings "+"st1 = "+st1+" st2 = "+st2);
		st1=st1+st2;
		st2=st1.substring(0, st1.length()-st2.length());
		st1=st1.substring(st2.length());
		System.out.println("after swapping the strings "+"st1 = "+st1+" st2 = "+st2);
	}
}
