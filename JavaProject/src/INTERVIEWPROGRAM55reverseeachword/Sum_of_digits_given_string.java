package INTERVIEWPROGRAM55reverseeachword;

import java.util.Scanner;

public class Sum_of_digits_given_string {

	public static void main(String[] args) {
		System.out.println("enter your input ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int digits = 0;
		for (int i = 0; i < name.length(); i++) {
			Character ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digits = digits + Character.getNumericValue(ch);
			}
		}
		System.out.println(digits);
	}
}
