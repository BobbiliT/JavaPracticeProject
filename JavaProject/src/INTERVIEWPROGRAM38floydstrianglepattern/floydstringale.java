package INTERVIEWPROGRAM38floydstrianglepattern;

import java.util.Scanner;

public class floydstringale {
	public static void main(String[] args) {
		System.out.println("enter your number :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int number = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
