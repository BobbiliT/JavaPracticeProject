package INTERVIEWPROGRAM22amstrong;

import java.util.Scanner;

public class print_amstrong_number {
	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1; 
		int a = 0;
		int b = 0;
		int c = 0;
		while (i <= num) {
			a = i % 10;
			b = i % 100;
			b = (b - a) / 10;
			c = i / 100;
			if ((a * a * a) + (b * b * b) + (c * c * c) == i)
				System.out.println(i);
			i++;

		}
	}
}
