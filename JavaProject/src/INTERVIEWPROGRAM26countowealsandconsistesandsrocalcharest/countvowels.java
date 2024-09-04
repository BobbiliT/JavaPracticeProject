package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class countvowels {
	public static void main(String[] args) {
		System.out.println("enter your name: ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		name=name.replace(" ", "");
		int count = 0;
		for (char ch:name.toCharArray()) {
			char c = ch;
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("total vowel count: " + count);
	}
}
