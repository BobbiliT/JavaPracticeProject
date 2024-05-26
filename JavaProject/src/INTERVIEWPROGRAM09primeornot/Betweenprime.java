package INTERVIEWPROGRAM09primeornot;

import java.util.Scanner;

public class Betweenprime {
	public static void main(String[] args) {
		System.out.println("enter your number :");
		Scanner s = new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		for(int i=num1; i<=num2; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}

}
