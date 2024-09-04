package _SpecificInterviewPrograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				result = result + i;
			}
		}
		if (result == num) {
			System.out.println("Given number is a perfect number.");
		} else {
			System.out.println("Given number is not a perfect number.");
		}
	}
}
