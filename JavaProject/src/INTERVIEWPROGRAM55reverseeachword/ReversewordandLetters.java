package INTERVIEWPROGRAM55reverseeachword;

import java.util.Scanner;

public class ReversewordandLetters {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	// here split the give value 
	String arr[]=name.split("");
	// here iterat each word
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"");
	}
	//here reverse eachletter and each word
	System.out.println();
	for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i]+"");
	}
}
}
