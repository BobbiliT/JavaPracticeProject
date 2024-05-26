package kiraninterview;

import java.util.Scanner;

public class vowler {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s= new Scanner(System.in);
	String name=s.nextLine();
//	char ch=s.next().charAt(0);
	for(int i=0; i<name.length(); i++) {
		if(name.equals("a")||name.equals("e")||name.equals("i")||name.equals("o")||name.equals("u")) {
			System.out.println("conatins vowel ");
		}
		else {
			System.out.println("cannot contains vowel");
		}
	}
}
}
