package Terner_operatior;

import java.util.Scanner;

public class Check_even_odd_with_ternary_operator {

	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		String check="";
		check=(num%2==0)?"even":"odd";
		System.out.println("given number is "+check+"="+num);
	}
}
