package INTERVIEWPROGRAM33squarefillpattern;

import java.util.Scanner;

public class squarepattern {
public static void main(String[] args) {
	System.out.println("enter your number :");
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=num; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
