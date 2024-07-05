package INTERVIEWPROGRAM27stringintegerornot;

import java.util.Scanner;

public class verifiestringintegerotnot {
	public static void main(String[] args) {
		System.out.println("enter your value :");
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		char c[] = x.toCharArray();
		int size = c.length;
		int i = 0;
		while (i != size) {
			if (c[i] >= '0' && c[i] <= '9') {
				i++;
			} else {
				System.out.println("string is not interger.");
				System.exit(0);
			}
		}
		System.out.println("string is integer.");
	}
}
