package Terner_operatior;

import java.util.Scanner;

public class Largest_number_with_three_values {
	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max = 0;
		max = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("largest number is - " + max);
	}
}
