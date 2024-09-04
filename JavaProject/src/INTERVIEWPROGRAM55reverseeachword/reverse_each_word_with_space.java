package INTERVIEWPROGRAM55reverseeachword;

import java.util.Scanner;

public class reverse_each_word_with_space {
	public static void main(String[] args) {
		System.out.println("enter your name :");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String a[] = name.split(" ");
		for (int i = 0; i < a.length; i++) {
			String words = a[i];
			String rev = "";
			for (int j = 0; j < words.length(); j++) {
				char ch = words.charAt(j);
				rev = ch + rev;
			}
			System.out.print(rev + " ");
		}
	}
}
