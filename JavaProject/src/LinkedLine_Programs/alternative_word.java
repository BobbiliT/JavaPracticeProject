package LinkedLine_Programs;

import java.util.Scanner;

public class alternative_word {
	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String word[] = name.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length; i++) {
			if (i % 2 == 0) {
				sb.append(word[i]);
			} else {
				sb.append(new StringBuilder(word[i]).reverse().append(" "));
				
			}
		}
		System.out.println(sb.toString().trim() + " ");
	}
}
