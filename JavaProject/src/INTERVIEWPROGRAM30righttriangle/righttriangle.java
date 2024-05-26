package INTERVIEWPROGRAM30righttriangle;

import java.util.Scanner;

public class righttriangle {
public static void main(String[] args) {
	System.out.println("enter your numbers :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
