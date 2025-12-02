package INTERVIEWPROGRAM25convertlowertoupperwihtspace;

import java.util.Scanner;

public class converLowerToUpperCase {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String result = " ";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
				result += ch;
			}
		}
		System.out.print("convert Lower " + name + " To Upper " + result);
	}
}
