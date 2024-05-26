package INTERVIEWPROGRAM24anagramsandwithspace;

import java.util.Arrays;
import java.util.Scanner;

public class anagramswithspace {
public static void main(String[] args) {
	System.out.println("enter your names :");
	Scanner s= new Scanner(System.in);
	String x=s.nextLine();
	String y=s.nextLine();
	x=x.replace(" ","");
	y=y.replace(" ","");
	x=x.toLowerCase();
	y=y.toLowerCase();
	char a[]=x.toCharArray();
	char b[]=y.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	boolean result=Arrays.equals(a,b);
	if(result==true) {
		System.out.println("name is anagrams.");
	}
	else {
		System.out.println("name is not anagrams.");
	}
}
}
