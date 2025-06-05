package INTERVIEWPROGRAM29removeduplicateelement;

import java.util.Scanner;

public class Remove_duplicate_from_string {
	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char ch[] = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			boolean repeated = false;
			for(int j=1+i; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					repeated = true;
				}
			}
			if(!repeated) {
				System.out.print(ch[i]);
			}
		}
	}
}
