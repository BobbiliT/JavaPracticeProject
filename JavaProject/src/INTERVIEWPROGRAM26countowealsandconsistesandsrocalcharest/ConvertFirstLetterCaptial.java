package INTERVIEWPROGRAM26countowealsandconsistesandsrocalcharest;

import java.util.Scanner;

public class ConvertFirstLetterCaptial {
	public static void main(String[] args) {
		System.out.println("enter your name :");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String space = "";
		String arr[] = name.split(" ");
		for (String ss : arr) {
			char firstletter = ss.charAt(0);
			char convert = Character.toUpperCase(firstletter);
			String sub = ss.substring(1);
			space = space + convert + sub + " ";
		}
		System.out.println(space);
	}
}
