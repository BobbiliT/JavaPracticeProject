package INTERVIEWPROGRAM02reversenumber;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("reverse number is :"+rev);
}
}
