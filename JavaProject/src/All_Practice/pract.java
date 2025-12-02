package All_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class pract {
	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int upper = 0;
		int lower = 0;
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
	}
}
