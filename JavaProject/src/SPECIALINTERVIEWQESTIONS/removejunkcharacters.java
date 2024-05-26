package SPECIALINTERVIEWQESTIONS;

import java.util.Scanner;

public class removejunkcharacters {
public static void main(String[] args) {
	System.out.println("enter your name :");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	name=name.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(name);
}
}
