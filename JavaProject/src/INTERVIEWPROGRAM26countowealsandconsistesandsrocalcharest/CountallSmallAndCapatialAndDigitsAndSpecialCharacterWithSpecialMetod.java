package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class CountallSmallAndCapatialAndDigitsAndSpecialCharacterWithSpecialMetod {
	public static void main(String[] args) {
		System.out.println("enter your name :");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int sl = 0;
		int cp = 0;
		int nu = 0;
		int sp = 0;
		String small = "";
		String captial = "";
		String digits = "";
		String specialchar = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLowerCase(ch)) {
				sl++;
				small = small + ch;
			} else if (Character.isUpperCase(ch)) {
				cp++;
				captial = captial + ch;
			} else if (Character.isDigit(ch)) {
				nu++;
				digits = digits + ch;
			} else {
				sp++;
				specialchar = specialchar + ch;
			}
		}
		System.out.println(name);
		System.out.println("small count -> " + sl + " small letters -> " + small);
		System.out.println("captial count -> " + cp + " captial letters -> " + captial);
		System.out.println("digits count -> " + nu + " digits letters -> " + digits);
		System.out.println("special character count -> " + sp + " special character letters -> " + specialchar);
	}
}
