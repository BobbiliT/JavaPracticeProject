package Terner_operatior;

import java.util.Scanner;

public class Find_Largest_number {
	public static void main(String[] args) {
		System.out.println("enter your values ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int max = 0;
		max = a > b ? a : b;
		System.out.println("largest number of between two numbers - " + max);
	}
}
