package INTERVIEWPROGRAM07largestandsmallestnumber;

import java.util.Scanner;

public class largeandsmall {
	public static void main(String[] args) {
		System.out.println("enter your values :");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b==a>c) {
			System.out.println("a is largest number :"+a);
		}
		else if(b>a==b>c) {
			System.out.println("b is largest number :"+b);
		}
		else {
			System.out.println("c is largest number :"+c);
		}
		if(a<b==a<c) {
			System.out.println("a is smallest number :"+a);
		}
		else if(b<a==b<c){
			System.out.println("b is smallest number :"+b);
		}
		else {
			System.out.println("c is smallest number :"+c);
		}
	}

}
