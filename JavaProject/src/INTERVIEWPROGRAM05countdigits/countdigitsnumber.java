package INTERVIEWPROGRAM05countdigits;

import java.util.Scanner;

public class countdigitsnumber {
	public static void main(String[] args) {
		System.out.println("enter your digits :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("total digits :" + count);
	}

}
