package INTERVIEWPROGRAM04palindrome;

import java.util.Scanner;

public class betweenpalindrome {
	public static void main(String[] args) {
		System.out.println("enter your numbers :");
		Scanner s= new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int count=0;
		for(int i=num1; i<num2; i++) {
			int num=i;
			int rev=0;
			while(num!=0) {
				rev=rev*10+num%10;
				num=num/10;
			}
			if(rev==i) {
				System.out.println(i);
			}
			if(rev==i) {
				count++;
			}
		}
		System.out.println("total number of palindromes :"+count);
	}

}
