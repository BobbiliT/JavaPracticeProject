package INTERVIEWPROGRAM27stringintegerornot;

import java.util.Scanner;

public class integerornot {
	public static void main(String[] args) {
		System.out.println("enter your value: ");
		Scanner s = new Scanner(System.in);
		String name=s.nextLine();
		char ch[]=name.toCharArray();
		int size=ch.length;
		int i=0;
		while(i!=size) {
			if(ch[i]>='0'&&ch[i]<='9') {
				i++;
			}
			else {
				System.out.println("string is not integer.");
				System.exit(0);
			}
		}
		System.out.println("string is integer.");
	}
}
