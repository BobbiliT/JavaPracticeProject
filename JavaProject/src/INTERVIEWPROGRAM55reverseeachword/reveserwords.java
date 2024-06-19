package INTERVIEWPROGRAM55reverseeachword;

import java.util.Scanner;

public class reveserwords {
public static void main(String[] args) {
	System.out.println("enter your input :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	//here split the given input 
	String arr[]=name.split(" ");
	//here iterate the given value 
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	//here reverse the each word 
	System.out.println(" ");
	for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i]+" ");
	}
}
}
