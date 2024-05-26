package INTERVIEWPROGRAM24anagramsandwithspace;

import java.util.Arrays;
import java.util.Scanner;

public class anagramwithspace {
public static void main(String[] args) {
	System.out.println("enter your name with space :");
	Scanner s = new Scanner(System.in);
	String a=s.nextLine();
	String b=s.nextLine();
	a=a.replace(" ", "");
	b=b.replace(" ", "");
	char x[]=a.toCharArray();
	char y[]=b.toCharArray();
	Arrays.sort(x);
	Arrays.sort(y);
	boolean result=Arrays.equals(x, y);
	if(result==true) {
		System.out.println("name is anagram.");
	}
	else {
		System.out.println("name is not anagram.");
	}
}
}
