package INTERVIEWPROGRAM04palindrome;

import java.util.Scanner;

public class numberpalindrome {
	public static void main(String[] args) {
		System.out.println("enter your name :");
		Scanner  s = new Scanner(System.in);
		int num=s.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("number is palindome ");
		}
		else {
			System.out.println("number is not palindrome.");
		}
	}
}
//What is palindrome number?
//A palindrome number is a number that reads the same forward and backward. 
//In other words,if you reverse the digits of a palindrome number, you get the same number
