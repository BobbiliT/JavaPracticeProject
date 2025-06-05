package INTERVIEWPROGRAM06countevenandodddigits;

import java.util.Scanner;

public class countbetweenevenodd {
	public static void main(String[] args) {
		System.out.println("enter your numbers :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int even = 0;
		int odd = 0;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			if (rev % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
		}
		System.out.println("count even numbers :" + even);
		System.out.println("count odd numbers :" + odd);
	}

}
