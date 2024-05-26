package INTERVIEWPROGRAM31lefttriangle;

import java.util.Scanner;

public class reverselefttriangle {
public static void main(String[] args) {
	System.out.println("enter your numebr :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	for(int i=num; i>=1; i--) {
		for(int j=num; j>i; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
