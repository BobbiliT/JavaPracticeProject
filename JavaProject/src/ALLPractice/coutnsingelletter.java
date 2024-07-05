package ALLPractice;

import java.util.Scanner;

public class coutnsingelletter {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s= new Scanner(System.in);
	String name=s.nextLine();
	System.out.println("enter count letter ");
	char single_letter=s.next().charAt(0);
	int count=0;
	for(char c:name.toCharArray()) {
		if(c==single_letter) {
			count++;
		}
	}
	System.out.println(count);
}
}
