package _SpecificInterviewPrograms;

import java.util.Scanner;

public class remove_speace_from_given_string {
public static void main(String[] args) {
	System.out.println("enter your name: ");
	Scanner s = new Scanner(System.in);
	String name=s.nextLine();
	System.out.println("original String :"+name);
	name=name.replace(" ", "");
	System.out.println("remove space String :"+name);
}
}
