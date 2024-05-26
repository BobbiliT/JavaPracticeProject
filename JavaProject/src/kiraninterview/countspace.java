package kiraninterview;

import java.util.Scanner;

public class countspace {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	int count=0;
	for(int i=0; i<name.length(); i++) {
		if(name.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println("count space :"+count);
}
}
