package _SpecificInterviewPrograms;

import java.util.Scanner;

public class vowler {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s= new Scanner(System.in);
	String name=s.nextLine();
	if(name.matches(".*[AEIOUaeiou].*")) {
		System.out.println("String contains vowel.");
	}
	else {
		System.out.println("String not contains vowel.");
	}
}
}
