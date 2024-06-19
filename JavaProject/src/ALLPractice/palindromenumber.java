package ALLPractice;

import java.util.Scanner;

public class palindromenumber {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	int org_num=num;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(org_num==rev) {
		System.out.println("number is palindrome.");
	}
	else {
		System.out.println("number is not palindrome.");
	}
}
}
