
package INTERVIEWPROGRAM25convertlowertoupperwihtspace;

import java.util.Scanner;

public class convertUpperToLowerCase {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String result = " ";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
				result += ch;
			}
		}
		System.out.println("convert Upper " + name + " To Lower " + result);
	}
}
