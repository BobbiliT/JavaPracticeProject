package INTERVIEWPROGRAM32pyramid;

import java.util.Scanner;

public class reversepyrmid {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j=i; j<=num; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
